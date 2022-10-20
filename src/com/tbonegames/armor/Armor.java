package com.tbonegames.armor;

import java.io.Serializable;

public class Armor implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	public String armorName;
	public String armorHandlerName;
	
	//description for when hovering over the items themselves.
	public String armorDescription;
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	public int idNumber;
	
	//this is used within the game timers class.
	public boolean unlocked;
	public int unlockAmount;
	
	
	// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
	public int rateOfIncrease;
		
	public int totalCurrentAmount;
	public int totalPurchased;
	
	public int armorValueNumerator;
	public int armorValueDenominator;
	
	public int defenseValue;
	
	public int armorPrice;
	public int armorPriceIncrease;
	
	public void raisePrice() {
		if (totalPurchased % rateOfIncrease == 0) {
			armorPrice += armorPriceIncrease;
		}
	}
	
}
