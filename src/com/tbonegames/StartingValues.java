package com.tbonegames;

	public class StartingValues {
		CookieMain cMain;
		StartingValues(CookieMain cMain){
			this.cMain = cMain;
		}
	public void startUpValues() {
			cMain.rodUnlocked = false;
			cMain.beltUnlocked = false;
			cMain.maskUnlocked  = false;
			cMain.armorUnlocked = false;
			cMain.displayPanelSwitch = true;
			cMain.slotsUnlocked = false;
			cMain.luckyUnlocked = false;
			cMain.bastardUnlocked = false;
			cMain.feverUnlocked = false;
			cMain.grandpaUnlocked = false;
			cMain.timerOn = false;
			cMain.cursorUpgradeAmount = 0;
			cMain.perSecond = 0;
			cMain.cookieCounter = 0;
			cMain.grandpaPrice = 100;
			cMain.grandmaPrice = 200;
			cMain.elvesPrice = 500;
			cMain.luckyPrice = 500;
			cMain.bastardPrice = 750;
			cMain.feverPrice = 1000;
			cMain.slotsPrice = 1000;
			cMain.cursorNumber = 0;
			cMain.cursorPrice = 10;
		}
		
	}
