package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CookieHandler implements ActionListener{
	
	DayTimer dayTimer;
	CookieMain cMain;
	UI ui;
	GameTimers timers;
	Slots slots;

	
	//each of these classes is needed to be passed into the CookieHandler class because there are values taken from each of the classes coming from the main class.
	public CookieHandler(CookieMain cMain, UI ui, GameTimers timers, DayTimer dayTimer, Slots slots) {
		this.cMain = cMain;
		this.ui = ui;
		this.timers = timers;
		this.dayTimer = dayTimer;
		this.slots = slots;
	}
	
	
	
	public void actionPerformed(ActionEvent event) {
		
		
		
		
		String action = event.getActionCommand();
		
		
		
		
		switch (action) {
			case "Start":
				cMain.soundFX.stop(cMain.soundFXValues.titleClip);
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.dayPerSecond = .1;
				dayTimer.timerUpdate();
				cMain.unlockTimer.startUnlockTimer();
				cMain.ui.closeAllPanels();
				cMain.ui.displayMainGame();
				cMain.bgMusicPlayer.playMusic(cMain.soundFXValues.backgroundmusic);
				break;
			case "cookie": 
				cMain.logosCounter = (cMain.logosCounter + 1 +(cMain.rodValue) + (cMain.beltValue * 2) + (cMain.maskValue * 3)); 
				cMain.counterLabel.setText(cMain.logosCounter + " Logos"); 
				cMain.shopMessageText.setText(cMain.logosCounter + " Cookies \n");
			break;
			case "Cursor": if (cMain.logosCounter >= cMain.cursorPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.logosCounter = cMain.logosCounter - cMain.cursorPrice;
				cMain.cursorPrice = cMain.cursorPrice + 5;
				cMain.counterLabel.setText(cMain.logosCounter + " Cookies");
				cMain.messageText.setText("Shin-Chan: \n [Price: " + cMain.cursorPrice + "] \n AutoClicks" + (.1*cMain.cursorUpgradeAmount) + "time every second");
				cMain.cursorNumber++;
				cMain.button1.setText("Shin-Chan " + "(" + cMain.cursorNumber + ")");
				cMain.perSecond = (cMain.perSecond + 0.1); timers.timerUpdate();
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
			break;
			case "Grandpa":
			 if (cMain.logosCounter >= cMain.whiteyPrice) {
				 cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				 cMain.logosCounter = cMain.logosCounter - cMain.whiteyPrice;
				 cMain.whiteyPrice = cMain.whiteyPrice + 50;
				 cMain.counterLabel.setText(cMain.logosCounter + " Cookies");
				 cMain.whiteyNumber++;
				 cMain.messageText.setText("Whitey: \n [Price: " + cMain.whiteyPrice + "] \n Each Whitey produces 1 cookie per second");
				 cMain.button2.setText("Whitey " + "(" + cMain.whiteyNumber + ")");
				 cMain.perSecond = cMain.perSecond + 1; timers.timerUpdate();
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
			break;
			case "Grandma":
				if (cMain.logosCounter >= cMain.lollipopPrice) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
					cMain.logosCounter = cMain.logosCounter - cMain.lollipopPrice;
					cMain.lollipopPrice = cMain.lollipopPrice + 200;
					cMain.counterLabel.setText(cMain.logosCounter + " Cookies");
					cMain.lollipopNumber++;
					cMain.messageText.setText("Lollipop: \n [Price: " + cMain.lollipopPrice + "] \n Each Lollipop produces 3 cookie per second");
					cMain.button3.setText("Lollipop " + "(" + cMain.lollipopNumber + ")");
					cMain.perSecond = cMain.perSecond + 3; timers.timerUpdate();
				} else {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
				}
			break;
			case "Elves":
				if (cMain.logosCounter >= cMain.docPrice) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
					cMain.logosCounter = cMain.logosCounter - cMain.docPrice;
					cMain.docPrice = cMain.docPrice + 500;
					cMain.counterLabel.setText(cMain.logosCounter + " Cookies");
					cMain.docNumber++;
					cMain.messageText.setText("Doc: \n [Price: " + cMain.docPrice + "] \n Each Doc produces 7 cookie per second");
					cMain.button4.setText("Doc " + "(" + cMain.docNumber + ")");
					cMain.perSecond = cMain.perSecond + 7; timers.timerUpdate();
				} else {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
				}
			break;
			
			case "Lucky":
				if(cMain.logosCounter >= cMain.luckyPrice) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
					cMain.logosCounter = cMain.logosCounter - cMain.luckyPrice;
					cMain.luckyPrice = cMain.luckyPrice + 500;
					slots.luckyBastardFever("Lucky", 5);
					cMain.messageText.setText("Lucky: \n [Price: " + cMain.luckyPrice + "] \n" +cMain.rewardsMessage);			
				}
				else { 
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
				}
			break;
			
			case "Bastard":
				if(cMain.logosCounter >= cMain.bastardPrice) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
					cMain.logosCounter = cMain.logosCounter - cMain.bastardPrice;
					cMain.bastardPrice = cMain.bastardPrice + 750;
					slots.luckyBastardFever("Bastard", 3);
					cMain.messageText.setText("Bastard: \n [Price: " + cMain.bastardPrice + "] \n " + cMain.rewardsMessage);
				} else {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
				}
			break;
			
			case "Fever":
				if(cMain.logosCounter >= cMain.feverPrice) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
					cMain.logosCounter = cMain.logosCounter - cMain.feverPrice;
					cMain.feverPrice = cMain.feverPrice + 1000;
					slots.luckyBastardFever("Bastard", 2);
					cMain.messageText.setText("Fever: \n [Price: " + cMain.feverPrice + "] \n"  + cMain.rewardsMessage);
				}
				else {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
				}
			break;
			case "Slots":
				if (cMain.slotsUnlocked==true) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
					if(cMain.logosCounter>= cMain.slotsPrice) {
					slots.luckyBastardFever("Slots", 4);
					cMain.logosCounter = cMain.logosCounter - cMain.slotsPrice;
					} else {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
					}
				} cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
				
			break;
			case "Display":
				ui.displaySwitch("Cog");
				break;
			case "Shop":
				ui.displaySwitch("ItemShop");
				break;
			case "NewGame":
				cMain.window.setVisible(false);
				cMain.bgMusicPlayer.stop(cMain.soundFXValues.backgroundmusic);
				new CookieMain();
				break;
				
			
		
				
		}
	
	}

}