package com.tbonegames.buffs;

public class Buffs {
	public String buffName;
	public String buffHandlerName;
	
	//description for when hovering over the items themselves.
	public String buffDescription;
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	public int idNumber;
	
	//this is used within the game timers class.
	public boolean unlocked;
	
	
	
	public int defenseValue;
	
	public int unlockAmount;
	public int buffPrice;
	public int buffPriceIncrease;
	public int totalAmountPurchased;
}
