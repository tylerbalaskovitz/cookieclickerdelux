package com.tbonegames.weapons;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class BastardRod extends Weapons  implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public BastardRod() {
	weaponName = "Bastard Rod";
	weaponHandlerName = "BastardRod";
	
	//used for the description when hovering over the items
	weaponDescription = "Grab your little bastard rod and swing it at your friends and your enemies";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 1;
	
	reduceDefense = 0;
	
	clickerMultiplier = 1;
	
	weaponMultiplier = 1;
	
	//used for the sound that unlocks during the GameTimers class being ran.
	unlocked = false;
	
	unlockAmount = 400;
	
	rateOfIncrease = 2;
	
	totalCurrentAmount = 0;
	totalAmountPurchased = 0;
	
	weaponPrice = 400;
	weaponPriceIncrease = 400;
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
}
