package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class GameTimers {
	
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
						cMain.grandpaUnlocked = true;
						cMain.button2.setText("Grandpa " + "(" + cMain.grandpaNumber + ")");
					}
				} else if (cMain.grandpaUnlocked == true){
					cMain.button2.setText("Grandpa " + "(" + cMain.grandpaNumber + ")");
				}
				
				if(cMain.grandmaUnlocked==false) {
					if(cMain.cookieCounter >= 200) {
						cMain.grandmaUnlocked = true;
						cMain.button3.setText("Grandma " + "(" + cMain.grandmaNumber + ")");
					}
				} else if (cMain.grandmaUnlocked == true){
					cMain.button3.setText("Grandma " + "(" + cMain.grandmaNumber + ")");
				}
				
				if(cMain.elvesUnlocked==false) {
					if(cMain.cookieCounter >= 500) {
						cMain.elvesUnlocked = true;
						cMain.button4.setText("Elves " + "(" + cMain.elvesNumber + ")");
					}
				} else if (cMain.elvesUnlocked == true){
					cMain.button4.setText("Elves " + "(" + cMain.elvesNumber + ")");
				}
				
			
				if(cMain.luckyUnlocked==false) {
					if(cMain.cookieCounter >= 500) {
						cMain.luckyUnlocked = true;
						cMain.button5.setText("Lucky");
					}
				} 
				if(cMain.bastardUnlocked==false) {
					if(cMain.cookieCounter >= 750) {
						cMain.bastardUnlocked = true;
						cMain.button6.setText("Bastard");
					}
				}
				
				if(cMain.feverUnlocked==false) {
					if(cMain.cookieCounter >= 1000) {
						cMain.feverUnlocked = true;
						cMain.button7.setText("Fever");
					}
				} 
				if(cMain.slotsUnlocked==false) {
					if(cMain.cookieCounter >= 1500) {
						cMain.slotsUnlocked = true;
						cMain.button8.setText("Slots");
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
