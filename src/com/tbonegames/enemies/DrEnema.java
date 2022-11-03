package com.tbonegames.enemies;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class DrEnema extends Enemies implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public DrEnema() {
		name = "Dr. Enema";
		hp = 1100;
		attack = 100;
		defense = 100;
		dodge = 10;
		disableDuration = 0;
		
		attackDisableCounter = 0;
		blockDisableCounter = 0;
		itemDisableCounter = 0;
		buffsDisableCounter = 0;
		
		attack1 = "Enema Ray";
		attack1Command = "EnemaRay";
		attack1Damage = 200;
		attack1Chance = 0;
		
		attack2 = "Anal Clench";
		attack2Command = "AnalClench";
		attack2Damage = 240;
		attack2Chance = 2;
		
		attack3 = "Brown Water Gun";
		attack3Command = "Fly";
		attack3Damage = 250;
		attack3Chance = 4;
		
		attack4 = "Enema Blast";
		attack4Command = "ArachnoBots";
		attack4Damage = 250;
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
