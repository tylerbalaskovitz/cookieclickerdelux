package com.tbonegames;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UI {

	CookieMain cMain;
	
	public UI(CookieMain cMain) {
		this.cMain=cMain;
		
	}
	
	
public void createUI() {
		
	cMain.window = new JFrame();
	cMain.window.setSize(800, 600);
	cMain.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	cMain.window.getContentPane().setBackground(Color.black);
	cMain.window.setLayout(null);
		

	
	cMain.combatPanel = new JPanel();
	cMain.combatPanel.setBounds(100, 100, 600, 250);
	cMain.combatPanel.setBackground(Color.black);
	cMain.window.add(cMain.combatPanel);
	
	cMain.combatTextArea = new JTextArea("");
	cMain.combatTextArea.setBounds(100, 100, 600, 250);
	cMain.combatTextArea.setBackground(Color.black);
	cMain.combatTextArea.setForeground(Color.white);
	cMain.combatTextArea.setFont(cMain.font3);
	
	//this allows longer text to be wrapped so that way it will stay in one area.
	cMain.combatTextArea.setLineWrap(true);
	cMain.combatTextArea.setWrapStyleWord(true);
	cMain.combatTextArea.setEditable(false);
	cMain.combatPanel.add(cMain.combatTextArea);
	
	
	
	cMain.combatButtonPanel = new JPanel();
	cMain.combatButtonPanel.setBounds(100, 350, 600, 150);
	cMain.combatButtonPanel.setBackground(Color.black);
	cMain.combatButtonPanel.setLayout(new GridLayout(2,2));
	cMain.window.add(cMain.combatButtonPanel);
	
	cMain.combatButton1 = new JButton("Attack");
	cMain.combatButton1.setFocusPainted(false);
	cMain.combatButton1.setBackground(Color.black);
	cMain.combatButton1.setForeground(Color.white);
	cMain.combatButton1.setFont(cMain.font3);
	cMain.combatButton1.addActionListener(cMain.combatHandler);
	cMain.combatButton1.setActionCommand("Attack");
	cMain.combatButtonPanel.add(cMain.combatButton1);
	
	
	

	
	
	
	cMain.combatButton2 = new JButton("Defend");
	cMain.combatButton2.setFocusPainted(false);
	cMain.combatButton2.setBackground(Color.black);
	cMain.combatButton2.setForeground(Color.white);
	cMain.combatButton2.setFont(cMain.font3);
	cMain.combatButton2.addActionListener(cMain.combatHandler);
	cMain.combatButton2.setActionCommand("Defend");
	cMain.combatButtonPanel.add(cMain.combatButton2);

	
	
	cMain.combatButton3 = new JButton("Item");
	cMain.combatButton3.setFocusPainted(false);
	cMain.combatButton3.setBackground(Color.black);
	cMain.combatButton3.setForeground(Color.white);
	cMain.combatButton3.setFont(cMain.font3);
	cMain.combatButton3.addActionListener(cMain.combatHandler);
	cMain.combatButton3.setActionCommand("Item");
	cMain.combatButtonPanel.add(cMain.combatButton3);

	
	
	cMain.combatButton4 = new JButton("");
	cMain.combatButton4.setFocusPainted(false);
	cMain.combatButton4.setBackground(Color.black);
	cMain.combatButton4.setForeground(Color.white);
	cMain.combatButton4.setFont(cMain.font3);
	cMain.combatButton4.addActionListener(cMain.combatHandler);
	cMain.combatButton4.setActionCommand("");
	cMain.combatButtonPanel.add(cMain.combatButton4);
	
	cMain.combatPanel.setVisible(false);
	cMain.combatButtonPanel.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	cMain.optionsPanel = new JPanel();
	cMain.optionsPanel.setBounds(10, 500, 250, 50);
	cMain.optionsPanel.setLayout(new GridLayout(1,5));
	cMain.optionsPanel.setBackground(Color.black);
	
	
	
	
		
	cMain.displayShop = new JButton();
		ImageIcon shop = new ImageIcon(getClass().getClassLoader().getResource("shop.png"));
		cMain.displayShop = new JButton();
		cMain.displayShop.setBackground(Color.black);
		cMain.displayShop.setIcon(shop);
		cMain.displayShop.setFocusPainted(false);
		cMain.displayShop.setBorder(null);
		cMain.displayShop.addActionListener(cMain.cHandler);
		cMain.displayShop.setActionCommand("Shop");
		cMain.optionsPanel.add(cMain.displayShop);
		
		cMain.shopUpperPanel = new JPanel();
		cMain.shopUpperPanel.setBounds(135, 50, 500, 200);
		cMain.shopUpperPanel.setLayout(new GridLayout(1,1));
		cMain.shopUpperPanel.setBackground(Color.white);
		cMain.shopUpperPanel.setVisible(false);
		
		cMain.shopMessageText = new JTextArea();
		cMain.shopMessageText.addMouseListener(null);
		cMain.shopMessageText.setBackground(Color.black);
		cMain.shopMessageText.setForeground(Color.white);
		cMain.shopMessageText.setText("");
		cMain.shopMessageText.setFont(cMain.font3);
		cMain.shopMessageText.setLineWrap(true);
		cMain.shopMessageText.setWrapStyleWord(true);
		cMain.shopMessageText.setEditable(false);
		cMain.shopMessageText.setVisible(true);
		
		cMain.shopUpperPanel.add(cMain.shopMessageText);
		
		
		
		cMain.shopPanel = new JPanel();
		cMain.shopPanel.setBounds(135, 275, 500, 200);
		cMain.shopPanel.setLayout(new GridLayout(2,3));
		cMain.shopPanel.setBackground(Color.black);
		
		
		cMain.shopButton1 = new JButton("Bastard Cola");
		cMain.shopButton1.setFont(cMain.font3);
		cMain.shopButton1.setBackground(Color.black);
		cMain.shopButton1.setForeground(Color.white);
		cMain.shopButton1.setFocusPainted(false);
		cMain.shopButton1.addActionListener(cMain.cHandler);
		cMain.shopButton1.setActionCommand("BastardCola");
		cMain.shopButton1.addMouseListener(cMain.mHandler);
		cMain.shopPanel.add(cMain.shopButton1);
		
		cMain.shopButton2 = new JButton("Bastard Sausage");
		cMain.shopButton2.setFont(cMain.font3);
		cMain.shopButton2.setBackground(Color.black);
		cMain.shopButton2.setForeground(Color.white);
		cMain.shopButton2.setFocusPainted(false);
		cMain.shopButton2.addActionListener(cMain.cHandler);
		cMain.shopButton2.addMouseListener(cMain.mHandler);
		cMain.shopButton2.setActionCommand("BastardSausage");
		cMain.shopPanel.add(cMain.shopButton2);
		
		cMain.shopButton3 = new JButton("?");
		cMain.shopButton3.setFont(cMain.font3);
		cMain.shopButton3.setBackground(Color.black);
		cMain.shopButton3.setForeground(Color.white);
		cMain.shopButton3.setFocusPainted(false);
		cMain.shopButton3.addActionListener(cMain.cHandler);
		cMain.shopButton3.addMouseListener(cMain.mHandler);
		cMain.shopButton3.setActionCommand("BastardRod");
		cMain.shopPanel.add(cMain.shopButton3);
		
		cMain.shopButton4 = new JButton("?");
		cMain.shopButton4.setFont(cMain.font3);
		cMain.shopButton4.setBackground(Color.black);
		cMain.shopButton4.setForeground(Color.white);
		cMain.shopButton4.setFocusPainted(false);
		cMain.shopButton4.addActionListener(cMain.cHandler);
		cMain.shopButton4.addMouseListener(cMain.mHandler);
		cMain.shopButton4.setActionCommand("BastardBelt");
		cMain.shopPanel.add(cMain.shopButton4);
		
		cMain.shopButton5 = new JButton("?");
		cMain.shopButton5.setFont(cMain.font3);
		cMain.shopButton5.setBackground(Color.black);
		cMain.shopButton5.setForeground(Color.white);
		cMain.shopButton5.setFocusPainted(false);
		cMain.shopButton5.addActionListener(cMain.cHandler);
		cMain.shopButton5.addMouseListener(cMain.mHandler);
		cMain.shopButton5.setActionCommand("BastardMask");
		
		cMain.shopPanel.add(cMain.shopButton5);
		
		cMain.shopButton6 = new JButton("?");
		cMain.shopButton6.setFont(cMain.font3);
		cMain.shopButton6.setBackground(Color.black);
		cMain.shopButton6.setForeground(Color.white);
		cMain.shopButton6.setFocusPainted(false);
		cMain.shopButton6.addActionListener(cMain.cHandler);
		cMain.shopButton6.addMouseListener(cMain.mHandler);
		cMain.shopButton6.setActionCommand("BastardArmor");
		cMain.shopPanel.add(cMain.shopButton6);
		
		
		cMain.shopPanel.setVisible(false);
		cMain.window.add(cMain.shopPanel);
		cMain.window.add(cMain.shopUpperPanel);
		
		
		ImageIcon cog = new ImageIcon(getClass().getClassLoader().getResource("cog.png"));
		cMain.button9 = new JButton();
		cMain.button9.setBackground(Color.black);
		cMain.button9.setIcon(cog);
		cMain.button9.setFocusPainted(false);
		cMain.button9.setBorder(null);
		cMain.button9.addActionListener(cMain.cHandler);
		cMain.button9.setActionCommand("Display");
		cMain.optionsPanel.add(cMain.button9);
		
		cMain.window.add(cMain.optionsPanel);
		
		cMain.cookiePanel = new JPanel();
		cMain.cookiePanel.setBounds(100, 220, 200, 200);
		cMain.cookiePanel.setBackground(Color.black);
		cMain.window.add(cMain.cookiePanel);
		
		
		ImageIcon cookie = new ImageIcon(getClass().getClassLoader().getResource("cookie.png"));
		
		JButton cookieButton = new JButton();
		
		
		cookieButton.setBackground(Color.black);
		cookieButton.setFocusPainted(false);
		cookieButton.setBorder(null);
		cookieButton.addActionListener(cMain.cHandler);
		cookieButton.setActionCommand("cookie");
		//setIcon is a method that allows you to set a picture on this Button
		cookieButton.setIcon(cookie);
		cMain.cookiePanel.add(cookieButton);
		
		
		
		cMain.counterPanel = new JPanel();
		cMain.counterPanel.setBounds(100,100,200,100);
		cMain.counterPanel.setBackground(Color.black);
		cMain.counterPanel.setLayout(new GridLayout(2,1));
		cMain.window.add(cMain.counterPanel);
		
		cMain.counterLabel = new JLabel(cMain.cookieCounter + " Cookies");
		cMain.counterLabel.setFont(cMain.font1);
		cMain.counterLabel.setForeground(Color.white);
		cMain.counterPanel.add(cMain.counterLabel);
		
		cMain.perSecLabel = new JLabel();
		cMain.perSecLabel.setFont(cMain.font2);
		cMain.perSecLabel.setForeground(Color.white);
		cMain.counterPanel.add(cMain.perSecLabel);
		
	
		
		//started here
		cMain.optionsPanel = new JPanel();
		cMain.optionsPanel.setBounds(275, 170, 250, 250);
		cMain.optionsPanel.setBackground(Color.white);
		cMain.optionsPanel.setLayout(new GridLayout(3,1));
		
		cMain.optionButton1 = new JButton("New Game");
		cMain.optionButton1.setFont(cMain.font1);
		cMain.optionButton1.setBackground(Color.black);
		cMain.optionButton1.setForeground(Color.white);
		cMain.optionButton1.setFocusPainted(false);
		cMain.optionButton1.addActionListener(cMain.cHandler);
		cMain.optionButton1.setActionCommand("NewGame");
		cMain.optionButton1.addMouseListener(cMain.mHandler);
		cMain.optionsPanel.add(cMain.optionButton1);
		
		cMain.optionButton2 = new JButton("High Scores");
		cMain.optionButton2.setFont(cMain.font1);
		cMain.optionButton2.setBackground(Color.black);
		cMain.optionButton2.setForeground(Color.white);
		cMain.optionButton2.setFocusPainted(false);
		cMain.optionButton2.addActionListener(cMain.cHandler);
		cMain.optionButton2.setActionCommand("HighScores");
		cMain.optionButton2.addMouseListener(cMain.mHandler);
		cMain.optionsPanel.add(cMain.optionButton2);
		
		
		cMain.optionButton3 = new JButton("Credits");
		cMain.optionButton3.setFont(cMain.font1);
		cMain.optionButton3.setBackground(Color.black);
		cMain.optionButton3.setForeground(Color.white);
		cMain.optionButton3.setFocusPainted(false);
		cMain.optionButton3.addActionListener(cMain.cHandler);
		cMain.optionButton3.setActionCommand("Credits");
		cMain.optionButton3.addMouseListener(cMain.mHandler);
		cMain.optionsPanel.add(cMain.optionButton3);
		cMain.optionsPanel.setVisible(false);
		
		cMain.window.add(cMain.optionsPanel);
		
		
		
		cMain.itemPanel = new JPanel();
		cMain.itemPanel.setBounds(500, 170, 250, 250);
		cMain.itemPanel.setBackground(Color.black);
		cMain.itemPanel.setLayout(new GridLayout(4,1));
		
		
		
		cMain.button1 = new JButton("Cursor");
		cMain.button1.setFont(cMain.font1);
		cMain.button1.setBackground(Color.black);
		cMain.button1.setForeground(Color.white);
		cMain.button1.setFocusPainted(false);
		cMain.button1.addActionListener(cMain.cHandler);
		cMain.button1.setActionCommand("Cursor");
		cMain.button1.addMouseListener(cMain.mHandler);
		cMain.itemPanel.add(cMain.button1);
		
		cMain.button2 = new JButton("?");
		cMain.button2.setFont(cMain.font1);
		cMain.button2.setBackground(Color.black);
		cMain.button2.setForeground(Color.white);
		cMain.button2.setFocusPainted(false);
		cMain.button2.addActionListener(cMain.cHandler);
		cMain.button2.setActionCommand("Grandpa");
		cMain.button2.addMouseListener(cMain.mHandler);
		cMain.itemPanel.add(cMain.button2);
		
		cMain.button3 = new JButton("?");
		cMain.button3.setFont(cMain.font1);
		cMain.button3.setBackground(Color.black);
		cMain.button3.setForeground(Color.white);
		cMain.button3.setFocusPainted(false);
		cMain.button3.addActionListener(cMain.cHandler);
		cMain.button3.setActionCommand("Grandma");
		cMain.button3.addMouseListener(cMain.mHandler);
		cMain.itemPanel.add(cMain.button3);
		
		cMain.button4 = new JButton("?");
		cMain.button4.setFont(cMain.font1);
		cMain.button4.setBackground(Color.black);
		cMain.button4.setForeground(Color.white);
		cMain.button4.setFocusPainted(false);
		cMain.button4.addActionListener(cMain.cHandler);
		cMain.button4.setActionCommand("Elves");
		cMain.button4.addMouseListener(cMain.mHandler);
		cMain.itemPanel.add(cMain.button4);
		cMain.window.add(cMain.itemPanel);
		
		cMain.cardPanel = new JPanel();
		cMain.cardPanel.setBounds(500, 418, 250, 60);
		cMain.cardPanel.setBackground(Color.black);
		cMain.cardPanel.setLayout(new GridLayout(1,3));
		
		cMain.button5 = new JButton("?");
		cMain.button5.setFont(cMain.font2);
		cMain.button5.setBackground(Color.black);
		cMain.button5.setForeground(Color.white);
		cMain.button5.setFocusPainted(false);
		cMain.button5.addActionListener(cMain.cHandler);
		cMain.button5.setActionCommand("Lucky");
		cMain.button5.addMouseListener(cMain.mHandler);
		cMain.cardPanel.add(cMain.button5);
		
		cMain.button6 = new JButton("?");
		cMain.button6.setFont(cMain.font2);
		cMain.button6.setBackground(Color.black);
		cMain.button6.setForeground(Color.white);
		cMain.button6.setFocusPainted(false);
		cMain.button6.addActionListener(cMain.cHandler);
		cMain.button6.setActionCommand("Bastard");
		cMain.button6.addMouseListener(cMain.mHandler);
		cMain.cardPanel.add(cMain.button6);
		
		cMain.button7 = new JButton("?");
		cMain.button7.setFont(cMain.font2);
		cMain.button7.setBackground(Color.black);
		cMain.button7.setForeground(Color.white);
		cMain.button7.setFocusPainted(false);
		cMain.button7.addActionListener(cMain.cHandler);
		cMain.button7.setActionCommand("Fever");
		cMain.button7.addMouseListener(cMain.mHandler);
		cMain.cardPanel.add(cMain.button7);
		
		cMain.window.add(cMain.cardPanel);
		
		cMain.slotPanel = new JPanel();
		cMain.slotPanel.setBounds(500, 480, 250, 60 );
		cMain.slotPanel.setBackground(Color.yellow);
		cMain.slotPanel.setLayout(new GridLayout(1,1));
		
		
	
		cMain.button8 = new JButton("?");
		cMain.button8.setFont(cMain.font1);
		cMain.button8.setBackground(Color.black);
		cMain.button8.setForeground(Color.white);
		cMain.button8.setFocusPainted(false);
		cMain.button8.addActionListener(cMain.cHandler);
		cMain.button8.setActionCommand("Slots");
		cMain.button8.addMouseListener(cMain.mHandler);
		cMain.slotPanel.add(cMain.button8);
		
		cMain.window.add(cMain.slotPanel);
		
		
		cMain.messagePanel = new JPanel();
		cMain.messagePanel.setBounds(500, 50, 250, 150);
		cMain.messagePanel.setBackground(Color.black);
		cMain.window.add(cMain.messagePanel);
		
		cMain.messageText = new JTextArea();
		cMain.messageText.setBounds(500, 70, 250, 150);
		cMain.messageText.setForeground(Color.white);
		cMain.messageText.setBackground(Color.black);
		cMain.messageText.setFont(cMain.font2);
		cMain.messageText.setLineWrap(true);
		cMain.messageText.setWrapStyleWord(true);
		cMain.messageText.setEditable(false);
		cMain.messagePanel.add(cMain.messageText);
		
		
		
		cMain.window.setVisible(true);
		
		
		
	}

	public void displayOptions() {
	cMain.optionsPanel.setVisible(true);
	
}
	
	public void displayCombat() {
		closeAllPanels();
		cMain.combatPanel.setVisible(true);
		cMain.combatButtonPanel.setVisible(true);
	}

	public void displayMainGame() {
		cMain.shopUpperPanel.setVisible(false);
		cMain.optionsPanel.setVisible(false);
		cMain.shopPanel.setVisible(false);
		cMain.itemPanel.setVisible(true);
		cMain.cardPanel.setVisible(true);
		cMain.slotPanel.setVisible(true);
		cMain.messagePanel.setVisible(true);
		cMain.counterPanel.setVisible(true);
		cMain.cookiePanel.setVisible(true);
		cMain.displayPanelSwitch= true;
	
}



		public void closeAllPanels() {
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
			cMain.displayPanelSwitch= false;
		}

		public void displaySwitch(String displayOption) {
			switch (displayOption) {
			case "Cog":
			if(cMain.displayPanelSwitch == true) {
				
				closeAllPanels();
				cMain.displayPanelSwitch= false;
				displayOptions();
				
			} else if (cMain.displayPanelSwitch == false) {
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
			
		}
		

			public void displayShop() {
			
			cMain.shopPanel.setVisible(true);
			cMain.shopUpperPanel.setVisible(true);
		
		}

	
}
