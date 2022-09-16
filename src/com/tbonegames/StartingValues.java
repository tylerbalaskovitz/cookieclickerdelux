package com.tbonegames;

	public class StartingValues {
		CookieMain cMain;
		StartingValues(CookieMain cMain){
			this.cMain = cMain;
		}
	public void startUpValues() {
			cMain.healingMultiplier = 1;
			cMain.counterUpgrade = 1;
			cMain.combatAttackingItem = "";
			cMain.colaUnlocked = true;
			cMain.sausageUnlocked = true;
			cMain.rodUnlocked = false;
			cMain.beltUnlocked = false;
			cMain.maskUnlocked  = false;
			cMain.armorUnlocked = false;
			cMain.displayPanelSwitch = true;
			cMain.slotsUnlocked = false;
			cMain.luckyUnlocked = false;
			cMain.bastardUnlocked = false;
			cMain.feverUnlocked = false;
			cMain.whiteyUnlocked = false;
			cMain.timerOn = false;
			cMain.inCombat = false;
			cMain.day = 0;
			cMain.bossDay = 20;
			cMain.startingDamage = 5;
			cMain.cursorUpgradeAmount = 0;
			cMain.perSecond = 0;
			cMain.dayPerSecond = 0;
			cMain.colaValue = 0;
			cMain.sausageValue = 0;
			cMain.rodValue = 0;
			cMain.beltValue = 0;
			cMain.maskValue = 0;
			cMain.armorValue = 0;
			cMain.logosCounter = 0;
			cMain.whiteyPrice = 100;
			cMain.lollipopPrice = 200;
			cMain.docPrice = 500;
			cMain.luckyPrice = 500;
			cMain.bastardPrice = 750;
			cMain.feverPrice = 1000;
			cMain.slotsPrice = 1000;
			cMain.cursorNumber = 0;
			cMain.cursorPrice = 10;
			cMain.colaPrice = 100;
			cMain.sausagePrice = 300;
			cMain.rodPrice = 400;
			cMain.beltPrice = 800;
			cMain.maskPrice = 1600;
			cMain.armorPrice = 2000;
		}
		
	}
