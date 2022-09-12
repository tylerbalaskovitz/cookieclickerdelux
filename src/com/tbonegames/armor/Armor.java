package com.tbonegames.armor;

public class Armor {
	public String armorName;
	public String armorHandlerName;
	
	//description for when hovering over the items themselves.
	public String armorDescription;
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	public int idNumber;
	
	//this is used within the game timers class.
	public boolean unlocked;
	public int unlockAmount;
	
	public int totalPurchased;
	
	public int armorValueNumerator;
	public int armorValueDenominator;
	
	public int defenseValue;
	
	public int armorPrice;
	public int armorPriceIncrease;
	
	
}
