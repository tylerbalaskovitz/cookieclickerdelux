package com.tbonegames.enemies;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class DrHitlerCloneAndroid extends Enemies implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	
	public DrHitlerCloneAndroid() {
		
		name = "Dr. Hitler Clone Android";
		hp = 4000000;
		attack = 15000;
		defense = 200;
		dodge = 10;
		disableDuration = 0;
		
		attackDisableCounter = 0;
		blockDisableCounter = 0;
		itemDisableCounter = 0;
		buffsDisableCounter = 0;
		
		//Massive Damage
		attack1 = "Chicken Shit Satelite";
		attack1Command = "Satelite";
		attack1Damage = 30000;
		attack1Chance = 0;
		
		attack2 = "Laser Eyes";
		attack2Command = "LaserEyes";
		attack2Damage = 26000;
		attack2Chance = 2;
		
		//Attack Damage Increase by 4 per turn
		attack3 = "Inhuman Stamina";
		attack3Command = "InhumanStamina";
		attack3Damage = 50000;
		attack3Chance = 4;
		
		//does more the more Chicken Shit Satelite is used
		attack4 = "Nuclear Holocaust";
		attack4Command = "Holocaust";
		attack4Damage = 200000;
		attack4Chance = 8;
		
		specialMessage = "";
		
		
	}
	
	
	
	public void special1(ClientMain cMain) {
		specialMessage = "Dr. Hitler Clone Android's Nuclear Holocaust is armed and ready to annahilate. ";
		attack4Damage *= 1000;
	}

	public void special2(ClientMain cMain) {
		
	}
	
	public void special3(ClientMain cMain) {
		attack3Damage *= 4;
		specialMessage = "Dr. Hitler Clone Android's Damage increase and he recovered health. ";
		double healingHP = (double)hp *.25;
		hp += (int)healingHP;
	}
	
	public void special4(ClientMain cMain) {
		
	}
	
	
	
}
