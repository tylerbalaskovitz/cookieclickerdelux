package com.tbonegames.weapons;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class BastardNitrogenBomb extends Weapons implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public BastardNitrogenBomb() {
	weaponName = "Bastard Nitrogen Bomb";
	weaponHandlerName = "NitrogenBomb";
	
	//used for the description when hovering over the items
	weaponDescription = "";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 5;
	
	reduceDefense = 0;
	
	clickerMultiplier = 28;
	
	weaponMultiplier = 20;
	
	//used for the sound that unlocks during the GameTimers class being ran.
	unlocked = false;
	
	unlockAmount = 10000;
	
	rateOfIncrease = 10;
	
	totalCurrentAmount = 0;
	totalAmountPurchased = 0;
	
	weaponPrice = 10000;
	weaponPriceIncrease = 10000;
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
}
