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
				cMain.inCombatDayLabel.setText("Day: " + cMain.day);
				
				//order of Boss encounters
				if (cMain.day == 20) {
					cMain.enemy = new FeverDemon();
					launchCombat();
					cMain.bossDay = 40;
					statTracker();
				}
				if (cMain.day == 40) {
					cMain.enemy = new DrEnema();
					launchCombat();
					cMain.bossDay = 60;
					statTracker();
				}
				if (cMain.day == 60) {
					cMain.enemy = new KungFujiApple();
					launchCombat();
					cMain.bossDay = 70;
					statTracker();
				}
				if (cMain.day == 70) {
					cMain.enemy = new BetaCarrotine();
					launchCombat();
					cMain.bossDay = 90;
					statTracker();
				}
				if (cMain.day == 90) {
					cMain.enemy = new AntiGravityChamber();
					launchCombat();
					cMain.bossDay = 100;
					statTracker();
				}
				if (cMain.day == 100) {
					cMain.enemy = new CornWhole();
					launchCombat();
					cMain.bossDay = 120;
					statTracker();
				}
				if (cMain.day == 120) {
					cMain.enemy = new DrDeflation();
					launchCombat();
					cMain.bossDay = 130;
					statTracker();
				}
				if (cMain.day == 130) {
					cMain.enemy = new TheDeflowerer();
					launchCombat();
					cMain.bossDay = 150;
					statTracker();
				}
				if (cMain.day == 150) {
					cMain.enemy = new TheGreatO();
					launchCombat();
					cMain.bossDay = 180;
					statTracker();
				}
				if (cMain.day == 180) {
					cMain.enemy = new Arachnobots();
					launchCombat();
					cMain.bossDay = 190;
					statTracker();
				}
				if (cMain.day == 190) {
					cMain.enemy = new HenchPeckers();
					launchCombat();
					cMain.bossDay = 200;
					statTracker();
				}
				if (cMain.day == 200) {
					cMain.enemy = new InflatableOfDoom();
					launchCombat();
					cMain.bossDay = 210;
					statTracker();
				}
				if (cMain.day == 210) {
					cMain.enemy = new FlyingPecker();
					launchCombat();
					cMain.bossDay = 220;
					statTracker();
				}
				if (cMain.day == 220) {
					cMain.enemy = new HenchPeckers();
					launchCombat();
					cMain.bossDay = 225;
					statTracker();
				}
				if (cMain.day == 225) {
					cMain.enemy = new FlyingPecker();
					launchCombat();
					cMain.bossDay = 230;
					statTracker();
				}
				if (cMain.day == 230) {
					cMain.enemy = new HenchPeckers();
					launchCombat();
					cMain.bossDay = 245;
					statTracker();
				}
				if (cMain.day == 245) {
					cMain.enemy = new DrHitlerClone();
					launchCombat();
					cMain.bossDay = 260;
					statTracker();
				}
				if (cMain.day == 260) {
					cMain.enemy = new DrHitlerCloneAndroid();
					launchCombat();
					cMain.bossDay = 280;
					statTracker();
				}
				
			}
		});
	}
	
	public void statTracker() {
		System.out.println("Day" + cMain.day + ", Logos: " + cMain.logosCounter + ". Armor:" + cMain.armorValue + 
				" \n Rod" + cMain.rodValue + "Mask:" + cMain.maskValue + ". Belt:" + cMain.beltValue + "\n Cola:" + cMain.colaValue + "Sausage" + cMain.sausageValue
				+ "\n =============================");
		
		
	}
	
	public void launchCombat() {
	cMain.ui.closeAllPanels();
	cMain.ui.displayCombat();
	cMain.numberOfActions = 1;
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


