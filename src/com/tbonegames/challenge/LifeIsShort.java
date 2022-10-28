package com.tbonegames.challenge;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class LifeIsShort extends Challenges implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	public LifeIsShort() {
	challengeName = "Life is Short";
	
	challengeDescription = "The day timer is sped up, making the days to gather resources shorter";
	
	completed = false;
	
	}
	public void combatChallenge(ClientMain cMain) {
		
	}
	
	public void menuChallenge(ClientMain cMain) {
		cMain.dayPerSecond = .11;
	}
}
