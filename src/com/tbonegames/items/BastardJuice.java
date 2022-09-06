package com.tbonegames.items;

public class BastardJuice extends Items{

	public BastardJuice() {
		itemName = "Bastard Juice";
		itemHandlerName = "BastardNuts";
		
		//used for when players hover over the itemw within the shop.
		itemDescription = "TBD";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 5;
		
		//used for the sound unlocks during the GameTimers class being ran.
		unlocked = false;
		
		healValue = 2000;
		
		strengthIncrease = 80;
		
		unlockAmount = 0;
		itemPrice = 2000;
		itemPriceIncrease = 2000;
		
		// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
		rateOfIncrease = 5;
		totalAmountPurchased = 0;
	}
	
}