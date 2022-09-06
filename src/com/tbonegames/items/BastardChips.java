package com.tbonegames.items;

public class BastardChips extends Items{

	public BastardChips() {
		itemName = "Bastard Chips";
		itemHandlerName = "BastardChips";
		
		//used for when players hover over the itemw within the shop.
		itemDescription = "TBD";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 4;
		
		//used for the sound unlocks during the GameTimers class being ran.
		unlocked = false;
		
		healValue = 750;
		
		
		
		unlockAmount = 0;
		itemPrice = 100;
		itemPriceIncrease = 100;
		
		// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
		rateOfIncrease = 5;
		totalAmountPurchased = 0;
	}
	
}