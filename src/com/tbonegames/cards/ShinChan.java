package com.tbonegames.cards;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class ShinChan extends Cards implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public ShinChan() {
		
		cardName = "Shin-Chan";
		
		cardPrice = 10;
		
		clickerIncrease = .1;
		
		//used for the description when hovering over the items
		cardDescription = "Shin-Chan: \n [Price: " + cardPrice + "] \n AutoClicks " + clickerIncrease +" times every second." ;
		
		//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
		idNumber = 2;
		
		
		
		defenseBonus = 0;
		
		buffBonus = 0;
		
		itemBonus = 0;
		
		weaponBonus = 0;
		
		//used for the sound that unlocks during the GameTimers class being ran.
		unlocked = false;
		
		unlockAmount = 0;
		
		// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
			
		totalCurrentAmount = 0;
		
		//total amount purchase is used when going through the combat loop. 
		totalAmountPurchased = 0;
		
		
		cardPriceIncrease = 5;
		
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
	
}
