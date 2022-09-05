package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ShopHandler implements ActionListener{


	
	CookieMain cMain;
	
	public ShopHandler(CookieMain cMain) {
		this.cMain = cMain;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String action = event.getActionCommand();
		
		switch (action) {
		
		case "Weapons":
			displayWeaponsShop();
			break;
		case "Armor":
			displayArmorShop();
			break;
		case "Items":
			displayItemsShop();
			break;
		case "Buffs":
			displayBuffsShop();
			break;
		case "Return":
			displayShopNavigation();
			break;
		
		case "BastardCola":
			if (cMain.logosCounter>=cMain.colaPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.startingDamage = cMain.startingDamage +3; 
			cMain.colaValue = cMain.colaValue+ 1;
			cMain.logosCounter = cMain.logosCounter - cMain.colaPrice;
			cMain.shopMessageText.setText("Bastard Cola \n [Price: " + cMain.colaPrice + "]\n [Amount: " + cMain.colaValue + " ] \n Wet your mouth with a bastard soda ");
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "BastardSausage":
			if (cMain.logosCounter>=cMain.sausagePrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.sausageValue = cMain.sausageValue+1;
			cMain.startingDamage = cMain.startingDamage +10; 
			cMain.logosCounter = cMain.logosCounter - cMain.sausagePrice;
			cMain.shopMessageText.setText("Bastard Sausage \n [Price: " + cMain.sausagePrice + "] \n [Amount: " + cMain.sausageValue +" ] \n  Be like Action Bastard and put your mouth on a sausage. From Action Foods, if you don't buy it, you'll die");
			} else { 
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "BastardRod":
			if (cMain.logosCounter>=cMain.rodPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.rodValue = cMain.rodValue+1;
			cMain.logosCounter = cMain.logosCounter - cMain.rodPrice;
			cMain.rodPrice = cMain.rodPrice +400;
			cMain.shopMessageText.setText("Bastard Rod \n [Price: " + cMain.rodPrice + "] \n [Amount: " + cMain.rodValue +" ] \n Grab your little bastard rod and swing it at your friends and your enemies");
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "BastardBelt":
			if (cMain.logosCounter>=cMain.beltPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.beltValue = cMain.beltValue+1;
			cMain.logosCounter = cMain.logosCounter - cMain.beltPrice;
			cMain.beltPrice = cMain.beltPrice +800;
			cMain.shopMessageText.setText("Bastard Belt \n [Price: " + cMain.beltPrice + "] \n [Amount: " + cMain.beltValue +"] \n With attachment for OSHA certification");
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "BastardMask":
			if (cMain.maskUnlocked==true) {
			if (cMain.logosCounter>= cMain.maskPrice){
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.maskValue = cMain.maskValue+1;
			cMain.logosCounter = cMain.logosCounter - cMain.maskPrice;
			cMain.maskPrice = cMain.maskPrice +1600;
			cMain.shopMessageText.setText("Bastard Mask \n [Price: " + cMain.maskPrice + "] \n[Amount: " + cMain.maskValue +"] \n With attachment for OSHA certification");
			} else  {cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);}
			}	cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
		break;
		case "BastardArmor":
			if (cMain.logosCounter >= cMain.armorPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.armorValue = cMain.armorValue+1;
			cMain.logosCounter = cMain.logosCounter - cMain.armorPrice;
			cMain.armorPrice = cMain.armorPrice +2000;
			cMain.shopMessageText.setText("Lucky Bastard Fever Bastard Armor \n [Price: " + cMain.armorPrice + "] \n [Amount: " + cMain.armorValue +"] \n Lucky Bastard Fever Armor");
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;

		
		}
		
	}

	public void shopButtonConfig(JButton shopButton, boolean shopItem, String trueText, String trueHandler) {
		if (shopItem == true ) {
			shopButton.setText(trueText);
			shopButton.setActionCommand(trueHandler);
		} else {
			shopButton.setText("?");
			shopButton.setActionCommand("");
		}
		
	}
	
	public void displayShopNavigation() {
		cMain.shopPanel.setVisible(false);
		cMain.shopNavigationPanel.setVisible(true);
		
	}
	
	public void displayBuffsShop() {
		cMain.shopNavigationPanel.setVisible(false);
		cMain.shopPanel.setVisible(true);
		cMain.displayItemsShop = false;
		cMain.displayWeaponsShop = false;
		cMain.displayArmorShop = false;
		cMain.displayBuffsSHop = true;
		
		shopButtonConfig(cMain.shopButton1, cMain.stopWatchUnlocked,"Bastard Stopwatch", "BastardStopwatch");
		shopButtonConfig(cMain.shopButton2, cMain.beltUnlocked,"?", "");
		shopButtonConfig(cMain.shopButton3, cMain.maskUnlocked,"?", "");
		shopButtonConfig(cMain.shopButton4, cMain.vibratingShaftUnlocked,"?", "");
		shopButtonConfig(cMain.shopButton5, cMain.nitrogenBombUnlocked,"?", "");
	}
		
	public void displayWeaponsShop() {
		cMain.shopNavigationPanel.setVisible(false);
		cMain.shopPanel.setVisible(true);
		cMain.displayItemsShop = false;
		cMain.displayWeaponsShop = true;
		cMain.displayArmorShop = false;
		cMain.displayBuffsSHop = false;
		
		shopButtonConfig(cMain.shopButton1, cMain.rodUnlocked,"Bastard Rod", "BastardRod");
		shopButtonConfig(cMain.shopButton2, cMain.beltUnlocked,"Bastard Belt", "BastardBelt");
		shopButtonConfig(cMain.shopButton3, cMain.maskUnlocked,"Bastard Mask", "BastardMask");
		shopButtonConfig(cMain.shopButton4, cMain.vibratingShaftUnlocked,"Bastard Vibrating Shaft", "VibratingShaft");
		shopButtonConfig(cMain.shopButton5, cMain.nitrogenBombUnlocked,"Bastard Nitrogen Bomb", "NitrogenBomb");
		
		
		
	}
	
	public void displayItemsShop() {
		cMain.displayItemsShop = true;
		cMain.displayWeaponsShop = false;
		cMain.displayArmorShop = false;
		cMain.displayBuffsSHop = false;
		cMain.shopNavigationPanel.setVisible(false);
		cMain.shopPanel.setVisible(true);
		shopButtonConfig(cMain.shopButton1, cMain.colaUnlocked, "Bastard Cola", "BastardCola");
		shopButtonConfig(cMain.shopButton2, cMain.sausageUnlocked, "Bastard Sausage", "BastardSausage");
		shopButtonConfig(cMain.shopButton3, cMain.nutsUnlocked, "Bastard Nuts", "BastardNuts");
		shopButtonConfig(cMain.shopButton4, cMain.chipsUnlocked, "Bastard Chips", "BastardChips");
		shopButtonConfig(cMain.shopButton5, cMain.juiceUnlocked, "Bastard Juice", "BastardJuice");
	}
	
	public void displayArmorShop() {
		cMain.displayItemsShop = false;
		cMain.displayWeaponsShop = false;
		cMain.displayBuffsSHop = false;
		cMain.displayArmorShop = true;
		cMain.shopNavigationPanel.setVisible(false);
		cMain.shopPanel.setVisible(true);
		
		
		shopButtonConfig(cMain.shopButton1, cMain.shoulderPadsUnlocked, "Bastard Shoulder Pads", "ShoulderPads");
		shopButtonConfig(cMain.shopButton2, cMain.glovesUnlocked, "Bastard Gloves", "BastardGloves");
		shopButtonConfig(cMain.shopButton3, cMain.bootsUnlocked, "Bastard Boots", "BastardBoots");
		shopButtonConfig(cMain.shopButton4, cMain.slotBeltUnlocked, "Bastard Slot Belt", "SlotBelt");
		shopButtonConfig(cMain.shopButton5, cMain.armorUnlocked, "Bastard Armor", "BastardArmor");
		
		
		
	}
	
}
