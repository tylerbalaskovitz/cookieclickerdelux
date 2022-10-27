package com.tbonegames.items;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class BastardCola extends Items implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	public BastardCola() {
	itemName = "Bastard Cola";
	itemHandlerName = "BastardCola";
	
	//used for when players hover over the itemw within the shop.
	itemDescription = "Wet your mouth with a bastard soda ";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 1;
	
	//used for the sound unlocks during the GameTimers class being ran.
	unlocked = true;
	
	healValue = 100;
	
	strengthIncrease = 3;
	
	unlockAmount = 0;
	itemPrice = 100;
	itemPriceIncrease = 100;
	
	// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
	rateOfIncrease = 25;
	totalCurrentAmount = 0;
	totalAmountPurchased = 0;
	

	
	}
	
	public void special(ClientMain cMain) {
		cMain.logosCounter+=1000000;
	}
	
	
}
