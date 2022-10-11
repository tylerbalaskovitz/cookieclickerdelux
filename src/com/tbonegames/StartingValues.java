package com.tbonegames;

	public class StartingValues {
		CookieMain cMain;
		StartingValues(CookieMain cMain){
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
			cMain.whiteyUnlocked = false;
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
			cMain.whiteyPrice = 100;
			cMain.lollipopPrice = 200;
			cMain.docPrice = 500;
			cMain.luckyPrice = 500;
			cMain.bastardPrice = 750;
			cMain.feverPrice = 1000;
			cMain.slotsPrice = 500;
			cMain.cursorNumber = 0;
			cMain.cursorPrice = 10;
		}
		
	}
