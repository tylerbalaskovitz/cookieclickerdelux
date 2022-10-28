package com.tbonegames;

import java.io.Serializable;

import com.tbonegames.challenge.Blitzkrieg;
import com.tbonegames.challenge.BurnSwitchChallenge;
import com.tbonegames.challenge.Challenges;
import com.tbonegames.challenge.CheapBastard;
import com.tbonegames.challenge.DoubleDamage;
import com.tbonegames.challenge.DoubleTroubleHP;
import com.tbonegames.challenge.Inflation;
import com.tbonegames.challenge.LifeIsShort;
import com.tbonegames.challenge.Marathon;
import com.tbonegames.challenge.ShinAndSoda;
import com.tbonegames.challenge.StopWatchFree;

public class ChallengeMode implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	Challenges challenges[];
	Challenges currentChallenge;
	ClientMain cMain;
	public boolean noBurnSwitch;
	public boolean savesDisabled;
	
	public ChallengeMode(ClientMain cMain) {
		this.cMain = cMain;
	}
	
	public void createChallenges() {
		if (currentChallenge == null) {
			challenges = new Challenges[10];
			challenges[0] = new BurnSwitchChallenge();
			challenges[1] = new CheapBastard();
			challenges[2] = new LifeIsShort();
			challenges[3] = new StopWatchFree();
			challenges[4] = new DoubleTroubleHP();
			challenges[5] = new Inflation();
			challenges[6] = new DoubleDamage();
			challenges[7] = new Marathon();
			challenges[8] = new Blitzkrieg();
			challenges[9] = new ShinAndSoda();
					
			
		}
	}
	
	
}
