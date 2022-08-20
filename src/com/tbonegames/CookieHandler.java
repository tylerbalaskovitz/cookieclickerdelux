package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class CookieHandler implements ActionListener{
	
	SoundFX soundFX = new SoundFX();
	CookieMain cMain;
	UI ui;
	GameTimers timers;
	Slots slots;
	public URL purchase = getClass().getClassLoader().getResource("audio//purchase.wav");
	public URL error = getClass().getClassLoader().getResource("audio//error.wav");
	
	//each of these classes is needed to be passed into the CookieHandler class because there are values taken from each of the classes coming from the main class.
	public CookieHandler(CookieMain cMain, UI ui, GameTimers timers, Slots slots) {
		this.cMain = cMain;
		this.ui = ui;
		this.timers = timers;
		this.slots = slots;
	}
	
	
	
	public void actionPerformed(ActionEvent event) {
		
		
		
		
		String action = event.getActionCommand();
		
		
		
		
		switch (action) {
			case "cookie": cMain.cookieCounter = (cMain.cookieCounter + 1 +(cMain.rodValue) + (cMain.beltValue * 2) + (cMain.maskValue * 3)); 
			cMain.counterLabel.setText(cMain.cookieCounter + " Cookies"); 
			cMain.shopMessageText.setText(cMain.cookieCounter + " Cookies \n");
			break;
			case "Cursor": if (cMain.cookieCounter >= cMain.cursorPrice) {
				soundFX.playSoundEffect(purchase);
				cMain.cookieCounter = cMain.cookieCounter - cMain.cursorPrice;
				cMain.cursorPrice = cMain.cursorPrice + 5;
				cMain.counterLabel.setText(cMain.cookieCounter + " Cookies");
				cMain.messageText.setText("Cursor: \n [Price: " + cMain.cursorPrice + "] \n AutoClicks" + (.1*cMain.cursorUpgradeAmount) + "time every second");
				cMain.cursorNumber++;
				cMain.button1.setText("Cursor " + "(" + cMain.cursorNumber + ")");
				cMain.perSecond = (cMain.perSecond + 0.1); timers.timerUpdate();
			} else {
				soundFX.playSoundEffect(error);
			}
			break;
			case "Grandpa":
			 if (cMain.cookieCounter >= cMain.grandpaPrice) {
				 soundFX.playSoundEffect(purchase);
				 cMain.cookieCounter = cMain.cookieCounter - cMain.grandpaPrice;
				 cMain.grandpaPrice = cMain.grandpaPrice + 50;
				 cMain.counterLabel.setText(cMain.cookieCounter + " Cookies");
				 cMain.grandpaNumber++;
				 cMain.messageText.setText("Grandpa: \n [Price: " + cMain.grandpaPrice + "] \n Each grandpa produces 1 cookie per second");
				 cMain.button2.setText("Grandpa " + "(" + cMain.grandpaNumber + ")");
				 cMain.perSecond = cMain.perSecond + 1; timers.timerUpdate();
			} else {
				soundFX.playSoundEffect(error);
			}
			break;
			case "Grandma":
				if (cMain.cookieCounter >= cMain.grandmaPrice) {
					soundFX.playSoundEffect(purchase);
					cMain.cookieCounter = cMain.cookieCounter - cMain.grandmaPrice;
					cMain.grandmaPrice = cMain.grandmaPrice + 200;
					cMain.counterLabel.setText(cMain.cookieCounter + " Cookies");
					cMain.grandmaNumber++;
					cMain.messageText.setText("Grandma: \n [Price: " + cMain.grandmaPrice + "] \n Each grandma produces 3 cookie per second");
					cMain.button3.setText("Grandpa " + "(" + cMain.grandmaNumber + ")");
					cMain.perSecond = cMain.perSecond + 3; timers.timerUpdate();
				} else {
					soundFX.playSoundEffect(error);
				}
			break;
			case "Elves":
				if (cMain.cookieCounter >= cMain.elvesPrice) {
					soundFX.playSoundEffect(purchase);
					cMain.cookieCounter = cMain.cookieCounter - cMain.elvesPrice;
					cMain.elvesPrice = cMain.elvesPrice + 500;
					cMain.counterLabel.setText(cMain.cookieCounter + " Cookies");
					cMain.elvesNumber++;
					cMain.messageText.setText("Elves: \n [Price: " + cMain.elvesPrice + "] \n Each elf produces 7 cookie per second");
					cMain.button4.setText("Elves " + "(" + cMain.elvesNumber + ")");
					cMain.perSecond = cMain.perSecond + 7; timers.timerUpdate();
				} else {
					soundFX.playSoundEffect(error);
				}
			break;
			
			case "Lucky":
				if(cMain.cookieCounter >= cMain.luckyPrice) {
					soundFX.playSoundEffect(purchase);
					cMain.cookieCounter = cMain.cookieCounter - cMain.luckyPrice;
					cMain.luckyPrice = cMain.luckyPrice + 500;
					slots.luckyBastardFever("Lucky", 5);
					cMain.messageText.setText("Lucky: \n [Price: " + cMain.luckyPrice + "] \n" +cMain.rewardsMessage);			
				}
				else { 
					soundFX.playSoundEffect(error);
				}
			break;
			
			case "Bastard":
				if(cMain.cookieCounter >= cMain.bastardPrice) {
					soundFX.playSoundEffect(purchase);
					cMain.cookieCounter = cMain.cookieCounter - cMain.bastardPrice;
					cMain.bastardPrice = cMain.bastardPrice + 750;
					slots.luckyBastardFever("Bastard", 3);
					cMain.messageText.setText("Bastard: \n [Price: " + cMain.bastardPrice + "] \n " + cMain.rewardsMessage);
				} else {
					soundFX.playSoundEffect(error);
				}
			break;
			
			case "Fever":
				if(cMain.cookieCounter >= cMain.feverPrice) {
					soundFX.playSoundEffect(purchase);
					cMain.cookieCounter = cMain.cookieCounter - cMain.feverPrice;
					cMain.feverPrice = cMain.feverPrice + 1000;
					slots.luckyBastardFever("Bastard", 2);
					cMain.messageText.setText("Fever: \n [Price: " + cMain.feverPrice + "] \n"  + cMain.rewardsMessage);
				}
				else {
					soundFX.playSoundEffect(error);
				}
			break;
			case "Slots":
				if (cMain.slotsUnlocked==true) {
					soundFX.playSoundEffect(purchase);
					if(cMain.cookieCounter>= cMain.slotsPrice) {
					slots.luckyBastardFever("Slots", 4);
					cMain.cookieCounter = cMain.cookieCounter - cMain.slotsPrice;
					} else {
						soundFX.playSoundEffect(error);
					}
				} soundFX.playSoundEffect(error);
				
			break;
			case "Display":
				ui.displaySwitch("Cog");
				break;
			case "Shop":
				ui.displaySwitch("ItemShop");
				break;
			case "NewGame":
				cMain.window.setVisible(false);
				cMain.soundFX.stop(cMain.backgroundmusic);
				new CookieMain();
				break;
				
			case "BastardCola":
				if (cMain.cookieCounter>=cMain.colaPrice) {
					soundFX.playSoundEffect(purchase);
				cMain.colaValue = cMain.colaValue+ 1;
				cMain.cookieCounter = cMain.cookieCounter - cMain.colaPrice;
				cMain.shopMessageText.setText(cMain.cookieCounter + " Cookies \n" + "Bastard Cola \n [Price: " + cMain.colaPrice + "]\n [Amount: " + cMain.colaValue + " ] \n Wet your mouth with a bastard soda ");
				} else {
					soundFX.playSoundEffect(error);
				}
			break;
			case "BastardSausage":
				if (cMain.cookieCounter>=cMain.sausagePrice) {
					soundFX.playSoundEffect(purchase);
				cMain.sausageValue = cMain.sausageValue+1;
				cMain.cookieCounter = cMain.cookieCounter - cMain.sausagePrice;
				cMain.shopMessageText.setText(cMain.cookieCounter + " Cookies \n" +"Bastard Sausage \n [Price: " + cMain.sausagePrice + "] \n [Amount: " + cMain.sausageValue +" ] \n  Be like Action Bastard and put your mouth on a sausage. From Action Foods, if you don't buy it, you'll die");
				} else { 
					soundFX.playSoundEffect(error);
				}
			break;
			case "BastardRod":
				if (cMain.cookieCounter>=cMain.rodPrice) {
					soundFX.playSoundEffect(purchase);
				cMain.rodValue = cMain.rodValue+1;
				cMain.cookieCounter = cMain.cookieCounter - cMain.rodPrice;
				cMain.rodPrice = cMain.rodPrice +400;
				cMain.shopMessageText.setText(cMain.cookieCounter + " Cookies \n" +"Bastard Rod \n [Price: " + cMain.rodPrice + "] \n [Amount: " + cMain.rodValue +" ] \n Grab your little bastard rod and swing it at your friends and your enemies");
				} else {
					soundFX.playSoundEffect(error);
				}
			break;
			case "BastardBelt":
				if (cMain.cookieCounter>=cMain.beltPrice) {
					soundFX.playSoundEffect(purchase);
				cMain.beltValue = cMain.beltValue+1;
				cMain.cookieCounter = cMain.cookieCounter - cMain.beltPrice;
				cMain.beltPrice = cMain.beltPrice +800;
				cMain.shopMessageText.setText(cMain.cookieCounter + " Cookies \n" +"Bastard Belt \n [Price: " + cMain.beltPrice + "] \n [Amount: " + cMain.beltValue +"] \n With attachment for OSHA certification");
				} else {
					soundFX.playSoundEffect(error);
				}
			break;
			case "BastardMask":
				if (cMain.maskUnlocked==true) {
				if (cMain.cookieCounter>= cMain.maskPrice){
					soundFX.playSoundEffect(purchase);
				cMain.maskValue = cMain.maskValue+1;
				cMain.cookieCounter = cMain.cookieCounter - cMain.maskPrice;
				cMain.maskPrice = cMain.maskPrice +1600;
				cMain.shopMessageText.setText(cMain.cookieCounter + " Cookies \n" +"Bastard Mask \n [Price: " + cMain.maskPrice + "] \n[Amount: " + cMain.maskValue +"] \n With attachment for OSHA certification");
				} else  {soundFX.playSoundEffect(error);}
				}	soundFX.playSoundEffect(error);
			break;
			case "BastardArmor":
				if (cMain.cookieCounter >= cMain.armorPrice) {
					soundFX.playSoundEffect(purchase);
				cMain.armorValue = cMain.armorValue+1;
				cMain.cookieCounter = cMain.cookieCounter - cMain.armorPrice;
				cMain.armorPrice = cMain.armorPrice +2000;
				cMain.shopMessageText.setText(cMain.cookieCounter + " Cookies \n" +"Lucky Bastard Fever Bastard Armor \n [Price: " + cMain.armorPrice + "] \n [Amount: " + cMain.armorValue +"Lucky Bastard Fever Armor");
				} else {
					soundFX.playSoundEffect(error);
				}
			break;
		
				
		}
	
	}

}