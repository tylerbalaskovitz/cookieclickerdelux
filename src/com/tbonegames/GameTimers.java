package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Timer;

public class GameTimers {
	
	public URL unlock = getClass().getClassLoader().getResource("audio/healsound.wav");
	
	
	CookieMain cMain;
	
	public GameTimers(CookieMain cMain) {
		this.cMain = cMain;
	}
	
	public void setTimer() {
		cMain.timer = new Timer(cMain.timerSpeed, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (cMain.inCombat == false) {
				cMain.logosCounter+=cMain.counterUpgrade;
				}
				cMain.counterLabel.setText(cMain.logosCounter + " Logos");
				cMain.shopCookieLabel.setText(cMain.logosCounter + " Logos");
				cMain.inCombatHPLabel.setText("HP:" + cMain.logosCounter);
				
			
				if(cMain.whiteyUnlocked==false) {
					if(cMain.logosCounter >= 100) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.whiteyUnlocked = true;
						cMain.button2.setText("Whitey " + "(" + cMain.whiteyNumber + ")");
					}
				} else if (cMain.whiteyUnlocked == true){
					cMain.button2.setText("Whitey " + "(" + cMain.whiteyNumber + ")");
				}
				
				if(cMain.lollipopUnlocked==false) {
					if(cMain.logosCounter >= 200) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.lollipopUnlocked = true;
						cMain.button3.setText("Lollipop " + "(" + cMain.lollipopNumber + ")");
					}
				} else if (cMain.lollipopUnlocked == true){
					cMain.button3.setText("Lollipop " + "(" + cMain.lollipopNumber + ")");
				}
				
				if(cMain.docUnlocked==false) {
					if(cMain.logosCounter >= 500) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.docUnlocked = true;
						cMain.button4.setText("Doc " + "(" + cMain.docNumber + ")");
					}
				} else if (cMain.docUnlocked == true){
					cMain.button4.setText("Doc " + "(" + cMain.docNumber + ")");
				}
				
			
				if(cMain.luckyUnlocked==false) {
					if(cMain.logosCounter >= 500) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.luckyUnlocked = true;
						cMain.button5.setText("Lucky");
					}
				} 
				if(cMain.bastardUnlocked==false) {
					if(cMain.logosCounter >= 750) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.bastardUnlocked = true;
						cMain.button6.setText("Bastard");
					}
				}
				
				if(cMain.feverUnlocked==false) {
					if(cMain.logosCounter >= 1000) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.feverUnlocked = true;
						cMain.button7.setText("Fever");
					}
				} 
				if(cMain.slotsUnlocked==false) {
					if(cMain.logosCounter >= 1500) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.slotsUnlocked = true;
						cMain.button8.setText("Slots");
					}
				} 
				if(cMain.nutsUnlocked==false) {
					if(cMain.logosCounter >= 500) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.nutsUnlocked = true;
					}
				}
				if(cMain.chipsUnlocked==false) {
					if(cMain.logosCounter >= 750) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.chipsUnlocked = true;
					}
				}
				if(cMain.juiceUnlocked==false) {
					if(cMain.logosCounter >= 1000) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.juiceUnlocked = true;
					}
				}

				if(cMain.rodUnlocked==false) {
					if(cMain.logosCounter >= 400) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.rodUnlocked = true;	
					}
				} 
				if(cMain.beltUnlocked==false) {
					if(cMain.logosCounter >= 800) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.beltUnlocked = true;
						}
					}
				
				
				if(cMain.vibratingShaftUnlocked==false) {
					if(cMain.logosCounter >= 3000) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.vibratingShaftUnlocked = true;
					}
				} 
				if(cMain.nitrogenBombUnlocked==false) {
					if(cMain.logosCounter >= 10000) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.nitrogenBombUnlocked = true;
					}
				} 
				if(cMain.maskUnlocked==false) {
					if(cMain.logosCounter >= 1600) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.maskUnlocked = true;
					}
				} 
				if(cMain.shoulderPadsUnlocked==false) {
					if(cMain.logosCounter >= 500) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.shoulderPadsUnlocked = true;
					}
				}
				if(cMain.glovesUnlocked==false) {
					if(cMain.logosCounter >= 1000) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.glovesUnlocked = true;
					}
				} 
				if(cMain.bootsUnlocked==false) {
					if(cMain.logosCounter >= 1600) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.bootsUnlocked = true;
					}
				} 
				if(cMain.slotBeltUnlocked==false) {
					if(cMain.logosCounter >= 1750) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.slotBeltUnlocked = true;
					}
				} 
				
				if(cMain.armorUnlocked==false) {
					if(cMain.logosCounter >= 2000) {
						cMain.soundFX.playSoundEffect(unlock);
						cMain.armorUnlocked = true;
					}
				} 
				
				
			}
		});
	}
	
	public void timerUpdate() {
		if (cMain.timerOn == false) {
			
			cMain.timerOn=true;
		}
		else if(cMain.timerOn==true) {
			cMain.timer.stop();
		}
		double speed = 1/cMain.perSecond*1000;
		
		cMain.timerSpeed = (int)Math.round(speed);
		
		//the %.1f is a a way for creating a format where the float(decimal) will go 1 digit deep)
		String s = String.format("%.1f", cMain.perSecond);
		cMain.perSecLabel.setText("Per Second: " + s);
		
		setTimer();
		cMain.timer.start();
		
	}

}
