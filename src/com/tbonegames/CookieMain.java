package com.tbonegames;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class CookieMain {

	JLabel counterLabel, perSecLabel;
	JButton button1, button2, button3, button4, button5, button6, button7, button8;
	
	int cookieCounter, timerSpeed, cursorNumber, cursorPrice, grandpaNumber, grandpaPrice, slotsPrice,
	grandmaPrice, grandmaNumber, elvesPrice, elvesNumber, luckyPrice, bastardPrice, feverPrice;
	
	double perSecond;
	boolean timerOn, grandpaUnlocked, grandmaUnlocked, elvesUnlocked, luckyUnlocked, bastardUnlocked, feverUnlocked, slotsUnlocked;
	Font font1, font2;
	CookieHandler cHandler = new CookieHandler();
	Timer timer;
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
	
	public void startUpValues() {
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
	
	
	public void createUI() {
		
		JFrame window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		JPanel cookiePanel = new JPanel();
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
		
		JPanel slotPanel = new JPanel();
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
		
		JPanel counterPanel = new JPanel();
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
		
		JPanel cardPanel = new JPanel();
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
		
		JPanel itemPanel = new JPanel();
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
		
		JPanel messagePanel = new JPanel();
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
					if(cookieCounter >= 1000) {
						feverUnlocked = true;
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
						messageText.setText("Lucky: \n [Price: " + luckyPrice + "] \n Roll the dice, you lucky bastard! One of the four costs to the prices above will be halved");
						
						
						
					}
				break;
				
				case "Bastard":
					if(cookieCounter >= bastardPrice) {
						cookieCounter = cookieCounter - bastardPrice;
						bastardPrice = bastardPrice + 750;
						messageText.setText("Bastard: \n " + bastardPrice + "] \nRoll the dice, you lucky bastard! One of the three costs to the prices above will be halved");
						
						
						
					}
				break;
				
				case "Fever":
					if(cookieCounter >= feverPrice) {
						cookieCounter = cookieCounter - feverPrice;
						feverPrice = feverPrice + 1000;
						messageText.setText("Roll the dice, you lucky bastard! One of the two costs to the prices above will be halved, or quartered");
						
						
						
					}
				break;
				case "Slots":
					
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
		// TODO Auto-generated method stub
		
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
		else if (button == button8) {
			messageText.setText(null);
		}
		
	}
	
	}
	

}

