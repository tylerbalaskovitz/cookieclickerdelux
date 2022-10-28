package com.tbonegames.items;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class BastardBuffet extends Items implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public BastardBuffet() {
		itemName = "Bastard Buffet";
		itemHandlerName = "BastardChips";
		
		//used for when players hover over the itemw within the shop.
		itemDescription = "Takes away strength, but heals for a large amount.";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 4;
		
		//used for the sound unlocks during the GameTimers class being ran.
		unlocked = false;
		
		healValue = 1500;
		
		strengthIncrease = -5;
		
		unlockAmount = 750;
		itemPrice = 750;
		itemPriceIncrease = 350;
		
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
