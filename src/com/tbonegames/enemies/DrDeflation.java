package com.tbonegames.enemies;

public class DrDeflation extends Enemies{

	public DrDeflation() {
		
		name = "Dr. Deflation";
		hp = 6000;
		attack = 700;
		defense = 50;
		dodge = 10;
		disableDuration = 0;
		
		//attacks the items in your inventory as well as the player
		attack1 = "Price Deflation";
		attack1Command = "Deflation";
		attack1Damage = 0;
		attack1Chance = 0;
		
		//same as above but more damage
		attack2 = "50% Off";
		attack2Command = "Sale";
		attack2Damage = 0;
		attack2Chance = 2;
		
		
		attack3 = "D for Damn it";
		attack3Command = "DamnIt";
		attack3Damage = 0;
		attack3Chance = 6;
		
		//massive percentile but with a low chance of success
		attack4 = "Black Friday";
		attack4Command = "BlackFriday";
		attack4Damage = 0;
		attack4Chance = 8;
	}
		
		
	
	
	
}
