package com.tbonegames.buffs;

import com.tbonegames.ClientMain;

public class AttackRestore extends Buffs{

	public AttackRestore() {
		buffName = "Restore Attacks";
		buffHandlerName = "RestoreAttacks";
		
		//description for when hovering over the items themselves.
		buffDescription = "Give your bastardly self some protection against future debuffs and remove ones you may already have. ";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 1;
		
		//this is used within the game timers class.
		unlocked = false;
		
		actionIncrease = 0;
		actionIncreaseUpgrade = 0;
		
		defenseValue = 0;
		
		removeDebuffAttack = 2;
		removeDebuffAttackUpgrade = 3;
		
		removeDebuffBlock = 0;
		removeDebuffBlockUpgrade = 0;
		
		removeDebuffItems = 0;
		removeDebuffItemsUpgrade = 0;
		
		removeDebuffBuffs = 0;
		removeDebuffBuffsUpgrade = 0;
		
		unlockAmount = 400;
		buffPrice = 400;
		buffPriceIncrease = 400;
		
		rateOfIncrease = 7;
		
		currentAmount = 0;
		totalAmountPurchased = 0;
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
}
