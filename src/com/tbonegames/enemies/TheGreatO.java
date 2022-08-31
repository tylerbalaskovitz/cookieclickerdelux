package com.tbonegames.enemies;

public class TheGreatO extends Enemies{

	public TheGreatO() {
		name = "The Great O";
		hp = 9000;
		attack = 2000;
		defense = 50;
		dodge = 10;
		disableDuration = 0;
		
		//Eludes an enemies attacks -- Full Disable
		attack1 = "Elusion";
		attack1Command = "Elusion";
		attack1Damage = 2500;
		attack1Chance = 0;
		
		
		attack2 = "Clones";
		attack2Command = "Clones";
		attack2Damage = 6000;
		attack2Chance = 2;
		
		//Damage Doubles Each Turn
		attack3 = "Wear You Out";
		attack3Command = "WearYouOut";
		attack3Damage = 8000;
		attack3Chance = 4;
		
		//Never Travel Alone. Strongest attack
		attack4 = "Never Travel Alone";
		attack4Command = "NeverTravelAlone";
		attack4Damage = 11000;
		attack4Chance = 6;
	}
	
}
