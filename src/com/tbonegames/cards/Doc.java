package com.tbonegames.cards;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class Doc extends Cards implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	
	public Doc() {
	cardName = "Doc";
	cardHandlerName = "";
	
	//used for the description when hovering over the items
	cardDescription = "Doc: \n [Price: " + cardPrice + "] \\n Each Doc produces 7 Logos per second";
	
	//this is used so there won't be duplicates when drafting in the future. ID 1, 2, 3, etc. Also, this is useful for counting the amount of items in stuff in game.
	idNumber = 3;
	
	clickerIncrease = 7;
	
	defenseBonus = 0;
	
	buffBonus = 0;
	
	itemBonus = 0;
	
	weaponBonus = 0;
	
	//used for the sound that unlocks during the GameTimers class being ran.
	unlocked = false;
	
	unlockAmount = 500;
	
	// intended to be used with % operator to increase after x amount of purchases and to be used with totalAmountPurchased
		
	totalCurrentAmount = 0;
	
	//total amount purchase is used when going through the combat loop. 
	totalAmountPurchased = 0;
	
	cardPrice = 500;
	cardPriceIncrease = 500;
	}
	
	public void shopSpecial(ClientMain cMain) {
		
	}
	
	public void combatSpecial(ClientMain cMain) {
		
	}
}
