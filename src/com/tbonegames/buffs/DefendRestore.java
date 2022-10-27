package com.tbonegames.buffs;

import com.tbonegames.ClientMain;

public class DefendRestore extends Buffs{

	public DefendRestore() {
		buffName = "Restore Blocks";
		buffHandlerName = "RestoreBlocks";
		
		//description for when hovering over the items themselves.
		buffDescription = "Give your bastardly self some protection against future debuffs and remove ones you may already have.";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 1;
		
		//this is used within the game timers class.
		unlocked = false;
		
		actionIncrease = 0;
		actionIncreaseUpgrade = 0;
		
		defenseValue = 0;
		
		removeDebuffAttack = 0;
		removeDebuffAttackUpgrade = 0;
		
		removeDebuffBlock = 2;
		removeDebuffBlockUpgrade = 3;
		
		removeDebuffItems = 0;
		removeDebuffItemsUpgrade = 0;
		
		removeDebuffBuffs = 0;
		removeDebuffBuffsUpgrade = 0;
		
		unlockAmount = 500;
		buffPrice = 500;
		buffPriceIncrease = 500;
		
		rateOfIncrease = 7;
		
		currentAmount = 0;
		totalAmountPurchased = 0;
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
	
}
