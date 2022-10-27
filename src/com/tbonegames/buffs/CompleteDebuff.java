package com.tbonegames.buffs;

import com.tbonegames.ClientMain;

public class CompleteDebuff extends Buffs {

	public CompleteDebuff() {
		buffName = "Complete Debuff";
		buffHandlerName = "CompleteDebuff";
		
		//description for when hovering over the items themselves.
		buffDescription = "Give your bastardly self some protection against all future debuffs and remove ones you may already have.";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 1;
		
		//this is used within the game timers class.
		unlocked = false;
		
		actionIncrease = 0;
		actionIncreaseUpgrade = 0;
		
		defenseValue = 0;
		
		removeDebuffAttack = 3;
		removeDebuffAttackUpgrade = 3;
		
		removeDebuffBlock = 3;
		removeDebuffBlockUpgrade = 3;
		
		removeDebuffItems = 3;
		removeDebuffItemsUpgrade = 3;
		
		removeDebuffBuffs = 3;
		removeDebuffBuffsUpgrade = 3;
		
		unlockAmount = 1500;
		buffPrice = 1500;
		buffPriceIncrease = 1500;
		
		rateOfIncrease = 5;
		
		currentAmount = 0;
		totalAmountPurchased = 0;
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
	
}
