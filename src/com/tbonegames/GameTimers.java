package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Timer;

public class GameTimers {
	
	public URL unlock = getClass().getClassLoader().getResource("audio//healsound.wav");
	
	SoundFX soundFX = new SoundFX();
	CookieMain cMain;
	
	public GameTimers(CookieMain cMain) {
		this.cMain = cMain;
	}
	
	public void setTimer() {
		cMain.timer = new Timer(cMain.timerSpeed, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				cMain.cookieCounter++;
				cMain.counterLabel.setText(cMain.cookieCounter + " Cookies");
				
				
				if(cMain.grandpaUnlocked==false) {
					if(cMain.cookieCounter >= 100) {
						soundFX.playSoundEffect(unlock);
						cMain.grandpaUnlocked = true;
						cMain.button2.setText("Grandpa " + "(" + cMain.grandpaNumber + ")");
					}
				} else if (cMain.grandpaUnlocked == true){
					cMain.button2.setText("Grandpa " + "(" + cMain.grandpaNumber + ")");
				}
				
				if(cMain.grandmaUnlocked==false) {
					if(cMain.cookieCounter >= 200) {
						soundFX.playSoundEffect(unlock);
						cMain.grandmaUnlocked = true;
						cMain.button3.setText("Grandma " + "(" + cMain.grandmaNumber + ")");
					}
				} else if (cMain.grandmaUnlocked == true){
					cMain.button3.setText("Grandma " + "(" + cMain.grandmaNumber + ")");
				}
				
				if(cMain.elvesUnlocked==false) {
					if(cMain.cookieCounter >= 500) {
						soundFX.playSoundEffect(unlock);
						cMain.elvesUnlocked = true;
						cMain.button4.setText("Elves " + "(" + cMain.elvesNumber + ")");
					}
				} else if (cMain.elvesUnlocked == true){
					cMain.button4.setText("Elves " + "(" + cMain.elvesNumber + ")");
				}
				
			
				if(cMain.luckyUnlocked==false) {
					if(cMain.cookieCounter >= 500) {
						soundFX.playSoundEffect(unlock);
						cMain.luckyUnlocked = true;
						cMain.button5.setText("Lucky");
					}
				} 
				if(cMain.bastardUnlocked==false) {
					if(cMain.cookieCounter >= 750) {
						soundFX.playSoundEffect(unlock);
						cMain.bastardUnlocked = true;
						cMain.button6.setText("Bastard");
					}
				}
				
				if(cMain.feverUnlocked==false) {
					if(cMain.cookieCounter >= 1000) {
						soundFX.playSoundEffect(unlock);
						cMain.feverUnlocked = true;
						cMain.button7.setText("Fever");
					}
				} 
				if(cMain.slotsUnlocked==false) {
					if(cMain.cookieCounter >= 1500) {
						soundFX.playSoundEffect(unlock);
						cMain.slotsUnlocked = true;
						cMain.button8.setText("Slots");
					}
				} 
				if(cMain.rodUnlocked==false) {
					if(cMain.cookieCounter >= 400) {
						soundFX.playSoundEffect(unlock);
						cMain.rodUnlocked = true;
						cMain.shopButton3.setText("Bastard Rod");
					}
				} 
				if(cMain.beltUnlocked==false) {
					if(cMain.cookieCounter >= 800) {
						soundFX.playSoundEffect(unlock);
						cMain.beltUnlocked = true;
						cMain.shopButton4.setText("Bastard Belt");
					}
				} 
				if(cMain.maskUnlocked==false) {
					if(cMain.cookieCounter >= 1600) {
						soundFX.playSoundEffect(unlock);
						cMain.maskUnlocked = true;
						cMain.shopButton5.setText("Bastard Mask");
					}
				} 
				if(cMain.armorUnlocked==false) {
					if(cMain.cookieCounter >= 2000) {
						soundFX.playSoundEffect(unlock);
						cMain.armorUnlocked = true;
						cMain.shopButton6.setText("Bastard Armor");
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
