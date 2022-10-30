package com.tbonegames.buffs;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class SpeedUp extends Buffs implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public SpeedUp() {
		
		buffName = "Speed Up!";
		buffHandlerName = "BuffsRestore";
		
		//description for when hovering over the items themselves.
		buffDescription = "Speed up the passage of time for a little bit of moo la la";
		
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
		
		unlockAmount = 100;
		buffPrice = 100;
		buffPriceIncrease = 100;
		
		rateOfIncrease = 10;
		
		currentAmount = 0;
		totalAmountPurchased = 0;
	}
	
	public void shopSpecial(ClientMain cMain) {
		cMain.dayPerSecond += .01;
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
	
}
