package com.tbonegames.weapons;

public class BastardBelt extends Weapons{

	public BastardBelt() {
	//used for the name and the handler of the game. 
	weaponName = "Bastard Belt";
	weaponHandlerName = "BastardBelt";
	
	//used for the description when hovering over the items
	weaponDescription = "";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 2;
	
	
	weaponMultiplier = 4;
	
	//used for the sound that unlocks during the GameTimers class being ran.
	unlocked = false;
	
	unlockAmount = 800;
	totalAmountPurchased = 0;
	
	weaponPrice = 800;
	weaponPriceIncrease = 800;
	}
}

