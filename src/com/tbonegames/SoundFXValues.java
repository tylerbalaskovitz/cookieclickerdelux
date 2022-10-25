package com.tbonegames;

import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class SoundFXValues implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	public final URL death = getClass().getResource("/audio/deathsound.wav");
	public final URL purchase = getClass().getResource("/audio/purchase.wav");
	public final URL error = getClass().getResource("/audio/error.wav");
	public final URL backgroundmusic = getClass().getResource("/audio/backgroundmusic.wav");
	public final URL victorymusic = getClass().getResource("/audio/victorymusic.wav");
	public final URL titleClip = getClass().getResource("/audio/titleclip.wav");
	public final URL jackpot = getClass().getResource("/audio/jackpot.wav");
	public final URL slotWinner = getClass().getResource("/audio/slotwinner.wav");
	public final URL unlock = getClass().getResource("/audio/healsound.wav");
	public final URL battlevictory = getClass().getResource("/audio/battlevictory.wav");
	
	
	
}
