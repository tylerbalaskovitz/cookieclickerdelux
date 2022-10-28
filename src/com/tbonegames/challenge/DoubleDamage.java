package com.tbonegames.challenge;

import com.tbonegames.ClientMain;

public class DoubleDamage extends Challenges{

	public DoubleDamage() {
			challengeName = "Double Damage";
			
			challengeDescription = "Enemies have their base attack as well as weapon damage doubled.";
			
			completed = false;
	}
		public void combatChallenge(ClientMain cMain) {
			cMain.enemy.attack *= 2;
			cMain.enemy.attack1Damage *= 2;
			cMain.enemy.attack2Damage *= 2;
			cMain.enemy.attack3Damage *= 2;
			cMain.enemy.attack4Damage *= 2;
		}
		
		public void menuChallenge(ClientMain cMain) {
			
		}
	
}
