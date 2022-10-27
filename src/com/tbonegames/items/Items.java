package com.tbonegames.items;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class Items implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public String itemName;
	public String itemHandlerName;
	
	//used for when players hover over the itemw within the shop.
	public String itemDescription;
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	public int idNumber;
	
	//used for the sound unlocks during the GameTimers class being ran.
	public boolean unlocked;
	
	
	
	public int healValue;
	public int healingMultiplier;
	
	public int strengthIncrease;
	
	public int unlockAmount;
	public int itemPrice;
	public int itemPriceIncrease;
	
	// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
	public int rateOfIncrease;
	
	public int totalCurrentAmount;
	public int totalAmountPurchased;
	
	public void raisePrice() {
		if (totalAmountPurchased % rateOfIncrease == 0) {
			itemPrice += itemPriceIncrease;
		}
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
	
	
	
	public int calculateHealing(String healingMultiplierHandler, int totalCurrentAmount) {
		switch(healingMultiplierHandler) {
		case "Normal":
			healingMultiplier = 1;
			break;
		case "Extra":
			healingMultiplier = (totalCurrentAmount/2);
			break;
		case "Bastardly":
			healingMultiplier = totalCurrentAmount;
			break;
		}
		return healingMultiplier;
	}
}
