package com.tbonegames;

import java.util.Random;

import javax.swing.JButton;

import com.tbonegames.enemies.Enemies;

public class Combat {
	
	Random random = new Random();
	
	CookieMain cMain;
	
	CombatHandler combatHandler;
	
	Enemies enemy;
	
	String defeatedEnemy;
	
	public Combat(CookieMain cMain, CombatHandler combatHandler) {
		this.cMain = cMain;
		this.combatHandler = combatHandler;
	}

	public Combat(CookieMain cMain) {
		this.cMain = cMain;
	}
	
	public void combatSetup() {
		if (cMain.customCombat == true) {
			
		} else {
			cMain.itemInventory.defaultCombat();
		}
	}

	public void fight() {
		
		
		cMain.inCombat=true;
		cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
		cMain.combatTextArea.setText(cMain.enemy.name +"'s HP:" + cMain.enemy.hp);
		//playerDamage3();
		
		combatButtonConfig(cMain.combatButton1, "Attack", "Attack");
	
		combatButtonConfig(cMain.combatButton2, "Defend", "Defend");
		
		combatButtonConfig(cMain.combatButton3, "Item", "Item");
		
		combatButtonConfig(cMain.combatButton4, "Buffs", "Buffs");
		victory();
	}
	
	public void playerDefendChoices() {
		
		combatButtonConfig(cMain.combatButton1, cMain.itemInventory.armor[0].totalCurrentAmount,cMain.itemInventory.armor[0].armorName, "Defend0");
		
		combatButtonConfig(cMain.combatButton2, cMain.itemInventory.armor[1].totalCurrentAmount, cMain.itemInventory.armor[1].armorName, "Defend1");
		
		combatButtonConfig(cMain.combatButton3, cMain.itemInventory.armor[2].totalCurrentAmount, cMain.itemInventory.armor[2].armorName, "Defend2");
			
		combatButtonConfig(cMain.combatButton4, cMain.itemInventory.armor[3].totalCurrentAmount, cMain.itemInventory.armor[3].armorName, "Defend3");
		
		if (cMain.itemInventory.armor[0].totalCurrentAmount == 0) {combatButtonConfig(cMain.combatButton4, "Return", "Return");}	
		
	}
	
	public void itemChoices() {
		combatButtonConfig(cMain.combatButton1, cMain.itemInventory.items[0].totalCurrentAmount ,cMain.itemInventory.items[0].itemName, "Item0");
		
		combatButtonConfig(cMain.combatButton2, cMain.itemInventory.items[1].totalCurrentAmount ,cMain.itemInventory.items[1].itemName, "Item1");
		
		combatButtonConfig(cMain.combatButton3, cMain.itemInventory.items[2].totalCurrentAmount ,cMain.itemInventory.items[2].itemName, "Item2");
		
		combatButtonConfig(cMain.combatButton4, cMain.itemInventory.items[3].totalCurrentAmount ,cMain.itemInventory.items[3].itemName, "Item3");
		
		if (cMain.itemInventory.items[0].totalCurrentAmount == 0) {combatButtonConfig(cMain.combatButton4, "Return", "Return");}
	}
	
	public void multiplier() {
		combatButtonConfig(cMain.combatButton1, "Normal", "NormalStrength");
		
		combatButtonConfig(cMain.combatButton2, "Extra", "ExtraStrength");
		
		combatButtonConfig(cMain.combatButton3, "Bastardly", "BastardlyStrength");
		
		combatButtonConfig(cMain.combatButton4, "Return", "Items");
	}
	
	public int healSelf(int healingItem, int healingValue, int healingMultiplier) {
		if (healingItem > 0) {
			cMain.logosCounter += (healingValue * healingMultiplier);
			healingItem -= healingMultiplier;
		}
		return cMain.logosCounter;
	}
	
	
	
