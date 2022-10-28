package com.tbonegames.challenge;

import com.tbonegames.ClientMain;

public class DoubleTroubleHP extends Challenges{

	private static final long serialVersionUID = 1527841505199077948L;

	DoubleTroubleHP(){
			challengeName = "Double Trouble";
			
			challengeDescription = "All enemies have their HP doubled for every boss fight.";
			
			completed = false;
	}
		
		public void combatChallenge(ClientMain cMain) {
			cMain.enemy.hp *= 2;
		}
		
		public void menuChallenge(ClientMain cMain) {
			
		}
	}
	

