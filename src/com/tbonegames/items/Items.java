package com.tbonegames.items;

public class Items {

	public String itemName;
	public String itemHandlerName;
	
	//used for when players hover over the itemw within the shop.
	public String itemDescription;
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	public int idNumber;
	
	//used for the sound unlocks during the GameTimers class being ran.
	public boolean unlocked;
	
	public int healValue;
	
	
	
	public int unlockAmount;
	public int itemPrice;
	public int itemPriceIncrease;
	
	// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
	public int rateOfIncrease;
	public int totalAmountPurchased;
	
	
	
	public void calculateHealing(String healingSelection, int logosAmount) {
		switch(healingSelection) {
		case "NormalStrength":
			healValue = healValue * 1;
			logosAmount+= healValue;
			break;
		case "ExtraStrength":
			break;
		case "BastardlyStrength":
			break;
		}
	}
}
