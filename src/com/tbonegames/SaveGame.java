package com.tbonegames;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveGame implements Serializable{
	CookieMain cMain;
	int highScore;
	
	public SaveGame(CookieMain cMain) {
		cMain = this.cMain;
	}
	
	
	public void saveHighScore() {
		try {
			FileOutputStream fos = new FileOutputStream("HighScore.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			SaveGame sGame = new SaveGame(cMain);
			
			sGame.highScore = cMain.highScore;
			
			oos.writeObject(sGame);
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
}	
