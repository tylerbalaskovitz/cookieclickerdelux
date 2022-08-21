package com.tbonegames;

import com.tbonegames.enemies.Enemies;

public class Combat {
	
	
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
		
		cMain.timer.stop();
		cMain.combatTextArea.setText(enemy.name +"'s HP:" + enemy.hp);
		//playerDamage3();
		
		cMain.combatButton1.setText("Attack");
		cMain.combatButton2.setText("Defend");
		cMain.combatButton3.setText("Item");
		cMain.combatButton4.setText("");
		
		
		
		
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
				cMain.combatButton2.setText("?");
				cMain.combatButton2.setActionCommand("");
			}
		
	}
	
	public void playerAttackChoices() {
		
		cMain.combatButton1.setText("Bastard Fists");
		cMain.combatButton1.setActionCommand("BastardFists");
		
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
				cMain.combatButton2.setText("?");
				cMain.combatButton2.setActionCommand("");
			}
	}
	
	public void playerAttackResult(){
		
		gameOver();
		victory();
		
		int playerDamage = new java.util.Random().nextInt();
		
		cMain.combatTextArea.setText("You attacked " + enemy.name + " and dealt " + playerDamage + "damage" );
		
		enemy.hp = enemy.hp - playerDamage;
		
		cMain.combatButton1.setText("Continue");
		cMain.combatButton1.setActionCommand("Continue");
		cMain.combatButton2.setText("");
		cMain.combatButton2.setActionCommand("");
		cMain.combatButton3.setText("");
		cMain.combatButton3.setActionCommand("");
		cMain.combatButton4.setText("");
		cMain.combatButton4.setActionCommand("");
		
		if (enemy.hp>0) {
		
		}
		else if (enemy.hp<1) {
			
			victory();
		}
	}
	
	public void enemyAttack() {
		String rolledAttack;
		int enemyAttackChoice = new java.util.Random().nextInt(4);
		switch (enemyAttackChoice) {
		case 0:
			rolledAttack = enemy.attack1Command;
			break;
		case 1:
			rolledAttack = enemy.attack2Command;
			break;
		case 2:
			rolledAttack = enemy.attack3Command;
			break;
		case 3:
			rolledAttack = enemy.attack4Command;
			break;
		
		
		}
		int enemyDamage = new java.util.Random().nextInt(enemy.attack);
		
		cMain.combatTextArea.setText(enemy.name + " attacked with the " + enemyDamage + "damage" );
		
		cMain.cookieCounter = cMain.cookieCounter  - enemyDamage;
		cMain.combatTextArea.setText(""+cMain.cookieCounter);
		
		
		
		cMain.combatButton1.setText(">");
		cMain.combatButton2.setText("");
		cMain.combatButton3.setText("");
		cMain.combatButton4.setText("");
		
		
		
		gameOver();
		victory();
	}
	
	public void gameOver() {
		
		if (cMain.cookieCounter < 1) {
		
		
		
		cMain.combatTextArea.setText("You have ran out of life \n Game Over.");
		
		
		
		cMain.combatButton1.setText("Main Menu");
		cMain.combatButton2.setVisible(false);
		cMain.combatButton3.setVisible(false);
		cMain.combatButton4.setVisible(false);
		
		
		
		}
		
	};
	public void victory() {
		if (enemy.hp < 1) {
			cMain.combatTextArea.setText("You have defeated " + enemy.name);
			defeatedEnemy = enemy.name;
			combatLog();
			
			cMain.combatButton1.setText("Continue Journey");
			cMain.combatButton2.setText("");
			cMain.combatButton3.setText("");
			cMain.combatButton4.setText("");
			
		
			
		}
		
	}
	
	public void combatLog() {
		
			
			//the switch position takes the String nextPosition as its parameter.
			switch(defeatedEnemy) {
			case "AntiGravityChamber": cMain.antiGravityChamber = true; cMain.combatTextArea.setText("You have defeated " + enemy.name + "\n ");break;
			
			
			}
	
	}
}
