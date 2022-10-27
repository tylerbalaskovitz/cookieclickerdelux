package com.tbonegames.weapons;

import com.tbonegames.ClientMain;

public class DeadWeapon extends Weapons{

	public DeadWeapon() {
		
		{
			weaponName = " ";
			weaponHandlerName = " ";
			
			//used for the description when hovering over the items
			weaponDescription =" ";
			
			//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
			idNumber = 4;
			
			reduceDefense = 0;
			
			clickerMultiplier = 0;
			
			weaponMultiplier = 0;
			
			//used for the sound that unlocks during the GameTimers class being ran.
			unlocked = false;
			
			unlockAmount = 2147483647;
			
			rateOfIncrease = 2147483647;
			
			totalCurrentAmount = 0;
			totalAmountPurchased = 0;
			
			weaponPrice = 2147483647;
			weaponPriceIncrease = 0;
			
			}
		
	}
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
}
