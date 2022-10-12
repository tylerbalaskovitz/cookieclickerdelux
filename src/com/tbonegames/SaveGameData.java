package com.tbonegames;

import java.awt.Font;
import java.io.Serializable;
import java.net.URL;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

import com.tbonegames.enemies.Enemies;

public class SaveGameData implements Serializable {
	final static long serialVersionUID = -1404202925519361557L;
	CookieMain cMain;
	int highScore;
	
	public SaveGameData() {	

}

	public SaveGameData(CookieMain cookieMain) {
		// TODO Auto-generated constructor stub
	}
}
