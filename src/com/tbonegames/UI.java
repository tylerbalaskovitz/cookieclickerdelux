package com.tbonegames;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UI { 

	ClientMain cMain;
	
	public UI(ClientMain cMain) {
		this.cMain=cMain;
		
	}
	
	
public void createUI() {
		
	cMain.window = new JFrame();
	cMain.window.setTitle("Action Bastard's Lucky Bastard Fever");
	cMain.window.setSize(800, 600);
	cMain.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	cMain.window.getContentPane().setBackground(Color.black);
	cMain.window.setLayout(null);
	

	
	cMain.titleNamePanel = new JPanel();
	panelConfiguration(cMain.titleNamePanel, 100, 50, 600, 150, Color.black, 1, 1, cMain.window);

	
	cMain.titleNameLabel = new JLabel();
	labelConfiguration(cMain.titleNameLabel, "Action Bastard's Lucky Bastard Fever", cMain.font1, Color.white,cMain.titleNamePanel);
	
	cMain.descriptionPanel = new JPanel();
	panelConfiguration(cMain.descriptionPanel, 235, 500, 600, 50, Color.black, 1, 1, cMain.window);
	
	
	cMain.descriptionLabel = new JLabel("Created by T-bone Games ©2022");
	labelConfiguration(cMain.descriptionLabel, "Created by T-bone Games ©2022", cMain.font3, Color.white,cMain.descriptionPanel);
	
	
	cMain.startButtonPanel = new JPanel();
	panelConfiguration(cMain.startButtonPanel, 330, 380, 140, 100, Color.black, 2, 1, cMain.window);
	
	cMain.startButton = new JButton("Start");
	buttonGenerator(cMain.startButton, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "PreStart", cMain.mouseHandler, cMain.startButtonPanel);
	
	cMain.startButton = new JButton("Continue");
	buttonGenerator(cMain.startButton, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "PreLoad", cMain.mouseHandler, cMain.startButtonPanel);
	
	cMain.saveSpotPanel = new JPanel();
	panelConfiguration(cMain.saveSpotPanel, 275, 240, 250, 250, Color.black, 4,1, cMain.window);
	
	cMain.saveSpotButton0 = new JButton("New Save 1");
	buttonGenerator(cMain.saveSpotButton0, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "Start", cMain.mouseHandler, cMain.saveSpotPanel);
	
	cMain.saveSpotButton1 = new JButton("New Save 2");
	buttonGenerator(cMain.saveSpotButton1, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "Start", cMain.mouseHandler, cMain.saveSpotPanel);
	
	cMain.saveSpotButton2 = new JButton("New Save 3");
	buttonGenerator(cMain.saveSpotButton2, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "Start", cMain.mouseHandler, cMain.saveSpotPanel);
	
	cMain.saveSpotButton3 = new JButton("Return");
	buttonGenerator(cMain.saveSpotButton3, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "StartMenu", cMain.mouseHandler, cMain.saveSpotPanel);
	
	//Things relating to Combat
	cMain.combatStatsPanel = new JPanel();
	panelConfiguration(cMain.combatStatsPanel, 100, 50, 600, 50, Color.black, 1, 3, cMain.window);
	
	cMain.inCombatHPLabel = new JLabel();
	labelConfiguration(cMain.inCombatHPLabel, "HP: " + cMain.logosCounter, cMain.font3, Color.white,cMain.combatStatsPanel);
	
	cMain.inCombatDayLabel = new JLabel();
	labelConfiguration(cMain.inCombatDayLabel, "Day: " + cMain.day, cMain.font3, Color.white,cMain.combatStatsPanel);
	
	cMain.inCombatActionsLabel = new JLabel();
	labelConfiguration(cMain.inCombatActionsLabel, "Actions: " + cMain.numberOfActions, cMain.font3, Color.white,cMain.combatStatsPanel); 
	
	cMain.combatPanel = new JPanel();
	panelConfiguration(cMain.combatPanel, 100, 100, 600, 250, Color.black, 1, 1, cMain.window);
	cMain.combatTextArea = new JTextArea("");
	textAreaConfiguration(cMain.combatTextArea, Color.black, Color.white, cMain.font3, true, true, false, true, cMain.combatPanel);
	
	cMain.multiplierPanel = new JPanel();
	panelConfiguration(cMain.multiplierPanel, 100, 500, 600, 60, Color.black, 1, 3, cMain.window);
	
	cMain.multiplierButton1 = new JButton("Normal");
	buttonGenerator(cMain.multiplierButton1, cMain.font3, Color.green, Color.black, false, cMain.combatHandler, "Normal", cMain.mouseHandler, cMain.multiplierPanel);
	
	cMain.multiplierButton2 = new JButton("Extra");
	buttonGenerator(cMain.multiplierButton2, cMain.font3, Color.yellow, Color.black, false, cMain.combatHandler, "Extra", cMain.mouseHandler, cMain.multiplierPanel);
	
	cMain.multiplierButton3 = new JButton("Bastardly");
	buttonGenerator(cMain.multiplierButton3, cMain.font3, Color.red, Color.black, false, cMain.combatHandler, "Bastardly", cMain.mouseHandler, cMain.multiplierPanel);
	
	
	cMain.combatButtonPanel = new JPanel();
	panelConfiguration(cMain.combatButtonPanel, 100, 350, 600, 150, Color.black, 2, 2, cMain.window);
	
	cMain.combatButton1 = new JButton("Attack");
	buttonGenerator(cMain.combatButton1, cMain.font3, Color.black, Color.white, false, cMain.combatHandler, "Attack", cMain.mouseHandler, cMain.combatButtonPanel);
	
	cMain.combatButton2 = new JButton("Defend");
	buttonGenerator(cMain.combatButton2, cMain.font3, Color.black, Color.white, false, cMain.combatHandler, "Defend", cMain.mouseHandler, cMain.combatButtonPanel);

	cMain.combatButton3 = new JButton("Item");
	buttonGenerator(cMain.combatButton3, cMain.font3, Color.black, Color.white, false, cMain.combatHandler, "Item", cMain.mouseHandler, cMain.combatButtonPanel);
	
	cMain.combatButton4 = new JButton("");
	buttonGenerator(cMain.combatButton4, cMain.font3, Color.black, Color.white, false, cMain.combatHandler, "", cMain.mouseHandler, cMain.combatButtonPanel);

	
	//Navigation Panel and Buttons

	
	
	cMain.navigationPanel = new JPanel();
	panelConfiguration(cMain.navigationPanel, 10, 500, 250, 50, Color.black, 1, 5, cMain.window);
	
	ImageIcon shop = new ImageIcon(getClass().getClassLoader().getResource("shop.png"));
	cMain.displayShop = new JButton();
	iconButtonGenerator(shop, cMain.displayShop, Color.black, Color.white, false, cMain.clickerHandler, "Shop", cMain.mouseHandler, cMain.navigationPanel);
	
	ImageIcon cog = new ImageIcon(getClass().getClassLoader().getResource("cog.png"));
	cMain.button9 = new JButton();
	iconButtonGenerator(cog, cMain.button9, Color.black, Color.white, false, cMain.clickerHandler, "Display", cMain.mouseHandler, cMain.navigationPanel);
	
	ImageIcon save = new ImageIcon(getClass().getClassLoader().getResource("save.png"));
	cMain.button9 = new JButton();
	iconButtonGenerator(save, cMain.button9, Color.black, Color.white, false, cMain.clickerHandler, "SaveGame", cMain.mouseHandler, cMain.navigationPanel);
		
	//Buttons for the inGameSHop
	
	cMain.cardModPanel = new JPanel();
	panelConfiguration(cMain.cardModPanel, 5, 250, 100, 200, Color.yellow, 2, 1, cMain.window);
	
	cMain.cardModButton0 = new JButton("Switcher");
	buttonGenerator(cMain.cardModButton0, cMain.font2, Color.black, Color.white, false, cMain.shopHandler, "Switcher", cMain.mouseHandler, cMain.cardModPanel);
	
	cMain.cardModButton1 = new JButton("Burn");
	buttonGenerator(cMain.cardModButton1, cMain.font2, Color.black, Color.white, false, cMain.shopHandler, "BurnCard", cMain.mouseHandler, cMain.cardModPanel);
	
		cMain.shopNavigationPanel = new JPanel();
		panelConfiguration(cMain.shopNavigationPanel, 150, 350, 500, 140, Color.yellow, 2, 2, cMain.window);
	
		cMain.shopNavigationButton1 = new JButton("Weapons");
		buttonGenerator(cMain.shopNavigationButton1, cMain.font3, Color.black, Color.white, false, cMain.shopHandler, "Weapons", cMain.mouseHandler, cMain.shopNavigationPanel);
		
		cMain.shopNavigationButton2 = new JButton("Armor");
		buttonGenerator(cMain.shopNavigationButton2, cMain.font3, Color.black, Color.white, false, cMain.shopHandler, "Armor", cMain.mouseHandler, cMain.shopNavigationPanel);

		cMain.shopNavigationButton3 = new JButton("Items");
		buttonGenerator(cMain.shopNavigationButton3, cMain.font3, Color.black, Color.white, false, cMain.shopHandler, "Items", cMain.mouseHandler, cMain.shopNavigationPanel);
		
		cMain.shopNavigationButton4 = new JButton("Buffs");
		buttonGenerator(cMain.shopNavigationButton4, cMain.font3, Color.black, Color.white, false, cMain.shopHandler, "Buffs", cMain.mouseHandler, cMain.shopNavigationPanel);
		
		cMain.shopCookiePanel = new JPanel();
		panelConfiguration(cMain.shopCookiePanel, 135, 12, 500, 30, Color.black, 1, 1, cMain.window);
		cMain.shopCookieLabel = new JLabel();
		labelConfiguration(cMain.shopCookieLabel, "", cMain.font1, Color.white,cMain.shopCookiePanel);
		cMain.shopUpperPanel = new JPanel();
		panelConfiguration(cMain.shopUpperPanel, 135, 50, 500, 200, Color.black, 1, 1, cMain.window);
		cMain.shopMessageText = new JTextArea();
		textAreaConfiguration(cMain.shopMessageText, Color.black, Color.white, cMain.font3, true, true, false, true, cMain.shopUpperPanel);
		cMain.shopPanel = new JPanel();
		panelConfiguration(cMain.shopPanel, 135, 275, 500, 200, Color.black, 2, 3, cMain.window);
		
		cMain.shopButton0 = new JButton("?");
		buttonGenerator(cMain.shopButton0, cMain.font3, Color.black, Color.white, false, cMain.shopHandler, "", cMain.mouseHandler, cMain.shopPanel);
		
		cMain.shopButton1 = new JButton("?");
		buttonGenerator(cMain.shopButton1, cMain.font3, Color.black, Color.white, false, cMain.shopHandler, "", cMain.mouseHandler, cMain.shopPanel);

		cMain.shopButton2 = new JButton("?");
		buttonGenerator(cMain.shopButton2, cMain.font3, Color.black, Color.white, false, cMain.shopHandler, "", cMain.mouseHandler, cMain.shopPanel);

		cMain.shopButton3 = new JButton("?");
		buttonGenerator(cMain.shopButton3, cMain.font3, Color.black, Color.white, false, cMain.shopHandler, "", cMain.mouseHandler, cMain.shopPanel);
		
		cMain.shopButton4 = new JButton("?");
		buttonGenerator(cMain.shopButton4, cMain.font3, Color.black, Color.white, false, cMain.shopHandler, "", cMain.mouseHandler, cMain.shopPanel);
		
		cMain.shopButton5 = new JButton("Return");
		buttonGenerator(cMain.shopButton5, cMain.font3, Color.black, Color.white, false, cMain.shopHandler, "Return", cMain.mouseHandler, cMain.shopPanel);
		
		//Code for the main button to click
		cMain.cookiePanel = new JPanel();
		panelConfiguration(cMain.cookiePanel, 100, 220, 200, 200, Color.black, 1,1, cMain.window);	
		ImageIcon logos = new ImageIcon(getClass().getClassLoader().getResource("logos.png"));
		JButton logosButton = new JButton();
		iconButtonGenerator(logos, logosButton, Color.black, Color.white, false, cMain.clickerHandler, "Logos", cMain.mouseHandler, cMain.cookiePanel);
	
		//Panel for the main stats of the game to be tracked
		cMain.counterPanel = new JPanel();
		panelConfiguration(cMain.counterPanel, 100, 75, 250, 125, Color.black, 4,1, cMain.window);
		cMain.counterLabel = new JLabel("Logos");
		labelConfiguration(cMain.counterLabel, cMain.logosCounter + " Logos", cMain.font1, Color.white,cMain.counterPanel);
		cMain.perSecLabel = new JLabel();
		labelConfiguration(cMain.perSecLabel, "Per Second: 0.0", cMain.font2, Color.white,cMain.counterPanel);
		cMain.combatDayLabel = new JLabel();
		labelConfiguration(cMain.combatDayLabel, "Next Combat Day: " + (cMain.bossDay), cMain.font2, Color.white,cMain.counterPanel);
		cMain.dayLabel = new JLabel();
		labelConfiguration(cMain.dayLabel, "0 Days", cMain.font2, Color.white,cMain.counterPanel);

		//Menu options when selecting the Cog Icon
		cMain.optionsPanel = new JPanel();
		panelConfiguration(cMain.optionsPanel, 275, 170, 250, 250, Color.black, 3,1, cMain.window);
		
		cMain.optionButton1 = new JButton("New Game");
		buttonGenerator(cMain.optionButton1, cMain.font1, Color.black, Color.white, false, cMain.clickerHandler, "NewGame", cMain.mouseHandler, cMain.optionsPanel);
		
		cMain.optionButton2 = new JButton("High Scores");
		buttonGenerator(cMain.optionButton2, cMain.font1, Color.black, Color.white, false, cMain.clickerHandler, "HighScore", cMain.mouseHandler, cMain.optionsPanel);
		
		cMain.optionButton3 = new JButton("Credits");
		buttonGenerator(cMain.optionButton3, cMain.font1, Color.black, Color.white, false, cMain.clickerHandler, "Credits", cMain.mouseHandler, cMain.optionsPanel);
		
		//Maint actions/items to be bought during the game
		cMain.itemPanel = new JPanel();
		panelConfiguration(cMain.itemPanel, 500, 170, 250, 250, Color.black, 4,1, cMain.window);
		
		cMain.button1 = new JButton("?");
		buttonGenerator(cMain.button1, cMain.font1, Color.black, Color.white, false, cMain.clickerHandler, "Card0", cMain.mouseHandler, cMain.itemPanel);
		
		cMain.button2 = new JButton("?");
		buttonGenerator(cMain.button2, cMain.font1, Color.black, Color.white, false, cMain.clickerHandler, "Card1", cMain.mouseHandler, cMain.itemPanel);

		cMain.button3 = new JButton("?");
		buttonGenerator(cMain.button3, cMain.font1, Color.black, Color.white, false, cMain.clickerHandler, "Card2", cMain.mouseHandler, cMain.itemPanel);
	
		cMain.button4 = new JButton("?");
		buttonGenerator(cMain.button4, cMain.font1, Color.black, Color.white, false, cMain.clickerHandler, "Card3", cMain.mouseHandler, cMain.itemPanel);
		
		cMain.cardPanel = new JPanel();
		panelConfiguration(cMain.cardPanel, 500, 418, 250, 60, Color.black, 1, 3, cMain.window);

		//slot spaces
		cMain.button5 = new JButton("?");
		buttonGenerator(cMain.button5, cMain.font2, Color.black, Color.white, false, cMain.clickerHandler, "Lucky", cMain.mouseHandler, cMain.cardPanel);
	
		cMain.button6 = new JButton("?");
		buttonGenerator(cMain.button6, cMain.font2, Color.black, Color.white, false, cMain.clickerHandler, "Bastard", cMain.mouseHandler, cMain.cardPanel);

		cMain.button7 = new JButton("?");
		buttonGenerator(cMain.button7, cMain.font2, Color.black, Color.white, false, cMain.clickerHandler, "Fever", cMain.mouseHandler, cMain.cardPanel);
		
		//slots
		cMain.slotPanel = new JPanel();
		panelConfiguration(cMain.slotPanel, 500, 480, 250, 60, Color.black, 1, 1, cMain.window);
	
		cMain.button8 = new JButton("?");
		buttonGenerator(cMain.button8, cMain.font1, Color.black, Color.white, false, cMain.clickerHandler, "Slots", cMain.mouseHandler, cMain.slotPanel);
		
		cMain.messagePanel = new JPanel();
		panelConfiguration(cMain.messagePanel, 500, 30, 250, 140, Color.black, 1, 1, cMain.window);
		
		cMain.messageText = new JTextArea();
		cMain.messageText.setBounds(500, 30, 250, 150);
		textAreaConfiguration(cMain.messageText, Color.black, Color.white, cMain.font2, true, true, false, true, cMain.messagePanel);
		
		cMain.window.setVisible(true);
		
		
	}

	public void labelConfiguration(JLabel label, String labelText, Font font, Color color, JPanel targetPanel ) {
		label.setText(labelText);
		label.setFont(font);
		label.setForeground(color);
		targetPanel.add(label);
	}

	public void textAreaConfiguration(JTextArea textArea, Color colorBG, Color colorFG, Font font, boolean lineWrap, boolean wrapStyle, boolean editable, boolean visible, JPanel targetPanel) {
		textArea.addMouseListener(null);
		textArea.setBackground(colorBG);
		textArea.setForeground(colorFG);
		textArea.setText("");
		textArea.setFont(font);
		textArea.setLineWrap(lineWrap);
		textArea.setWrapStyleWord(wrapStyle);
		textArea.setEditable(editable);
		textArea.setVisible(visible);
		targetPanel.add(textArea);
	}

	public void panelConfiguration(JPanel newPanel, int x1,int  y1,int x2,int y2, Color colorBG, int rows, int columns, JFrame targetFrame) {
		newPanel.setBounds(x1, y1, x2, y2 );
		newPanel.setBackground(colorBG);
		newPanel.setLayout(new GridLayout(rows,columns));
		targetFrame.add(newPanel);
	}

	public void iconButtonGenerator(ImageIcon icon, JButton newButton, Color colorBG, Color colorFG, boolean painted, ActionListener actionHandler, String actionCommand, MouseListener mouseListener,JPanel targetPanel   ) {
	
		newButton.setBorder(null);
		newButton.setIcon(icon);
		newButton.setBackground(colorBG);
		newButton.setForeground(colorFG);
		newButton.setFocusPainted(painted);
		newButton.addActionListener(actionHandler);
		newButton.setActionCommand(actionCommand);
		newButton.addMouseListener(mouseListener);
		targetPanel.add(newButton);
	}

	

	public void buttonGenerator(JButton newButton, Font font, Color colorBG, Color colorFG, boolean painted, ActionListener actionHandler, String actionCommand, MouseListener mouseListener,JPanel targetPanel   ) {
		newButton.setFont(font);
		newButton.setBackground(colorBG);
		newButton.setForeground(colorFG);
		newButton.setFocusPainted(painted);
		newButton.addActionListener(actionHandler);
		newButton.setActionCommand(actionCommand);
		newButton.addMouseListener(mouseListener);
		targetPanel.add(newButton);
	}

	public void displayPreStartMenu() {
		cMain.startButtonPanel.setVisible(false);
		cMain.saveSpotPanel.setVisible(true);
		buttonGenerator(cMain.saveSpotButton0, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "Start", cMain.mouseHandler, cMain.saveSpotPanel);
		buttonGenerator(cMain.saveSpotButton1, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "Start", cMain.mouseHandler, cMain.saveSpotPanel);
		buttonGenerator(cMain.saveSpotButton2, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "Start", cMain.mouseHandler, cMain.saveSpotPanel);
		buttonGenerator(cMain.saveSpotButton3, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "StartMenu", cMain.mouseHandler, cMain.saveSpotPanel);
		
	}
	
	public void displayPreLoadMenu() {
		cMain.startButtonPanel.setVisible(false);
		cMain.saveSpotPanel.setVisible(true);
		buttonGenerator(cMain.saveSpotButton0, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "Continue", cMain.mouseHandler, cMain.saveSpotPanel);
		buttonGenerator(cMain.saveSpotButton1, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "Continue", cMain.mouseHandler, cMain.saveSpotPanel);
		buttonGenerator(cMain.saveSpotButton2, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "Continue", cMain.mouseHandler, cMain.saveSpotPanel);
		buttonGenerator(cMain.saveSpotButton3, cMain.font3, Color.black, Color.white, false, cMain.clickerHandler, "StartMenu", cMain.mouseHandler, cMain.saveSpotPanel);
		
	}


	public void displayOptions() {
		cMain.optionsPanel.setVisible(true);
		cMain.navigationPanel.setVisible(true);
	}
	
	public void displayCombat() {
		closeAllPanels();
		cMain.multiplierPanel.setVisible(true);
		cMain.combatStatsPanel.setVisible(true);
		cMain.combatPanel.setVisible(true);
		cMain.combatButtonPanel.setVisible(true);
	}

	public void displayMainGame() {
		cMain.shopCookiePanel.setVisible(false);
		cMain.descriptionPanel.setVisible(false);
		cMain.titleNamePanel.setVisible(false);
		cMain.startButtonPanel.setVisible(false);
		cMain.shopUpperPanel.setVisible(false);
		cMain.optionsPanel.setVisible(false);
		cMain.shopPanel.setVisible(false);
		cMain.navigationPanel.setVisible(true);
		cMain.itemPanel.setVisible(true);
		cMain.cardPanel.setVisible(true);
		cMain.slotPanel.setVisible(true);
		cMain.messagePanel.setVisible(true);
		cMain.counterPanel.setVisible(true);
		cMain.cookiePanel.setVisible(true);
		cMain.displayPanelSwitch= true;
	
	}



	public void closeAllPanels() {
		cMain.multiplierPanel.setVisible(false);
		cMain.combatStatsPanel.setVisible(false);
		cMain.shopNavigationPanel.setVisible(false);
		cMain.shopCookiePanel.setVisible(false);
		cMain.navigationPanel.setVisible(false);
		cMain.descriptionPanel.setVisible(false);
		cMain.titleNamePanel.setVisible(false);
		cMain.startButtonPanel.setVisible(false);
		cMain.optionsPanel.setVisible(false);
		cMain.itemPanel.setVisible(false);
		cMain.cardPanel.setVisible(false);
		cMain.slotPanel.setVisible(false);
		cMain.shopPanel.setVisible(false);
		cMain.messagePanel.setVisible(false);
		cMain.counterPanel.setVisible(false);
		cMain.cookiePanel.setVisible(false);
		cMain.shopPanel.setVisible(false);
		cMain.shopUpperPanel.setVisible(false);
		cMain.combatPanel.setVisible(false);
		cMain.combatButtonPanel.setVisible(false);
		cMain.cardModPanel.setVisible(false);
		cMain.saveSpotPanel.setVisible(false);
		cMain.displayPanelSwitch= false;

		
	}
		
	public void displayStartMenu() {
		
		cMain.descriptionPanel.setVisible(true);
		cMain.titleNamePanel.setVisible(true);
		cMain.startButtonPanel.setVisible(true);
	}
		
		public void displayShop() {
		cMain.shopCookiePanel.setVisible(true);
		cMain.navigationPanel.setVisible(true);
		cMain.shopNavigationPanel.setVisible(true);
		cMain.shopPanel.setVisible(false);
		cMain.shopUpperPanel.setVisible(true);
		cMain.cardModPanel.setVisible(true);
	}

		public void displaySwitch(String displayOption) {
			switch (displayOption) {
			case "Cog":
			if(cMain.displayPanelSwitch == true) {
				
				closeAllPanels();
				cMain.displayPanelSwitch= false;
				displayOptions();
				
			} else if (cMain.displayPanelSwitch == false) {
				closeAllPanels();
				displayMainGame();
				cMain.displayPanelSwitch= true;
			}
			break;
			case "ItemShop":
				if(cMain.displayPanelSwitch == true) {
					closeAllPanels();
					displayShop();
					cMain.displayPanelSwitch= false;
					
				} else if (cMain.displayPanelSwitch == false) {
					closeAllPanels();
					displayMainGame();
					cMain.displayPanelSwitch= true;
				break;
			}
		}
	
}	
		
		public void createFont() {
			cMain.font1 = new Font("Comic Sans MS", Font.PLAIN, 32);
			cMain.font2 = new Font("Comic Sans MS", Font.PLAIN, 16);
			cMain.font3 = new Font("Comic Sans MS", Font.PLAIN, 20);
			cMain.font3Bold = new Font("Comic Sans MS", Font.BOLD, 26);
		}	
}