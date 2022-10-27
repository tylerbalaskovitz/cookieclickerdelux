package com.tbonegames.armor;

import com.tbonegames.ClientMain;

public class BastardGloves extends Armor{

	public BastardGloves() {
	armorName = "Bastard Gloves";
	armorHandlerName ="BastardGloves";
	
	//description for when hovering over the items themselves.
	armorDescription = "";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 1;
	
	//this is used within the game timers class.
	unlocked= false;
	unlockAmount = 250;
	
	rateOfIncrease = 3;
	
	totalCurrentAmount = 0;
	totalPurchased = 0;
	
	armorValueNumerator = 1;
	armorValueDenominator = 1;
	
	defenseValue = 20;
	
	armorPrice = 250;
	armorPriceIncrease = 250;
	
	}
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
}
