package com.tbonegames.challenge;

import com.tbonegames.ClientMain;

public class Blitzkrieg extends Challenges{

	public Blitzkrieg() {
	challengeName = "No Challenge";
	
	challengeDescription = "";
	
	completed = false;
}

public void combatChallenge(ClientMain cMain) {
	cMain.enemy.hp *= 2;
	cMain.enemy.attack *= 2;
	cMain.enemy.attack1Damage *= 2;
	cMain.enemy.attack2Damage *= 2;
	cMain.enemy.attack3Damage *= 2;
	cMain.enemy.attack4Damage *= 2;
}

public void menuChallenge(ClientMain cMain) {
	cMain.dayPerSecond = .13;
}
	
}
