package com.tbonegames.enemies;

public class FlyingPecker extends Enemies {
	
	public FlyingPecker () {
	name = "Flying Pecker";
	hp = 40000;
	attack = 5000;
	defense = 50;
	dodge = 10;
	disableDuration = 0;
	
	attack1 = "the Big Pecker with feathers";
	attack1Command = "BigPecker";
	attack1Damage = 8000;
	attack1Chance = 0;
	
	//High hitting energy ball
	attack2 = "Poly Blast";
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
		
	}
	
	public void special3() {
		
	}
	
	public void special4() {
		
	}
}
