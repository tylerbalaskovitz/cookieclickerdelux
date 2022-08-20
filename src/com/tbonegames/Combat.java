package com.tbonegames;

import com.tbonegames.enemies.Enemies;

public class Combat {
	
	CookieMain cMain;
	
	Enemies enemy;
	
	public void fight() {
		
		cMain.combatTextArea.setText(enemy.name +"'s HP:" + enemy.hp);
		//playerDamage3();
		
		cMain.combatButton1.setText("Attack");
		cMain.combatButton2.setText("");
		cMain.combatButton3.setText("");
		cMain.combatButton4.setText("");
		
		launcher.nextPosition1 = "playerAttack";
		launcher.nextPosition2 = "";
		launcher.nextPosition3 = "";
		launcher.nextPosition4 = "";
		
		
	}
	
	public void playerAttack(){
		
		gameOver();
		victory();
		
		int playerDamage = new java.util.Random().nextInt();
		
		cMain.combatTextArea.setText("You attacked " + enemy.name + " and dealt " + playerDamage + "damage" );
		
		enemy.hp = enemy.hp - playerDamage;
		
		cMain.combatButton1.setText("Continue");
		cMain.combatButton2.setText("");
		cMain.combatButton3.setText("");
		cMain.combatButton4.setText("");
		
		if (enemy.hp>0) {
		launcher.nextPosition1 = "enemyAttack";
		launcher.nextPosition2 = "";
		launcher.nextPosition3 = "";
		launcher.nextPosition4 = "";
		}
		else if (enemy.hp<1) {
			launcher.nextPosition1 = "victory";
			launcher.nextPosition2 = "";
			launcher.nextPosition3 = "";
			launcher.nextPosition4 = "";
			
		}
	}
	
	public void enemyAttack() {
		
		int enemyDamage = new java.util.Random().nextInt(enemy.attackDamage);
		
		cMain.combatTextArea.setText(enemy.name + " attacked and and dealt " + enemyDamage + "damage" );
		
		cMain.cookieCounter = cMain.cookieCounter  - enemyDamage;
		ui.hpLabelNumber.setText(""+player.playerHP);
		
		
		
		cMain.combatButton1.setText(">");
		cMain.combatButton2.setText("");
		cMain.combatButton3.setText("");
		cMain.combatButton4.setText("");
		
		launcher.nextPosition1 = "fight";
		launcher.nextPosition2 = "";
		launcher.nextPosition3 = "";
		launcher.nextPosition4 = "";
		
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
		
		launcher.nextPosition1 = "restartGame";
		launcher.nextPosition2 = "";
		launcher.nextPosition3 = "";
		launcher.nextPosition4 = "";
		
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
			
			launcher.nextPosition1 = postFight;
			launcher.nextPosition2 = "";
			launcher.nextPosition3 = "";
			launcher.nextPosition4 = "";
			
		}
		
	}
	
	public void combatLog() {
		
			
			//the switch position takes the String nextPosition as its parameter.
			switch(defeatedEnemy) {
			case "Gerri": gerri = true; silverKey = true; ui.mainTextArea.setText("You have defeated " + enemy.name + "\n (You gained a silver manor key)");break;
			
			}
	
	}
}
