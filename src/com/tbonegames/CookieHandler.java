package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CookieHandler implements ActionListener{
	
	CookieMain cMain;
	UI ui;
	GameTimers timers;
	Slots slots;
	
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
		case "cookie": cMain.cookieCounter++; cMain.counterLabel.setText(cMain.cookieCounter + " Cookies"); break;
			case "Cursor": if (cMain.cookieCounter >= cMain.cursorPrice) {
				cMain.cookieCounter = cMain.cookieCounter - cMain.cursorPrice;
				cMain.cursorPrice = cMain.cursorPrice + 5;
				cMain.counterLabel.setText(cMain.cookieCounter + " Cookies");
				cMain.messageText.setText("Cursor: \n [Price: " + cMain.cursorPrice + "] \n AutoClicks" + (.1*cMain.cursorUpgradeAmount) + "time every second");
				cMain.cursorNumber++;
				cMain.button1.setText("Cursor " + "(" + cMain.cursorNumber + ")");
				cMain.perSecond = (cMain.perSecond + 0.1); timers.timerUpdate();
			} else {
				cMain.messageText.setText("You need more cookies!"); 
			}
			break;
			case "Grandpa":
			 if (cMain.cookieCounter >= cMain.grandpaPrice) {
				 cMain.cookieCounter = cMain.cookieCounter - cMain.grandpaPrice;
				 cMain.grandpaPrice = cMain.grandpaPrice + 50;
				 cMain.counterLabel.setText(cMain.cookieCounter + " Cookies");
				 cMain.grandpaNumber++;
				 cMain.messageText.setText("Grandpa: \n [Price: " + cMain.grandpaPrice + "] \n Each grandpa produces 1 cookie per second");
				 cMain.button2.setText("Grandpa " + "(" + cMain.grandpaNumber + ")");
				 cMain.perSecond = cMain.perSecond + 1; timers.timerUpdate();
			} else {
				cMain.messageText.setText("You need more cookies!"); 
			}
			break;
			case "Grandma":
				if (cMain.cookieCounter >= cMain.grandmaPrice) {
					cMain.cookieCounter = cMain.cookieCounter - cMain.grandmaPrice;
					cMain.grandmaPrice = cMain.grandmaPrice + 200;
					cMain.counterLabel.setText(cMain.cookieCounter + " Cookies");
					cMain.grandmaNumber++;
					cMain.messageText.setText("Grandma: \n [Price: " + cMain.grandmaPrice + "] \n Each grandma produces 3 cookie per second");
					cMain.button3.setText("Grandpa " + "(" + cMain.grandmaNumber + ")");
					cMain.perSecond = cMain.perSecond + 3; timers.timerUpdate();
				} else {
					cMain.messageText.setText("You need more cookies!"); 
				}
			break;
			case "Elves":
				if (cMain.cookieCounter >= cMain.elvesPrice) {
					cMain.cookieCounter = cMain.cookieCounter - cMain.elvesPrice;
					cMain.elvesPrice = cMain.elvesPrice + 500;
					cMain.counterLabel.setText(cMain.cookieCounter + " Cookies");
					cMain.elvesNumber++;
					cMain.messageText.setText("Elves: \n [Price: " + cMain.elvesPrice + "] \n Each elf produces 7 cookie per second");
					cMain.button4.setText("Elves " + "(" + cMain.elvesNumber + ")");
					cMain.perSecond = cMain.perSecond + 7; timers.timerUpdate();
				} else {
					cMain.messageText.setText("You need more cookies!"); 
				}
			break;
			
			case "Lucky":
				if(cMain.cookieCounter >= cMain.luckyPrice) {
					cMain.cookieCounter = cMain.cookieCounter - cMain.luckyPrice;
					cMain.luckyPrice = cMain.luckyPrice + 500;
					slots.luckyBastardFever("Lucky", 5);
					cMain.messageText.setText("Lucky: \n [Price: " + cMain.luckyPrice + "] \n" +cMain.rewardsMessage);
					
					
					
					
				}
			break;
			
			case "Bastard":
				if(cMain.cookieCounter >= cMain.bastardPrice) {
					cMain.cookieCounter = cMain.cookieCounter - cMain.bastardPrice;
					cMain.bastardPrice = cMain.bastardPrice + 750;
					slots.luckyBastardFever("Bastard", 3);
					cMain.messageText.setText("Bastard: \n [Price: " + cMain.bastardPrice + "] \n " + cMain.rewardsMessage);
					
					
					
				}
			break;
			
			case "Fever":
				if(cMain.cookieCounter >= cMain.feverPrice) {
					cMain.cookieCounter = cMain.cookieCounter - cMain.feverPrice;
					cMain.feverPrice = cMain.feverPrice + 1000;
					slots.luckyBastardFever("Bastard", 2);
					cMain.messageText.setText("Fever: \n [Price: " + cMain.feverPrice + "] \n"  + cMain.rewardsMessage);
					
					
					
				}
			break;
			case "Slots":
				if(cMain.cookieCounter>= cMain.slotsPrice) {
					slots.luckyBastardFever("Slots", 4);
					cMain.cookieCounter = cMain.cookieCounter - cMain.slotsPrice;
				}
			break;
			case "Display":
				ui.displaySwitch("Cog");
				break;
			case "Shop":
				ui.displaySwitch("ItemShop");
				break;
			case "NewGame":
				cMain.window.setVisible(false);
				new CookieMain();
				break;
			case "CursorUpgrade":
				//cookieCounter = cookieCounter - cursorUpgradePrice;
				//cursorUpgradePrice = cursorUpgradePrice + 2000;
				cMain.cursorUpgradeAmount = cMain.cursorUpgradeAmount+1000;
				break;
				
		}
	
	}

}