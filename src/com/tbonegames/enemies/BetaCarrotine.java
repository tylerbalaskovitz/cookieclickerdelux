package com.tbonegames.enemies;

import java.io.Serializable;

public class BetaCarrotine extends Enemies  implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public BetaCarrotine() {
	name = "Beta Carrotine";
	hp = 3500;
	attack = 300;
	defense = 10;
	dodge = 10;
	disableDuration = 0;
	
	attackDisableCounter = 0;
	blockDisableCounter = 0;
	itemDisableCounter = 0;
	buffsDisableCounter = 0;
	
	attack1 = "24 Carrot Golden Shower";
	attack1Command = "CarrotShower";
	attack1Damage = 1200;
	attack1Chance = 0;
	
	attack2 = "Carrot and Mushshroom Slap Surpirse";
	attack2Command = "BirdShit";
	attack2Damage = 1500;
	attack2Chance = 2;
	
	attack3 = "Carrot Hole Stuff";
	attack3Command = "Carrot Hole";
	attack3Damage = 2000;
	attack3Chance = 4;
	
	attack4 = "Do You Carrot All";
	attack4Command = "DoYouCarrot";
	attack4Damage = 1000;
	attack4Chance = 6;
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
