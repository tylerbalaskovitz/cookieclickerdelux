package com.tbonegames.enemies;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class DrHitlerClone extends Enemies implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public DrHitlerClone() {
	name = "Dr. Hitler Clone";
	hp = 750000;
	attack = 10000;
	defense = 1000;
	dodge = 10;
	disableDuration = 0;
	
	attackDisableCounter = 0;
	blockDisableCounter = 0;
	itemDisableCounter = 0;
	buffsDisableCounter = 0;
	
	attack1 = "Mad Sciences";
	attack1Command = "MadScience";
	attack1Damage = 10000;
	attack1Chance = 0;
	
	attack2 = "Kill All The Dumb People who Advocate Killing";
	attack2Command = "KillAll";
	attack2Damage = 30000;
	attack2Chance = 2;
	
	//Everything is disabled for 3 turns
	attack3 = "Brainwash Using Detergent With Bleach";
	attack3Command = "Brainwash";
	attack3Damage = 15000;
	attack3Chance = 6;
	
	//Blows everything to Kingdom Come
	attack4 = "Hindenburg";
	attack4Command = "Hindenburg";
	attack4Damage = 100000;
	attack4Chance = 8;
	specialMessage = "";
	}


	public void special1(ClientMain cMain) {
		
	}

	public void special2(ClientMain cMain) {
		
	}
	
	public void special3(ClientMain cMain) {
		attackDisableCounter += 3;
		blockDisableCounter += 3;
		itemDisableCounter += 3;
		buffsDisableCounter += 3;
	}
	
	public void special4(ClientMain cMain) {
		
	}
	

	
}
