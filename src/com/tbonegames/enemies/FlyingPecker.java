package com.tbonegames.enemies;

import java.io.Serializable;

public class FlyingPecker extends Enemies  implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	public FlyingPecker () {
	name = "Flying Pecker";
	hp = 400000;
	attack = 5000;
	defense = 50;
	dodge = 10;
	disableDuration = 0;
	
	attackDisableCounter = 0;
	blockDisableCounter = 0;
	itemDisableCounter = 0;
	buffsDisableCounter = 0;
	
	attack1 = "the Big Pecker with feathers";
	attack1Command = "BigPecker";
	attack1Damage = 8000;
	attack1Chance = 0;
	
	//High hitting energy ball
	attack2 = "Poly-Blast";
	attack2Command = "PolyBlast";
	attack2Damage = 12000;
	attack2Chance = 2;
	
	attack3 = "Split Your Egg in Two";
	attack3Command = "EggSplit";
	attack3Damage = 16000;
	attack3Chance = 4;
	
	attack4 = "ArachnoBots";
	attack4Command = "ArachnoBots";
	attack4Damage = 20000;
	attack4Chance = 8;

	specialMessage = "";
	}

	
	
	public void special1() {
		
	}
	
	public void special2() {
		attack2Damage *= 4;
		attack *= 4;
		specialMessage = "Flying Pecker's attack and Poly-Blast grew much stronger!";
	}
	
	public void special3() {
		
	}
	
	public void special4() {
		
	}
}
