package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.Timer;

public class UnlockTimer implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

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
				
				cMain.counterLabel.setText(cMain.logosCounter + " Logos");
				cMain.shopCookieLabel.setText(cMain.logosCounter + " Logos");
				cMain.inCombatHPLabel.setText("HP:" + cMain.logosCounter);
				
				if(cMain.whiteyUnlocked==false) {
					if(cMain.logosCounter >= 100) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.whiteyUnlocked = true;
						cMain.button2.setText("Whitey " + "(" + cMain.whiteyNumber + ")");
					}
				} else if (cMain.whiteyUnlocked == true){
					cMain.button2.setText("Whitey " + "(" + cMain.whiteyNumber + ")");
				}
				
				if(cMain.lollipopUnlocked==false) {
					if(cMain.logosCounter >= 200) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.lollipopUnlocked = true;
						cMain.button3.setText("Lollipop " + "(" + cMain.lollipopNumber + ")");
					}
				} else if (cMain.lollipopUnlocked == true){
					cMain.button3.setText("Lollipop " + "(" + cMain.lollipopNumber + ")");
				}
				
				if(cMain.docUnlocked==false) {
					if(cMain.logosCounter >= 500) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.docUnlocked = true;
						cMain.button4.setText("Doc " + "(" + cMain.docNumber + ")");
					}
				} else if (cMain.docUnlocked == true){
					cMain.button4.setText("Doc " + "(" + cMain.docNumber + ")");
				}
				
			
				if(cMain.luckyUnlocked==false) {
					if(cMain.logosCounter >= 500) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.luckyUnlocked = true;
						cMain.button5.setText("Lucky");
					}
				} 
				if(cMain.bastardUnlocked==false) {
					if(cMain.logosCounter >= 750) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.bastardUnlocked = true;
						cMain.button6.setText("Bastard");
					}
				}
				
				if(cMain.feverUnlocked==false) {
					if(cMain.logosCounter >= 1000) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.feverUnlocked = true;
						cMain.button7.setText("Fever");
					}
				} 
				if(cMain.slotsUnlocked==false) {
					if(cMain.logosCounter >= 1000) {
						cMain.soundFX.playSoundEffect(cMain.soundFXValues.unlock);
						cMain.slotsUnlocked = true;
						cMain.button8.setText("Slots");
					}
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
