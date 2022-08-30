package com.tbonegames.enemies;

public class DrHitlerCloneAndroid extends Enemies{

	public DrHitlerCloneAndroid() {
		
		name = "Dr. Hitler Clone Android";
		hp = 100000;
		attack = 15000;
		defense = 50;
		dodge = 10;
		disableDuration = 0;
		
		//Massive Damage
		attack1 = "Chicken Shit Satelite";
		attack1Command = "Satelite";
		attack1Damage = 30000;
		attack1Chance = 0;
		
		attack2 = "Laser Eyes";
		attack2Command = "LaserEyes";
		attack2Damage = 26000;
		attack2Chance = 2;
		
		//Attack Damage Increase by 4 per turn
		attack3 = "Inhuman Stamina";
		attack3Command = "InhumanStamina";
		attack3Damage = 50000;
		attack3Chance = 4;
		
		//does more the more Chicken Shit Satelite is used
		attack4 = "Nuclear Holocaust";
		attack4Command = "Holocaust";
		attack4Damage = 200000;
		attack4Chance = 8;
		
	}
	
}
