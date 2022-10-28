package com.tbonegames.weapons;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class BastardMask extends Weapons{

	public BastardMask() {
	weaponName = "Bastard Mask";
	weaponHandlerName = "BastardMask";
	
	//used for the description when hovering over the items
	weaponDescription = "";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 3;
	
	reduceDefense = 0;
	
	clickerMultiplier = 3;
	
	weaponMultiplier = 6;
	
	//used for the sound that unlocks during the GameTimers class being ran.
	unlocked = false;
	
	unlockAmount = 1600;
	
	rateOfIncrease = 4;
	
	totalCurrentAmount = 0;
	totalAmountPurchased = 0;
	
	weaponPrice = 1600;
	weaponPriceIncrease = 1600;
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
}
