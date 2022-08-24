package com.tbonegames;

import java.net.URL;
import java.util.Random;
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
		
		 
		cMain.combatButton1.setText("Attack");
		cMain.combatButton1.setActionCommand("Attack");
	
		
		cMain.combatButton2.setText("Defend");
		cMain.combatButton2.setActionCommand("Defend");
		
		cMain.combatButton3.setText("Item");
		cMain.combatButton3.setActionCommand("Item");
		
		
		cMain.combatButton4.setText("?");
		cMain.combatButton4.setActionCommand("");
		
		
		
	}
	
	public void playerDefendChoices() {
		
		cMain.combatButton1.setText("Bastard Block");
		cMain.combatButton1.setActionCommand("BastardBlock");
		
		if (cMain.rodUnlocked == true) {
		cMain.combatButton2.setText("Bastard Rod");
		cMain.combatButton2.setActionCommand("BastardRod");
		
		} else {
			cMain.combatButton2.setText("?");
			cMain.combatButton2.setActionCommand("");
		}
		
		if (cMain.beltUnlocked == true) {
			cMain.combatButton3.setText("Bastard Belt");
			cMain.combatButton3.setActionCommand("BastardBelt");
			
			} else {
				cMain.combatButton3.setText("?");
				cMain.combatButton3.setActionCommand("");
			}
		
		if (cMain.maskUnlocked == true) {
			cMain.combatButton4.setText("Bastard Mask");
			cMain.combatButton4.setActionCommand("BastardMask");
			
			} else {
				cMain.combatButton4.setText("?");
				cMain.combatButton4.setActionCommand("");
			}
		
	}
	
	public void playerAttackChoices() {
		
		 if (cMain.attack1Disabled == false) {
		cMain.combatButton1.setText("Bastard Fists");
		cMain.combatButton1.setActionCommand("BastardFists");
		 }
		
		 if (cMain.attack2Disabled == false) {
		if (cMain.rodUnlocked == true) {
		cMain.combatButton2.setText("Bastard Rod");
		cMain.combatButton2.setActionCommand("BastardRod");
		
		} else {
			cMain.combatButton2.setText("?");
			cMain.combatButton2.setActionCommand("");
		}
		 }
		 
		 
		if (cMain.attack3Disabled == false) {
		if (cMain.beltUnlocked == true) {
			cMain.combatButton3.setText("Bastard Belt");
			cMain.combatButton3.setActionCommand("BastardBelt");
			
			} else {
				cMain.combatButton3.setText("?");
				cMain.combatButton3.setActionCommand("");
			}
		}
		
		if (cMain.attack4Disabled == false) {
		if (cMain.maskUnlocked == true) {
			cMain.combatButton4.setText("Bastard Mask");
			cMain.combatButton4.setActionCommand("BastardMask");
			
			} else {
				cMain.combatButton2.setText("?");
				cMain.combatButton2.setActionCommand("");
			}
		 }
		
		if ((cMain.attack1Disabled == true) && (cMain.attack2Disabled == true) && (cMain.attack3Disabled == true) && (cMain.attack4Disabled == true)) {
			enemyAttack();
		}
		
	}
	
	public void playerAttackResult(){
		
		gameOver();
		victory();
		int itemDamageBonus = 0;
		int itemDamageDenominator = 10;
		//Allow these to be upgraded. 
		switch (cMain.combatItemString) {
		case "BastardFists":
			break;
		case "BastardRod":
			itemDamageBonus = cMain.rodValue;
			break;
		case "BastardBelt":
			itemDamageBonus = cMain.beltValue*2;
			break;
		case "BastardMask":
			itemDamageBonus = cMain.maskValue*3;
			break;
		}
		int playerDamage = new java.util.Random().nextInt(cMain.startingDamage) + ((cMain.startingDamage * (10+itemDamageBonus))/itemDamageDenominator);
		
		cMain.combatTextArea.setText("You attacked " + cMain.enemy.name + " and dealt " + playerDamage + "damage" );
		
		cMain.enemy.hp = cMain.enemy.hp - playerDamage;
		
		cMain.combatButton1.setText("Continue");
		cMain.combatButton1.setActionCommand("EnemyTurn");
		cMain.combatButton2.setText("");
		cMain.combatButton2.setActionCommand("");
		cMain.combatButton3.setText("");
		cMain.combatButton3.setActionCommand("");
		cMain.combatButton4.setText("");
		cMain.combatButton4.setActionCommand("");
		gameOver();
		if (cMain.enemy.hp>0) {
		
		}
		else if (cMain.enemy.hp<1) {
			
			victory();
		}
	}
	
	
	public void enemyAttack() {
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
		
		cMain.combatButton1.setText(">");
		cMain.combatButton1.setActionCommand("ContinueBattle");
		cMain.combatButton2.setText("");
		cMain.combatButton2.setActionCommand("");
		cMain.combatButton3.setText("");
		cMain.combatButton3.setActionCommand("");
		cMain.combatButton4.setText("");
		cMain.combatButton4.setActionCommand("");
		
		
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
			combatLog();
			
			cMain.combatButton1.setText("Continue");
			cMain.combatButton1.setActionCommand("Victory");
			cMain.combatButton2.setText("");
			cMain.combatButton2.setActionCommand("");
			cMain.combatButton3.setText("");
			cMain.combatButton3.setActionCommand("");
			cMain.combatButton4.setText("");
			cMain.combatButton4.setActionCommand("");
			
		
			
		}
		
	}
	
	public void combatLog() {
		
			
			//the switch position takes the String nextPosition as its parameter.
			switch(defeatedEnemy) {
			case "AntiGravityChamber": cMain.antiGravityChamber = true; cMain.combatTextArea.setText("You have defeated " + enemy.name + "\n ");break;
			
			
			}
	
	}
}
