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
			cMain.messageText.setText("Cursor: \n [Price: " + cMain.cursorPrice + "] \n AutoClicks once every 10 seconds");
		}
		
		if(button == cMain.button2) {
			if(cMain.grandpaUnlocked==false) {
				cMain.messageText.setText("This item is currently locked");
			} else {
				cMain.messageText.setText("Grandpa: \n [Price: " + cMain.grandpaPrice + "] \n Each grandpa produces 1 cookie per second");
			}
		}
		if(button == cMain.button3) {
			if(cMain.grandmaUnlocked==false) {
				
			
				cMain.messageText.setText("This item is currently locked");
			} else {
				cMain.messageText.setText("Grandma: \n [Price: " + cMain.grandmaPrice + "] \n Each grandma produces 3 cookie per second");
			}
		}
		
		if(button == cMain.button4) {
			if(cMain.elvesUnlocked==false) {
				cMain.messageText.setText("This item is currently locked");
			} else {
				cMain.messageText.setText("Elves: \n [Price: " + cMain.elvesPrice + "] \n Each elf produces 7 cookie per second");
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
				cMain.messageText.setText("Fever: \n [Price: " + cMain.feverPrice + "] \n Roll the dice, you lucky bastard! One of the two costs to the prices above will be halved, or quartered");
			}
		}
		
		if(button == cMain.button8) {
			if(cMain.slotsUnlocked==false) {
				cMain.messageText.setText("This item is currently locked");
			} else {
				cMain.messageText.setText("Slots: \n [Price: " + cMain.slotsPrice + "] \n Pull that Bastard Rod, you lucky bastard and get a little action!");
			}
		}
		
		
		//buttons for the shop
		if(button == cMain.shopButton1) {
			if(cMain.slotsUnlocked==false) {
				cMain.shopMessageText.setText("This item is currently locked");
			} else {
				cMain.shopMessageText.setText("Slots: \n [Price: " + cMain.slotsPrice + "] \n Pull that Bastard Rod, you lucky bastard and get a little action!");
			}
		}
		
		if(button == cMain.shopButton2) {
			if(cMain.slotsUnlocked==false) {
				cMain.shopMessageText.setText("This item is currently locked");
			} else {
				cMain.shopMessageText.setText("Slots: \n [Price: " + cMain.slotsPrice + "] \n Pull that Bastard Rod, you lucky bastard and get a little action!");
			}
		}
		
		if(button == cMain.shopButton3) {
			if(cMain.slotsUnlocked==false) {
				cMain.shopMessageText.setText("This item is currently locked");
			} else {
				cMain.shopMessageText.setText("Slots: \n [Price: " + cMain.slotsPrice + "] \n Pull that Bastard Rod, you lucky bastard and get a little action!");
			}
		}
		
		if(button == cMain.shopButton4) {
			if(cMain.slotsUnlocked==false) {
				cMain.shopMessageText.setText("This item is currently locked");
			} else {
				cMain.shopMessageText.setText("Slots: \n [Price: " + cMain.slotsPrice + "] \n Pull that Bastard Rod, you lucky bastard and get a little action!");
			}
		}
		
		if(button == cMain.shopButton5) {
			if(cMain.slotsUnlocked==false) {
				cMain.shopMessageText.setText("This item is currently locked");
			} else {
				cMain.shopMessageText.setText("Slots: \n [Price: " + cMain.slotsPrice + "] \n Pull that Bastard Rod, you lucky bastard and get a little action!");
			}
		}
		
		if(button == cMain.shopButton6) {
			if(cMain.slotsUnlocked==false) {
				cMain.shopMessageText.setText("This item is currently locked");
			} else {
				cMain.shopMessageText.setText("Slots: \n [Price: " + cMain.slotsPrice + "] \n Pull that Bastard Rod, you lucky bastard and get a little action!");
			}
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
		
	}
	
	}
	


