package com.tbonegames.challenge;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class Marathon extends Challenges  implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public Marathon(){
		challengeName = "Saves Disabled";
		
		challengeDescription = "You have one shot to make it from beginning to end without dying. No saves.";
		
		completed = false;
	}
	
	public void combatChallenge(ClientMain cMain) {
	}
	
	public void menuChallenge(ClientMain cMain) {
	cMain.challengeMode.savesDisabled = true;
	}
	
}
