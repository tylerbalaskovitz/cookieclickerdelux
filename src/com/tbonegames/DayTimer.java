package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import com.tbonegames.enemies.AntiGravityChamber;
import com.tbonegames.enemies.Arachnobots;
import com.tbonegames.enemies.BetaCarrotine;
import com.tbonegames.enemies.CornWhole;
import com.tbonegames.enemies.DrDeflation;
import com.tbonegames.enemies.DrEnema;
import com.tbonegames.enemies.DrHitlerClone;
import com.tbonegames.enemies.DrHitlerCloneAndroid;
import com.tbonegames.enemies.FeverDemon;
import com.tbonegames.enemies.FlyingPecker;
import com.tbonegames.enemies.HenchPeckers;
import com.tbonegames.enemies.InflatableOfDoom;
import com.tbonegames.enemies.KungFujiApple;
import com.tbonegames.enemies.TheDeflowerer;
import com.tbonegames.enemies.TheGreatO;

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
				cMain.combatDayLabel.setText("Next Combat Day: " + (cMain.bossDay));
				
				//order of Boss encounters
				if (cMain.day == 20) {
					launchCombat();
					cMain.enemy = new FeverDemon();
					cMain.bossDay = 40;
				}
				if (cMain.day == 40) {
					launchCombat();
					cMain.enemy = new DrEnema();
					cMain.bossDay = 60;
				}
				if (cMain.day == 60) {
					launchCombat();
					cMain.enemy = new KungFujiApple();
					cMain.bossDay = 70;
				}
				if (cMain.day == 70) {
					launchCombat();
					cMain.enemy = new BetaCarrotine();
					cMain.bossDay = 90;
				}
				if (cMain.day == 90) {
					launchCombat();
					cMain.enemy = new AntiGravityChamber();
					cMain.bossDay = 100;
				}
				if (cMain.day == 100) {
					launchCombat();
					cMain.enemy = new CornWhole();
					cMain.bossDay = 120;
				}
				if (cMain.day == 120) {
					launchCombat();
					cMain.enemy = new DrDeflation();
					cMain.bossDay = 130;
				}
				if (cMain.day == 130) {
					launchCombat();
					cMain.enemy = new TheDeflowerer();
					cMain.bossDay = 150;
				}
				if (cMain.day == 150) {
					launchCombat();
					cMain.enemy = new TheGreatO();
					cMain.bossDay = 180;
				}
				if (cMain.day == 180) {
					launchCombat();
					cMain.enemy = new Arachnobots();
					cMain.bossDay = 190;
				}
				if (cMain.day == 190) {
					launchCombat();
					cMain.enemy = new HenchPeckers();
					cMain.bossDay = 200;
				}
				if (cMain.day == 200) {
					launchCombat();
					cMain.enemy = new InflatableOfDoom();
					cMain.bossDay = 210;
				}
				if (cMain.day == 210) {
					launchCombat();
					cMain.enemy = new FlyingPecker();
					cMain.bossDay = 220;
				}
				if (cMain.day == 220) {
					launchCombat();
					cMain.enemy = new HenchPeckers();
					cMain.bossDay = 225;
				}
				if (cMain.day == 225) {
					launchCombat();
					cMain.enemy = new FlyingPecker();
					cMain.bossDay = 230;
				}
				if (cMain.day == 230) {
					launchCombat();
					cMain.enemy = new HenchPeckers();
					cMain.bossDay = 245;
				}
				if (cMain.day == 245) {
					launchCombat();
					cMain.enemy = new DrHitlerClone();
					cMain.bossDay = 260;
				}
				if (cMain.day == 260) {
					launchCombat();
					cMain.enemy = new DrHitlerCloneAndroid();
					cMain.bossDay = 80;
				}
				
			}
		});
	}
	
	public void launchCombat() {
	cMain.ui.closeAllPanels();
	cMain.ui.displayCombat();
	cMain.combat.fight();
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


