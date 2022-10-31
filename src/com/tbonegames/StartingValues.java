package com.tbonegames;

import com.tbonegames.levels.HitlerClone;

public class StartingValues {
		ClientMain cMain;
		StartingValues(ClientMain cMain){
			this.cMain = cMain;
		}
	public void startUpValues() {
			//temporary until the handler is created.
			cMain.levels = new HitlerClone();
			cMain.levels.createLevel();
			cMain.levels.createBossDay();
			cMain.itemInventory.startingValuesBurnManager();
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
			cMain.logosCounter = 200000;
			cMain.startingDamage = 5;
			cMain.perSecond = 0;
			cMain.dayPerSecond = 1;
			cMain.luckyPrice = 500;
			cMain.bastardPrice = 750;
			cMain.feverPrice = 1000;
			cMain.slotsPrice = 500;
			cMain.switcherEnabled = false;
			cMain.challengeMode.savesDisabled = false;
			cMain.challengeMode.switchesDisabled = false;
			cMain.challengeMode.noBurnSwitch = false;
		}
		
	}
