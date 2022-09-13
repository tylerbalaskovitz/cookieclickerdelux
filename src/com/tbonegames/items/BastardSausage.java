package com.tbonegames.items;

public class BastardSausage extends Items{

	public BastardSausage() {
		itemName = "Bastard Sausage";
		itemHandlerName = "BastardSausage";
		
		//used for when players hover over the itemw within the shop.
		itemDescription = "Be like Action Bastard and put your mouth on a sausage. From Action Foods, if you don't buy it, you'll die";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 2;
		
		//used for the sound unlocks during the GameTimers class being ran.
		unlocked = true;
		
		
		healValue = 300;
		
		strengthIncrease = 10;
		
		unlockAmount = 0;
		itemPrice = 300;
		itemPriceIncrease = 300;
		
		// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
		rateOfIncrease = 5;
		totalCurrentAmount = 0;
		totalAmountPurchased = 0;
	}
}
