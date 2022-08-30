package com.tbonegames.enemies;

public class TheDeflowerer extends Enemies {

	public TheDeflowerer() {
		name = "The Deflowerer";
		hp = 7000;
		attack = 1000;
		defense = 50;
		dodge = 10;
		disableDuration = 0;
		
		//disables an attack
		attack1 = "Hymen Break";
		attack1Command = "HymenBreak";
		attack1Damage = 2000;
		attack1Chance = 0;
		
		//disables two attacks
		attack2 = "Deflower";
		attack2Command = "Deflower";
		attack2Damage = 0;
		attack2Chance = 2;
		
		attack3 = "Old Enough to Buy Cigarettes";
		attack3Command = "BuyCigarettes";
		attack3Damage = 5000;
		attack3Chance = 4;
		
		attack4 = "Go Where No Man Has Gone Before";
		attack4Command = "GoWhereNoMan";
		attack4Damage = 10000;
		attack4Chance = 6;
		
		
	}
	
}
