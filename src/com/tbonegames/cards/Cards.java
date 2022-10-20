package com.tbonegames.cards;

import java.io.Serializable;

public class Cards implements Serializable{
	
	final static long serialVersionUID = -1404202925519361557L;

	public String cardName;
	public String cardHandlerName;
	
	//used for the description when hovering over the items
	public String cardDescription;
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	public int idNumber;
	
	public double clickerIncrease;
	
	public int defenseBonus;
	
	public int buffBonus;
	
	public int itemBonus;
	
	public int weaponBonus;
	
	//used for the sound that unlocks during the GameTimers class being ran.
	public boolean unlocked;
	
	public int unlockAmount;
	
	// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
		
	public int totalCurrentAmount;
	
	//total amount purchase is used when going through the combat loop. 
	public int totalAmountPurchased;
	
	public int cardPrice;
	public int cardPriceIncrease;
	
}
