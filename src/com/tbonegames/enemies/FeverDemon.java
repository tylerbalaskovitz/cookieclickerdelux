package com.tbonegames.enemies;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class FeverDemon extends Enemies implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public FeverDemon() {
		name = "The Red Hot Fever Demon";
		hp = 300;
		attack = 50;
		defense = 10;
		dodge = 10;
		disableDuration = 0;
		
		attackDisableCounter = 0;
		blockDisableCounter = 0;
		itemDisableCounter = 0;
		buffsDisableCounter = 0;
		
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
		
		specialMessage = "";
	}
	
	
	
	public void special1(ClientMain cMain) {
		
	}

	public void special2(ClientMain cMain) {
		
	}
	
	public void special3(ClientMain cMain) {
		
	}
	
	public void special4(ClientMain cMain) {
		
	}
}
