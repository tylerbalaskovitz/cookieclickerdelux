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
		
		gameOver();
		
		cMain.inCombat=true;
		cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
		cMain.combatTextArea.setText(cMain.enemy.name +"'s HP:" + cMain.enemy.hp);
		//playerDamage3();
		cMain.multiplierPanel.setVisible(false);
		
		if (cMain.attacksDisabled == false || cMain.blocksDisabled == false || cMain.itemsDisabled == false || cMain.buffsDisabled == false) {
		
		combatButtonConfig(cMain.combatButton1, "Attack", "Attack");
	
		combatButtonConfig(cMain.combatButton2, "Defend", "Defend");
		
		combatButtonConfig(cMain.combatButton3, "Item", "Item");
		
		combatButtonConfig(cMain.combatButton4, "Buffs", "Buffs");
		} else {
			enemyAttack();
		}
		victory();
	}
	
	public void playerDefendChoices() {
		if (cMain.blocksDisabled == false) {
		combatButtonConfig(cMain.combatButton1, cMain.itemInventory.armor[0].totalCurrentAmount,cMain.itemInventory.armor[0].armorName, "Defend0");
		
		combatButtonConfig(cMain.combatButton2, cMain.itemInventory.armor[1].totalCurrentAmount, cMain.itemInventory.armor[1].armorName, "Defend1");
		
		combatButtonConfig(cMain.combatButton3, cMain.itemInventory.armor[2].totalCurrentAmount, cMain.itemInventory.armor[2].armorName, "Defend2");
			
		combatButtonConfig(cMain.combatButton4, cMain.itemInventory.armor[3].totalCurrentAmount, cMain.itemInventory.armor[3].armorName, "Defend3");
		
		if (cMain.itemInventory.armor[3].totalCurrentAmount == 0) {combatButtonConfig(cMain.combatButton4, "Return", "Return");}	
		} else {
	 		enemyAttack();
	 	}
	}
	
	public void itemChoices() {
		
		if (cMain.itemsDisabled == false) {
		
		setBoldness();
		cMain.multiplierPanel.setVisible(true);
		
		combatButtonConfig(cMain.combatButton1, cMain.itemInventory.items[0].totalCurrentAmount ,cMain.itemInventory.items[0].itemName, "Item0");
		
		combatButtonConfig(cMain.combatButton2, cMain.itemInventory.items[1].totalCurrentAmount ,cMain.itemInventory.items[1].itemName, "Item1");
		
		combatButtonConfig(cMain.combatButton3, cMain.itemInventory.items[2].totalCurrentAmount ,cMain.itemInventory.items[2].itemName, "Item2");
		
		combatButtonConfig(cMain.combatButton4, cMain.itemInventory.items[3].totalCurrentAmount ,cMain.itemInventory.items[3].itemName, "Item3");
		
		if (cMain.itemInventory.items[3].totalCurrentAmount == 0) {combatButtonConfig(cMain.combatButton4, "Return", "Return");}
		} else {
	 		enemyAttack();
	 	}
	}
	
	
	public int healSelf(int healingItem, int healingValue, int healingMultiplier, String healingMultiplierHandler) {
		double doubleHealingMultiplier = 0.0;
		if (healingItem > 0) {
			switch (healingMultiplierHandler) {
			case "Normal":
			cMain.logosCounter += (healingValue * healingMultiplier);
			healingItem -= healingMultiplier;
			break;
			case "Extra":
				doubleHealingMultiplier = ((double)(healingValue * healingMultiplier) * .8);
			cMain.logosCounter += (int)doubleHealingMultiplier;
			healingItem -= healingMultiplier;
			break;
			case "Bastardly":
				doubleHealingMultiplier = ((double)(healingValue * healingMultiplier) * .7);
			cMain.logosCounter += (int)doubleHealingMultiplier;
			healingItem -= healingMultiplier;
			break;
		}
		}
		return cMain.logosCounter;
	}
	
	
	
	public void buffChoices() {
		
		if (cMain.buffsDisabled == false) {
		
		combatButtonConfig(cMain.combatButton1, cMain.itemInventory.buffs[0].currentAmount, cMain.itemInventory.buffs[0].buffName, "Buff0");
		
		combatButtonConfig(cMain.combatButton2, cMain.itemInventory.buffs[1].currentAmount, cMain.itemInventory.buffs[1].buffName, "Buff1");
		
		combatButtonConfig(cMain.combatButton3, cMain.itemInventory.buffs[2].currentAmount,cMain.itemInventory.buffs[2].buffName, "Buff2");
		
		combatButtonConfig(cMain.combatButton4, cMain.itemInventory.buffs[3].currentAmount,cMain.itemInventory.buffs[3].buffName, "Buff3");
		
		if (cMain.itemInventory.buffs[3].currentAmount == 0) {combatButtonConfig(cMain.combatButton4, "Return", "Return");}
		} else {
	 		enemyAttack();
	 	}
	}
	
	
	
	
	public void playerAttackChoices() {
		
		 	if (cMain.attacksDisabled == false) {
				cMain.combatDeath = false;

		 		
		 		cMain.multiplierPanel.setVisible(true);
			 	
			combatButtonConfig(cMain.combatButton1, cMain.itemInventory.weapons[0].totalCurrentAmount , cMain.itemInventory.weapons[0].weaponName, "Attack0");
			if (cMain.itemInventory.weapons[0].totalCurrentAmount == 0) {combatButtonConfig(cMain.combatButton1, "Bastard Fists", "BastardFists");}
		
			combatButtonConfig(cMain.combatButton2, cMain.itemInventory.weapons[1].totalCurrentAmount , cMain.itemInventory.weapons[1].weaponName, "Attack1");
			
			combatButtonConfig(cMain.combatButton3, cMain.itemInventory.weapons[2].totalCurrentAmount , cMain.itemInventory.weapons[2].weaponName, "Attack2");
			
			combatButtonConfig(cMain.combatButton4, cMain.itemInventory.weapons[3].totalCurrentAmount , cMain.itemInventory.weapons[3].weaponName, "Attack3");
			
			if (cMain.itemInventory.weapons[3].totalCurrentAmount == 0) {combatButtonConfig(cMain.combatButton4, "Return", "Return");}
			
		 	} else {
		 		enemyAttack();
		 	}
	}
	
	public void playerHealResult(String itemUsed, String healingStyle) {
	
		cMain.combatTextArea.setText("You healed yourself with the " + itemUsed + " using the Action Bastard " + healingStyle + " Bastard Healing Technique. \n Your HP is now " + cMain.logosCounter);
		cMain.inCombatHPLabel.setText("HP: " + cMain.logosCounter);
		
		numberOfTurns();
	
		gameOver();
	}
	
	public int calculateDamage(int weaponsMultiplier, int totalPurchase) {
		int itemDamageBonus = 0;

		
		itemDamageBonus =weaponsMultiplier * totalPurchase;
		
		cMain.playerDamage = new java.util.Random().nextInt(cMain.startingDamage) + ((cMain.startingDamage * (10+itemDamageBonus))/cMain.enemy.defense);
		return cMain.playerDamage;
	}
	
	public int calculateBonus(int playerDamage) {
		double bonusCalculation = 0;
		switch (cMain.healingMultiplierHandler) {
		case "Normal":
			cMain.playerAttackBonus = 0;
			break;
		case "Extra":
			bonusCalculation = (double)(playerDamage * .3);
			break;
		case "Bastardly":
			bonusCalculation = (double)(((playerDamage * .1) +((double)(new java.util.Random().nextInt(6))*.1)* playerDamage) + (double)(new java.util.Random().nextInt(playerDamage)*.5));
			break;
		}
			cMain.playerAttackBonus = (int)bonusCalculation;
		
		return cMain.playerAttackBonus;
	}
	
	public int calculateRecoil(int extraRecoilDamage, int bastardlyRecoilDamage, String handler) {
			int recoilDamage = 0;
			switch (handler) {
			case "Normal":
				recoilDamage = 0;
				break;
			case "Extra":
				recoilDamage = extraRecoilDamage;
				break;
			case "Bastardly":
				recoilDamage = bastardlyRecoilDamage;
				break;
			}
			
		return recoilDamage;
	}
		
	
	public void playerAttackResult(String weaponName, int playerDamage, int playerBonus, int playerRecoil){
		
		gameOver();
		victory();

		
		String attackStyleMessage = "";
		switch (cMain.healingMultiplierHandler) {
		case "Normal":
			break;
		case "Extra":
			attackStyleMessage = "Due to using the Action Bastard Lucky Bastard " + cMain.healingMultiplierHandler + " technique, you dealt an additional " + playerBonus + " damage, but took " + playerRecoil +" damage in recoil.";
			break;
		case "Bastardly":
			attackStyleMessage = "Due to using the Action Bastard Lucky Bastard " + cMain.healingMultiplierHandler + " technique, you dealt an additional " + playerBonus + " damage, but took " + playerRecoil +" damage in recoil.";
			break;
		}

		cMain.playerDamage += cMain.playerAttackBonus;
		
		
		cMain.combatTextArea.setText("You attacked " + cMain.enemy.name + " with the " + weaponName + " with the Action Bastard Lucky Bastard " + cMain.healingMultiplierHandler + " Teachnique. " +
		"You dealt " + playerDamage + " damage." + attackStyleMessage);
				
		cMain.logosCounter = cMain.logosCounter - playerRecoil;
		cMain.enemy.hp = cMain.enemy.hp - cMain.playerDamage;
		
		
		numberOfTurns();
		
		gameOver();
		
		
	}
	
	public void playerDefendResult() {
		cMain.combatTextArea.setText("You put up your guard with the " + cMain.defendingItemCombat + " and your blocking value is now " + cMain.blockValue);
		
		numberOfTurns();
		
		gameOver();
	}
	
	public void enemyAttack() {
		calculateDisables(cMain.enemy.attackDisableCounter, cMain.enemy.blockDisableCounter, cMain.enemy.itemDisableCounter, cMain.enemy.buffsDisableCounter);
		cMain.multiplierPanel.setVisible(false);
		victory();
		if (cMain.inCombat==true) {
		String rolledAttack = "";
		cMain.enemyAttackChoice = new java.util.Random().nextInt(10);
		if (cMain.enemyAttackChoice  >= cMain.enemy.attack4Chance) {
			rolledAttack = cMain.enemy.attack4;
			cMain.enemy.special4();
			cMain.enemyDamage = new java.util.Random().nextInt(cMain.enemy.attack4Damage) + cMain.enemy.attack;
		}
		if ((cMain.enemyAttackChoice  >= cMain.enemy.attack3Chance) && (cMain.enemyAttackChoice  < cMain.enemy.attack4Chance)) {
			rolledAttack = cMain.enemy.attack3;
			cMain.enemy.special3();
			cMain.enemyDamage = new java.util.Random().nextInt(cMain.enemy.attack3Damage) + cMain.enemy.attack;
		}
		if ((cMain.enemyAttackChoice  >= cMain.enemy.attack2Chance) && (cMain.enemyAttackChoice  < cMain.enemy.attack3Chance)) {
			rolledAttack = cMain.enemy.attack2;
			cMain.enemy.special2();
			cMain.enemyDamage = new java.util.Random().nextInt(cMain.enemy.attack2Damage) + cMain.enemy.attack;
		}
		if ((cMain.enemyAttackChoice  >= cMain.enemy.attack1Chance) && (cMain.enemyAttackChoice  < cMain.enemy.attack2Chance)) {
			rolledAttack = cMain.enemy.attack1;
			cMain.enemy.special1();
			cMain.enemyDamage = new java.util.Random().nextInt(cMain.enemy.attack1Damage) + cMain.enemy.attack;
		}

		switch (rolledAttack) {
		case "Miss":
			break;
		
		}
		
		cMain.combatDeath = true;
		
		cMain.enemyDamage = ((cMain.enemyDamage * 100) / (100 + cMain.blockValue));

		cMain.logosCounter = cMain.logosCounter  - cMain.enemyDamage;
		cMain.combatTextArea.setText(cMain.enemy.name + " attacked with " + rolledAttack + " doing "  + cMain.enemyDamage + " damage." + cMain.enemy.specialMessage + "\n You have " + cMain.logosCounter + " logos remaining");
		
		cMain.enemy.specialMessage = "";
		
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
			combatButtonConfig(cMain.combatButton2, " ", "Return");
			combatButtonConfig(cMain.combatButton3, " ", "Return");
			combatButtonConfig(cMain.combatButton4, " ", "Return");
	
			
		} else if (cMain.numberOfActions <= 0) {
			combatButtonConfig(cMain.combatButton1, "Continue", "EnemyTurn");
			combatButtonConfig(cMain.combatButton2, "?", "");
			combatButtonConfig(cMain.combatButton3, "?", "");
			combatButtonConfig(cMain.combatButton4, "?", "");	
			cMain.numberOfActions = 0;
			
		}
	}
	
	public void calculateDisables(int attackCounter, int blockCounter, int itemsCounter, int buffsCounter) {
		
		if (attackCounter > 0) {
			attackCounter--;
			cMain.attacksDisabled = true;
		} else if (attackCounter <= 0 ) {
			cMain.attacksDisabled = false;
		}
		
		
		if (blockCounter > 0) {
			blockCounter--;
			cMain.blocksDisabled = true;
		} else if (blockCounter <=  0 ) {
			cMain.blocksDisabled = false;
		}
		
		
		if (itemsCounter > 0) {
			itemsCounter--;
			cMain.itemsDisabled = true;
		} else if (attackCounter<=  0 ) {
			cMain.itemsDisabled = false;
		}
		
		
		if (buffsCounter > 0) {
			buffsCounter--;
			cMain.buffsDisabled = true;
		} else if (buffsCounter<=  0 ) {
			cMain.buffsDisabled = false;
		}
		
		if (cMain.inCombat == false) {
			attackCounter = 0;
			blockCounter = 0;
			itemsCounter = 0;
			buffsCounter = 0;
		}
		
	}
	
	
	public void gameOver() {
		String recoilDeath = "";
		if (cMain.logosCounter < 1) {
			
			if (cMain.combatDeath == false) {
			switch(cMain.healingMultiplierHandler) {
			
			case "Extra":
				recoilDeath = "You took " + cMain.playerRecoil + " in recoil damage and blew yourself to bastard bits. ";
				break;
			case "Bastardly":
				recoilDeath = "You took " + cMain.playerRecoil + " in recoil damage and bastardly blew yourself to bastard bits. ";
				break;
			}
			}
		
			
		
		cMain.bgMusicPlayer.stop(cMain.soundFXValues.backgroundmusic);
		
		cMain.soundFX.playSoundEffect(cMain.soundFXValues.death);
		
		
		cMain.combatTextArea.setText( recoilDeath + "You have ran out of life \n Game Over.");
		
		
		
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
			if (cMain.enemiesDefeated % 4 == 0) {
				cMain.clickerBonus++;
			}
			if (cMain.enemiesDefeated >= 18) {
				beatGame();
				
			} else {
		
			combatButtonConfig(cMain.combatButton1, "Continue", "Victory");
			combatButtonConfig(cMain.combatButton2, "?", "");
			combatButtonConfig(cMain.combatButton3, "?", "");
			combatButtonConfig(cMain.combatButton4, "?", "");
			
			}
			
		}
		
	}
	
	public void beatGame() {
		cMain.bgMusicPlayer.stop(cMain.soundFXValues.backgroundmusic);
		cMain.bgMusicPlayer.play(cMain.soundFXValues.victorymusic);
		
		cMain.ui.closeAllPanels();
		cMain.ui.displayOptions();
	}
	
	public void setBoldness() {
		switch (cMain.healingMultiplierHandler) {
		case "Normal":
			cMain.multiplierButton1.setFont(cMain.font3Bold);
			cMain.multiplierButton2.setFont(cMain.font3);
			cMain.multiplierButton3.setFont(cMain.font3);
			break;
		case "Extra":
			cMain.multiplierButton1.setFont(cMain.font3);
			cMain.multiplierButton2.setFont(cMain.font3Bold);
			cMain.multiplierButton3.setFont(cMain.font3);
			break;
		case "Bastardly":
			cMain.multiplierButton1.setFont(cMain.font3);
			cMain.multiplierButton2.setFont(cMain.font3);
			cMain.multiplierButton3.setFont(cMain.font3Bold);
			break;
		}
	}

	public void playerBuffResult(String buffName) {
	cMain.combatTextArea.setText("You buff your bastardly self up with the " + buffName);
		
		numberOfTurns();
		
		gameOver();
		
	}
	
}
