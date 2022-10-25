package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class GameTimers {

	
	
	ClientMain cMain;
	
	public GameTimers(ClientMain cMain) {
		this.cMain = cMain;
	}
	
	public void setTimer() {
		cMain.timer = new Timer(cMain.timerSpeed, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			
				
				if (cMain.inCombat == false) {
				cMain.logosCounter+=(cMain.counterUpgrade+cMain.rounds);
				
				if (cMain.perSecond >= 76) {
				cMain.perSecond /= 2;
				cMain.rounds++;
				
				}
				}
				cMain.counterLabel.setText(cMain.logosCounter + " Logos");
				cMain.shopCookieLabel.setText(cMain.logosCounter + " Logos");
				cMain.inCombatHPLabel.setText("HP:" + cMain.logosCounter);
				
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
		String s = String.format("%.1f", (cMain.perSecond + (cMain.rounds * 38)));
		cMain.perSecLabel.setText("Per Second: " + s);
		
		setTimer();
		cMain.timer.start();
		
	}

}
