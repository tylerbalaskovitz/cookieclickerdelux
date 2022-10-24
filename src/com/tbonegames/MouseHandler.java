package com.tbonegames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import javax.swing.JButton;

public class MouseHandler implements MouseListener, Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	int switcherStep, savedValue, clickedButton;
	ClientMain cMain;


	
	
	public void shopSwitcher (int x, JButton buttonSource) {

	if 	(cMain.displayItemsShop == true && cMain.switcherEnabled == true && cMain.itemInventory.items[x].unlocked == true) {
		if (switcherStep == 0) {
			savedValue = x;
		cMain.itemInventory.itemsHolder[0] = cMain.itemInventory.items[x];
		}
		if (switcherStep == 1) {
			cMain.itemInventory.items[savedValue] = cMain.itemInventory.items[x];
			cMain.itemInventory.items[x] = cMain.itemInventory.itemsHolder[0];
			cMain.shopMessageText.setText(cMain.itemInventory.items[x].itemName+ " \n [Price: " + cMain.itemInventory.items[x].itemPrice + "]\n [Amount: " + cMain.itemInventory.items[x].totalCurrentAmount +" ] \n" + cMain.itemInventory.items[x].itemDescription);
		}
		switcherStep++;
		
		
	};
	if (cMain.displayWeaponsShop == true && cMain.switcherEnabled == true  && cMain.itemInventory.weapons[x].unlocked == true) {
		if (switcherStep == 0) {
			savedValue = x;
		cMain.itemInventory.weaponsHolder[0] = cMain.itemInventory.weapons[x];
		}
		if (switcherStep == 1) {
			cMain.itemInventory.weapons[savedValue] = cMain.itemInventory.weapons[x];
			cMain.itemInventory.weapons[x] = cMain.itemInventory.weaponsHolder[0];
			cMain.shopMessageText.setText(cMain.itemInventory.weapons[x].weaponName + " \n [Price: " + cMain.itemInventory.weapons[x].weaponPrice + "] \n [Amount: " + cMain.itemInventory.weapons[x].totalCurrentAmount +" ] \n" + cMain.itemInventory.weapons[x].weaponDescription);
	}
		switcherStep++;
		
	};
	
	if (cMain.displayArmorShop == true && cMain.switcherEnabled == true  && cMain.itemInventory.armor[x].unlocked == true) {
		if (switcherStep == 0) {
			savedValue = x;
		cMain.itemInventory.armorHolder[0] = cMain.itemInventory.armor[x];
		}
		if (switcherStep == 1) {
			cMain.itemInventory.armor[savedValue] = cMain.itemInventory.armor[x];
			cMain.itemInventory.armor[x] = cMain.itemInventory.armorHolder[0];	
			cMain.shopMessageText.setText(cMain.itemInventory.armor[x].armorName + " \n [Price: " + cMain.itemInventory.armor[x].armorPrice + "] \n [Amount: " + cMain.itemInventory.armor[x].totalCurrentAmount +"\n" + cMain.itemInventory.armor[x].armorDescription);

		}
		
		switcherStep++;
		
	};
	if (cMain.displayBuffsShop == true && cMain.switcherEnabled == true  && cMain.itemInventory.buffs[x].unlocked == true) {
		if (switcherStep == 0) {
			savedValue = x;
			cMain.itemInventory.buffsHolder[0] = cMain.itemInventory.buffs[x];
			}
			if (switcherStep == 1) {
				cMain.itemInventory.buffs[savedValue] = cMain.itemInventory.buffs[x];
				cMain.itemInventory.buffs[x] = cMain.itemInventory.buffsHolder[0];
				cMain.shopMessageText.setText(cMain.itemInventory.buffs[x].buffName + " \n [Price: " + cMain.itemInventory.buffs[x].buffPrice + "] \n [Amount: " + cMain.itemInventory.buffs[x].currentAmount +"\n" + cMain.itemInventory.buffs[x].buffDescription);
			}
		switcherStep++;
		
	};
	
	if (switcherStep >= 2) {
		cMain.shopHandler.displayShopNavigation();
		if (cMain.displayItemsShop == true) {
		cMain.shopHandler.displayItemsShop();
		}
		if (cMain.displayArmorShop == true) {
			cMain.shopHandler.displayArmorShop();
		}
		if (cMain.displayWeaponsShop == true) {
			cMain.shopHandler.displayWeaponsShop();
		}
		if (cMain.displayBuffsShop == true) {
			cMain.shopHandler.displayBuffsShop();
		}
		cMain.soundFX.playSoundEffect(cMain.soundFXValues.slotWinner);
		switcherStep = 0;
		savedValue = 0;
	}
	}
	
	public void burnItem(int x) {
		if 	(cMain.displayBuffsShop == true && cMain.burnCardEnabled == true && cMain.itemInventory.buffs[x].unlocked == true && cMain.itemInventory.burnManager[0] <10) {
			
			cMain.shopMessageText.setText(cMain.itemInventory.buffs[x].buffName+ " \n [Price: " + cMain.itemInventory.buffs[x].buffPrice + "]\n [Amount: " + cMain.itemInventory.buffs[x].currentAmount +" ] \n" + cMain.itemInventory.buffs[x].buffDescription);
		cMain.itemInventory.buffs[x]= cMain.itemInventory.buffs[cMain.itemInventory.burnManager[0]];
		cMain.itemInventory.burnManager[0]++;
		};
		if 	(cMain.displayItemsShop == true && cMain.burnCardEnabled == true && cMain.itemInventory.items[x].unlocked == true && cMain.itemInventory.burnManager[1] <10) {
				
				cMain.shopMessageText.setText(cMain.itemInventory.items[x].itemName+ " \n [Price: " + cMain.itemInventory.items[x].itemPrice + "]\n [Amount: " + cMain.itemInventory.items[x].totalCurrentAmount +" ] \n" + cMain.itemInventory.items[x].itemDescription);
			cMain.itemInventory.items[x]= cMain.itemInventory.items[cMain.itemInventory.burnManager[1]];
			cMain.itemInventory.burnManager[1]++;
		};
		if 	(cMain.displayWeaponsShop == true && cMain.burnCardEnabled == true && cMain.itemInventory.weapons[x].unlocked == true && cMain.itemInventory.burnManager[2] <10) {
			
			cMain.shopMessageText.setText(cMain.itemInventory.weapons[x].weaponName+ " \n [Price: " + cMain.itemInventory.weapons[x].weaponPrice + "]\n [Amount: " + cMain.itemInventory.weapons[x].totalCurrentAmount +" ] \n" + cMain.itemInventory.weapons[x].weaponDescription);
		cMain.itemInventory.weapons[x]= cMain.itemInventory.weapons[cMain.itemInventory.burnManager[2]];
		cMain.itemInventory.burnManager[2]++;
		};
		if 	(cMain.displayArmorShop == true && cMain.burnCardEnabled == true && cMain.itemInventory.armor[x].unlocked == true  && cMain.itemInventory.burnManager[3] <10) {
			
			cMain.shopMessageText.setText(cMain.itemInventory.armor[x].armorName+ " \n [Price: " + cMain.itemInventory.armor[x].armorPrice + "]\n [Amount: " + cMain.itemInventory.armor[x].totalCurrentAmount +" ] \n" + cMain.itemInventory.armor[x].armorDescription);
		cMain.itemInventory.armor[x]= cMain.itemInventory.armor[cMain.itemInventory.burnManager[3]];
		cMain.itemInventory.burnManager[3]++;
		};
		
		if (cMain.displayItemsShop == true) {
		cMain.shopHandler.displayItemsShop();
		}
		if (cMain.displayArmorShop == true) {
			cMain.shopHandler.displayArmorShop();
		}
		if (cMain.displayWeaponsShop == true) {
			cMain.shopHandler.displayWeaponsShop();
		}
		if (cMain.displayBuffsShop == true) {
			cMain.shopHandler.displayBuffsShop();
		}
		

	}
	
	public MouseHandler(ClientMain cMain) {
	this.cMain = cMain;	
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {

		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		JButton button = (JButton)e.getSource();

		
		if (button == cMain.shopButton0) {
			clickedButton = 0;
			shopSwitcher(clickedButton, button);
			try {
				burnItem(clickedButton);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if (button == cMain.shopButton1) {
			clickedButton = 1;
			shopSwitcher(clickedButton, button);
			try {
				burnItem(clickedButton);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if (button == cMain.shopButton2) {
			clickedButton = 2;
			shopSwitcher(clickedButton, button);
			try {
				burnItem(clickedButton);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if (button == cMain.shopButton3) {
			clickedButton = 3;
			shopSwitcher(clickedButton, button);
			try {
				burnItem(clickedButton);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if (button == cMain.shopButton4) {
			clickedButton = 4;
			shopSwitcher(clickedButton, button);
			try {
				burnItem(clickedButton);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton button = (JButton)e.getSource();
		
		if (button == cMain.button1) {
			if (cMain.itemInventory.cards[0].unlocked== false) {
				cMain.messageText.setText("This item is currently locked");
			}
			else {
				cMain.messageText.setText(cMain.itemInventory.cards[0].cardDescription);
			}
		}
		
		if (button == cMain.button2) {
			if (cMain.itemInventory.cards[1].unlocked== false) {
				cMain.messageText.setText("This item is currently locked");
			}
			else {
				cMain.messageText.setText(cMain.itemInventory.cards[1].cardDescription);
			}
		}
		
		if (button == cMain.button3) {
			if (cMain.itemInventory.cards[2].unlocked== false) {
				cMain.messageText.setText("This item is currently locked");
			}
			else {
				cMain.messageText.setText(cMain.itemInventory.cards[2].cardDescription);
			}
		}
		
		
		if (button == cMain.button4) {
			if (cMain.itemInventory.cards[3].unlocked== false) {
				cMain.messageText.setText("This item is currently locked");
			}
			else {
				cMain.messageText.setText(cMain.itemInventory.cards[3].cardDescription);
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
		
		
		if(button == cMain.shopButton0) {
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
			if (cMain.displayBuffsShop == true) {
				if (cMain.itemInventory.buffs[0].unlocked == false){
					cMain.shopMessageText.setText("This item is currently locked");
					} else {
					cMain.shopMessageText.setText(cMain.itemInventory.buffs[0].buffName + " \n [Price: " + cMain.itemInventory.buffs[0].buffPrice + "] \n [Amount: " + cMain.itemInventory.buffs[0].currentAmount +"\n" + cMain.itemInventory.buffs[0].buffDescription);	
					}
			}
			
		}
		
		if(button == cMain.shopButton1) {
			
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
				if (cMain.displayBuffsShop == true) {
					if (cMain.itemInventory.buffs[1].unlocked == false){
						cMain.shopMessageText.setText("This item is currently locked");
						} else {
						cMain.shopMessageText.setText(cMain.itemInventory.buffs[1].buffName + " \n [Price: " + cMain.itemInventory.buffs[1].buffPrice + "] \n [Amount: " + cMain.itemInventory.buffs[1].currentAmount +"\n" + cMain.itemInventory.buffs[1].buffDescription);	
						}
				}
				
		}
		
		if(button == cMain.shopButton2) {

				
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
				if (cMain.displayBuffsShop == true) {
					if (cMain.itemInventory.buffs[2].unlocked == false){
						cMain.shopMessageText.setText("This item is currently locked");
						} else {
						cMain.shopMessageText.setText(cMain.itemInventory.buffs[2].buffName + " \n [Price: " + cMain.itemInventory.buffs[2].buffPrice + "] \n [Amount: " + cMain.itemInventory.buffs[2].currentAmount +"\n" + cMain.itemInventory.buffs[2].buffDescription);	
						}
				}
			
		}
		
		if(button == cMain.shopButton3) {
			
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
			if (cMain.displayBuffsShop == true) {
				if (cMain.itemInventory.buffs[3].unlocked == false){
					cMain.shopMessageText.setText("This item is currently locked");
					} else {
					cMain.shopMessageText.setText(cMain.itemInventory.buffs[3].buffName + " \n [Price: " + cMain.itemInventory.buffs[3].buffPrice + "] \n [Amount: " + cMain.itemInventory.buffs[3].currentAmount +"\n" + cMain.itemInventory.buffs[3].buffDescription);	
					}
			}
					
		}
		
		if(button == cMain.shopButton4) {
			
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
			
			if (cMain.displayBuffsShop == true) {
				if (cMain.itemInventory.buffs[4].unlocked == false){
					cMain.shopMessageText.setText("This item is currently locked");
					} else {
					cMain.shopMessageText.setText(cMain.itemInventory.buffs[4].buffName + " \n [Price: " + cMain.itemInventory.buffs[4].buffPrice + "] \n [Amount: " + cMain.itemInventory.buffs[4].currentAmount +"\n" + cMain.itemInventory.buffs[4].buffDescription);	
					}
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
		
		else if (button== cMain.shopButton0) {
			cMain.shopMessageText.setText(null);
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
	


