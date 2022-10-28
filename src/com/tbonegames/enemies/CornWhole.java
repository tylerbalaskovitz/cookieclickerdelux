package com.tbonegames.enemies;

import java.io.Serializable;

public class CornWhole extends Enemies implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public CornWhole() {
		
		name = "Corn Whole";
		hp = 4200;
		attack = 400;
		defense = 12;
		dodge = 10;
		disableDuration = 0;
		
		attackDisableCounter = 0;
		blockDisableCounter = 0;
		itemDisableCounter = 0;
		buffsDisableCounter = 0;
		
		attack1 = "Cornhole Blast";
		attack1Command = "CornholeBlast";
		attack1Damage = 1000;
		attack1Chance = 0;
		
		//this one does the disables
		attack2 = "Corn Stalker Surprise";
		attack2Command = "CornStalker";
		attack2Damage = 750;
		attack2Chance = 2;
		
		attack3 = "Pop Your Corn Like a Cherry";
		attack3Command = "Popcorn";
		attack3Damage = 1500;
		attack3Chance = 4;
		
		attack4 = "Running Through a Cornfield Backwards and Naked";
		attack4Command = "ArachnoBots";
		attack4Damage = 2000;
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
