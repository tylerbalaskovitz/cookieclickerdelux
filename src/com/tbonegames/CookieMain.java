package com.tbonegames;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
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
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, displayShop, shopButton1, shopButton2, shopButton3, shopButton4, shopButton5;
	
	int cookieCounter, timerSpeed, cursorNumber, cursorPrice, grandpaNumber, grandpaPrice, slotsPrice,
	grandmaPrice, grandmaNumber, elvesPrice, elvesNumber, luckyPrice, bastardPrice, feverPrice;
	
	double perSecond;
	boolean timerOn, grandpaUnlocked, grandmaUnlocked, elvesUnlocked, luckyUnlocked, bastardUnlocked, feverUnlocked, slotsUnlocked, displayPanelSwitch;
	Font font1, font2;
	CookieHandler cHandler = new CookieHandler();
	Timer timer, slotTimer;
	JTextArea messageText;
	MouseHandler mHandler = new MouseHandler();
	
	public static void main(String[] args) {
		new CookieMain();
	}
	
	public CookieMain() {
		
		startUpValues();
		
		createFont();
		
		createUI();
		
	}
	
	public void displayMainGame() {
		shopUpperPanel.setVisible(false);
		shopPanel.setVisible(false);
		itemPanel.setVisible(true);
		cardPanel.setVisible(true);
		slotPanel.setVisible(true);
		messagePanel.setVisible(true);
		counterPanel.setVisible(true);
		cookiePanel.setVisible(true);
		displayPanelSwitch= true;
		
	}
	
	public void closeAllPanels() {
		itemPanel.setVisible(false);
		cardPanel.setVisible(false);
		slotPanel.setVisible(false);
		shopPanel.setVisible(false);
		messagePanel.setVisible(false);
		counterPanel.setVisible(false);
		cookiePanel.setVisible(false);
		shopPanel.setVisible(false);
		shopUpperPanel.setVisible(false);
		displayPanelSwitch= false;
	}
	
	public void displaySwitch(String displayOption) {
		switch (displayOption) {
		case "Cog":
		if(displayPanelSwitch == true) {
			
			closeAllPanels();
			displayPanelSwitch= false;
			
		} else if (displayPanelSwitch == false) {
			displayMainGame();
			displayPanelSwitch= true;
			
		}
		break;
		
		
		case "ItemShop":
			if(displayPanelSwitch == true) {
				closeAllPanels();
				displayShop();
				displayPanelSwitch= false;
				
			} else if (displayPanelSwitch == false) {
				displayMainGame();
				displayPanelSwitch= true;
			break;
		
		}
	}
	}
	
	public void wildCard(int wildCard) {
		switch (wildCard) {
		
		case(0):
			elvesPrice = elvesPrice/2;
			rewardsMessage = "The cost of elves have been halved!";
			break;
		case (1):
			grandmaPrice = grandmaPrice/2;
			rewardsMessage = "The cost of grandmas have been halved!";
			break;
		case (2):
			grandpaPrice = grandpaPrice/2;
			rewardsMessage = "The cost of grandpas have been halved!";
			break;
		case (3):
			cursorPrice = cursorPrice/2;
			rewardsMessage = "The cost of cursors have been halved!";
			break;
			default:
			rewardsMessage = "Ya lost you little bastard!";
			break;
		}
	}
	
	public void luckyBastardFever(String slotType, int slotValue) {
		int result;
		switch (slotType) {
		case "Lucky":
			result = rand.nextInt(slotValue);
			wildCard(result);
			break;
		case "Bastard":
			result = rand.nextInt(slotValue);
			wildCard(result);
			break;
		case "Fever":
			result = rand.nextInt(slotValue);
			wildCard(result);
			break;
		case "Slots":
			
			int slot1 = rand.nextInt(slotValue);
			button5.setText(""+ slot1);
			int slot2 = rand.nextInt(slotValue);
			button6.setText(""+ slot2);
			int slot3 = rand.nextInt(slotValue);
			button7.setText(""+ slot3);
			if (slot1 == slot2 && slot1 == slot3) {
				if (slot1 == 3) {
					rewardsMessage = "Gain 10,000 Cookies";
					cookieCounter = cookieCounter + 10000;
				} else {
					rewardsMessage = "";
				}
				
				messageText.setText("You're the luckiest bastard of all! You hit the jackpot! All sticker prices are 1/4 the price. " + rewardsMessage);
				cursorPrice = cursorPrice/4;
				grandpaPrice = grandpaPrice/4;
				grandmaPrice = grandmaPrice/4;
				elvesPrice = elvesPrice/4;
				luckyPrice = luckyPrice/4;
				bastardPrice = bastardPrice/4;
				feverPrice = feverPrice/4;
				
				break;
			}
			else if (slot1 == slot2 || slot2==slot3) {
				luckyBastardFever("Lucky", 4);
				messageText.setText("You pulled the rod, and the results are a bit lopsided. " + rewardsMessage);
				break;
			}
			else if (slot1 == slot3) {
				luckyBastardFever("Bastard", 4);
				messageText.setText("Keep pulling that rod, you little bastard! Something good is starting to come out! " + rewardsMessage);
				break;
			} else {
				messageText.setText("Ya lost you little bastard!");
			}
			break;
		
		
		
		}
			
	}
	
	public void startUpValues() {
		displayPanelSwitch = true;
		slotsUnlocked = false;
		luckyUnlocked = false;
		bastardUnlocked = false;
		feverUnlocked = false;
		grandpaUnlocked = false;
		timerOn = false;
		perSecond = 0;
		cookieCounter = 0;
		grandpaPrice = 100;
		grandmaPrice = 200;
		elvesPrice = 500;
		luckyPrice = 500;
		bastardPrice = 750;
		feverPrice = 1000;
		slotsPrice = 1000;
		cursorNumber = 0;
		cursorPrice = 10;
	}
	
	public void createFont() {
		
		font1 = new Font("Comic Sans MS", Font.PLAIN, 32);
		font2 = new Font("Comic Sans MS", Font.PLAIN, 16);
		
	}
	
	public void displayShop() {
		
		shopPanel.setVisible(true);
		shopUpperPanel.setVisible(true);

	}
	
	
	public void createUI() {
		
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		optionsPanel = new JPanel();
		optionsPanel.setBounds(10, 500, 250, 50);
		optionsPanel.setLayout(new GridLayout(1,5));
		optionsPanel.setBackground(Color.yellow);
		
		displayShop = new JButton();
		ImageIcon shop = new ImageIcon(getClass().getClassLoader().getResource("shop.png"));
		displayShop = new JButton();
		displayShop.setBackground(Color.black);
		displayShop.setIcon(shop);
		displayShop.setFocusPainted(false);
		displayShop.setBorder(null);
		displayShop.addActionListener(cHandler);
		displayShop.setActionCommand("Shop");
		optionsPanel.add(displayShop);
		
		shopUpperPanel = new JPanel();
		shopUpperPanel.setBounds(135, 50, 500, 200);
		shopUpperPanel.setLayout(new GridLayout(2,5));
		shopUpperPanel.setBackground(Color.white);
		shopUpperPanel.setVisible(false);
		
		
		shopPanel = new JPanel();
		shopPanel.setBounds(135, 275, 500, 200);
		shopPanel.setLayout(new GridLayout(2,5));
		shopPanel.setBackground(Color.yellow);
		
		shopButton1 = new JButton();
		shopButton1 = new JButton();
		shopButton1.setBackground(Color.yellow);
		
		shopButton1.setFocusPainted(false);
		shopButton1.setBorder(null);
		shopButton1.addActionListener(cHandler);
		shopButton1.setActionCommand("");
		shopPanel.add(shopButton1);
		shopPanel.setVisible(false);
		window.add(shopPanel);
		window.add(shopUpperPanel);
		
		
		ImageIcon cog = new ImageIcon(getClass().getClassLoader().getResource("cog.png"));
		button9 = new JButton();
		button9.setBackground(Color.black);
		button9.setIcon(cog);
		button9.setFocusPainted(false);
		button9.setBorder(null);
		button9.addActionListener(cHandler);
		button9.setActionCommand("Display");
		optionsPanel.add(button9);
		
		window.add(optionsPanel);
		
		cookiePanel = new JPanel();
		cookiePanel.setBounds(100, 220, 200, 200);
		cookiePanel.setBackground(Color.black);
		window.add(cookiePanel);
		
		
		ImageIcon cookie = new ImageIcon(getClass().getClassLoader().getResource("cookie.png"));
		
		JButton cookieButton = new JButton();
		
		
		cookieButton.setBackground(Color.black);
		cookieButton.setFocusPainted(false);
		cookieButton.setBorder(null);
		cookieButton.addActionListener(cHandler);
		cookieButton.setActionCommand("cookie");
		//setIcon is a method that allows you to set a picture on this Button
		cookieButton.setIcon(cookie);
		cookiePanel.add(cookieButton);
		
		slotPanel = new JPanel();
		slotPanel.setBounds(500, 480, 250, 60 );
		slotPanel.setBackground(Color.yellow);
		slotPanel.setLayout(new GridLayout(1,1));
		
		
	
		button8 = new JButton("?");
		button8.setFont(font1);
		button8.setBackground(Color.black);
		button8.setForeground(Color.white);
		button8.setFocusPainted(false);
		button8.addActionListener(cHandler);
		button8.setActionCommand("Slots");
		button8.addMouseListener(mHandler);
		slotPanel.add(button8);
		
		window.add(slotPanel);
		
		counterPanel = new JPanel();
		counterPanel.setBounds(100,100,200,100);
		counterPanel.setBackground(Color.black);
		counterPanel.setLayout(new GridLayout(2,1));
		window.add(counterPanel);
		
		counterLabel = new JLabel(cookieCounter + " Cookies");
		counterLabel.setFont(font1);
		counterLabel.setForeground(Color.white);
		counterPanel.add(counterLabel);
		
		perSecLabel = new JLabel();
		perSecLabel.setFont(font2);
		perSecLabel.setForeground(Color.white);
		counterPanel.add(perSecLabel);
		
		cardPanel = new JPanel();
		cardPanel.setBounds(500, 418, 250, 60);
		cardPanel.setBackground(Color.black);
		cardPanel.setLayout(new GridLayout(1,3));
		
		button5 = new JButton("?");
		button5.setFont(font2);
		button5.setBackground(Color.black);
		button5.setForeground(Color.white);
		button5.setFocusPainted(false);
		button5.addActionListener(cHandler);
		button5.setActionCommand("Lucky");
		button5.addMouseListener(mHandler);
		cardPanel.add(button5);
		
		button6 = new JButton("?");
		button6.setFont(font2);
		button6.setBackground(Color.black);
		button6.setForeground(Color.white);
		button6.setFocusPainted(false);
		button6.addActionListener(cHandler);
		button6.setActionCommand("Bastard");
		button6.addMouseListener(mHandler);
		cardPanel.add(button6);
		
		button7 = new JButton("?");
		button7.setFont(font2);
		button7.setBackground(Color.black);
		button7.setForeground(Color.white);
		button7.setFocusPainted(false);
		button7.addActionListener(cHandler);
		button7.setActionCommand("Fever");
		button7.addMouseListener(mHandler);
		cardPanel.add(button7);
		
		window.add(cardPanel);
		
		itemPanel = new JPanel();
		itemPanel.setBounds(500, 170, 250, 250);
		itemPanel.setBackground(Color.black);
		itemPanel.setLayout(new GridLayout(4,1));
		
		
		button1 = new JButton("Cursor");
		button1.setFont(font1);
		button1.setBackground(Color.black);
		button1.setForeground(Color.white);
		button1.setFocusPainted(false);
		button1.addActionListener(cHandler);
		button1.setActionCommand("Cursor");
		button1.addMouseListener(mHandler);
		itemPanel.add(button1);
		
		button2 = new JButton("?");
		button2.setFont(font1);
		button2.setBackground(Color.black);
		button2.setForeground(Color.white);
		button2.setFocusPainted(false);
		button2.addActionListener(cHandler);
		button2.setActionCommand("Grandpa");
		button2.addMouseListener(mHandler);
		itemPanel.add(button2);
		
		button3 = new JButton("?");
		button3.setFont(font1);
		button3.setBackground(Color.black);
		button3.setForeground(Color.white);
		button3.setFocusPainted(false);
		button3.addActionListener(cHandler);
		button3.setActionCommand("Grandma");
		button3.addMouseListener(mHandler);
		itemPanel.add(button3);
		
		button4 = new JButton("?");
		button4.setFont(font1);
		button4.setBackground(Color.black);
		button4.setForeground(Color.white);
		button4.setFocusPainted(false);
		button4.addActionListener(cHandler);
		button4.setActionCommand("Elves");
		button4.addMouseListener(mHandler);
		itemPanel.add(button4);
		
		
		
		window.add(itemPanel);
		
		messagePanel = new JPanel();
		messagePanel.setBounds(500, 50, 250, 150);
		messagePanel.setBackground(Color.black);
		window.add(messagePanel);
		
		messageText = new JTextArea();
		messageText.setBounds(500, 70, 250, 150);
		messageText.setForeground(Color.white);
		messageText.setBackground(Color.black);
		messageText.setFont(font2);
		messageText.setLineWrap(true);
		messageText.setWrapStyleWord(true);
		messageText.setEditable(false);
		messagePanel.add(messageText);
		
		
		
		window.setVisible(true);
		
		
	}
	
	public void setTimer() {
		timer = new Timer(timerSpeed, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				cookieCounter++;
				counterLabel.setText(cookieCounter + " Cookies");
				
				if(grandpaUnlocked==false) {
					if(cookieCounter >= 100) {
						grandpaUnlocked = true;
						button2.setText("Grandpa " + "(" + grandpaNumber + ")");
					}
				} else if (grandpaUnlocked == true){
					button2.setText("Grandpa " + "(" + grandpaNumber + ")");
				}
				
				if(grandmaUnlocked==false) {
					if(cookieCounter >= 200) {
						grandmaUnlocked = true;
						button3.setText("Grandma " + "(" + grandmaNumber + ")");
					}
				} else if (grandmaUnlocked == true){
					button3.setText("Grandma " + "(" + grandmaNumber + ")");
				}
				
				if(elvesUnlocked==false) {
					if(cookieCounter >= 500) {
						elvesUnlocked = true;
						button4.setText("Elves " + "(" + elvesNumber + ")");
					}
				} else if (elvesUnlocked == true){
					button4.setText("Elves " + "(" + elvesNumber + ")");
				}
				
			
				if(luckyUnlocked==false) {
					if(cookieCounter >= 500) {
						luckyUnlocked = true;
						button5.setText("Lucky");
					}
				} 
				if(bastardUnlocked==false) {
					if(cookieCounter >= 750) {
						bastardUnlocked = true;
						button6.setText("Bastard");
					}
				}
				
				if(feverUnlocked==false) {
					if(cookieCounter >= 1000) {
						feverUnlocked = true;
						button7.setText("Fever");
					}
				} 
				if(slotsUnlocked==false) {
					if(cookieCounter >= 1500) {
						slotsUnlocked = true;
						button8.setText("Slots");
					}
				} 
				
			}
		});
	}
	
	public void timerUpdate() {
		if (timerOn == false) {
			
			timerOn=true;
		}
		else if(timerOn==true) {
			timer.stop();
		}
		
		double speed = 1/perSecond*1000;
		timerSpeed = (int)Math.round(speed);
		
		//the %.1f is a a way for creating a format where the float(decimal) will go 1 digit deep)
		String s = String.format("%.1f", perSecond);
		perSecLabel.setText("Per Second: " + s);
		
		setTimer();
		timer.start();
		
	}
	
	
	
	public class CookieHandler implements ActionListener{
		
		
		public void actionPerformed(ActionEvent event) {
			
			
			
			String action = event.getActionCommand();
			
			
			
			
			switch (action) {
			case "cookie": cookieCounter++; counterLabel.setText(cookieCounter + " Cookies"); break;
				case "Cursor": if (cookieCounter >= cursorPrice) {
					cookieCounter = cookieCounter - cursorPrice;
					cursorPrice = cursorPrice + 5;
					counterLabel.setText(cookieCounter + " Cookies");
					messageText.setText("Cursor: \n [Price: " + cursorPrice + "] \n AutoClicks once every 10 seconds");
					cursorNumber++;
					button1.setText("Cursor " + "(" + cursorNumber + ")");
					perSecond = perSecond + 0.1; timerUpdate();
				} else {
					messageText.setText("You need more cookies!"); 
				}
				break;
				case "Grandpa":
				 if (cookieCounter >= grandpaPrice) {
					cookieCounter = cookieCounter - grandpaPrice;
					grandpaPrice = grandpaPrice + 50;
					counterLabel.setText(cookieCounter + " Cookies");
					grandpaNumber++;
					messageText.setText("Grandpa: \n [Price: " + grandpaPrice + "] \n Each grandpa produces 1 cookie per second");
					button2.setText("Grandpa " + "(" + grandpaNumber + ")");
					perSecond = perSecond + 1; timerUpdate();
				} else {
					messageText.setText("You need more cookies!"); 
				}
				break;
				case "Grandma":
					if (cookieCounter >= grandmaPrice) {
						cookieCounter = cookieCounter - grandmaPrice;
						grandmaPrice = grandmaPrice + 200;
						counterLabel.setText(cookieCounter + " Cookies");
						grandmaNumber++;
						messageText.setText("Grandma: \n [Price: " + grandmaPrice + "] \n Each grandma produces 3 cookie per second");
						button3.setText("Grandpa " + "(" + grandmaNumber + ")");
						perSecond = perSecond + 3; timerUpdate();
					} else {
						messageText.setText("You need more cookies!"); 
					}
				break;
				case "Elves":
					if (cookieCounter >= elvesPrice) {
						cookieCounter = cookieCounter - elvesPrice;
						elvesPrice = elvesPrice + 500;
						counterLabel.setText(cookieCounter + " Cookies");
						elvesNumber++;
						messageText.setText("Elves: \n [Price: " + elvesPrice + "] \n Each elf produces 7 cookie per second");
						button4.setText("Elves " + "(" + elvesNumber + ")");
						perSecond = perSecond + 7; timerUpdate();
					} else {
						messageText.setText("You need more cookies!"); 
					}
				break;
				
				case "Lucky":
					if(cookieCounter >= luckyPrice) {
						cookieCounter = cookieCounter - luckyPrice;
						luckyPrice = luckyPrice + 500;
						luckyBastardFever("Lucky", 5);
						messageText.setText("Lucky: \n [Price: " + luckyPrice + "] \n" + rewardsMessage);
						
						
						
						
					}
				break;
				
				case "Bastard":
					if(cookieCounter >= bastardPrice) {
						cookieCounter = cookieCounter - bastardPrice;
						bastardPrice = bastardPrice + 750;
						luckyBastardFever("Bastard", 3);
						messageText.setText("Bastard: \n [Price: " + bastardPrice + "] \n " + rewardsMessage);
						
						
						
					}
				break;
				
				case "Fever":
					if(cookieCounter >= feverPrice) {
						cookieCounter = cookieCounter - feverPrice;
						feverPrice = feverPrice + 1000;
						luckyBastardFever("Bastard", 2);
						messageText.setText("Fever: \n [Price: " + feverPrice + "] \n"  + rewardsMessage);
						
						
						
					}
				break;
				case "Slots":
					if(cookieCounter>= slotsPrice) {
					luckyBastardFever("Slots", 4);
					cookieCounter = cookieCounter - slotsPrice;
					}
				break;
				case "Display":
					displaySwitch("Cog");
					break;
				case "Shop":
					displaySwitch("ItemShop");
					break;
					
			}
		
		}

	}
	

	
	public class MouseHandler implements MouseListener{
		
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton button = (JButton)e.getSource();
		
		if(button == button1) {
			messageText.setText("Cursor: \n [Price: " + cursorPrice + "] \n AutoClicks once every 10 seconds");
		}
		
		if(button == button2) {
			if(grandpaUnlocked==false) {
			messageText.setText("This item is currently locked");
			} else {
				messageText.setText("Grandpa: \n [Price: " + grandpaPrice + "] \n Each grandpa produces 1 cookie per second");
			}
		}
		if(button == button3) {
			if(grandmaUnlocked==false) {
				
			
			messageText.setText("This item is currently locked");
			} else {
			messageText.setText("Grandma: \n [Price: " + grandmaPrice + "] \n Each grandma produces 3 cookie per second");
			}
		}
		
		if(button == button4) {
			if(elvesUnlocked==false) {
			messageText.setText("This item is currently locked");
			} else {
				messageText.setText("Elves: \n [Price: " + elvesPrice + "] \n Each elf produces 7 cookie per second");
			}
		}
		if(button == button5) {
			if (luckyUnlocked==false) {
			messageText.setText("This item is currently locked");
			} else {
				messageText.setText("Lucky: \n [Price: " + luckyPrice + "] \n Roll the dice, you lucky bastard! One of the four costs to the prices above will be halved");
				
			}
		}
		
		if(button == button6) {
			if(bastardUnlocked==false) {
			messageText.setText("This item is currently locked");
			} else {
				messageText.setText("Bastard: \n " + bastardPrice + "] \nRoll the dice, you lucky bastard! One of the three costs to the prices above will be halved");
			}
		}
		if(button == button7) {
			if(feverUnlocked==false) {
				
			
			messageText.setText("This item is currently locked");
			} else {
			messageText.setText("Fever: \n [Price: " + feverPrice + "] \n Roll the dice, you lucky bastard! One of the two costs to the prices above will be halved, or quartered");
			}
		}
		
		if(button == button8) {
			if(slotsUnlocked==false) {
			messageText.setText("This item is currently locked");
			} else {
				messageText.setText("Slots: \n [Price: " + slotsPrice + "] \n Pull that Bastard Rod, you lucky bastard and get a little action!");
			}
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton button = (JButton)e.getSource();
		if(button == button1) {
			messageText.setText(null);
		}
		else if (button == button2) {
			messageText.setText(null);
		}
		else if (button == button3) {
			messageText.setText(null);
		}
		else if (button == button4) {
			messageText.setText(null);
		}
		else if (button == button5) {
			messageText.setText(null);
		}
		else if (button == button6) {
			messageText.setText(null);
		}
		else if (button == button7) {
			messageText.setText(null);
		}
		//by exiting(not hovering over the 8th button, the text for the regular part of the game appear.
		else if (button == button8) {
			if (luckyUnlocked == true) {
			button5.setText("Lucky");
			}
			if (bastardUnlocked == true) {
			button6.setText("Bastard");
			}
			if (feverUnlocked == true) {
			button7.setText("Fever");
			}
			messageText.setText(null);
			
		}
		
	}
	
	}
	

}

