package com.tbonegames;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveGame implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	ClientMain cMain;
	int highScore;
	
	public SaveGame(ClientMain cMain) {
		this.cMain = cMain;
	}
	
	public SaveGame() {

	}
	

	



	public void saveHighScore() {
	
	try {
		FileOutputStream fos = new FileOutputStream("HighScore.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		SaveGameData sGameData = new SaveGameData();
		sGameData.highScore = cMain.highScore;
		
		oos.writeObject(sGameData);
		oos.close();
		
	} catch (IOException ex ) {
		ex.printStackTrace();
	}
	
	}
	
	public void loadHighScore() {
		
		try {
			
			FileInputStream fis = new FileInputStream("HighScore.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
		
			SaveGameData sGameData = (SaveGameData)ois.readObject();
	
			cMain.highScore = sGameData.highScore;
	
			ois.close();
	
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		}

	public void saveGame(int x) {
		
		try {
			FileOutputStream fos = new FileOutputStream("SaveGame" + x + ".dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			SaveGameData sGameData = new SaveGameData();
			sGameData.day = cMain.day;
			sGameData.logosCounter = cMain.logosCounter;
			sGameData.rounds = cMain.rounds;
			sGameData.timerSpeed = cMain.timerSpeed;
			sGameData.dayTimerSpeed = cMain.dayTimerSpeed;
			sGameData.slotsPrice = cMain.slotsPrice;
			sGameData.luckyPrice = cMain.luckyPrice;
			sGameData.bastardPrice = cMain.bastardPrice;
			sGameData.feverPrice = cMain.feverPrice;
			sGameData.enemyAttackChoice = cMain.enemyAttackChoice;
			sGameData.enemyDamage = cMain.enemyDamage;
			sGameData.bossDay = cMain.bossDay;
			sGameData.startingDamage = cMain.startingDamage;
			sGameData.enemiesDefeated = cMain.enemiesDefeated;
			sGameData.counterUpgrade = cMain.counterUpgrade;
			sGameData.healingMultiplier = cMain.healingMultiplier;
			sGameData.selectedItemValue = cMain.selectedItemValue;
			sGameData.baseNumberOfActions = cMain.baseNumberOfActions;
			sGameData.playerDamage = cMain.playerDamage;
			sGameData.playerAttackBonus = cMain.playerAttackBonus;
			sGameData.clickerBonus = cMain.clickerBonus;
			sGameData.dayLimiter = cMain.dayLimiter;
			sGameData.highestLogo = cMain.highestLogo;
			sGameData.score = cMain.score;
			sGameData.perSecond = cMain.perSecond;
			sGameData.dayPerSecond = cMain.dayPerSecond;

			for (int i = 0; i< 10; i++) {
				sGameData.armor[i] = cMain.itemInventory.armor[i];
				sGameData.weapons[i] = cMain.itemInventory.weapons[i];
				sGameData.items[i] = cMain.itemInventory.items[i];
				sGameData.buffs[i] = cMain.itemInventory.buffs[i];
			}
			
			for (int i = 0; i < 4; i++) {
				sGameData.cards[i] = cMain.itemInventory.cards[i];
			}
			
			for (int i = 0; i < 4; i++) {
			sGameData.burnManager[i] = cMain.itemInventory.burnManager[i];
			}
			
	
			oos.writeObject(sGameData);
			oos.close();
	
		} catch (IOException ex ) {
			ex.printStackTrace();	
		}

	}
	


	public void loadGame(int x) {
	
		try {
			FileInputStream fis = new FileInputStream("SaveGame" + x +".dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			
			SaveGameData sGameData = (SaveGameData) ois.readObject(); 
			
			cMain.day= sGameData.day;
			cMain.logosCounter =sGameData.logosCounter;
			cMain.rounds = sGameData.rounds;
			cMain.timerSpeed = sGameData.timerSpeed;
			cMain.dayTimerSpeed = sGameData.dayTimerSpeed;
			cMain.slotsPrice = sGameData.slotsPrice;
			cMain.luckyPrice = sGameData.luckyPrice;
			cMain.bastardPrice = sGameData.bastardPrice;
			cMain.feverPrice = sGameData.feverPrice;
			cMain.enemyAttackChoice = sGameData.enemyAttackChoice;
			cMain.enemyDamage = sGameData.enemyDamage;
			cMain.bossDay = sGameData.bossDay;
			cMain.startingDamage = sGameData.startingDamage;
			cMain.enemiesDefeated = sGameData.enemiesDefeated;
			cMain.counterUpgrade = sGameData.counterUpgrade;
			cMain.healingMultiplier = sGameData.healingMultiplier;
			cMain.selectedItemValue = sGameData.selectedItemValue;
			cMain.baseNumberOfActions = sGameData.baseNumberOfActions;
			cMain.playerDamage = sGameData.playerDamage;
			cMain.playerAttackBonus = sGameData.playerAttackBonus;
			cMain.clickerBonus = sGameData.clickerBonus;
			cMain.dayLimiter = sGameData.dayLimiter;
			cMain.highestLogo = sGameData.highestLogo;
			cMain.score = sGameData.score;
			cMain.perSecond = sGameData.perSecond;
			cMain.dayPerSecond = sGameData.dayPerSecond;
			
			for (int i = 0; i< 10; i++) {
				 cMain.itemInventory.armor[i] = sGameData.armor[i];
				 cMain.itemInventory.weapons[i] = sGameData.weapons[i];
				 cMain.itemInventory.items[i] = sGameData.items[i];
				 cMain.itemInventory.buffs[i] = sGameData.buffs[i];
			}
			
			for (int i = 0; i < 4; i++) {
				 cMain.itemInventory.cards[i] = sGameData.cards[i];
			}
			
			for (int i = 0; i < 4; i++) {
				 cMain.itemInventory.burnManager[i] = sGameData.burnManager[i];
			}
			
			ois.close();
	
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}

	
}	
