package com.tbonegames.buffs;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class ItemRestore extends Buffs implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public ItemRestore() {
		buffName = "Restore Items";
		buffHandlerName = "RestoreItems";
		
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
		
		removeDebuffBlock = 0;
		removeDebuffBlockUpgrade = 0;
		
		removeDebuffItems = 2;
		removeDebuffItemsUpgrade = 3;
		
		removeDebuffBuffs = 0;
		removeDebuffBuffsUpgrade = 0;
		
		unlockAmount = 550;
		buffPrice = 550;
		buffPriceIncrease = 550;
		
		rateOfIncrease = 7;
		
		currentAmount = 0;
		totalAmountPurchased = 0;
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
	
}
