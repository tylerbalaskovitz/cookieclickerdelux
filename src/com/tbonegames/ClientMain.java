package com.tbonegames;


import java.awt.Font;
import java.io.Serializable;
import java.net.URL;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;

import com.tbonegames.enemies.Enemies;


public class ClientMain implements Serializable{
	
	final static long serialVersionUID = -1404202925519361557L;
	
	String rewardsMessage, combatAttackingItem, weaponPurhcase1,  weaponPurchase2, weaponPurchase3, weapon1Handler, weapon2Handler, weapon3Handler, itemPurhcase1, itemPurchase2, 
	itemPurchase3, item1Handler, item2Handler, item3Handler, armorPurchase1, armorPurchase2, armorPurchase3, armor1Handler, armor2Handler, armor3Handler, defendingItemCombat,
	healingMultiplierHandler, saveGameHeader, saveGameMode;
	
	Random rand = new Random();
	JFrame window;
	JPanel itemPanel, cardPanel, slotPanel, shopPanel, shopUpperPanel, shopCookiePanel, messagePanel, counterPanel, cookiePanel, optionsPanel, navigationPanel, combatPanel, combatButtonPanel, 
	startButtonPanel, titleNamePanel, descriptionPanel, shopNavigationPanel, combatStatsPanel, multiplierPanel, cardModPanel, saveSpotPanel, challengeModePanel;
	JLabel counterLabel, shopCookieLabel, perSecLabel, shopLabel, titleNameLabel, descriptionLabel, dayLabel, combatDayLabel, inCombatHPLabel, inCombatDayLabel, inCombatActionsLabel;
	JButton startButton0, startButton1, startButton2, startButton3, startButton4, button1, button2, button3, button4, button5, button6, button7, button8, button9, displayShop, shopButton0, 
	shopButton1, shopButton2, shopButton3, shopButton4, shopButton5, shopButton6, shopButton7, shopButton8, shopButton9, optionButton1, optionButton2, optionButton3,optionButton4, 
	combatButton1, combatButton2, combatButton3, combatButton4, shopNavigationButton1, shopNavigationButton2, shopNavigationButton3, shopNavigationButton4, multiplierButton1, 
	multiplierButton2, multiplierButton3, cardModButton0, cardModButton1, saveSpotButton0, saveSpotButton1, saveSpotButton2, saveSpotButton3;
	
	JButton challengeModeButtons[] = new JButton[11];
	JScrollPane challengeModeScrollPane;
	
	int saveHeaderArray[] = new int[3];
	public int  logosCounter, rounds, timerSpeed, dayTimerSpeed, slotsPrice, saveLoadInt, challengeModeInt,
	luckyPrice, bastardPrice, feverPrice, day, enemyAttackChoice, enemyDamage, bossDay, startingDamage, disableAttacksCounter, disableBlocksCounter, disableItemsCounter, enemiesDefeated, 
	numberOfActions, counterUpgrade, healingMultiplier, selectedItemValue, blockValue, baseNumberOfActions, extraAttackRecoil, bastardlyAttackRecoil, playerDamage, playerRecoil, 
	playerAttackBonus, disableBuffsCounter, clickerBonus, blockValueBonus, dayLimiter, highestLogo, score, highScore;
	
	public double  perSecond, dayPerSecond;
	boolean timerOn, dayTimerOn,luckyUnlocked, bastardUnlocked, feverUnlocked, slotsUnlocked, displayPanelSwitch, switcherEnabled, burnCardEnabled,
	inCombat, attacksDisabled, buffsDisabled, blocksDisabled, itemsDisabled, displayItemsShop, displayWeaponsShop, 
	displayArmorShop, displayBuffsShop, customCombat, combatDeath;
	
	
	public ChallengeMode challengeMode = new ChallengeMode(this);
	Font font1, font2, font3, font3Bold, font4;
	Slots slots = new Slots(this);
	URL url;
	StartingValues sValues = new StartingValues(this);
	UI ui = new UI(this);
	Combat combat = new Combat(this);
	UnlockTimer unlockTimer = new UnlockTimer(this);
	GameTimers timers = new GameTimers(this);
	DayTimer dayTimers = new DayTimer(this);
	ShopHandler shopHandler = new ShopHandler(this);
	CombatHandler combatHandler = new CombatHandler(this, combat);
	public Enemies enemy = new Enemies();
	ClickerHandler clickerHandler = new ClickerHandler(this, ui, timers, dayTimers, slots);
	Timer timer, unlockTimers, dayTimer;
	JTextArea messageText, shopMessageText, combatTextArea;
	MouseHandler mouseHandler = new MouseHandler(this);
	public ItemInventory itemInventory = new ItemInventory();
	SoundFXValues soundFXValues = new SoundFXValues();
	SoundFX soundFX = new SoundFX();
	BackgroundMusic backgroundMusic = new BackgroundMusic();
	SaveGame saveGame = new SaveGame(this);
	
	public static void main(String[] args) {
		
		new ClientMain();
	}
	
	public ClientMain() {

		
		itemInventory.inventoryOfItems();
		ui.createFont();
		ui.createUI(); 
		
		ui.closeAllPanels(); 
		ui.displayStartMenu();
		saveGame.loadHighScore();
		for (int i = 0; i < 3; i++) {
			saveGame.loadFileHeader(i);
			}
		backgroundMusic.setFile(soundFXValues.backgroundmusic);
		
		soundFX.playSoundEffect(soundFXValues.titleClip);
		sValues.startUpValues();
		
	}

	

	
	
}