	public void buffChoices() {
		
		if (cMain.buffsDisabled == false) {
		
		combatButtonConfig(cMain.combatButton1, cMain.itemInventory.buffs[0].currentAmount, cMain.itemInventory.buffs[0].buffName, "Buff0");
		
		combatButtonConfig(cMain.combatButton2, cMain.itemInventory.buffs[1].currentAmount, cMain.itemInventory.buffs[1].buffName, "Buff1");
		
		combatButtonConfig(cMain.combatButton3, cMain.itemInventory.buffs[2].currentAmount,cMain.itemInventory.buffs[2].buffName, "Buff2");
		
		combatButtonConfig(cMain.combatButton4, cMain.itemInventory.buffs[3].currentAmount,cMain.itemInventory.buffs[3].buffName, "Buff3");
		
		if (cMain.itemInventory.buffs[0].currentAmount == 0) {combatButtonConfig(cMain.combatButton4, "Return", "Return");}
		}
	}
	
	
	
	
	public void playerAttackChoices() {
		
		 	if (cMain.attacksDisabled == false) {
			 	
			combatButtonConfig(cMain.combatButton1, cMain.itemInventory.weapons[0].totalCurrentAmount , cMain.itemInventory.weapons[0].weaponName, "Attack0");
			if (cMain.itemInventory.weapons[0].totalCurrentAmount == 0) {combatButtonConfig(cMain.combatButton1, "Bastard Fists", "BastardFists");}
		
			combatButtonConfig(cMain.combatButton2, cMain.itemInventory.weapons[1].totalCurrentAmount , cMain.itemInventory.weapons[1].weaponName, "Attack1");
			
			combatButtonConfig(cMain.combatButton3, cMain.itemInventory.weapons[2].totalCurrentAmount , cMain.itemInventory.weapons[2].weaponName, "Attack2");
			
			combatButtonConfig(cMain.combatButton4, cMain.itemInventory.weapons[3].totalCurrentAmount , cMain.itemInventory.weapons[3].weaponName, "Attack3");
			
			if (cMain.itemInventory.weapons[3].totalCurrentAmount == 0) {combatButtonConfig(cMain.combatButton4, "Return", "Return");}
			
		 	}
	}
	
	public void playerHealResult() {
		switch (cMain.combatAttackingItem) {
		
		
		
		}
		cMain.combatTextArea.setText("You healed yourself and your HP is now " + cMain.logosCounter);
		cMain.inCombatHPLabel.setText("HP: " + cMain.logosCounter);
		
		numberOfTurns();
	
		gameOver();
	}
		
	
	public void playerAttackResult(){
		
		gameOver();
		victory();
		int itemDamageBonus = 0;
		int itemDamageDenominator = 10;
		String weaponName = "Bastard Fists";
		//Allow these to be upgraded. 
		switch (cMain.combatAttackingItem) {
		case "BastardFists":
			break;
		case "Attack0":
			itemDamageBonus = cMain.itemInventory.weapons[0].weaponMultiplier * cMain.itemInventory.weapons[0].totalAmountPurchased;
			weaponName = cMain.itemInventory.weapons[0].weaponName;
			break;
		case "Attack1":
			itemDamageBonus = cMain.itemInventory.weapons[1].weaponMultiplier * cMain.itemInventory.weapons[1].totalAmountPurchased;
			weaponName = cMain.itemInventory.weapons[1].weaponName;
			break;
		case "Attack2":
			itemDamageBonus = cMain.itemInventory.weapons[2].weaponMultiplier * cMain.itemInventory.weapons[2].totalAmountPurchased;
			weaponName = cMain.itemInventory.weapons[2].weaponName;
			break;
		case "Attack3":
			itemDamageBonus = cMain.itemInventory.weapons[3].weaponMultiplier * cMain.itemInventory.weapons[3].totalAmountPurchased;
			weaponName = cMain.itemInventory.weapons[3].weaponName;
			break;
		}
		int playerDamage = new java.util.Random().nextInt(cMain.startingDamage) + ((cMain.startingDamage * (10+itemDamageBonus))/itemDamageDenominator);
		
		cMain.combatTextArea.setText("You attacked " + cMain.enemy.name + "with the" + weaponName + "and dealt " + playerDamage + " damage" );
		
		cMain.enemy.hp = cMain.enemy.hp - playerDamage;
		
		numberOfTurns();
		
		gameOver();
		
		
	}
	
	public void playerDefendResult() {
		cMain.combatTextArea.setText("You put up your guard with the " + cMain.defendingItemCombat + "and your blocking value is now" + cMain.blockValue);
		
		numberOfTurns();
		
		gameOver();
	}
	
	public void enemyAttack() {
		victory();
		if (cMain.inCombat==true) {
		String rolledAttack = "";
		cMain.enemyAttackChoice = new java.util.Random().nextInt(10);
		if (cMain.enemyAttackChoice  >= cMain.enemy.attack4Chance) {
			rolledAttack = cMain.enemy.attack4;
			cMain.enemyDamage = new java.util.Random().nextInt(cMain.enemy.attack4Damage) + cMain.enemy.attack;
		}
		if ((cMain.enemyAttackChoice  >= cMain.enemy.attack3Chance) && (cMain.enemyAttackChoice  < cMain.enemy.attack4Chance)) {
			rolledAttack = cMain.enemy.attack3;
			cMain.enemyDamage = new java.util.Random().nextInt(cMain.enemy.attack3Damage) + cMain.enemy.attack;
		}
		if ((cMain.enemyAttackChoice  >= cMain.enemy.attack2Chance) && (cMain.enemyAttackChoice  < cMain.enemy.attack3Chance)) {
			rolledAttack = cMain.enemy.attack2;
			cMain.enemyDamage = new java.util.Random().nextInt(cMain.enemy.attack2Damage) + cMain.enemy.attack;
		}
		if ((cMain.enemyAttackChoice  >= cMain.enemy.attack1Chance) && (cMain.enemyAttackChoice  < cMain.enemy.attack2Chance)) {
			rolledAttack = cMain.enemy.attack1;
			cMain.enemyDamage = new java.util.Random().nextInt(cMain.enemy.attack1Damage) + cMain.enemy.attack;
		}

		switch (rolledAttack) {
		case "Miss":
			break;
		
		}
		
		cMain.enemyDamage = ((cMain.enemyDamage * 100) / (100 + cMain.blockValue));

		cMain.logosCounter = cMain.logosCounter  - cMain.enemyDamage;
		cMain.combatTextArea.setText(cMain.enemy.name + " attacked with " + rolledAttack + " doing "  + cMain.enemyDamage + "damage" + "\n You have " + cMain.logosCounter + "logos remaining" );
		
		
		combatButtonConfig(cMain.combatButton1, ">", "ContinueBattle");
		combatButtonConfig(cMain.combatButton2, "?", "");
		combatButtonConfig(cMain.combatButton3, "?", "");
		combatButtonConfig(cMain.combatButton4, "?", "");
		
		}
	}
	
