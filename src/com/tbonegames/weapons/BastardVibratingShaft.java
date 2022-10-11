package com.tbonegames.weapons;

public class BastardVibratingShaft extends Weapons{

	public BastardVibratingShaft() {
	weaponName = "Vibrating Bastard Shaft";
	weaponHandlerName = "VibratingShaft";
	
	//used for the description when hovering over the items
	weaponDescription ="Reduces the enemies defense for the battle.";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 4;
	
	reduceDefense = 1;
	
	clickerMultiplier = 7;
	
	weaponMultiplier = 0;
	
	//used for the sound that unlocks during the GameTimers class being ran.
	unlocked = false;
	
	unlockAmount = 3000;
	
	rateOfIncrease = 5;
	
	totalCurrentAmount = 0;
	totalAmountPurchased = 0;
	
	weaponPrice = 3000;
	weaponPriceIncrease = 3000;
	}
	
	public void special(){
		
	}
}
