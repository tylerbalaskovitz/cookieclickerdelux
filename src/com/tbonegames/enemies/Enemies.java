package com.tbonegames.enemies;

import java.io.Serializable;
import java.net.URL;


public class Enemies implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;


	public String name;
	public int hp;
	public int attack;
	public int defense;
	public int dodge;
	public int disableDuration;
	
	public int attackDisableCounter;
	public int blockDisableCounter;
	public int itemDisableCounter;
	public int buffsDisableCounter;
	
	public String attack1;
	public String attack1Command;
	public int attack1Damage;
	public int attack1Chance;
	
	public String attack2;
	public String attack2Command;
	public int attack2Damage;
	public int attack2Chance;
	
	public String attack3;
	public String attack3Command;
	public int attack3Damage;
	public int attack3Chance;
	
	public String attack4;
	public String attack4Command;
	public int attack4Damage;
	public int attack4Chance;
	
	public URL talk1;
	public URL talk2;
	public URL talk3;
	public URL defeated;
	
	public URL imageID;
	
	public String specialMessage = "";
	
	public void special1() {
		
	}

	public void special2() {
		
	}
	
	public void special3() {
		
	}
	
	public void special4() {
		
	}
	
}

