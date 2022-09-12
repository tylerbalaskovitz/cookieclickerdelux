package com.tbonegames.weapons;

public class BastardRod extends Weapons {

	public BastardRod() {
	weaponName = "Bastard Rod";
	weaponHandlerName = "BastardRod";
	
	//used for the description when hovering over the items
	weaponDescription = "";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 1;
	
	
	weaponMultiplier = 1;
	
	//used for the sound that unlocks during the GameTimers class being ran.
	unlocked = false;
	
	unlockAmount = 400;
	totalAmountPurchased = 0;
	
	weaponPrice = 400;
	weaponPriceIncrease = 400;
	}
}
