package com.tbonegames.enemies;

public class DrEnema extends Enemies{

	public DrEnema() {
		name = "Dr. Enema";
		hp = 300;
		attack = 100;
		defense = 50;
		dodge = 10;
		disableDuration = 0;
		
		attack1 = "Enema Ray";
		attack1Command = "EnemaRay";
		attack1Damage = 100;
		attack1Chance = 0;
		
		attack2 = "Bird Shit";
		attack2Command = "BirdShit";
		attack2Damage = 20;
		attack2Chance = 2;
		
		attack3 = "Fly";
		attack3Command = "Fly";
		attack3Damage = 20;
		attack3Chance = 4;
		
		attack4 = "ArachnoBots";
		attack4Command = "ArachnoBots";
		attack4Damage = 50;
		attack4Chance = 6;
	}
	
}
