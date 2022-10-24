package com.tbonegames.armor;

public class BastardMirror extends Armor{

	public BastardMirror() {
		armorName = "Bastard Mirror";
		armorHandlerName = "BastardArmor";
		
		//description for when hovering over the items themselves.
		armorDescription = "";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 5;
		
		//this is used within the game timers class.
		unlocked = false;
		unlockAmount = 1000;
		
		rateOfIncrease = 3;
		
		totalCurrentAmount = 0;
		totalPurchased = 0;
		
		armorValueNumerator = 1;
		armorValueDenominator = 1;
		
		defenseValue = 100;
		
		armorPrice = 1000;
		armorPriceIncrease = 1000;
		
	}
	
}
