package com.tbonegames.buffs;

import com.tbonegames.ClientMain;

public class DoubleDamage extends Buffs {
	
	public DoubleDamage() {
	buffName = "Double Damage";
	buffHandlerName = "BuffsRestore";
	
	//description for when hovering over the items themselves.
	buffDescription = "Double Your Damage For a Turn";
	
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
	
	unlockAmount = 5000;
	buffPrice = 5000;
	buffPriceIncrease = 5000;
	
	rateOfIncrease = 1;
	
	currentAmount = 0;
	totalAmountPurchased = 0;
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
}
