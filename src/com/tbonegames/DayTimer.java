package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class DayTimer {

	SoundFX soundFX = new SoundFX();
	CookieMain cMain;
	
	public DayTimer(CookieMain cMain) {
		this.cMain = cMain;
	}
	
	public void setTimer() {
		cMain.dayTimer = new Timer(cMain.dayTimerSpeed, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				cMain.day++;
				cMain.dayLabel.setText("Day: "+ cMain.day);
				
			}
		});
	}
	
	public void timerUpdate() {
		if (cMain.dayTimerOn == false) {
			
			cMain.dayTimerOn =true;
		}
		else if(cMain.dayTimerOn ==true) {
			cMain.dayTimer.stop();
		}
		
		double speed =	1/cMain.dayPerSecond*1000;
		
		cMain.dayTimerSpeed = (int)Math.round(speed);
		
		//the %.1f is a a way for creating a format where the float(decimal) will go 1 digit deep)
		cMain.dayLabel.setText("Day: " + cMain.day);
		
		setTimer();
		cMain.dayTimer.start();
		
	}

}


