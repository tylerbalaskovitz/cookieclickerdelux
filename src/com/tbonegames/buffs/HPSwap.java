package com.tbonegames.buffs;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class HPSwap extends Buffs implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public HPSwap() {
		
		buffName = "HP Swap";
		buffHandlerName = "BuffsRestore";
		
		//description for when hovering over the items themselves.
		buffDescription = "Swap your HP with that of an enemy.";
		
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
		
		unlockAmount = 10000;
		buffPrice = 10000;
		buffPriceIncrease = 10000;
		
		rateOfIncrease = 1;
		
		currentAmount = 0;
		totalAmountPurchased = 0;
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
	
}
