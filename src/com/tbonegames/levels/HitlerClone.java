package com.tbonegames.levels;

import com.tbonegames.ClientMain;
import com.tbonegames.enemies.AntiGravityChamber;
import com.tbonegames.enemies.Arachnobots;
import com.tbonegames.enemies.BetaCarrotine;
import com.tbonegames.enemies.CornWhole;
import com.tbonegames.enemies.DrDeflation;
import com.tbonegames.enemies.DrEnema;
import com.tbonegames.enemies.DrHitlerClone;
import com.tbonegames.enemies.DrHitlerCloneAndroid;
import com.tbonegames.enemies.Enemies;
import com.tbonegames.enemies.FeverDemon;
import com.tbonegames.enemies.FlyingPecker;
import com.tbonegames.enemies.HenchPeckers;
import com.tbonegames.enemies.InflatableOfDoom;
import com.tbonegames.enemies.KungFujiApple;
import com.tbonegames.enemies.TheDeflowerer;
import com.tbonegames.enemies.TheGreatO;

public class HitlerClone extends Levels{

	public HitlerClone() {
		levelName = "The Fourth Reich";
		
		levelDescription = "Dastardly foes and henchmen waiting for you in this 18 boss battle slugfest.";
		
		level = null;
		
		combatDayArray = null;
	}
	public void createLevel() {
		if (level == null) {
			level = new Enemies[18];	
		}
			level[0] = new FeverDemon();  
			level[1] = new DrEnema();
			level[2] = new KungFujiApple();
			level[3] = new BetaCarrotine();
			level[4] = new AntiGravityChamber();
			level[5] = new CornWhole();
			level[6] = new DrDeflation();
			level[7] = new TheDeflowerer();
			level[8] = new TheGreatO();
			level[9] = new Arachnobots();
			level[10] = new HenchPeckers();
			level[11] = new InflatableOfDoom();
			level[12] = new FlyingPecker();
			level[13] = new HenchPeckers();
			level[14] = new FlyingPecker();
			level[15] = new HenchPeckers();
			level[16] = new DrHitlerClone();
			level[17] = new DrHitlerCloneAndroid();
	}
	
	public void createBossDay() {
		if (combatDayArray == null) {
			combatDayArray = new int [18];
		}
		combatDayArray[0] = 20;
		combatDayArray[1] = 40;
		combatDayArray[2] = 60;
		combatDayArray[3] = 70;
		combatDayArray[4] = 90;
		combatDayArray[5] = 100;
		combatDayArray[6] = 120;
		combatDayArray[7] = 130;
		combatDayArray[8] = 150;
		combatDayArray[9] = 180;
		combatDayArray[10] = 190;
		combatDayArray[11] = 200;
		combatDayArray[12] = 210;
		combatDayArray[13] = 220;
		combatDayArray[14] = 225;
		combatDayArray[15] = 230;
		combatDayArray[16] = 245;
		combatDayArray[17] = 260;
		
		
	}
	
	public void bossLoader(int enemiesDefeated, ClientMain cMain) {
		cMain.bossDay = combatDayArray[enemiesDefeated];
		if (cMain.day >= cMain.bossDay) {
			cMain.enemy = level[enemiesDefeated];
			
		}
		
	}
	
}