	public void combatButtonConfig(JButton combatButton, String text, String command) {
		combatButton.setText(text);
		combatButton.setActionCommand(command);
	}
	
	public void combatButtonConfig(JButton combatButton, int unlocked, String text, String command) {
		if (unlocked > 0 ) {
		combatButton.setText(text);
		combatButton.setActionCommand(command);
		} else {
			combatButton.setText("?");
			combatButton.setActionCommand("");
		}
			
	}
	public void combatButtonConfig(JButton combatButton, String text, String command, String multiplier) {
		combatButton.setText(text);
		combatButton.setActionCommand(command);
	}
	
	public void numberOfTurns(){
		cMain.numberOfActions--;
		
		if (cMain.numberOfActions > 0) {
			combatButtonConfig(cMain.combatButton1, "Bastard Blitz", "Return");
			combatButtonConfig(cMain.combatButton2, "?", "");
			combatButtonConfig(cMain.combatButton3, "?", "");
			combatButtonConfig(cMain.combatButton4, "?", "");
	
			
		} else if (cMain.numberOfActions <= 0) {
			combatButtonConfig(cMain.combatButton1, "Continue", "EnemyTurn");
			combatButtonConfig(cMain.combatButton2, "?", "");
			combatButtonConfig(cMain.combatButton3, "?", "");
			combatButtonConfig(cMain.combatButton4, "?", "");	
			cMain.numberOfActions = 0;
			
		}
	}
	
	public void disableAttackCounter() {
		cMain.disableAttacksCounter--;
		if (cMain.disableAttacksCounter <= 0) {
			cMain.disableAttacksCounter = 0;
			cMain.attacksDisabled = false;
		} else if (cMain.disableAttacksCounter > 0 ) {
			cMain.attacksDisabled = true;
		}
	}
	
	public void disableBlocksCounter() {
		cMain.disableBlocksCounter--;
		if (cMain.disableBlocksCounter <= 0) {
			cMain.disableBlocksCounter = 0;
			cMain.blocksDisabled = false;
		} else if (cMain.disableAttacksCounter > 0 ) {
			cMain.blocksDisabled = true;
		}
	}
	
	public void disableItemsCounter() {
		cMain.disableItemsCounter--;
		if (cMain.disableItemsCounter <= 0) {
			cMain.disableItemsCounter = 0;
			cMain.itemsDisabled = false;
		} else if (cMain.disableItemsCounter > 0 ) {
			cMain.itemsDisabled = true;
		}
	}
	
	
	
	

	
	public void gameOver() {
		
		if (cMain.logosCounter < 1) {
			
		
			
		
		cMain.bgMusicPlayer.stop(cMain.soundFXValues.backgroundmusic);
		
		cMain.soundFX.playSoundEffect(cMain.soundFXValues.death);
		
		cMain.inCombat = true;
		cMain.combatTextArea.setText("You have ran out of life \n Game Over.");
		
		
		
		cMain.combatButton1.setText("New Game");
		cMain.combatButton1.setActionCommand("GameOver");
		cMain.combatButton2.setVisible(false);
		cMain.combatButton3.setVisible(false);
		cMain.combatButton4.setVisible(false);
		
		
		
		}
		
	};
	public void victory() {
		if (cMain.enemy.hp < 1) {
			cMain.combatTextArea.setText("You have defeated " + cMain.enemy.name);
			defeatedEnemy = cMain.enemy.name;
			cMain.itemInventory.exitCombat();
			cMain.inCombat = false;
			cMain.enemiesDefeated++;
			
		
			combatButtonConfig(cMain.combatButton1, "Continue", "Victory");
			combatButtonConfig(cMain.combatButton2, "?", "");
			combatButtonConfig(cMain.combatButton3, "?", "");
			combatButtonConfig(cMain.combatButton4, "?", "");
			
		
			
		}
		
	}
	
}
