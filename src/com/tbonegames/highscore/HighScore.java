package com.tbonegames.highscore;


public class HighScore {

	public int highScoreMarker;
	
	public String tableName;
	
	public String playerName;
	
	public int highScore;
	
	HighScore highScoreTable[] = new HighScore[5];
	
	public String displayHighScoreTable() {

		return highScoreTable.toString();
	}
	
	
	public void addHighScore(String nameEntry, int newHighScore) {
		for (int i = 1; i < 5; i++) {
			if (newHighScore > highScoreTable[0].highScore) {
				highScoreMarker = 0;
				for (int j = 3; j >= 0; j--) {
					highScoreTable[j+1].highScore = highScoreTable[j].highScore;
					highScoreTable[j+1].playerName = highScoreTable[j+1].playerName;
				}
				highScoreTable[0].playerName = nameEntry;
				highScoreTable[0].highScore = newHighScore;
				break;
				
			} else if (newHighScore > highScoreTable[i].highScore && newHighScore < highScoreTable[i-1].highScore) {
				
				for (int heldValue = i; 1+heldValue <5; heldValue++) {
					
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
