package com.tbonegames.levels;

import java.io.Serializable;

import com.tbonegames.enemies.Enemies;

public class Levels implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public String levelName;
	
	public String levelDescription;
	
	public Enemies level[];
	
	public int combatDayArray[];
	
	public void createLevel() {

		
	}
	
	public void createBossDay() {
		
	}
}
