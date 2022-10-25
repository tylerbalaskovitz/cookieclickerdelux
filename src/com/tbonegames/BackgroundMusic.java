package com.tbonegames;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class BackgroundMusic {
	private Clip clip;
	ClientMain cMain;
	
	
	public BackgroundMusic() {
		
	}
	

	public void playSoundEffect(URL name) {
		setFile(name);
		play(name);
	}
	
	public void setFile(URL name) {
		try {
			AudioInputStream sound = AudioSystem.getAudioInputStream(name);
			clip = AudioSystem.getClip();
			clip.open(sound);
			sound.close();
		} catch (Exception e) {
			
		}
	}
	
	public void playMusic(URL name) {
		setFile(name);
		play(name);
		loop(name);
		
	}
	
	public void play(URL name) {
		clip.setFramePosition(0);
		clip.start();
	}
	
	public void loop(URL name) {
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public void stop(URL name) {
		clip.stop();
	}
	
}
