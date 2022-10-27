package com.tbonegames.armor;

import com.tbonegames.ClientMain;

public class DeadArmor extends Armor{

	public DeadArmor() {
		armorName = " ";
		armorHandlerName = " ";
		
		//description for when hovering over the items themselves.
		armorDescription = "";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 4;
		
		//this is used within the game timers class.
		unlocked = false;
		unlockAmount = 2147483647;
		
		rateOfIncrease = 2147483647;
		
		totalCurrentAmount = 0;
		totalPurchased = 0;
		
		armorValueNumerator = 1;
		armorValueDenominator = 1;
		
		defenseValue = 0;
		
		armorPrice = 2147483647;
		armorPriceIncrease = 0;
	}
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
	
}
