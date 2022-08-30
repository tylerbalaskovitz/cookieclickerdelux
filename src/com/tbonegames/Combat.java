package com.tbonegames;

import java.net.URL;
import java.util.Random;

import javax.swing.JButton;

import com.tbonegames.enemies.Enemies;

public class Combat {
	
	public URL death = getClass().getClassLoader().getResource("audio//deathsound.wav");
	SoundFX soundFX = new SoundFX();
	
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

	public void fight() {
		
		cMain.inCombat=true;
		cMain.combatTextArea.setText(cMain.enemy.name +"'s HP:" + cMain.enemy.hp);
		//playerDamage3();
		
		combatButtonConfig(cMain.combatButton1, "Attack", "Attack");
	
		combatButtonConfig(cMain.combatButton2, "Defend", "Defend");
		
		combatButtonConfig(cMain.combatButton3, "Item", "Item");
		
		combatButtonConfig(cMain.combatButton4, "Party", "Party");
	}
	
	public void playerDefendChoices() {
		
		combatButtonConfig(cMain.combatButton1, "Bastard Block", "BastardBlock");
		
		if (cMain.rodUnlocked == true) {
		combatButtonConfig(cMain.combatButton2, "Bastard Rod", "BastardRod");
		} else {
			combatButtonConfig(cMain.combatButton2, "?", "");
		}
		
		if (cMain.beltUnlocked == true) {
			combatButtonConfig(cMain.combatButton3, "Bastard Belt", "BastardBelt");
			} else {
				combatButtonConfig(cMain.combatButton3, "?", "");
			}
		
		if (cMain.maskUnlocked == true) {
			combatButtonConfig(cMain.combatButton4, "Bastard Mask", "BastardMask");
			} else {
				combatButtonConfig(cMain.combatButton4, "?", "");
			}
		
	}
	
	
	
	
	public void partyChoices() {
		combatButtonConfig(cMain.combatButton1, "Shin Chan", "ShinChan");
		
		combatButtonConfig(cMain.combatButton2, "Lollipop", "Lollipop");
		
		combatButtonConfig(cMain.combatButton3, "Doc", "Doc");
		
		combatButtonConfig(cMain.combatButton4, "Return", "Return");
		
	}
	
	public void removeDisables() {
		combatButtonConfig(cMain.combatButton1, "Restore Attacks", "RestoreAttacks");
		
		combatButtonConfig(cMain.combatButton2, "Restore Blocks", "RestoreBlocks");
		
		combatButtonConfig(cMain.combatButton3, "Restore Items", "RestoreItems");
		
		combatButtonConfig(cMain.combatButton4, "Return", "Party");
		
		
	}
	
	
	
	public void playerAttackChoices() {
		
		 	if (cMain.attacksDisabled == false) {
			 	combatButtonConfig(cMain.combatButton1, "Bastard Fists", "BastardFists");
		 	}

		 	if (cMain.rodUnlocked == true) {
			 combatButtonConfig(cMain.combatButton2, "Bastard Rod", "BastardRod");
		
			} else {
				combatButtonConfig(cMain.combatButton2, "?", "");
			}

		if (cMain.beltUnlocked == true) {
			combatButtonConfig(cMain.combatButton3, "Bastard Belt", "BastardBelt");
			
			} else {
			combatButtonConfig(cMain.combatButton3, "?", "");
			}
		
		
		
			if (cMain.maskUnlocked == true) {
				combatButtonConfig(cMain.combatButton4, "Bastard Mask", "BastardMask");
			} else {
			combatButtonConfig(cMain.combatButton4, "?", "");
			}
		
	}
		
	
	public void playerAttackResult(){
		
		gameOver();
		victory();
		int itemDamageBonus = 0;
		int itemDamageDenominator = 10;
		//Allow these to be upgraded. 
		switch (cMain.combatAttackingItem) {
		case "BastardFists":
			break;
		case "BastardRod":
			itemDamageBonus = cMain.rodValue;
			break;
		case "BastardBelt":
			itemDamageBonus = cMain.beltValue*4;
			break;
		case "BastardMask":
			itemDamageBonus = cMain.maskValue*6;
			break;
		}
		int playerDamage = new java.util.Random().nextInt(cMain.startingDamage) + ((cMain.startingDamage * (10+itemDamageBonus))/itemDamageDenominator);
		
		cMain.combatTextArea.setText("You attacked " + cMain.enemy.name + " and dealt " + playerDamage + "damage" );
		
		cMain.enemy.hp = cMain.enemy.hp - playerDamage;
		
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

		cMain.cookieCounter = cMain.cookieCounter  - cMain.enemyDamage;
		cMain.combatTextArea.setText(cMain.enemy.name + " attacked with " + rolledAttack + " doing "  + cMain.enemyDamage + "damage" + "\n You have " + cMain.cookieCounter + "logos remaining" );
		
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
	
	public void numberOfTurns(){
		if (cMain.numberOfActions > 0) {
			cMain.numberOfActions--;
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
		
		if (cMain.cookieCounter < 1) {
		
		soundFX.playSoundEffect(death);
		cMain.soundFX.stop(cMain.backgroundmusic);
		cMain.inCombat = false;
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
			cMain.inCombat = false;
			cMain.enemiesDefeated++;
			
		
			combatButtonConfig(cMain.combatButton1, "Continue", "Victory");
			combatButtonConfig(cMain.combatButton2, "?", "");
			combatButtonConfig(cMain.combatButton3, "?", "");
			combatButtonConfig(cMain.combatButton4, "?", "");
			
		
			
		}
		
	}
	
}
