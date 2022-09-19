package com.tbonegames.enemies;

public class DrHitlerClone extends Enemies{

	public DrHitlerClone() {
	name = "Dr. Hitler Clone";
	hp = 75000;
	attack = 10000;
	defense = 50;
	dodge = 10;
	disableDuration = 0;
	
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



	public void special1() {
	
	}

	public void special2() {
	
	}
	
	public void special3() {
		
	}
	
	public void special4() {
		
	}
	
}
