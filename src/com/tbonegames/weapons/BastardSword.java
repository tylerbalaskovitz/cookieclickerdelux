package com.tbonegames.weapons;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class BastardSword extends Weapons implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	public BastardSword() {
		weaponName = "Bastard Sword";
		weaponHandlerName = "BastardBelt";
		
		//used for the description when hovering over the items
		weaponDescription = "With attachment for OSHA certification";
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 2;
		
		reduceDefense = 0;
		
		clickerMultiplier = 2;
		
		weaponMultiplier = 4;
		
		//used for the sound that unlocks during the GameTimers class being ran.
		unlocked = false;
		
		unlockAmount = 800;
		
		rateOfIncrease = 3;
		
		totalCurrentAmount = 0;
		totalAmountPurchased = 0;
		
		weaponPrice = 800;
		weaponPriceIncrease = 800;

	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
	
}
