package com.tbonegames.challenge;

import java.io.Serializable;

import com.tbonegames.ClientMain;

public class Blitzkrieg extends Challenges implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public Blitzkrieg() {
	challengeName = "Blitzkrieg";
	
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
