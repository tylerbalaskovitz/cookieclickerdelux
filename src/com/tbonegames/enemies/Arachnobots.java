package com.tbonegames.enemies;

import java.io.Serializable;

public class Arachnobots extends Enemies  implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public Arachnobots() {
		
		name = "Arachnobots";
		hp = 200000;
		attack = 2000;
		defense = 16;
		dodge = 10;
		disableDuration = 0;
		
		attackDisableCounter = 0;
		blockDisableCounter = 0;
		itemDisableCounter = 0;
		buffsDisableCounter = 0;
		
		//Everything is disabled. Lose a turn.
		attack1 = "Mind Control";
		attack1Command = "MindControl";
		attack1Damage = 2200;
		attack1Chance = 0;
		
		//Large Amounts of Damage
		attack2 = "Car Crash";
		attack2Command = "Car Crash";
		attack2Damage = 13000;
		attack2Chance = 2;
		
		attack3 = "Kamikaze";
		attack3Command = "Kamikaze";
		attack3Damage = 20000;
		attack3Chance = 5;
		
		//restores their HP
		attack4 = "ArachnoBots";
		attack4Command = "ArachnoBots";
		attack4Damage = 2;
		attack4Chance = 6;
		specialMessage = "";
	}
	
	
	
	public void special1() {
		attackDisableCounter = 2;
		blockDisableCounter = 2;
		itemDisableCounter = 2;
		buffsDisableCounter = 2;
		
	}

	public void special2() {
		
	}
	
	public void special3() {
		
	}
	
	public void special4() {
		specialMessage = "The Arachnobots recovered health. ";
		double healingHP = (double)hp *.25;
		hp += (int)healingHP;
	}
}
