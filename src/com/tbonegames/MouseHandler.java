package com.tbonegames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MouseHandler implements MouseListener{
	
	CookieMain cMain;
	
	public MouseHandler(CookieMain cMain) {
	this.cMain = cMain;	
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton button = (JButton)e.getSource();
		
		if(button == cMain.button1) {
			cMain.messageText.setText("Shin-Chan: \n [Price: " + cMain.cursorPrice + "] \n AutoClicks once every 10 seconds");
		}
		
		if(button == cMain.button2) {
			if(cMain.whiteyUnlocked==false) {
				cMain.messageText.setText("This item is currently locked");
			} else {
				cMain.messageText.setText("Whitey: \n [Price: " + cMain.whiteyPrice + "] \n Each Whitey produces 1 logo per second");
			}
		}
		if(button == cMain.button3) {
			if(cMain.lollipopUnlocked==false) {
				
			
				cMain.messageText.setText("This item is currently locked");
			} else {
				cMain.messageText.setText("Lollipop: \n [Price: " + cMain.lollipopPrice + "] \n Each Lollipop produces 3 logo per second");
			}
		}
		
		if(button == cMain.button4) {
			if(cMain.docUnlocked==false) {
				cMain.messageText.setText("This item is currently locked");
			} else {
				cMain.messageText.setText("Doc: \n [Price: " + cMain.docPrice + "] \n Each Doc produces 7 logo per second");
			}
		}
		if(button == cMain.button5) {
			if (cMain.luckyUnlocked==false) {
				cMain.messageText.setText("This item is currently locked");
			} else {
				cMain.messageText.setText("Lucky: \n [Price: " + cMain.luckyPrice + "] \n Roll the dice, you lucky bastard! One of the four costs to the prices above will be halved");
				
			}
		}
		
		if(button == cMain.button6) {
			if(cMain.bastardUnlocked==false) {
				cMain.messageText.setText("This item is currently locked");
			} else {
				cMain.messageText.setText("Bastard: \n [Price: " + cMain.bastardPrice + "] \nRoll the dice, you lucky bastard! One of the three costs to the prices above will be halved");
			}
		}
		if(button == cMain.button7) {
			if(cMain.feverUnlocked==false) {
				
			
				cMain.messageText.setText("This item is currently locked");
			} else {
				cMain.messageText.setText("Fever: \n [Price: " + cMain.feverPrice + "] \n Roll the dice, you lucky bastard! One of the two costs to the prices above will be halved!");
			}
		}
		
		if(button == cMain.button8) {
			if(cMain.slotsUnlocked==false) {
				cMain.messageText.setText("This item is currently locked");
			} else {
				cMain.messageText.setText("Slots: \n [Price: " + cMain.slotsPrice + "] \n Pull that Bastard Rod, you lucky bastard and get a little action!");
			}
		}
		
		
		if(button == cMain.shopButton1) {
			if (cMain.displayItemsShop == true) {
				cMain.shopMessageText.setText("Bastard Cola \n [Price: " + cMain.colaPrice + "]\n [Amount: " + cMain.colaValue +" ] \n Wet your mouth with a bastard soda ");
			}
			if (cMain.displayWeaponsShop == true) {
				if (cMain.rodUnlocked == false){
				cMain.shopMessageText.setText("This item is currently locked");
				} else {
				cMain.shopMessageText.setText("Bastard Rod \n [Price: " + cMain.rodPrice + "] \n [Amount: " + cMain.rodValue +" ] \n Grab your little bastard rod and swing it at your friends and your enemies");	
				}
				
			}
			
			if (cMain.displayArmorShop == true) {
				if (cMain.armorUnlocked == false){
					cMain.shopMessageText.setText("This item is currently locked");
					} else {
					cMain.shopMessageText.setText("Lucky Bastard Fever Bastard Armor \n [Price: " + cMain.armorPrice + "] \n [Amount: " + cMain.armorValue +"Lucky Bastard Fever Armor");	
					}
			}
			
		}
		
		if(button == cMain.shopButton2) {
			
				if (cMain.displayItemsShop == true) {
				cMain.shopMessageText.setText("Bastard Sausage \n [Price: " + cMain.sausagePrice + "] \n [Amount: " + cMain.sausageValue +" ] \n Be like Action Bastard and put your mouth on a sausage. From Action Foods, if you don't buy it, you'll die");
				}
				
				if (cMain.displayWeaponsShop == true) {
					if (cMain.beltUnlocked == false){
						cMain.shopMessageText.setText("This item is currently locked");
						} else {
							cMain.shopMessageText.setText("Bastard Belt \n [Price: " + cMain.beltPrice + "] \n [Amount: " + cMain.beltValue +"] \n With growing wire for OSHA compliance");	
						}	
				}
				
				if (cMain.displayArmorShop == true) {
					
				}
				
		}
		
		if(button == cMain.shopButton3) {

				
				if (cMain.displayItemsShop == true){
					
					
				}
				
				if (cMain.displayWeaponsShop == true) {
					if (cMain.maskUnlocked == false){
						cMain.shopMessageText.setText("This item is currently locked");
						} else {
						cMain.shopMessageText.setText("Bastard Mask \n [Price: " + cMain.maskPrice + "] \n[Amount: " + cMain.maskValue +"] \n With attachment for OSHA certification");	
						}
				}
				
				if (cMain.displayArmorShop == true) {
					
				}
			
		}
		
		if(button == cMain.shopButton4) {
			
			if (cMain.displayItemsShop == true){
				
				
			}
			
			if (cMain.displayWeaponsShop == true) {
				
			}
			
			if (cMain.displayArmorShop == true) {
				
			}
			
					
		}
		
		if(button == cMain.shopButton5) {
			
			if (cMain.displayItemsShop == true){
				
				
			}
			
			if (cMain.displayWeaponsShop == true) {
				
			}
			
			if (cMain.displayArmorShop == true) {
				
			}
			

		}
		
		if(button == cMain.shopButton6) {
			
			if (cMain.displayItemsShop == true){
				
				
			}
			
			if (cMain.displayWeaponsShop == true) {
				
			}
			
			if (cMain.displayArmorShop == true) {
				
			}

		}
		
		if (button == cMain.shopNavigationButton1) {
			cMain.shopMessageText.setText("Click here to buy weapons useful throughout the game. They can be used when facing off against enemies and helpful when trying to get more logos.");
			
		}
		
		if (button == cMain.shopNavigationButton2) {
			cMain.shopMessageText.setText("Click here to buy armor useful throughout the game. These can reduce damage in combat and more.");
			
		}
		
		if (button == cMain.shopNavigationButton3) {
			cMain.shopMessageText.setText("Click here to buy items. These can make you stronger in combat, heal you in combat and more.");
			
		}
		
		if (button == cMain.shopNavigationButton4) {
			cMain.shopMessageText.setText("These are very useful in combat and can give you all sorts of special abilities");
			
		}
		
		
		
		
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton button = (JButton)e.getSource();
		if(button == cMain.button1) {
			cMain.messageText.setText(null);
		}
		else if (button == cMain.button2) {
			cMain.messageText.setText(null);
		}
		else if (button == cMain.button3) {
			cMain.messageText.setText(null);
		}
		else if (button == cMain.button4) {
			cMain.messageText.setText(null);
		}
		else if (button == cMain.button5) {
			cMain.messageText.setText(null);
		}
		else if (button == cMain.button6) {
			cMain.messageText.setText(null);
		}
		else if (button == cMain.button7) {
			cMain.messageText.setText(null);
		}
		//by exiting(not hovering over the 8th button, the text for the regular part of the game appear.
		else if (button == cMain.button8) {
			if (cMain.luckyUnlocked == true) {
				cMain.button5.setText("Lucky");
			}
			if (cMain.bastardUnlocked == true) {
				cMain.button6.setText("Bastard");
			}
			if (cMain.feverUnlocked == true) {
				cMain.button7.setText("Fever");
			}
			cMain.messageText.setText(null);
			
		}
		
		else if (button== cMain.shopButton1) {
			cMain.shopMessageText.setText(null);
		}
		
		else if (button== cMain.shopButton2) {
			cMain.shopMessageText.setText(null);
		}
		
		else if (button== cMain.shopButton3) {
			cMain.shopMessageText.setText(null);
		}
		
		else if (button== cMain.shopButton4) {
			cMain.shopMessageText.setText(null);
		}
		
		else if (button== cMain.shopButton5) {
			cMain.shopMessageText.setText(null);
		}
		
		else if (button== cMain.shopButton6) {
			cMain.shopMessageText.setText(null);
		}
		
		else if (button== cMain.shopNavigationButton1) {
			cMain.shopMessageText.setText(null);
		}
		
		else if (button== cMain.shopNavigationButton2) {
			cMain.shopMessageText.setText(null);
		}
		
		else if (button== cMain.shopNavigationButton3) {
			cMain.shopMessageText.setText(null);
		}
		
		else if (button== cMain.shopNavigationButton4) {
			cMain.shopMessageText.setText(null);
		}
		
		
	}
	
	}
	


