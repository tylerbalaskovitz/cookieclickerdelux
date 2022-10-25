package com.tbonegames.buffs;

public class StealAndHeal extends Buffs{

	public StealAndHeal() {
		buffName = "Heal and Steal";
		buffHandlerName = "BuffsRestore";
		
		//description for when hovering over the items themselves.
		buffDescription = "Heal yourself off a little stolen sweetness from your foes.";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 1;
		
		//this is used within the game timers class.
		unlocked = false;
		
		actionIncrease = 0;
		actionIncreaseUpgrade = 0;
		
		defenseValue = 0;
		
		removeDebuffAttack = 0;
		removeDebuffAttackUpgrade = 0;
		
		removeDebuffBlock = 0;
		removeDebuffBlockUpgrade = 0;
		
		removeDebuffItems = 0;
		removeDebuffItemsUpgrade = 0;
		
		removeDebuffBuffs = 2;
		removeDebuffBuffsUpgrade = 3;
		
		unlockAmount = 600;
		buffPrice = 600;
		buffPriceIncrease = 600;
		
		rateOfIncrease = 7;
		
		currentAmount = 0;
		totalAmountPurchased = 0;
	}
}