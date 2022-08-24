package com.tbonegames.enemies;

public class DrHitlerClone extends Enemies{

	public DrHitlerClone() {
	name = "Dr. Hitler Clone";
	hp = 300;
	attack = 100;
	defense = 50;
	dodge = 10;
	disableDuration = 0;
	
	attack1 = "Mad Sciences";
	attack1Command = "MadScience";
	attack1Damage = 0;
	attack1Chance = 0;
	
	attack2 = "Kill All The Dumb People who Advocate Killing";
	attack2Command = "KillAll";
	attack2Damage = 1000;
	attack2Chance = 2;
	
	//Everything is disable for 3 turns
	attack3 = "Brainwash Using Detergent With Bleach";
	attack3Command = "Brainwash";
	attack3Damage = 0;
	attack3Chance = 6;
	
	//Blows everything to Kingdom Come
	attack4 = "Hindenburg";
	attack4Command = "Hindenburg";
	attack4Damage = 10000;
	attack4Chance = 8;
	}
	
}
