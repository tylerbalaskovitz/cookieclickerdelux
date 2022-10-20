package com.tbonegames;

import java.io.Serializable;

public class StartingValues implements Serializable{
		final static long serialVersionUID = -1404202925519361557L;
		ClientMain cMain;
		StartingValues(ClientMain cMain){
			this.cMain = cMain;
		}
	public void startUpValues() {
			cMain.highestLogo = 0;
			cMain.healingMultiplier = 1;
			cMain.counterUpgrade = 1;
			cMain.enemiesDefeated = 0;
			cMain.combatAttackingItem = "";
			cMain.healingMultiplierHandler = "Normal";
			cMain.displayPanelSwitch = true;
			cMain.slotsUnlocked = false;
			cMain.luckyUnlocked = false;
			cMain.bastardUnlocked = false;
			cMain.feverUnlocked = false;
			cMain.timerOn = false;
			cMain.inCombat = false;
			cMain.baseNumberOfActions = 2;
			cMain.day = 0;
			cMain.bossDay = 20;
			cMain.logosCounter = 0;
			cMain.startingDamage = 5;
			cMain.cursorUpgradeAmount = 0;
			cMain.perSecond = 0;
			cMain.dayPerSecond = 0;
			cMain.luckyPrice = 500;
			cMain.bastardPrice = 750;
			cMain.feverPrice = 1000;
			cMain.slotsPrice = 500;
		}
		
	}
