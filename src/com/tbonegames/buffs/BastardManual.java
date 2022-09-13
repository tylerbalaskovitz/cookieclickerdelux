package com.tbonegames.buffs;

public class BastardManual extends Buffs{

	public BastardManual() {
		
		buffName = "Bastard Manual";
		buffHandlerName = "BastardManual";
		
		//description for when hovering over the items themselves.
		buffDescription = "";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 1;
		
		//this is used within the game timers class.
		unlocked = false;
		
		
		
		defenseValue = 0;
		
		unlockAmount = 1250;
		buffPrice = 1250;
		buffPriceIncrease = 1250;
		
		rateOfIncrase = 1;
		
		currentAmount = 0;
		totalAmountPurchased = 0;
		
	}
	
}
