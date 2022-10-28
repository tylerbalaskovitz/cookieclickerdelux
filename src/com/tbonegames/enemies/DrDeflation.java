package com.tbonegames.enemies;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class DrDeflation extends Enemies implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public DrDeflation() {
		
		name = "Dr. Deflation";
		hp = 12000;
		attack = 700;
		defense = 12;
		dodge = 10;
		disableDuration = 0;
		
		attackDisableCounter = 0;
		blockDisableCounter = 0;
		itemDisableCounter = 0;
		buffsDisableCounter = 0;
		
		//attacks the items in your inventory as well as the player
		attack1 = "Price Deflation";
		attack1Command = "Deflation";
		attack1Damage = 1000;
		attack1Chance = 0;
		
		//same as above but more damage
		attack2 = "50% Off";
		attack2Command = "Sale";
		attack1Damage = 2000;
		attack2Chance = 2;
		
		
		attack3 = "I is for Inflation";
		attack3Command = "DamnIt";
		attack1Damage = 4000;
		attack3Chance = 6;
		
		//massive percentile but with a low chance of success
		attack4 = "Black Friday";
		attack4Command = "BlackFriday";
		attack4Damage = 8000;
		attack4Chance = 8;
		specialMessage = "";
	}
	
	
	
	public void special1(ClientMain cMain) {
		for (int i = 0; i < 4; i++) {
		cMain.itemInventory.weapons[i].totalCurrentAmount /= 2;
		}
		specialMessage = "All your weapons have lost half their power!";
	}

	public void special2(ClientMain cMain) {
		
		specialMessage = "The 50% shopping spree has begun!";
	}
	
	public void special3(ClientMain cMain) {
		specialMessage = "The shop price of all the items have doubled!";
		for (int i = 0; i < 4; i++) {
			cMain.itemInventory.items[i].itemPrice *= 2;
			}
	}
	
	public void special4(ClientMain cMain) {
		specialMessage = "Black Friday has commenced! All logos are 90% OFF!";
		double temp = 0;
		temp = (double)cMain.logosCounter * .10;
		cMain.logosCounter = (int)temp;
	}
		
		
	
	
	
}
