package com.tbonegames.challenge;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class BurnSwitchChallenge extends Challenges implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public BurnSwitchChallenge() {
		challengeName = "The Burn Switch";
		
		challengeDescription = "In this challenge, the burns buttons and switch buttons have been disabled. Thus cutting your inventory of items, and ability to prepare for comabat in half";
	
		completed = false;
	}
	
	public void combatChallenge(ClientMain cMain) {
		
	}
	
	public void menuChallenge(ClientMain cMain) {
		cMain.challengeMode.noBurnSwitch = true;
	}
	
	
}
