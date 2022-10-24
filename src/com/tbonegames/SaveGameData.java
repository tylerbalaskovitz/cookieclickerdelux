package com.tbonegames;

import java.io.Serializable;

public class SaveGameData implements Serializable {
	final static long serialVersionUID = -1404202925519361557L;
	int day, logosCounter, rounds, timerSpeed, dayTimerSpeed, slotsPrice, cursorUpgradeAmount, 
	luckyPrice, bastardPrice, feverPrice, enemyAttackChoice, enemyDamage, bossDay, startingDamage, disableAttacksCounter, disableBlocksCounter, disableItemsCounter, enemiesDefeated, 
	numberOfActions, counterUpgrade, healingMultiplier, selectedItemValue, blockValue, baseNumberOfActions, extraAttackRecoil, bastardlyAttackRecoil, playerDamage, playerRecoil, 
	playerAttackBonus, disableBuffsCounter, clickerBonus, blockValueBonus, dayLimiter, highestLogo, score;
	
	
	int highScore;
	ClientMain cMain;
	
	
	
	
	//======================================================================================
	public SaveGameData() {	

}

}
