package com.tbonegames.enemies;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class InflatableOfDoom extends Enemies  implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	public InflatableOfDoom() {
		name ="The Inflatable of Doom";
		hp = 300000;
		attack = 5000;
		defense = 50;
		dodge = 10;
		disableDuration = 0;
		
		attackDisableCounter = 0;
		blockDisableCounter = 0;
		itemDisableCounter = 0;
		buffsDisableCounter = 0;
		
		attack1 = "Tsunami";
		attack1Command = "Tsunami";
		attack1Damage = 3000;
		attack1Chance = 0;
		
		attack2 = "";
		attack2Command = "";
		attack2Damage = 0;
		attack2Chance = 10;
		
		attack3 = "";
		attack3Command = "";
		attack3Damage = 0;
		attack3Chance = 11;
		
		attack4 = "";
		attack4Command = "";
		attack4Damage = 0;
		attack4Chance = 12;
		
		
	}
	
	public void special1(ClientMain cMain) {
		attack1Damage *= 2;
		attack *=2;
	}

	public void special2(ClientMain cMain) {
		
	}
	
	public void special3(ClientMain cMain) {
		
	}
	
	public void special4(ClientMain cMain) {
		
	}
}
