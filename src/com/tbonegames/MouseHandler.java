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
				if (cMain.itemInventory.items[0].unlocked == true) {
				cMain.shopMessageText.setText(cMain.itemInventory.items[0].itemName+ " \n [Price: " + cMain.itemInventory.items[0].itemPrice + "]\n [Amount: " + cMain.itemInventory.items[0].totalCurrentAmount +" ] \n" + cMain.itemInventory.items[0].itemDescription);
				} else {
				cMain.shopMessageText.setText("This item is currently locked");	
				}
				
				}
			if (cMain.displayWeaponsShop == true) {
				if (cMain.itemInventory.weapons[0].unlocked == false){
				cMain.shopMessageText.setText("This item is currently locked");
				} else {
				cMain.shopMessageText.setText(cMain.itemInventory.weapons[0].weaponName + " \n [Price: " + cMain.itemInventory.weapons[0].weaponPrice + "] \n [Amount: " + cMain.itemInventory.weapons[0].totalCurrentAmount +" ] \n" + cMain.itemInventory.weapons[0].weaponDescription);	
				}
				
			}
			
			if (cMain.displayArmorShop == true) {
				if (cMain.itemInventory.armor[0].unlocked == false){
					cMain.shopMessageText.setText("This item is currently locked");
					} else {
					cMain.shopMessageText.setText(cMain.itemInventory.armor[0].armorName + " \n [Price: " + cMain.itemInventory.armor[0].armorPrice + "] \n [Amount: " + cMain.itemInventory.armor[0].totalCurrentAmount +"\n" + cMain.itemInventory.armor[0].armorDescription);	
					}
			}
			
		}
		
		if(button == cMain.shopButton2) {
			
				if (cMain.displayItemsShop == true) {
					if (cMain.itemInventory.items[1].unlocked == true) {
						cMain.shopMessageText.setText(cMain.itemInventory.items[1].itemName+ " \n [Price: " + cMain.itemInventory.items[1].itemPrice + "]\n [Amount: " + cMain.itemInventory.items[1].totalCurrentAmount +" ] \n" + cMain.itemInventory.items[1].itemDescription);
						} else {
						cMain.shopMessageText.setText("This item is currently locked");	
						}
				}
				
				if (cMain.displayWeaponsShop == true) {
					if (cMain.itemInventory.weapons[1].unlocked == false){
						cMain.shopMessageText.setText("This item is currently locked");
						} else {
						cMain.shopMessageText.setText(cMain.itemInventory.weapons[1].weaponName + " \n [Price: " + cMain.itemInventory.weapons[1].weaponPrice + "] \n [Amount: " + cMain.itemInventory.weapons[1].totalCurrentAmount +" ] \n" + cMain.itemInventory.weapons[1].weaponDescription);	
						}
				}
				
				if (cMain.displayArmorShop == true) {
					if (cMain.itemInventory.armor[1].unlocked == false){
						cMain.shopMessageText.setText("This item is currently locked");
						} else {
						cMain.shopMessageText.setText(cMain.itemInventory.armor[1].armorName + " \n [Price: " + cMain.itemInventory.armor[1].armorPrice + "] \n [Amount: " + cMain.itemInventory.armor[1].totalCurrentAmount +"\n" + cMain.itemInventory.armor[1].armorDescription);	
						}
				}
				
		}
		
		if(button == cMain.shopButton3) {

				
				if (cMain.displayItemsShop == true){
					if (cMain.itemInventory.items[2].unlocked == true) {
						cMain.shopMessageText.setText(cMain.itemInventory.items[2].itemName+ " \n [Price: " + cMain.itemInventory.items[2].itemPrice + "]\n [Amount: " + cMain.itemInventory.items[2].totalCurrentAmount +" ] \n" + cMain.itemInventory.items[2].itemDescription);
						} else {
						cMain.shopMessageText.setText("This item is currently locked");	
						}
					
				}
				
				if (cMain.displayWeaponsShop == true) {
					if (cMain.itemInventory.weapons[2].unlocked == false){
						cMain.shopMessageText.setText("This item is currently locked");
						} else {
						cMain.shopMessageText.setText(cMain.itemInventory.weapons[2].weaponName + " \n [Price: " + cMain.itemInventory.weapons[2].weaponPrice + "] \n [Amount: " + cMain.itemInventory.weapons[2].totalCurrentAmount +" ] \n" + cMain.itemInventory.weapons[2].weaponDescription);	
						}
				}
				
				if (cMain.displayArmorShop == true) {
					if (cMain.itemInventory.armor[2].unlocked == false){
						cMain.shopMessageText.setText("This item is currently locked");
						} else {
						cMain.shopMessageText.setText(cMain.itemInventory.armor[2].armorName + " \n [Price: " + cMain.itemInventory.armor[2].armorPrice + "] \n [Amount: " + cMain.itemInventory.armor[2].totalCurrentAmount +"\n" + cMain.itemInventory.armor[2].armorDescription);	
						}
				}
			
		}
		
		if(button == cMain.shopButton4) {
			
			if (cMain.displayItemsShop == true){
				if (cMain.itemInventory.items[3].unlocked == true) {
				cMain.shopMessageText.setText(cMain.itemInventory.items[3].itemName+ " \n [Price: " + cMain.itemInventory.items[3].itemPrice + "]\n [Amount: " + cMain.itemInventory.items[3].totalCurrentAmount +" ] \n" + cMain.itemInventory.items[3].itemDescription);
				} else {
				cMain.shopMessageText.setText("This item is currently locked");	
				}
				
			}
			
			if (cMain.displayWeaponsShop == true) {
				
				if (cMain.itemInventory.weapons[3].unlocked == false){
				cMain.shopMessageText.setText("This item is currently locked");
				} else {
				cMain.shopMessageText.setText(cMain.itemInventory.weapons[3].weaponName + " \n [Price: " + cMain.itemInventory.weapons[3].weaponPrice + "] \n [Amount: " + cMain.itemInventory.weapons[3].totalCurrentAmount +" ] \n" + cMain.itemInventory.weapons[3].weaponDescription);	
				}
				
			}
			
			if (cMain.displayArmorShop == true) {
				if (cMain.itemInventory.armor[3].unlocked == false){
					cMain.shopMessageText.setText("This item is currently locked");
					} else {
					cMain.shopMessageText.setText(cMain.itemInventory.armor[3].armorName + " \n [Price: " + cMain.itemInventory.armor[3].armorPrice + "] \n [Amount: " + cMain.itemInventory.armor[3].totalCurrentAmount +"\n " + cMain.itemInventory.armor[3].armorDescription);	
					}
			}
			
					
		}
		
		if(button == cMain.shopButton5) {
			
			if (cMain.displayItemsShop == true){
				if (cMain.itemInventory.items[4].unlocked == true) {
				cMain.shopMessageText.setText(cMain.itemInventory.items[4].itemName+ " \n [Price: " + cMain.itemInventory.items[4].itemPrice + "]\n [Amount: " + cMain.itemInventory.items[4].totalCurrentAmount +" ] \n" + cMain.itemInventory.items[4].itemDescription);
				} else {
				cMain.shopMessageText.setText("This item is currently locked");	
				}
				
			}
			
			if (cMain.displayWeaponsShop == true) {
				
				if (cMain.itemInventory.weapons[4].unlocked == false){
				cMain.shopMessageText.setText("This item is currently locked");
				} else {
				cMain.shopMessageText.setText(cMain.itemInventory.weapons[4].weaponName + " \n [Price: " + cMain.itemInventory.weapons[4].weaponPrice + "] \n [Amount: " + cMain.itemInventory.weapons[4].totalCurrentAmount +" ] \n" + cMain.itemInventory.weapons[4].weaponDescription);	
				}
				
			}
			
			if (cMain.displayArmorShop == true) {
				if (cMain.itemInventory.armor[4].unlocked == false){
					cMain.shopMessageText.setText("This item is currently locked");
					} else {
					cMain.shopMessageText.setText(cMain.itemInventory.armor[4].armorName + " \n [Price: " + cMain.itemInventory.armor[4].armorPrice + "] \n [Amount: " + cMain.itemInventory.armor[4].totalCurrentAmount +"\n " + cMain.itemInventory.armor[4].armorDescription);	
					}
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
	


