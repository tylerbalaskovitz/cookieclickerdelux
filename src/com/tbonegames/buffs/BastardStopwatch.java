package com.tbonegames.buffs;


public class BastardStopwatch extends Buffs{
	
	public BastardStopwatch(){
		
		buffName = "Bastard Stopwatch";
		buffHandlerName = "BastardStopwatch";
		
		//description for when hovering over the items themselves.
		buffDescription = "";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 1;
		
		//this is used within the game timers class.
		unlocked = false;
		
		actionIncrease = 4;
		actionIncreaseUpgrade = 2;
		
		defenseValue = 0;
		
		removeDebuffAttack = 0;
		removeDebuffAttackUpgrade = 0;
		
		removeDebuffBlock = 0;
		removeDebuffBlockUpgrade = 0;
		
		removeDebuffItems = 0;
		removeDebuffItemsUpgrade = 0;
		
		removeDebuffBuffs = 0;
		removeDebuffBuffsUpgrade = 0;
		
		unlockAmount = 250;
		buffPrice = 250;
		buffPriceIncrease = 250;
		rateOfIncrease = 10;
		
		currentAmount = 0;
		totalAmountPurchased = 0;
		
		
	}
	
}
