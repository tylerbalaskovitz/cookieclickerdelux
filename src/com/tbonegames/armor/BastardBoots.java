package com.tbonegames.armor;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class BastardBoots extends Armor implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public BastardBoots() {
	armorName = "Bastard Boots";
	armorHandlerName = "BastardBoots";
	
	//description for when hovering over the items themselves.
	armorDescription = "";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 2;
	
	//this is used within the game timers class.
	unlocked = false;
	unlockAmount = 500;
	
	rateOfIncrease = 3;
	
	totalCurrentAmount = 0;
	totalPurchased = 0;
	
	armorValueNumerator = 1;
	armorValueDenominator = 1;
	
	defenseValue = 40;
	
	armorPrice = 500;
	armorPriceIncrease = 500;
	
	}
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
}
