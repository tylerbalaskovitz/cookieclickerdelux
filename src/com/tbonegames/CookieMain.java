package com.tbonegames;


import java.awt.Font;
import java.net.URL;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

import com.tbonegames.enemies.Enemies;

public class CookieMain {
	
	String rewardsMessage;
	Random rand = new Random();
	JFrame window;
	JPanel itemPanel, cardPanel, slotPanel, shopPanel, shopUpperPanel, shopCookiePanel, messagePanel, counterPanel, cookiePanel, optionsPanel, navigationPanel, combatPanel, combatButtonPanel, 
	startButtonPanel, titleNamePanel, descriptionPanel;
	JLabel counterLabel, shopCookieLabel, perSecLabel, shopLabel, titleNameLabel, descriptionLabel, dayLabel;
	JButton startButton, button1, button2, button3, button4, button5, button6, button7, button8, button9, displayShop, shopButton1, shopButton2, shopButton3, shopButton4, shopButton5, 
	shopButton6, shopButton7, shopButton8, shopButton9, shopButton10, optionButton1, optionButton2, optionButton3,optionButton4, combatButton1, combatButton2, combatButton3,
	combatButton4;
	
	int  cookieCounter, timerSpeed, dayTimerSpeed, cursorNumber, cursorPrice, grandpaNumber, grandpaPrice, slotsPrice, cursorUpgradeAmount, cursorUpgradePrice, colaPrice, sausagePrice, rodPrice,
	beltPrice, maskPrice, armorPrice, grandmaPrice, grandmaNumber, elvesPrice, elvesNumber, luckyPrice, bastardPrice, feverPrice, colaValue, sausageValue, rodValue, beltValue,
	maskValue, armorValue, day;
	
	double  perSecond, dayPerSecond;
	boolean timerOn, dayTimerOn, grandpaUnlocked, grandmaUnlocked, elvesUnlocked, luckyUnlocked, bastardUnlocked, feverUnlocked, slotsUnlocked, displayPanelSwitch, rodUnlocked, beltUnlocked,
	colaUnlocked, maskUnlocked, armorUnlocked, sausageUnlocked, antiGravityChamber;
	Font font1, font2, font3;
	Slots slots = new Slots(this);
	
	StartingValues sValues = new StartingValues(this);
	UI ui = new UI(this);
	Combat combat = new Combat(this);
	GameTimers timers = new GameTimers(this);
	DayTimer dayTimers = new DayTimer(this);
	CombatHandler combatHandler = new CombatHandler(this, combat);
	
	CookieHandler cHandler = new CookieHandler(this, ui, timers, dayTimers, slots);
	Timer timer, slotTimer, dayTimer;
	JTextArea messageText, shopMessageText, combatTextArea;
	MouseHandler mHandler = new MouseHandler(this);
	SoundFX soundFX = new SoundFX();
	
	public URL backgroundmusic = getClass().getClassLoader().getResource("audio//backgroundmusic.wav");
	public URL titleClip = getClass().getClassLoader().getResource("audio//titleclip.wav");
	
	public static void main(String[] args) {
		new CookieMain();
	}
	
	public CookieMain() {
		
		soundFX.playSoundEffect(titleClip);
		
		sValues.startUpValues();
		
		ui.createFont();
		
		ui.createUI(); ui.closeAllPanels(); ui.displayStartMenu();
		
	}
}