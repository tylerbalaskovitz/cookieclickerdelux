package com.tbonegames.buffs;

import java.io.Serializable;

public class Buffs implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	
	public String buffName;
	public String buffHandlerName;
	
	//description for when hovering over the items themselves.
	public String buffDescription;
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	public int idNumber;
	
	//this is used within the game timers class.
	public boolean unlocked;
	
	//this is used for giving more turns
	public int actionIncrease;
	public int actionIncreaseUpgrade;
	
	public int defenseValue;
	
	public int removeDebuffAttack;
	public int removeDebuffAttackUpgrade;
	
	public int removeDebuffBlock;
	public int removeDebuffBlockUpgrade;
	
	public int removeDebuffItems;
	public int removeDebuffItemsUpgrade;
	
	public int removeDebuffBuffs;
	public int removeDebuffBuffsUpgrade;
	
	
	public int unlockAmount;
	public int buffPrice;
	public int buffPriceIncrease;
	
	public int rateOfIncrease;
	
	public int currentAmount;
	public int totalAmountPurchased;
	
	public int turnBoost(int turns, int amountGiven) {
		turns += amountGiven;
		return turns;
	}
	
	public void raisePrice() {
		if (totalAmountPurchased % rateOfIncrease == 0) {
			buffPrice += buffPriceIncrease;
		}
	}
	
	public void debuff(int debuffAttack, int debuffBlock, int debuffItems, int debuffBuffs) {
		
		if (totalAmountPurchased % rateOfIncrease == 0) {
		 if (removeDebuffAttack > 0) {
			 removeDebuffAttack += removeDebuffAttackUpgrade;
		 }
		 if (removeDebuffBlock > 0) {
			 removeDebuffBlock += removeDebuffBlockUpgrade;
		 }
		 if (removeDebuffItems > 0) {
			 removeDebuffItems += removeDebuffItemsUpgrade;
		 }
		 if (removeDebuffBuffs > 0) {
			 removeDebuffBuffs += removeDebuffBuffsUpgrade;
		 }
		 if (actionIncrease > 0) {
			 actionIncrease += actionIncreaseUpgrade;
		 }
		}
		
		debuffAttack -= removeDebuffAttack;
		debuffBlock -= removeDebuffBlock;
		debuffItems -= removeDebuffItems;
		debuffBuffs -= removeDebuffBuffs;
	}
	
}
