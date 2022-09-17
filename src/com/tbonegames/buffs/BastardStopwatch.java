package com.tbonegames.buffs;

import com.tbonegames.CookieMain;

public class BastardStopwatch extends Buffs{
	CookieMain cMain;
	public BastardStopwatch(){
		
		buffName = "Bastard Stopwatch";
		buffHandlerName = "BastardStopwatch";
		
		//description for when hovering over the items themselves.
		buffDescription = "";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 1;
		
		//this is used within the game timers class.
		unlocked = false;
		
		
		
		defenseValue = 0;
		
		unlockAmount = 250;
		buffPrice = 250;
		buffPriceIncrease = 250;
		
		rateOfIncrease = 4;
		
		currentAmount = 0;
		totalAmountPurchased = 0;
		
		
	}
	
	
	
	public void special() {
		
	}
	
	public int special(int turns, int amountToGive) {
		turns += amountToGive;
		return turns;
	}
	
	
}
