package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CookieHandler implements ActionListener {
	CookieMain cMain;
	
	
	
	public void actionPerformed(ActionEvent event) {
		
		
		
		String action = event.getActionCommand();
		
		
		
		
		switch (action) {
		case "cookie": cMain.cookieCounter++; cMain.counterLabel.setText(cMain.cookieCounter + " Cookies"); break;
			case "Cursor": if (cMain.cookieCounter >= cMain.cursorPrice) {
				cMain.cookieCounter = cMain.cookieCounter - cMain.cursorPrice;
				cMain.cursorPrice = cMain.cursorPrice + 5;
				cMain.counterLabel.setText(cMain.cookieCounter + " Cookies");
				cMain.messageText.setText("Cursor: \n [Price: " + cMain.cursorPrice + "] \n AutoClicks once every 10 seconds");
				cMain.cursorNumber++;
				cMain.button1.setText("Cursor " + "(" + cMain.cursorNumber + ")");
				cMain.perSecond = cMain.perSecond + 0.1; cMain.timerUpdate();
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
				cMain.perSecond = cMain.perSecond + 1; cMain.timerUpdate();
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
					cMain.perSecond = cMain.perSecond + 3; cMain.timerUpdate();
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
					cMain.perSecond = cMain.perSecond + 7; cMain.timerUpdate();
				} else {
					cMain.messageText.setText("You need more cookies!"); 
				}
			break;
			
			case "Lucky":
				if(cMain.cookieCounter >= cMain.luckyPrice) {
					cMain.cookieCounter = cMain.cookieCounter - cMain.luckyPrice;
					cMain.luckyPrice = cMain.luckyPrice + 500;
					cMain.luckyBastardFever("Lucky", 5);
					cMain.messageText.setText("Lucky: \n [Price: " + cMain.luckyPrice + "] \n" + cMain.rewardsMessage);
					
					
					
					
				}
			break;
			
			case "Bastard":
				if(cMain.cookieCounter >= cMain.bastardPrice) {
					cMain.cookieCounter = cMain.cookieCounter - cMain.bastardPrice;
					cMain.bastardPrice = cMain.bastardPrice + 750;
					cMain.luckyBastardFever("Bastard", 3);
					cMain.messageText.setText("Bastard: \n [Price: " + cMain.bastardPrice + "] \n " + cMain.rewardsMessage);
					
					
					
				}
			break;
			
			case "Fever":
				if(cMain.cookieCounter >= cMain.feverPrice) {
					cMain.cookieCounter = cMain.cookieCounter - cMain.feverPrice;
					cMain.feverPrice = cMain.feverPrice + 1000;
					cMain.luckyBastardFever("Bastard", 2);
					cMain.messageText.setText("Fever: \n [Price: " + cMain.feverPrice + "] \n"  + cMain.rewardsMessage);
					
					
					
				}
			break;
			case "Slots":
				if(cMain.cookieCounter>= cMain.slotsPrice) {
					cMain.luckyBastardFever("Slots", 4);
					cMain.cookieCounter = cMain.cookieCounter - cMain.slotsPrice;
				}
			break;
			case "Display":
				cMain.displaySwitch("Cog");
				break;
			case "Shop":
				cMain.displaySwitch("ItemShop");
				break;
				
		}
	
	}

}


