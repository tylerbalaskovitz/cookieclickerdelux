package com.tbonegames.armor;

public class BastardShoulderPads extends Armor{

	public BastardShoulderPads() {
	armorName = "Bastard Shoulder Pads";
	armorHandlerName = "ShoulderPads";
	
	//description for when hovering over the items themselves.
	armorDescription = "";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 3;
	
	//this is used within the game timers class.
	unlocked = false;
	unlockAmount  = 1600;
	
	rateOfIncrease = 1;
	
	totalCurrentAmount = 0;
	totalPurchased = 0;
	
	armorValueNumerator = 1;
	armorValueDenominator = 1;
	
	defenseValue = 30;
	
	armorPrice = 1600;
	armorPriceIncrease = 1600;
	
	}
}
