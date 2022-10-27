package com.tbonegames.items;

import com.tbonegames.ClientMain;

public class BastardVeganOption extends Items{

		public BastardVeganOption(){
		itemName = "Bastard Vegan Option";
		itemHandlerName = "BastardVegan";
		
		//used for when players hover over the itemw within the shop.
		itemDescription = "They say its healthy, but could they be wrong?";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 4;
		
		//used for the sound unlocks during the GameTimers class being ran.
		unlocked = false;
		
		healValue = 1;
		
		strengthIncrease = -100;
		
		unlockAmount = 750;
		itemPrice = 2000;
		itemPriceIncrease = 2000;
		
		// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
		rateOfIncrease = 5;
		totalCurrentAmount = 0;
		totalAmountPurchased = 0;
	}
		
		public void shopSpecial(ClientMain cMain) {
			
		}
		
		public void combatSpecial(ClientMain cMain) {
			
		}
	
}
