package com.tbonegames.enemies;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class AntiGravityChamber extends Enemies  implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public AntiGravityChamber(){
		name = "Anti-Gravity Chamber";
		hp = 3000;
		attack = 300;
		defense = 100;
		dodge = 10;
		disableDuration = 0;
		
		attackDisableCounter = 0;
		blockDisableCounter = 0;
		itemDisableCounter = 0;
		buffsDisableCounter = 0;
		
		attack1 = "Anti-Gravity Pounding";
		attack1Command = "BigPecker";
		attack1Damage = 500;
		attack1Chance = 0;
		
		attack2 = "Bird Shit";
		attack2Command = "BirdShit";
		attack2Damage = 1;
		attack2Chance = 9;
		
		attack3 = "Fly";
		attack3Command = "Fly";
		attack3Damage = 1;
		attack3Chance = 10;
		
		attack4 = "ArachnoBots";
		attack4Command = "ArachnoBots";
		attack4Damage = 1;
		attack4Chance = 11;
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
