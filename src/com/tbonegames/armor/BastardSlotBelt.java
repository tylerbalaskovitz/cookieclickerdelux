package com.tbonegames.armor;

public class BastardSlotBelt extends Armor{

	public BastardSlotBelt() {
	armorName = "Bastard Slot Belt";
	armorHandlerName = "SlotBelt";
	
	//description for when hovering over the items themselves.
	armorDescription = "";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 4;
	
	//this is used within the game timers class.
	unlocked = false;
	unlockAmount = 875;
	
	rateOfIncrease = 3;
	
	totalCurrentAmount = 0;
	totalPurchased = 0;
	
	armorValueNumerator = 1;
	armorValueDenominator = 1;
	
	defenseValue = 80;
	
	armorPrice = 875;
	armorPriceIncrease = 875;
	
	}
}
