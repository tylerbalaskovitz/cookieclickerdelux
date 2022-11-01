package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class DayTimer {
	
	ClientMain cMain;
	
	public DayTimer(ClientMain cMain) {
		this.cMain = cMain;
	}
	
	public void setTimer() {
		cMain.dayTimer = new Timer(cMain.dayTimerSpeed, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cMain.dayLimiter = cMain.bossDay - 1;
				if (cMain.inCombat == true && (cMain.day >= cMain.dayLimiter)) {
				} else {
				cMain.day++;
				}
				cMain.dayLabel.setText("Day: "+ cMain.day);
				cMain.combatDayLabel.setText("Next Combat Day: " + (cMain.bossDay));
				cMain.inCombatDayLabel.setText("Day: " + cMain.day);
				
				bossGenerator();
				
				if (cMain.day == cMain.bossDay && cMain.inCombat == false) {
					launchCombat();
					statTracker();
				}
				
			}
		});
	}
	
	public void bossGenerator() {
		
		if (cMain.inCombat == false && cMain.bossGenerated == false) {
			cMain.enemy = cMain.levels.level[cMain.enemiesDefeated];
			cMain.bossDay = cMain.levels.combatDayArray[cMain.enemiesDefeated];
			cMain.bossGenerated = true;
		}
		
	}
	
	public void statTracker() {
		System.out.println("Day" + cMain.day + ", Logos: " + cMain.logosCounter);
		for (int i = 0; i < 5; i++) {
		nameAndStat(cMain.itemInventory.items[i].itemName, cMain.itemInventory.items[i].totalCurrentAmount);
		
		nameAndStat(cMain.itemInventory.weapons[i].weaponName, cMain.itemInventory.weapons[i].totalCurrentAmount);
		
		nameAndStat(cMain.itemInventory.armor[i].armorName, cMain.itemInventory.weapons[i].totalCurrentAmount);
		
		nameAndStat(cMain.itemInventory.buffs[i].buffName, cMain.itemInventory.buffs[i].currentAmount);

		System.out.println("==================================================");
		}
		
	}
	
	public void nameAndStat(String name, int stat) {
		System.out.println(name + ":" + stat);
	}
	
	public void launchCombat() {
	
	cMain.ui.closeAllPanels();
	cMain.ui.displayCombat();
	cMain.blockValue = 0;
	calculateRecoil();
	calculateBlockValueBonus();
	cMain.numberOfActions = cMain.baseNumberOfActions;
	cMain.combat.combatSetup();
	cMain.combat.fight();
	}
	
	public void calculateBlockValueBonus() {
		cMain.blockValueBonus = cMain.logosCounter / 200;
	}
	
	public void calculateRecoil() {
		double doubleExtraRecoil = ((double)cMain.logosCounter * .15);
		cMain.extraAttackRecoil = (int)doubleExtraRecoil;
		double doubleBastardlyAttackRecoil = ((double)cMain.logosCounter * .3);
		cMain.bastardlyAttackRecoil = (int)doubleBastardlyAttackRecoil;
	}
	
	public void timerUpdate() {
		if (cMain.dayTimerOn == false) {
			
			cMain.dayTimerOn =true;
		}
		else if(cMain.dayTimerOn ==true) {
			cMain.dayTimer.stop();
		}
		
		double speed =	1/cMain.dayPerSecond*1000;
		
		cMain.dayTimerSpeed = (int)Math.round(speed);
		
		//the %.1f is a a way for creating a format where the float(decimal) will go 1 digit deep)
		cMain.dayLabel.setText("Day: " + cMain.day);
		
		setTimer();
		cMain.dayTimer.start();
		
	}

}


