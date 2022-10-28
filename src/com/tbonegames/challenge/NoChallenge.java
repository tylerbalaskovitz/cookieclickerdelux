package com.tbonegames.challenge;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class NoChallenge extends Challenges implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public NoChallenge() {
			challengeName = "No Challenge";
			
			challengeDescription = "";
			
			completed = false;
	}
		
		public void combatChallenge(ClientMain cMain) {
		}
		
		public void menuChallenge(ClientMain cMain) {
			
		}
	}
	
