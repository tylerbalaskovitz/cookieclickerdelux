package com.tbonegames.challenge;

import java.io.Serializable;

import com.tbonegames.ClientMain;
import com.tbonegames.buffs.DeadBuff;

public class StopWatchFree extends Challenges  implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public StopWatchFree() {
		challengeName = "Stop free Stopwatch";
		
		challengeDescription = "Your Stopwatch is completely gone and in its space is a dead spot. Good luck";
		
		completed = false;
}
	
	public void combatChallenge(ClientMain cMain) {
	}
	
	public void menuChallenge(ClientMain cMain) {
		cMain.itemInventory.buffs[0] = new DeadBuff();
	}
		
	
	
}
