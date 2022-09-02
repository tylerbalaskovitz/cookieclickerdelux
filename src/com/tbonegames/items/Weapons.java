package com.tbonegames.items;

public class Weapons {

	//used for the name and the handler of the game. 
	public String weaponName;
	public String weaponHandlerName;
	
	//used for the description when hovering over the items
	public String weaponDescription;
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	public int idNumber;
	
	public int attackValue;
	public int weaponMultiplier;
	
	//used for the sound that unlocks during the GameTimers class being ran.
	public boolean unlocked;
	
	public int unlockAmount;
	public int totalAmountPurchased;
	
	public int weaponPrice;
	public int weaponPriceIncrease;
	
	
}
