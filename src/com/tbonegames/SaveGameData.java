package com.tbonegames;

import java.io.Serializable;

public class SaveGameData implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	CookieMain cMain;
	int highScore;
	
	public SaveGameData(CookieMain cMain) {
		this.cMain = cMain;
	}
	
	public SaveGameData() {	

}
}
