package com.tbonegames;


import java.awt.Font;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class CookieMain {
	
	String rewardsMessage;
	Random rand = new Random();
	JFrame window;
	JPanel itemPanel, cardPanel, slotPanel, shopPanel, shopUpperPanel, messagePanel, counterPanel, cookiePanel, optionsPanel;
	JLabel counterLabel, perSecLabel, shopLabel;
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, displayShop, shopButton1, shopButton2, shopButton3, shopButton4, shopButton5, 
	shopButton6, shopButton7, shopButton8, shopButton9, shopButton10, optionButton1, optionButton2, optionButton3,optionButton4, combatButton1, combatButton2, combatButton3,
	combatButton4;
	
	int  cookieCounter, timerSpeed, cursorNumber, cursorPrice, grandpaNumber, grandpaPrice, slotsPrice, cursorUpgradeAmount, cursorUpgradePrice, colaPrice, sausagePrice, rodPrice,
	beltPrice, maskPrice, armorPrice, grandmaPrice, grandmaNumber, elvesPrice, elvesNumber, luckyPrice, bastardPrice, feverPrice, colaValue, sausageValue, rodValue, beltValue,
	maskValue, armorValue;
	
	double  perSecond;
	boolean timerOn, grandpaUnlocked, grandmaUnlocked, elvesUnlocked, luckyUnlocked, bastardUnlocked, feverUnlocked, slotsUnlocked, displayPanelSwitch, rodUnlocked, beltUnlocked,
	colaUnlocked, maskUnlocked, armorUnlocked, sausageUnlocked;
	Font font1, font2, font3;
	Slots slots = new Slots(this);
	StartingValues sValues = new StartingValues(this);
	UI ui = new UI(this);
	GameTimers timers = new GameTimers(this);
	CookieHandler cHandler = new CookieHandler(this, ui, timers, slots);
	Timer timer, slotTimer, dayTimer;
	JTextArea messageText, shopMessageText;
	MouseHandler mHandler = new MouseHandler(this);
	
	public static void main(String[] args) {
		new CookieMain();
	}
	
	public CookieMain() {
		
		
		
		sValues.startUpValues();
		
		ui.createFont();
		
		ui.createUI();
		
	}
}