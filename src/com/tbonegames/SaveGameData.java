package com.tbonegames;

import java.io.Serializable;

import com.tbonegames.armor.Armor;
import com.tbonegames.buffs.Buffs;
import com.tbonegames.cards.Cards;
import com.tbonegames.items.Items;
import com.tbonegames.weapons.Weapons;

public class SaveGameData implements Serializable {
	final static long serialVersionUID = -1404202925519361557L;
	int day, logosCounter, rounds, timerSpeed, dayTimerSpeed, slotsPrice, cursorUpgradeAmount, 
	luckyPrice, bastardPrice, feverPrice, enemyAttackChoice, enemyDamage, bossDay, startingDamage, disableAttacksCounter, disableBlocksCounter, disableItemsCounter, enemiesDefeated, 
	numberOfActions, counterUpgrade, healingMultiplier, selectedItemValue, blockValue, baseNumberOfActions, extraAttackRecoil, bastardlyAttackRecoil, playerDamage, playerRecoil, 
	playerAttackBonus, disableBuffsCounter, clickerBonus, blockValueBonus, dayLimiter, highestLogo, score;
	
	
	int highScore;
	double  perSecond, dayPerSecond;
	Armor armor[] = new Armor[10];
	Buffs buffs[] = new Buffs[10];
	Weapons weapons[] = new Weapons[10];
	Items items[] = new Items[10];
	Cards cards [] = new Cards[4];
	
	int burnManager [] = new int[4];
	
	
	
	
	//======================================================================================
	public SaveGameData() {	

}

}
