package com.tbonegames.enemies;

public class FeverDemon extends Enemies{

	public FeverDemon() {
		name = "The Red Hot Fever Demon";
		hp = 300;
		attack = 100;
		defense = 50;
		dodge = 10;
		disableDuration = 0;
		
		attack1 = "Flaming Griddle of Doom";
		attack1Command = "FlamingGriddle";
		attack1Damage = 100;
		attack1Chance = 0;
		
		attack2 = "Tasty Pops";
		attack2Command = "TastyPops";
		attack2Damage = 50;
		attack2Chance = 2;
		
		attack3 = "A Car Parked in the Sun for 5 Hours";
		attack3Command = "ParkedCar";
		attack3Damage = 75;
		attack3Chance = 4;
		
		attack4 = "Flaming Ass Crack of Death";
		attack4Command = "FlamingAss";
		attack4Damage = 150;
		attack4Chance = 6;
	}
	
}
