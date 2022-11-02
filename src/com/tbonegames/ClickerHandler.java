package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.tbonegames.cards.Cards;


public class ClickerHandler implements ActionListener { 
	
	DayTimer dayTimer;
	ClientMain cMain;
	UI ui;
	GameTimers timers;
	Slots slots;

	
	//each of these classes is needed to be passed into the CookieHandler class because there are values taken from each of the classes coming from the main class.
	public ClickerHandler(ClientMain cMain, UI ui, GameTimers timers, DayTimer dayTimer, Slots slots) {
		this.cMain = cMain;
		this.ui = ui;
		this.timers = timers;
		this.dayTimer = dayTimer;
		this.slots = slots;
	}
	
	
	
	public String cardDescription(Cards cards) {
		String localCardDescription = cards.cardName + "\n [Price: " + cards.cardPrice + "] \n Each " +cards.cardName +" produces " + cards.clickerIncrease+ " Logos persecond";
		return localCardDescription;
		
	}
	
	
	
	public void actionPerformed(ActionEvent event) {
		
		
		
		
		String action = event.getActionCommand();
		
		
		
		
		switch (action) {
			case "Quit":
				System.exit(0);
			break;
			case "Start":
				if (cMain.saveGameMode == null) {
				cMain.saveGameMode = "Normal";
				}
				cMain.soundFX.stop(cMain.soundFXValues.titleClip);
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.backgroundMusic.loop(cMain.soundFXValues.backgroundmusic);
				dayTimer.timerUpdate();
				cMain.unlockTimer.startUnlockTimer();
				cMain.ui.closeAllPanels();
				cMain.ui.displayMainGame();
				break;
			case "StartMenu":
				cMain.ui.closeAllPanels();
				cMain.ui.displayStartMenu();
				break;
			case "ModeSelect":
				cMain.ui.closeAllPanels();
				
				//finish this method
				cMain.ui.displayModeSelect();
				break;
			case "DeckSelect":
				cMain.ui.closeAllPanels();
				
				//finish this method
				cMain.ui.displayDeckSelect();
				break;
			case "Levels":
				cMain.ui.closeAllPanels();
				
				//finish this method
				cMain.ui.displayLevelSelect();
				break;
			case "PreChallenge":
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.challengeMode.createChallenges();
				cMain.challengeMode.labelChallengeButtons();
				cMain.ui.displayChallenges();
				break;
			case "Challenge":
				cMain.challengeMode.currentChallenge = cMain.challengeMode.challenges[cMain.challengeModeInt];
				cMain.challengeMode.currentChallenge.menuChallenge(cMain);
				cMain.saveGameMode = cMain.challengeMode.currentChallenge.challengeName;
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.ui.closeAllPanels();
				cMain.ui.displayPreStartMenu();
				break;
			case "Continue":
				cMain.saveGame.loadGame(cMain.saveLoadInt);
				cMain.backgroundMusic.loop(cMain.soundFXValues.backgroundmusic);
				cMain.soundFX.stop(cMain.soundFXValues.titleClip);
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				dayTimer.timerUpdate();
				cMain.timers.timerUpdate();
				cMain.unlockTimer.startUnlockTimer();
				timerFixer();
				if (cMain.saveGameMode == null) {
					cMain.saveGameMode = "Normal";
				}
				cMain.ui.closeAllPanels();
				cMain.ui.displayMainGame();
				break;
			case "PreStart":
				cMain.ui.displayPreStartMenu();
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				break;
			case "PreLoad":
				cMain.ui.displayPreLoadMenu();
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				break;
			case "SaveGame":
				if (cMain.challengeMode.savesDisabled == false) {
				cMain.saveGame.saveGame(cMain.saveLoadInt);
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
				}
				break;
			case "Logos": 
				cMain.logosCounter = (cMain.logosCounter + 1 + cMain.clickerBonus); 
				cMain.counterLabel.setText(cMain.logosCounter + " Logos"); 
				cMain.shopMessageText.setText(cMain.logosCounter + " Logos \n");
			break;
			case "Card0": 
			 if (cMain.logosCounter >= cMain.itemInventory.cards[0].cardPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.logosCounter -= cMain.itemInventory.cards[0].cardPrice;
				cMain.itemInventory.cards[0].cardPrice += cMain.itemInventory.cards[0].cardPriceIncrease;
				cMain.counterLabel.setText(cMain.logosCounter + " Logos");
				cMain.messageText.setText(cardDescription(cMain.itemInventory.cards[0]));
				cMain.itemInventory.cards[0].cardDescription = cardDescription(cMain.itemInventory.cards[0]);
				cMain.itemInventory.cards[0].totalCurrentAmount++;
				cMain.itemInventory.cards[0].totalAmountPurchased++;
				cMain.button1.setText(cMain.itemInventory.cards[0].cardName + "(" + cMain.itemInventory.cards[0].totalCurrentAmount + ")");
				cMain.perSecond+= cMain.itemInventory.cards[0].clickerIncrease; timers.timerUpdate();
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
			break;
			case "Card1":
				if (cMain.logosCounter >= cMain.itemInventory.cards[1].cardPrice) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
					cMain.logosCounter -= cMain.itemInventory.cards[1].cardPrice;
					cMain.itemInventory.cards[1].cardPrice += cMain.itemInventory.cards[1].cardPriceIncrease;
					cMain.counterLabel.setText(cMain.logosCounter + " Logos");
					cMain.messageText.setText(cardDescription(cMain.itemInventory.cards[1]));
					cMain.itemInventory.cards[1].cardDescription = cardDescription(cMain.itemInventory.cards[1]);
					cMain.itemInventory.cards[1].totalCurrentAmount++;
					cMain.itemInventory.cards[1].totalAmountPurchased++;
					cMain.button2.setText(cMain.itemInventory.cards[1].cardName + "(" + cMain.itemInventory.cards[1].totalCurrentAmount + ")");
					cMain.perSecond+= cMain.itemInventory.cards[1].clickerIncrease; timers.timerUpdate();
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
			break;
			case "Card2":
				if (cMain.logosCounter >= cMain.itemInventory.cards[2].cardPrice) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
					cMain.logosCounter -= cMain.itemInventory.cards[2].cardPrice;
					cMain.itemInventory.cards[2].cardPrice += cMain.itemInventory.cards[2].cardPriceIncrease;
					cMain.counterLabel.setText(cMain.logosCounter + " Logos");
					cMain.messageText.setText(cardDescription(cMain.itemInventory.cards[2]));
					cMain.itemInventory.cards[2].cardDescription = cardDescription(cMain.itemInventory.cards[2]);
					cMain.itemInventory.cards[2].totalCurrentAmount++;
					cMain.itemInventory.cards[2].totalAmountPurchased++;
					cMain.button3.setText(cMain.itemInventory.cards[2].cardName + "(" + cMain.itemInventory.cards[2].totalCurrentAmount + ")");
					cMain.perSecond+= cMain.itemInventory.cards[2].clickerIncrease;timers.timerUpdate();
				} else {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
				}
			break;
			case "Card3":
				if (cMain.logosCounter >= cMain.itemInventory.cards[3].cardPrice) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
					cMain.logosCounter -= cMain.itemInventory.cards[3].cardPrice;
					cMain.itemInventory.cards[3].cardPrice += cMain.itemInventory.cards[3].cardPriceIncrease;
					cMain.counterLabel.setText(cMain.logosCounter + " Logos");
					cMain.messageText.setText(cardDescription(cMain.itemInventory.cards[3]));
					cMain.itemInventory.cards[3].cardDescription = cardDescription(cMain.itemInventory.cards[3]);
					cMain.itemInventory.cards[3].totalCurrentAmount++;
					cMain.itemInventory.cards[3].totalAmountPurchased++;
					cMain.button4.setText(cMain.itemInventory.cards[3].cardName + "(" + cMain.itemInventory.cards[3].totalCurrentAmount + ")");
					cMain.perSecond+= cMain.itemInventory.cards[3].clickerIncrease; timers.timerUpdate();
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
				if (cMain.dayTimer != null) {
				cMain.dayTimer.stop();
				}
				if (cMain.timer != null) {
				cMain.timer.stop();
				}
				if (cMain.unlockTimers != null) {
				cMain.unlockTimers.stop();
				}
				cMain.window.setVisible(false);
				cMain.backgroundMusic.stop(cMain.soundFXValues.backgroundmusic);
				new ClientMain();
				break;
				
			
		
				
		}
		
		
	
	}
	public void timerFixer() {
		if (cMain.perSecond == 0) {
			cMain.perSecond+=.1;
			cMain.timers.timerUpdate();
			cMain.perSecond-=.1;
		}
	}

}