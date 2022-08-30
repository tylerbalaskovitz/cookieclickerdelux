package com.tbonegames.enemies;

public class Arachnobots extends Enemies {

	public Arachnobots() {
		
		name = "Arachnobots";
		hp = 50000;
		attack = 2000;
		defense = 50;
		dodge = 10;
		disableDuration = 0;
		
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
		attack4Damage = 0;
		attack4Chance = 6;
	}
	
}
