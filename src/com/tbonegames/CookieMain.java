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
import com.tbonegames.items.Armors;
import com.tbonegames.items.Buffs;
import com.tbonegames.items.Items;
import com.tbonegames.items.Weapons;

public class CookieMain {
	
	String rewardsMessage, combatAttackingItem, weaponPurhcase1,  weaponPurchase2, weaponPurchase3, weapon1Handler, weapon2Handler, weapon3Handler, itemPurhcase1, itemPurchase2, 
	itemPurchase3, item1Handler, item2Handler, item3Handler, armorPurchase1, armorPurchase2, armorPurchase3, armor1Handler, armor2Handler, armor3Handler;
	Random rand = new Random();
	JFrame window;
	JPanel itemPanel, cardPanel, slotPanel, shopPanel, shopUpperPanel, shopCookiePanel, messagePanel, counterPanel, cookiePanel, optionsPanel, navigationPanel, combatPanel, combatButtonPanel, 
	startButtonPanel, titleNamePanel, descriptionPanel, shopNavigationPanel, combatStatsPanel;
	JLabel counterLabel, shopCookieLabel, perSecLabel, shopLabel, titleNameLabel, descriptionLabel, dayLabel, combatDayLabel, inCombatHPLabel, inCombatDayLabel, inCombatActionsLabel;
	JButton startButton, button1, button2, button3, button4, button5, button6, button7, button8, button9, displayShop, shopButton1, shopButton2, shopButton3, shopButton4, shopButton5, 
	shopButton6, shopButton7, shopButton8, shopButton9, shopButton10, optionButton1, optionButton2, optionButton3,optionButton4, combatButton1, combatButton2, combatButton3,
	combatButton4, shopNavigationButton1, shopNavigationButton2, shopNavigationButton3, shopNavigationButton4;
	
	int  cookieCounter, timerSpeed, dayTimerSpeed, cursorNumber, cursorPrice, grandpaNumber, grandpaPrice, slotsPrice, cursorUpgradeAmount, cursorUpgradePrice, colaPrice, sausagePrice, rodPrice,
	beltPrice, maskPrice, armorPrice, grandmaPrice, grandmaNumber, elvesPrice, elvesNumber, luckyPrice, bastardPrice, feverPrice, colaValue, sausageValue, rodValue, beltValue,
	maskValue, armorValue, day, enemyAttackChoice, enemyDamage, bossDay, startingDamage, disableAttacksCounter, disableBlocksCounter, disableItemsCounter, enemiesDefeated, numberOfActions;
	
	double  perSecond, dayPerSecond;
	boolean timerOn, dayTimerOn, grandpaUnlocked, grandmaUnlocked, elvesUnlocked, luckyUnlocked, bastardUnlocked, feverUnlocked, slotsUnlocked, displayPanelSwitch, rodUnlocked, beltUnlocked,
	colaUnlocked, maskUnlocked, armorUnlocked, sausageUnlocked, antiGravityChamber, inCombat, attacksDisabled, blocksDisabled, itemsDisabled, displayItemsShop, displayWeaponsShop, 
	displayArmorShop, nutsUnlocked, juiceUnlocked, chipsUnlocked, shoulderPadsUnlocked, glovesUnlocked, vibratingShaftUnlocked, nitrogenBombUnlocked;
	
	Font font1, font2, font3;
	Slots slots = new Slots(this);
	URL url;
	StartingValues sValues = new StartingValues(this);
	UI ui = new UI(this);
	Combat combat = new Combat(this);
	GameTimers timers = new GameTimers(this);
	DayTimer dayTimers = new DayTimer(this);
	ShopHandler shopHandler = new ShopHandler(this);
	CombatHandler combatHandler = new CombatHandler(this, combat);
	Armors armors = new Armors();
	Buffs buffs = new Buffs();
	Items items = new Items();
	Weapons weapons = new Weapons();
	Enemies enemy = new Enemies();
	CookieHandler cookieHandler = new CookieHandler(this, ui, timers, dayTimers, slots);
	Timer timer, slotTimer, dayTimer;
	JTextArea messageText, shopMessageText, combatTextArea;
	MouseHandler mouseHandler = new MouseHandler(this);
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