package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class UnlockTimer {

	ClientMain cMain;
	
	public UnlockTimer(ClientMain cMain) {
		this.cMain = cMain;
	}
	
	public void unlockItemTimer() {
		cMain.unlockTimers = new Timer(100, new ActionListener() {

			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (cMain.logosCounter > cMain.highestLogo) {
					cMain.highestLogo = cMain.logosCounter;
				}
				String s = String.format("%.1f", (cMain.perSecond + (cMain.rounds * 38)));
				cMain.perSecLabel.setText("Per Second: " + s);
				
				cMain.dayLabel.setText("Day: "+ cMain.day);
				
				cMain.counterLabel.setText(cMain.logosCounter + " Logos");
				cMain.shopCookieLabel.setText(cMain.logosCounter + " Logos");
				cMain.inCombatHPLabel.setText("HP:" + cMain.logosCounter);
				
				if (cMain.itemInventory.cards[0].unlocked == false) {
					if (cMain.logosCounter >= cMain.itemInventory.cards[0].unlockAmount) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.itemInventory.cards[0].unlocked = true;
						cMain.button1.setText(cMain.itemInventory.cards[0].cardName + "("+cMain.itemInventory.cards[0].totalCurrentAmount+")");
					}
				} else {
					cMain.button1.setText(cMain.itemInventory.cards[0].cardName + "("+cMain.itemInventory.cards[0].totalCurrentAmount+")");
				}
				
				
				
				if (cMain.itemInventory.cards[1].unlocked == false) {
					if (cMain.logosCounter >= cMain.itemInventory.cards[1].unlockAmount) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.itemInventory.cards[1].unlocked = true;
						cMain.button2.setText(cMain.itemInventory.cards[1].cardName + "("+cMain.itemInventory.cards[1].totalCurrentAmount+")");
					}
				} else {
					cMain.button2.setText(cMain.itemInventory.cards[1].cardName + "("+cMain.itemInventory.cards[1].totalCurrentAmount+")");
				}
				
				
				
				if (cMain.itemInventory.cards[2].unlocked == false) {
					if (cMain.logosCounter >= cMain.itemInventory.cards[2].unlockAmount) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.itemInventory.cards[2].unlocked = true;
						cMain.button3.setText(cMain.itemInventory.cards[2].cardName + "("+cMain.itemInventory.cards[2].totalCurrentAmount+")");
					}
				} else {
					cMain.button3.setText(cMain.itemInventory.cards[2].cardName + "("+cMain.itemInventory.cards[2].totalCurrentAmount+")");
				}
				
				if (cMain.itemInventory.cards[3].unlocked == false) {
					if (cMain.logosCounter >= cMain.itemInventory.cards[3].unlockAmount) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.itemInventory.cards[3].unlocked = true;
						cMain.button4.setText(cMain.itemInventory.cards[3].cardName + "("+cMain.itemInventory.cards[3].totalCurrentAmount+")");
					}
				} else  {
					cMain.button4.setText(cMain.itemInventory.cards[3].cardName + "("+cMain.itemInventory.cards[3].totalCurrentAmount+")");
				}
			
				
			
				if(cMain.luckyUnlocked==false) {
					if(cMain.logosCounter >= 500) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.luckyUnlocked = true;
						cMain.button5.setText("Lucky");
					} 
				} else {
						cMain.button5.setText("Lucky");
				} 
				if(cMain.bastardUnlocked==false) {
					if(cMain.logosCounter >= 750) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.bastardUnlocked = true;
						cMain.button6.setText("Bastard");
					}
				} else {
					cMain.button6.setText("Bastard");
				}
				
				if(cMain.feverUnlocked==false) {
					if(cMain.logosCounter >= 1000) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.feverUnlocked = true;
						cMain.button7.setText("Fever");
					}
				} else {
					cMain.button7.setText("Fever");
				}
				if(cMain.slotsUnlocked==false) {
					if(cMain.logosCounter >= 1000) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.slotsUnlocked = true;
						cMain.button8.setText("Slots");
					}
				}  else {
					cMain.button8.setText("Slots");
				}
				
				//unlock status for the in game items. 
				cMain.itemInventory.items[0].unlocked = unlockItem(cMain.itemInventory.items[0].unlocked, cMain.itemInventory.items[0].unlockAmount);
				
				cMain.itemInventory.items[1].unlocked = unlockItem(cMain.itemInventory.items[1].unlocked, cMain.itemInventory.items[1].unlockAmount);
				
				cMain.itemInventory.items[2].unlocked = unlockItem(cMain.itemInventory.items[2].unlocked, cMain.itemInventory.items[2].unlockAmount);
				
				cMain.itemInventory.items[3].unlocked = unlockItem(cMain.itemInventory.items[3].unlocked, cMain.itemInventory.items[3].unlockAmount);
				
				cMain.itemInventory.items[4].unlocked = unlockItem(cMain.itemInventory.items[4].unlocked, cMain.itemInventory.items[4].unlockAmount);
				
				//unlock status for the in game weapons
				cMain.itemInventory.weapons[0].unlocked = unlockItem(cMain.itemInventory.weapons[0].unlocked, cMain.itemInventory.weapons[0].unlockAmount);
				
				cMain.itemInventory.weapons[1].unlocked = unlockItem(cMain.itemInventory.weapons[1].unlocked, cMain.itemInventory.weapons[1].unlockAmount);
				
				cMain.itemInventory.weapons[2].unlocked = unlockItem(cMain.itemInventory.weapons[2].unlocked, cMain.itemInventory.weapons[2].unlockAmount);
				
				cMain.itemInventory.weapons[3].unlocked = unlockItem(cMain.itemInventory.weapons[3].unlocked, cMain.itemInventory.weapons[3].unlockAmount);
				
				cMain.itemInventory.weapons[4].unlocked = unlockItem(cMain.itemInventory.weapons[4].unlocked, cMain.itemInventory.weapons[4].unlockAmount);
				
				//unlock status for the in game armor
				
				cMain.itemInventory.armor[0].unlocked = unlockItem(cMain.itemInventory.armor[0].unlocked, cMain.itemInventory.armor[0].unlockAmount);
				
				cMain.itemInventory.armor[1].unlocked = unlockItem(cMain.itemInventory.armor[1].unlocked, cMain.itemInventory.armor[1].unlockAmount);
				
				cMain.itemInventory.armor[2].unlocked = unlockItem(cMain.itemInventory.armor[2].unlocked, cMain.itemInventory.armor[2].unlockAmount);
				
				cMain.itemInventory.armor[3].unlocked = unlockItem(cMain.itemInventory.armor[3].unlocked, cMain.itemInventory.armor[3].unlockAmount);
				
				cMain.itemInventory.armor[4].unlocked = unlockItem(cMain.itemInventory.armor[4].unlocked, cMain.itemInventory.armor[4].unlockAmount);
				

				//unlock status for the in game buffs
				
				cMain.itemInventory.buffs[0].unlocked = unlockItem(cMain.itemInventory.buffs[0].unlocked, cMain.itemInventory.buffs[0].unlockAmount);
				
				cMain.itemInventory.buffs[1].unlocked = unlockItem(cMain.itemInventory.buffs[1].unlocked, cMain.itemInventory.buffs[1].unlockAmount);
				
				cMain.itemInventory.buffs[2].unlocked = unlockItem(cMain.itemInventory.buffs[2].unlocked, cMain.itemInventory.buffs[2].unlockAmount);
				
				cMain.itemInventory.buffs[3].unlocked = unlockItem(cMain.itemInventory.buffs[3].unlocked, cMain.itemInventory.buffs[3].unlockAmount);
				
				cMain.itemInventory.buffs[4].unlocked = unlockItem(cMain.itemInventory.buffs[4].unlocked, cMain.itemInventory.buffs[4].unlockAmount);
				
			
			}
			
		});
		
	}
	public boolean unlockItem(boolean unlocked, int unlockAmount) {
		if (unlocked == false) {
			if (cMain.logosCounter >= unlockAmount) {
			cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
			unlocked = true;
			}
		} return unlocked;	
	}
	
	public void startUnlockTimer() {
		unlockItemTimer();
		cMain.unlockTimers.start();
	}
}
