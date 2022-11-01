package com.tbonegames.challenge;

import java.io.Serializable;

import com.tbonegames.ClientMain;
import com.tbonegames.highscore.HighScore;

public class Challenges implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	public String challengeName;
	
	public String challengeDescription;
	
	boolean completed;
	
	//Each challenges high score data
	
	public int highScoreMarker;
	
	public String tableName;
	
	public String playerName;
	
	public int highScore;
	
	HighScore highScoreTable[] = new HighScore[5];
	
	public void combatChallenge(ClientMain cMain) {
		
	}
	
	public void menuChallenge(ClientMain cMain) {
		
	}
	
	
	public String displayHighScoreTable() {

		return highScoreTable.toString();
	}
	
	
	public void addHighScore(String nameEntry, int newHighScore) {
		for (int i = 1; i < 5; i++) {
			if (newHighScore > highScoreTable[0].highScore) {
				highScoreMarker = 0;
				for (int j = 3; j >= 0; j--) {
					highScoreTable[j+1].highScore = highScoreTable[j].highScore;
					highScoreTable[j+1].playerName = highScoreTable[j].playerName;
				}
				highScoreTable[0].playerName = nameEntry;
				highScoreTable[0].highScore = newHighScore;
				break;
				
			} else if ( highScoreTable[i-1].highScore > newHighScore && newHighScore > highScoreTable[i].highScore ) {
				int heldValue = 5 - i;
				
				for (int k = 4; k > heldValue; k--) {
					highScoreTable[k+1].highScore = highScoreTable[k].highScore;
					highScoreTable[k+1].playerName = highScoreTable[k].playerName;
				}
				
				highScoreTable[i].highScore = newHighScore;
				highScoreTable[i].playerName = nameEntry;
			}
		}
	}
	
	public void generateHighScore() {
		for (int i = 0; i < 5; i++) {
		
			highScoreTable[i].playerName = "John Doe"; 
			highScoreTable[i].highScore = 10000*i;
		}
	}

}
