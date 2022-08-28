package com.tbonegames.enemies;

public class Arachnobots extends Enemies {

	public Arachnobots() {
		
		name = "Arachnobots";
		hp = 5000;
		attack = 100;
		defense = 50;
		dodge = 10;
		disableDuration = 0;
		
		//Everything is disabled. Lose a turn.
		attack1 = "Mind Control";
		attack1Command = "MindControl";
		attack1Damage = 0;
		attack1Chance = 0;
		
		//Large Amounts of Damage
		attack2 = "Car Crash";
		attack2Command = "Car Crash";
		attack2Damage = 1000;
		attack2Chance = 2;
		
		attack3 = "Fly";
		attack3Command = "Fly";
		attack3Damage = 0;
		attack3Chance = 4;
		
		attack4 = "ArachnoBots";
		attack4Command = "ArachnoBots";
		attack4Damage = 0;
		attack4Chance = 6;
	}
	
}
