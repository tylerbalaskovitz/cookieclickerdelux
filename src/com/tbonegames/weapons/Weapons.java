package com.tbonegames.weapons;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class Weapons implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	//used for the name and the handler of the game. 
	public String weaponName;
	public String weaponHandlerName;
	
	//used for the description when hovering over the items
	public String weaponDescription;
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	public int idNumber;
	
	public int clickerMultiplier;
	
	public int reduceDefense;
	
	public int weaponMultiplier;
	
	//used for the sound that unlocks during the GameTimers class being ran.
	public boolean unlocked;
	
	public int unlockAmount;
	
	// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
	public int rateOfIncrease;
		
	public int totalCurrentAmount;
	
	//total amount purchase is used when going through the combat loop. 
	public int totalAmountPurchased;
	
	public int weaponPrice;
	public int weaponPriceIncrease;
	
	public void raisePrice() {
		if (totalAmountPurchased % rateOfIncrease == 0) {
			weaponPrice += weaponPriceIncrease;
			if (reduceDefense > 0 ) {
				reduceDefense++;
			}
		}
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
	
	
	
}
