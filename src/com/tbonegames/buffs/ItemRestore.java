package com.tbonegames.buffs;

public class ItemRestore extends Buffs{

	public ItemRestore() {
		buffName = "Restore Items";
		buffHandlerName = "RestoreItems";
		
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
		
		rateOfIncrease = 1;
		
		currentAmount = 0;
		totalAmountPurchased = 0;
	}
	
	public void special() {
		
	}
	
}
