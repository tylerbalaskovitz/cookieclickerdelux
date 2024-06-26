package com.tbonegames.items;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class DeadItem extends Items implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public DeadItem() {
		itemName = " ";
		itemHandlerName = "";
		
		//used for when players hover over the itemw within the shop.
		itemDescription = "";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 4;
		
		//used for the sound unlocks during the GameTimers class being ran.
		unlocked = false;
		
		healValue = 0;
		
		strengthIncrease = 0;
		
		unlockAmount = 2147483647;
		itemPrice = 2147483647;
		itemPriceIncrease = 0;
		
		// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
		rateOfIncrease = 2147483647;
		totalCurrentAmount = 0;
		totalAmountPurchased = 0;
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
	
}
