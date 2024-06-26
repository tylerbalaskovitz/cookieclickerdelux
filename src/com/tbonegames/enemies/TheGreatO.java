package com.tbonegames.enemies;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class TheGreatO extends Enemies implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public TheGreatO() {
		name = "The Great O";
		hp = 20000;
		attack = 2000;
		defense = 140;
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
	
	
	public void special1(ClientMain cMain) {
		attackDisableCounter += 2;
		blockDisableCounter += 2;
		itemDisableCounter += 2;
		buffsDisableCounter += 2;
		specialMessage = "The Great O has done a complete disabled. \n Attacks: " + attackDisableCounter + "\n Blocks: " + blockDisableCounter + "\n Items: " + 
		itemDisableCounter + "\n Buffs: " + buffsDisableCounter;
	}

	public void special2(ClientMain cMain) {
		
	}
	
	public void special3(ClientMain cMain) {
		attack3Damage *= 2;
		attack4Damage *=2;
		cMain.playerDamage /=2;
		if (cMain.playerDamage <= 0){
			cMain.playerDamage =1;
		}
		specialMessage = "The Great O grows more powerful. You grow considerably weaker!";
	}
	
	public void special4(ClientMain cMain) {
		
	}
}
