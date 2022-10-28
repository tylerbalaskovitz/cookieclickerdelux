package com.tbonegames.challenge;

import com.tbonegames.ClientMain;

public class Inflation extends Challenges{

	public Inflation() {
		challengeName = "Inflation";
		
		challengeDescription = "All items in your load out are double in price, price increases, and lockout value.";
		
		completed = false;
	}
	
	public void combatChallenge(ClientMain cMain) {
	}
	
	public void menuChallenge(ClientMain cMain) {
		for (int i = 0; i < 10; i++) {
		cMain.itemInventory.armor[i].armorPrice *=2;
		cMain.itemInventory.armor[i].armorPriceIncrease *=2;
		cMain.itemInventory.armor[i].unlockAmount *=2;
		
		cMain.itemInventory.buffs[i].buffPrice *=2;
		cMain.itemInventory.buffs[i].buffPriceIncrease *=2;
		cMain.itemInventory.buffs[i].unlockAmount *=2;
		
		cMain.itemInventory.items[i].itemPrice *=2;
		cMain.itemInventory.items[i].itemPriceIncrease *=2;
		cMain.itemInventory.items[i].unlockAmount *=2;

		cMain.itemInventory.weapons[i].weaponPrice *=2;
		cMain.itemInventory.weapons[i].rateOfIncrease *=2;
		cMain.itemInventory.weapons[i].unlockAmount *=2;
		}
	}
		
	
	
}
