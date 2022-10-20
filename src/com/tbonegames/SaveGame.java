package com.tbonegames;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveGame implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	ClientMain cMain;
	int highScore;
	
	public SaveGame(ClientMain cMain) {
		this.cMain = cMain;
	}
	
	public SaveGame() {

	}
	

	

	public void loadHighScore() {
	
		try {
			
			FileInputStream fis = new FileInputStream("HighScore.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
		
			SaveGameData sGameData = (SaveGameData)ois.readObject();
	
			cMain.highScore = sGameData.highScore;
	
			ois.close();
	
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
	}
	
	
	
	}

	public void saveHighScore() {
	
	try {
		FileOutputStream fos = new FileOutputStream("HighScore.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		SaveGameData sGameData = new SaveGameData();
		sGameData.highScore = cMain.highScore;
		
		oos.writeObject(sGameData);
		oos.close();
		
	} catch (IOException ex ) {
		ex.printStackTrace();
	}
	
	}

	public void saveGame() {

		try {
			FileOutputStream fos = new FileOutputStream("SaveGame.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
	
			
			
	
			oos.writeObject(this.cMain);
			oos.close();
	
		} catch (IOException ex ) {
			ex.printStackTrace();	
		}

	}
	


	public void loadGame() {
	
		try {
			FileInputStream fis = new FileInputStream("SaveGame.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			
			this.cMain = (ClientMain) ois.readObject(); 
			
			ois.close();
	
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}

	
}	
