package com.tbonegames.enemies;

public class TheGreatO extends Enemies{

	public TheGreatO() {
		name = "The Great O";
		hp = 9000;
		attack = 2000;
		defense = 10;
		dodge = 10;
		disableDuration = 0;
		
		attackDisableCounter = 0;
		blockDisableCounter = 0;
		itemDisableCounter = 0;
		buffsDisableCounter = 0;
		
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
		specialMessage = "";
	}
	
	
	
	public void special1() {
		attackDisableCounter += 2;
		blockDisableCounter += 2;
		itemDisableCounter += 2;
		buffsDisableCounter += 2;
		specialMessage = "The Great O has done a complete disabled. \n Attacks: " + attackDisableCounter + "\n Blocks: " + blockDisableCounter + "\n Items: " + 
		itemDisableCounter + "\n Buffs: " + buffsDisableCounter;
	}

	public void special2() {
		
	}
	
	public void special3() {
		attack3Damage *= 2;
		attack4Damage *=2;
		specialMessage = "The Great O grows more powerful.";
	}
	
	public void special4() {
		
	}
}
