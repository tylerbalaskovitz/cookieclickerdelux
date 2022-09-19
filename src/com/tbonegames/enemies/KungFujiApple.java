package com.tbonegames.enemies;

public class KungFujiApple extends Enemies{

	public KungFujiApple() {
		name = "Kung Fuji Apple";
		hp = 2200;
		attack = 200;
		defense = 10;
		dodge = 10;
		disableDuration = 0;
		
		attackDisableCounter = 0;
		blockDisableCounter = 0;
		itemDisableCounter = 0;
		buffsDisableCounter = 0;
		
		attack1 = "Rotten to the Core Sphincter Clench";
		attack1Command = "SpincterClench";
		attack1Damage = 350;
		attack1Chance = 0;
		
		attack2 = "Skin Peel";
		attack2Command = "Skin Peel";
		attack2Damage = 500;
		attack2Chance = 4;
		
		attack3 = "Johnny Apple Seed";
		attack3Command = "AppleSeed";
		attack3Damage = 500;
		attack3Chance = 6;
		
		attack4 = "Plant Your Apple Seeds In Me";
		attack4Command = "PlantSeed";
		attack4Damage = 1000;
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
