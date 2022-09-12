package com.tbonegames.weapons;

public class BastardNitrogenBomb extends Weapons{

	public BastardNitrogenBomb() {
	weaponName = "Bastard Nitrogen Bomb";
	weaponHandlerName = "NitrogenBomb";
	
	//used for the description when hovering over the items
	weaponDescription = "";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 5;
	
	
	weaponMultiplier = 20;
	
	//used for the sound that unlocks during the GameTimers class being ran.
	unlocked = false;
	
	unlockAmount = 10000;
	
	rateOfIncrease = 1;
	
	totalCurrentAmount = 0;
	totalAmountPurchased = 0;
	
	weaponPrice = 10000;
	weaponPriceIncrease = 10000;
	}
}
