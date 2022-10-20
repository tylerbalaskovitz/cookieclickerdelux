package com.tbonegames.cards;

public class Lollipop extends Cards{

	public Lollipop() {
		
		cardName = "Lollipop";
		cardHandlerName = "";
		
		//used for the description when hovering over the items
		cardDescription = "";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 2;
		
		clickerIncrease = 3;
		
		defenseBonus = 0;
		
		buffBonus = 0;
		
		itemBonus = 0;
		
		weaponBonus = 0;
		
		//used for the sound that unlocks during the GameTimers class being ran.
		unlocked = false;
		
		unlockAmount = 300;
		
		// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
			
		totalCurrentAmount = 0;
		
		//total amount purchase is used when going through the combat loop. 
		totalAmountPurchased = 0;
		
		cardPrice = 300;
		cardPriceIncrease = 300;
		
	}
	
}
