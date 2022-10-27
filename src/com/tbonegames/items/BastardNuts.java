package com.tbonegames.items;

import com.tbonegames.ClientMain;

public class BastardNuts extends Items{

	public BastardNuts() {
		itemName = "Bastard Nuts";
		itemHandlerName = "BastardNuts";
		
		//used for when players hover over the itemw within the shop.
		itemDescription = "TBD";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 3;
		
		//used for the sound unlocks during the GameTimers class being ran.
		unlocked = false;
		
		
		
		healValue = 500;
		
		strengthIncrease = 18;
		
		unlockAmount = 500;
		itemPrice = 500;
		itemPriceIncrease = 500;
		
		// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
		rateOfIncrease = 25;
		totalCurrentAmount = 0;
		totalAmountPurchased = 0;
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
	
}
