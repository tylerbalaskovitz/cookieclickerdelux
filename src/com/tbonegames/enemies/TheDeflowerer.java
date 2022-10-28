package com.tbonegames.enemies;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class TheDeflowerer extends Enemies  implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public TheDeflowerer() {
		name = "The Deflowerer";
		hp = 14000;
		attack = 1000;
		defense = 13;
		dodge = 10;
		disableDuration = 0;
		
		attackDisableCounter = 0;
		blockDisableCounter = 0;
		itemDisableCounter = 0;
		buffsDisableCounter = 0;
		
		//disables an attack
		attack1 = "Hymen Break";
		attack1Command = "HymenBreak";
		attack1Damage = 2000;
		attack1Chance = 0;
		
		//disables two attacks
		attack2 = "Deflower";
		attack2Command = "Deflower";
		attack2Damage = 2000;
		attack2Chance = 2;
		
		attack3 = "Old Enough to Buy Cigarettes";
		attack3Command = "BuyCigarettes";
		attack3Damage = 5000;
		attack3Chance = 4;
		
		attack4 = "Go Where No Man Has Gone Before";
		attack4Command = "GoWhereNoMan";
		attack4Damage = 10000;
		attack4Chance = 6;
		
		specialMessage = "";
	
	}
	
	
	public void special1(ClientMain cMain) {
		attackDisableCounter += 2;
	}

	public void special2(ClientMain cMain) {
		blockDisableCounter = 2;
		itemDisableCounter = 2;
	}
	
	public void special3(ClientMain cMain) {
		
	}
	
	public void special4(ClientMain cMain) {
		
	}
}
