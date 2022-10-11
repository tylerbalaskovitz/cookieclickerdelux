package com.tbonegames.enemies;

public class DrDeflation extends Enemies{

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
		
		
		attack3 = "D for Damn it";
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
	
	
	
	public void special1() {
		
	}

	public void special2() {
		
	}
	
	public void special3() {
		
	}
	
	public void special4() {
		
	}
		
		
	
	
	
}
