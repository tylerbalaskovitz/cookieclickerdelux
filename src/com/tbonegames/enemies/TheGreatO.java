package com.tbonegames.enemies;

public class TheGreatO extends Enemies{

	public TheGreatO() {
		name = "The Great O";
		hp = 300;
		attack = 100;
		defense = 50;
		dodge = 10;
		disableDuration = 0;
		
		//Eludes an enemies attacks -- None of your attacks work -- booleans
		attack1 = "Elusion";
		attack1Command = "Elusion";
		attack1Damage = 0;
		attack1Chance = 0;
		
		
		attack2 = "Clones";
		attack2Command = "Clones";
		attack2Damage = 0;
		attack2Chance = 2;
		
		//Damage Doubles Each Turn
		attack3 = "Wear You Out";
		attack3Command = "WearYouOut";
		attack3Damage = 0;
		attack3Chance = 4;
		
		//Never Travel Alone. Strongest attack
		attack4 = "Never Travel Alone";
		attack4Command = "NeverTravelAlone";
		attack4Damage = 502;
		attack4Chance = 6;
	}
	
}
