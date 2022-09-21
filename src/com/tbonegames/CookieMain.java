package com.tbonegames;


import java.awt.Font;
import java.net.URL;
import java.util.Random;

import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

import com.tbonegames.buffs.Buffs;
import com.tbonegames.enemies.Enemies;


public class CookieMain {
	String item1Name, item1HandlerName, item1Description;
	
	boolean item1Unlocked;
	
	String rewardsMessage, combatAttackingItem, weaponPurhcase1,  weaponPurchase2, weaponPurchase3, weapon1Handler, weapon2Handler, weapon3Handler, itemPurhcase1, itemPurchase2, 
	itemPurchase3, item1Handler, item2Handler, item3Handler, armorPurchase1, armorPurchase2, armorPurchase3, armor1Handler, armor2Handler, armor3Handler, defendingItemCombat,
	healingMultiplierHandler;
	Random rand = new Random();
	JFrame window;
	JPanel itemPanel, cardPanel, slotPanel, shopPanel, shopUpperPanel, shopCookiePanel, messagePanel, counterPanel, cookiePanel, optionsPanel, navigationPanel, combatPanel, combatButtonPanel, 
	startButtonPanel, titleNamePanel, descriptionPanel, shopNavigationPanel, combatStatsPanel, multiplierPanel;
	JLabel counterLabel, shopCookieLabel, perSecLabel, shopLabel, titleNameLabel, descriptionLabel, dayLabel, combatDayLabel, inCombatHPLabel, inCombatDayLabel, inCombatActionsLabel;
	JButton startButton, button1, button2, button3, button4, button5, button6, button7, button8, button9, displayShop, shopButton1, shopButton2, shopButton3, shopButton4, shopButton5, 
	shopButton6, shopButton7, shopButton8, shopButton9, shopButton10, optionButton1, optionButton2, optionButton3,optionButton4, combatButton1, combatButton2, combatButton3,
	combatButton4, shopNavigationButton1, shopNavigationButton2, shopNavigationButton3, shopNavigationButton4, multiplierButton1, multiplierButton2, multiplierButton3;
	
	int  logosCounter, rounds, timerSpeed, dayTimerSpeed, cursorNumber, cursorPrice, whiteyNumber, whiteyPrice, slotsPrice, cursorUpgradeAmount, cursorUpgradePrice, 
	lollipopPrice, lollipopNumber, docPrice, docNumber, luckyPrice, bastardPrice, feverPrice, day, enemyAttackChoice, enemyDamage, bossDay, startingDamage, disableAttacksCounter, disableBlocksCounter, disableItemsCounter, enemiesDefeated, 
	numberOfActions, counterUpgrade, healingMultiplier, selectedItemValue, blockValue, baseNumberOfActions, extraAttackRecoil, bastardlyAttackRecoil, playerDamage, playerRecoil, 
	playerAttackBonus, disableBuffsCounter, clickerBonus;
	
	double  perSecond, dayPerSecond;
	boolean timerOn, dayTimerOn, whiteyUnlocked, lollipopUnlocked, docUnlocked, luckyUnlocked, bastardUnlocked, feverUnlocked, slotsUnlocked, displayPanelSwitch, 
	inCombat, attacksDisabled, buffsDisabled, blocksDisabled, itemsDisabled, displayItemsShop, displayWeaponsShop, 
	displayArmorShop, displayBuffsShop, customCombat, combatDeath;
	
	
	
	Clip clip;
	Font font1, font2, font3, font3Bold;
	Slots slots = new Slots(this);
	URL url;
	Buffs buffs = new Buffs();
	StartingValues sValues = new StartingValues(this);
	UI ui = new UI(this);
	Combat combat = new Combat(this);
	UnlockTimer unlockTimer = new UnlockTimer(this);
	GameTimers timers = new GameTimers(this);
	DayTimer dayTimers = new DayTimer(this);
	ShopHandler shopHandler = new ShopHandler(this);
	CombatHandler combatHandler = new CombatHandler(this, combat);
	Enemies enemy = new Enemies();
	ClickerHandler clickerHandler = new ClickerHandler(this, ui, timers, dayTimers, slots);
	Timer timer, unlockTimers, dayTimer;
	JTextArea messageText, shopMessageText, combatTextArea;
	MouseHandler mouseHandler = new MouseHandler(this);
	ItemInventory itemInventory = new ItemInventory(this);
	SoundFXValues soundFXValues = new SoundFXValues();
	SoundFX soundFX = new SoundFX(this);
	SoundFX bgMusicPlayer = new SoundFX(this);
	
	public static void main(String[] args) {
		
		
		new CookieMain();
	}
	
	public CookieMain() {
		
		itemInventory.inventoryOfItems();
		
		sValues.startUpValues();
		
		soundFX.playSoundEffect(soundFXValues.titleClip);
		
		ui.createFont();
		ui.createUI(); 
		ui.closeAllPanels(); 
		ui.displayStartMenu();
		
		
		
	}
	
	
}