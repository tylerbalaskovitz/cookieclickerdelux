package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JButton;

public class ShopHandler implements ActionListener, Serializable{
	final static long serialVersionUID = -1404202925519361557L;


	
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
		
		case "Item0":
			if (cMain.logosCounter>=cMain.itemInventory.items[0].itemPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.startingDamage = cMain.startingDamage + cMain.itemInventory.items[0].strengthIncrease; 
			cMain.itemInventory.items[0].totalCurrentAmount++;
			cMain.itemInventory.items[0].totalAmountPurchased++;
			cMain.startingDamage = cMain.startingDamage + cMain.itemInventory.items[0].strengthIncrease; 
			cMain.logosCounter = cMain.logosCounter - cMain.itemInventory.items[0].itemPrice;
			cMain.itemInventory.items[0].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.items[0].itemName + " \n [Price: " + cMain.itemInventory.items[0].itemPrice + "]\n [Amount: " + cMain.itemInventory.items[0].totalCurrentAmount + " ] \n " + cMain.itemInventory.items[0].itemDescription);
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Item1":
			if (cMain.logosCounter>=cMain.itemInventory.items[1].itemPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.itemInventory.items[1].totalCurrentAmount++;
				cMain.itemInventory.items[1].totalAmountPurchased++;
				cMain.startingDamage = cMain.startingDamage + cMain.itemInventory.items[1].strengthIncrease; 
				cMain.logosCounter = cMain.logosCounter - cMain.itemInventory.items[1].itemPrice;
				cMain.itemInventory.items[1].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.items[1].itemName + " \n [Price: " + cMain.itemInventory.items[1].itemPrice + "] \n [Amount: " + cMain.itemInventory.items[1].totalCurrentAmount +" ] \n  " + cMain.itemInventory.items[1].itemDescription);
			} else { 
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Item2":
			if (cMain.logosCounter>=cMain.itemInventory.items[2].itemPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.startingDamage = cMain.startingDamage + cMain.itemInventory.items[2].strengthIncrease; 
			cMain.itemInventory.items[2].totalCurrentAmount++;
			cMain.itemInventory.items[2].totalAmountPurchased++;
			cMain.logosCounter = cMain.logosCounter - cMain.itemInventory.items[2].itemPrice;
			cMain.itemInventory.items[2].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.items[2].itemName + " \n [Price: " + cMain.itemInventory.items[2].itemPrice + "]\n [Amount: " + cMain.itemInventory.items[2].totalCurrentAmount + " ] \n " + cMain.itemInventory.items[2].itemDescription);
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Item3":
			if (cMain.logosCounter>=cMain.itemInventory.items[3].itemPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.itemInventory.items[3].totalCurrentAmount++;
				cMain.itemInventory.items[3].totalAmountPurchased++;
				cMain.startingDamage = cMain.startingDamage + cMain.itemInventory.items[3].strengthIncrease; 
				cMain.logosCounter = cMain.logosCounter - cMain.itemInventory.items[3].itemPrice;
				cMain.itemInventory.items[3].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.items[3].itemName + " \n [Price: " + cMain.itemInventory.items[3].itemPrice + "] \n [Amount: " + cMain.itemInventory.items[3].totalCurrentAmount +" ] \n " + cMain.itemInventory.items[3].itemDescription);
			} else { 
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Item4":
			if (cMain.logosCounter>=cMain.itemInventory.items[4].itemPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.startingDamage = cMain.startingDamage + cMain.itemInventory.items[4].strengthIncrease; 
			cMain.itemInventory.items[4].totalCurrentAmount++;
			cMain.itemInventory.items[4].totalAmountPurchased++;
			cMain.logosCounter = cMain.logosCounter - cMain.itemInventory.items[4].itemPrice;
			cMain.itemInventory.items[4].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.items[4].itemName + " \n [Price: " + cMain.itemInventory.items[4].itemPrice + "]\n [Amount: " + cMain.itemInventory.items[4].totalCurrentAmount + " ] \n " + cMain.itemInventory.items[4].itemDescription);
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		
		
		
		case "Weapon0":
			if (cMain.itemInventory.weapons[0].unlocked==true) {
			if (cMain.logosCounter>= cMain.itemInventory.weapons[0].weaponPrice){
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				
			cMain.itemInventory.weapons[0].totalCurrentAmount++;
			cMain.itemInventory.weapons[0].totalAmountPurchased++;
			cMain.logosCounter -= cMain.itemInventory.weapons[0].weaponPrice;
			cMain.itemInventory.weapons[0].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.weapons[0].weaponName + "\n [Price: " + cMain.itemInventory.weapons[0].weaponPrice + "] \n[Amount: " + cMain.itemInventory.weapons[0].totalCurrentAmount +"] \n" + cMain.itemInventory.weapons[0].weaponDescription);
			} else  {cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);}
			}	
		break;
		case "Weapon1":
			if (cMain.itemInventory.weapons[1].unlocked==true) {
			if (cMain.logosCounter>= cMain.itemInventory.weapons[1].weaponPrice){
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.itemInventory.weapons[1].totalCurrentAmount++;
			cMain.itemInventory.weapons[1].totalAmountPurchased++;
			cMain.logosCounter -= cMain.itemInventory.weapons[1].weaponPrice;
			cMain.itemInventory.weapons[1].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.weapons[1].weaponName + "\n [Price: " + cMain.itemInventory.weapons[1].weaponPrice + "] \n[Amount: " + cMain.itemInventory.weapons[1].totalCurrentAmount +"] \n" + cMain.itemInventory.weapons[1].weaponDescription);
			} else  {cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);}
			}	
		break;
		case "Weapon2":
			if (cMain.itemInventory.weapons[2].unlocked==true) {
			if (cMain.logosCounter>= cMain.itemInventory.weapons[2].weaponPrice){
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.itemInventory.weapons[2].totalCurrentAmount++;
			cMain.itemInventory.weapons[2].totalAmountPurchased++;
			cMain.logosCounter -= cMain.itemInventory.weapons[2].weaponPrice;
			cMain.itemInventory.weapons[2].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.weapons[2].weaponName + "\n [Price: " + cMain.itemInventory.weapons[2].weaponPrice + "] \n[Amount: " + cMain.itemInventory.weapons[2].totalCurrentAmount +"] \n" + cMain.itemInventory.weapons[2].weaponDescription);
			} else  {cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);}
			}	
		break;
		case "Weapon3":
			if (cMain.itemInventory.weapons[3].unlocked==true) {
			if (cMain.logosCounter>= cMain.itemInventory.weapons[3].weaponPrice){
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.itemInventory.weapons[3].totalCurrentAmount++;
			cMain.itemInventory.weapons[3].totalAmountPurchased++;
			cMain.logosCounter -= cMain.itemInventory.weapons[3].weaponPrice;
			cMain.itemInventory.weapons[3].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.weapons[3].weaponName + "\n [Price: " + cMain.itemInventory.weapons[3].weaponPrice + "] \n[Amount: " + cMain.itemInventory.weapons[3].totalCurrentAmount +"] \n" + cMain.itemInventory.weapons[3].weaponDescription);
			} else  {cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);}
			}	
		break;
		case "Weapon4":
			if (cMain.itemInventory.weapons[4].unlocked==true) {
			if (cMain.logosCounter>= cMain.itemInventory.weapons[4].weaponPrice){
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.itemInventory.weapons[4].totalCurrentAmount++;
			cMain.itemInventory.weapons[4].totalAmountPurchased++;
			cMain.logosCounter -= cMain.itemInventory.weapons[4].weaponPrice;
			cMain.itemInventory.weapons[4].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.weapons[4].weaponName + "\n [Price: " + cMain.itemInventory.weapons[4].weaponPrice + "] \n[Amount: " + cMain.itemInventory.weapons[4].totalCurrentAmount +"] \n" + cMain.itemInventory.weapons[4].weaponDescription);
			} else  {cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);}
			}	
		break;
		case "Armor0":
			if (cMain.logosCounter >= cMain.itemInventory.armor[0].armorPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.itemInventory.armor[0].totalCurrentAmount++;
			cMain.itemInventory.armor[0].totalPurchased++;
			cMain.logosCounter -= cMain.itemInventory.armor[0].armorPrice;
			cMain.itemInventory.armor[0].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.armor[0].armorName + " \n [Price: " + cMain.itemInventory.armor[0].armorPrice + "] \n [Amount: " + cMain.itemInventory.armor[0].totalCurrentAmount +"] \n" + cMain.itemInventory.armor[0].armorDescription);
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Armor1":
			if (cMain.logosCounter >= cMain.itemInventory.armor[1].armorPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.itemInventory.armor[1].totalCurrentAmount++;
			cMain.itemInventory.armor[1].totalPurchased++;
			cMain.logosCounter -= cMain.itemInventory.armor[1].armorPrice;
			cMain.itemInventory.armor[1].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.armor[1].armorName + " \n [Price: " + cMain.itemInventory.armor[1].armorPrice + "] \n [Amount: " + cMain.itemInventory.armor[1].totalCurrentAmount +"] \n" + cMain.itemInventory.armor[1].armorDescription);
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Armor2":
			if (cMain.logosCounter >= cMain.itemInventory.armor[2].armorPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.itemInventory.armor[2].totalCurrentAmount++;
			cMain.itemInventory.armor[2].totalPurchased++;
			cMain.logosCounter -= cMain.itemInventory.armor[2].armorPrice;
			cMain.itemInventory.armor[2].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.armor[2].armorName + " \n [Price: " + cMain.itemInventory.armor[2].armorPrice + "] \n [Amount: " + cMain.itemInventory.armor[2].totalCurrentAmount +"] \n" + cMain.itemInventory.armor[2].armorDescription);
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Armor3":
			if (cMain.logosCounter >= cMain.itemInventory.armor[3].armorPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.itemInventory.armor[3].totalCurrentAmount++;
			cMain.itemInventory.armor[3].totalPurchased++;
			cMain.logosCounter -= cMain.itemInventory.armor[3].armorPrice;
			cMain.itemInventory.armor[3].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.armor[3].armorName + " \n [Price: " + cMain.itemInventory.armor[3].armorPrice + "] \n [Amount: " + cMain.itemInventory.armor[3].totalCurrentAmount +"] \n" + cMain.itemInventory.armor[3].armorDescription);
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Armor4":
			if (cMain.logosCounter >= cMain.itemInventory.armor[4].armorPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
				cMain.itemInventory.armor[4].totalCurrentAmount++;
			cMain.itemInventory.armor[4].totalPurchased++;
			cMain.logosCounter -= cMain.itemInventory.armor[4].armorPrice;
			cMain.itemInventory.armor[4].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.armor[4].armorName + " \n [Price: " + cMain.itemInventory.armor[4].armorPrice + "] \n [Amount: " + cMain.itemInventory.armor[4].totalCurrentAmount +"] \n" + cMain.itemInventory.armor[4].armorDescription);
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Buffs0":
			if (cMain.logosCounter >= cMain.itemInventory.buffs[0].buffPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.itemInventory.buffs[0].totalAmountPurchased++;
			cMain.itemInventory.buffs[0].currentAmount++;
			cMain.logosCounter -= cMain.itemInventory.buffs[0].buffPrice;
			cMain.itemInventory.buffs[0].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.buffs[0].buffName + " \n [Price: " + cMain.itemInventory.buffs[0].buffPrice + "] \n [Amount: " + cMain.itemInventory.buffs[0].currentAmount +"] \n" + cMain.itemInventory.buffs[0].buffDescription);
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Buffs1":
			if (cMain.logosCounter >= cMain.itemInventory.buffs[1].buffPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.itemInventory.buffs[1].totalAmountPurchased++;
			cMain.itemInventory.buffs[1].currentAmount++;
			cMain.logosCounter -= cMain.itemInventory.buffs[1].buffPrice;
			cMain.itemInventory.buffs[1].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.buffs[1].buffName + " \n [Price: " + cMain.itemInventory.buffs[1].buffPrice + "] \n [Amount: " + cMain.itemInventory.buffs[1].currentAmount +"] \n" + cMain.itemInventory.buffs[1].buffDescription);
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Buffs2":
			if (cMain.logosCounter >= cMain.itemInventory.buffs[2].buffPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.itemInventory.buffs[2].totalAmountPurchased++;
			cMain.itemInventory.buffs[2].currentAmount++;
			cMain.logosCounter -= cMain.itemInventory.buffs[2].buffPrice;
			cMain.itemInventory.buffs[2].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.buffs[2].buffName + " \n [Price: " + cMain.itemInventory.buffs[2].buffPrice + "] \n [Amount: " + cMain.itemInventory.buffs[2].currentAmount +"] \n" + cMain.itemInventory.buffs[2].buffDescription);
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Buffs3":
			if (cMain.logosCounter >= cMain.itemInventory.buffs[3].buffPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.itemInventory.buffs[3].totalAmountPurchased++;
			cMain.itemInventory.buffs[3].currentAmount++;
			cMain.logosCounter -= cMain.itemInventory.buffs[3].buffPrice;
			cMain.itemInventory.buffs[3].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.buffs[3].buffName + " \n [Price: " + cMain.itemInventory.buffs[3].buffPrice + "] \n [Amount: " + cMain.itemInventory.buffs[3].currentAmount +"] \n" + cMain.itemInventory.buffs[3].buffDescription);
			} else {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.error);
			}
		break;
		case "Buffs4":
			if (cMain.logosCounter >= cMain.itemInventory.buffs[4].buffPrice) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.purchase);
			cMain.itemInventory.buffs[4].totalAmountPurchased++;
			cMain.itemInventory.buffs[4].currentAmount++;
			cMain.logosCounter -= cMain.itemInventory.buffs[4].buffPrice;
			cMain.itemInventory.buffs[4].raisePrice();
			cMain.shopMessageText.setText(cMain.itemInventory.buffs[4].buffName + " \n [Price: " + cMain.itemInventory.buffs[4].buffPrice + "] \n [Amount: " + cMain.itemInventory.buffs[4].currentAmount +"] \n" + cMain.itemInventory.buffs[4].buffDescription);
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
		cMain.displayBuffsShop = true;
		
		//this needs to be updated for 
		shopButtonConfig(cMain.shopButton1, cMain.itemInventory.buffs[0].unlocked,cMain.itemInventory.buffs[0].buffName, "Buffs0");
		shopButtonConfig(cMain.shopButton2, cMain.itemInventory.buffs[1].unlocked,cMain.itemInventory.buffs[1].buffName, "Buffs1");
		shopButtonConfig(cMain.shopButton3, cMain.itemInventory.buffs[2].unlocked,cMain.itemInventory.buffs[2].buffName, "Buffs2");
		shopButtonConfig(cMain.shopButton4, cMain.itemInventory.buffs[3].unlocked,cMain.itemInventory.buffs[3].buffName, "Buffs3");
		shopButtonConfig(cMain.shopButton5, cMain.itemInventory.buffs[4].unlocked,cMain.itemInventory.buffs[4].buffName, "Buffs4");
	}
		
	public void displayWeaponsShop() {
		cMain.shopNavigationPanel.setVisible(false);
		cMain.shopPanel.setVisible(true);
		cMain.displayItemsShop = false;
		cMain.displayWeaponsShop = true;
		cMain.displayArmorShop = false;
		cMain.displayBuffsShop = false;
		
		shopButtonConfig(cMain.shopButton1, cMain.itemInventory.weapons[0].unlocked,cMain.itemInventory.weapons[0].weaponName, "Weapon0");
		shopButtonConfig(cMain.shopButton2, cMain.itemInventory.weapons[1].unlocked,cMain.itemInventory.weapons[1].weaponName, "Weapon1");
		shopButtonConfig(cMain.shopButton3, cMain.itemInventory.weapons[2].unlocked,cMain.itemInventory.weapons[2].weaponName, "Weapon2");
		shopButtonConfig(cMain.shopButton4, cMain.itemInventory.weapons[3].unlocked,cMain.itemInventory.weapons[3].weaponName, "Weapon3");
		shopButtonConfig(cMain.shopButton5, cMain.itemInventory.weapons[4].unlocked,cMain.itemInventory.weapons[4].weaponName, "Weapon4");
		
		
		
	}
	
	public void displayItemsShop() {
		cMain.displayItemsShop = true;
		cMain.displayWeaponsShop = false;
		cMain.displayArmorShop = false;
		cMain.displayBuffsShop = false;
		cMain.shopNavigationPanel.setVisible(false);
		cMain.shopPanel.setVisible(true);
		shopButtonConfig(cMain.shopButton1, cMain.itemInventory.items[0].unlocked, cMain.itemInventory.items[0].itemName, "Item0");
		shopButtonConfig(cMain.shopButton2, cMain.itemInventory.items[1].unlocked, cMain.itemInventory.items[1].itemName, "Item1");
		shopButtonConfig(cMain.shopButton3, cMain.itemInventory.items[2].unlocked, cMain.itemInventory.items[2].itemName, "Item2");
		shopButtonConfig(cMain.shopButton4, cMain.itemInventory.items[3].unlocked, cMain.itemInventory.items[3].itemName, "Item3");
		shopButtonConfig(cMain.shopButton5, cMain.itemInventory.items[4].unlocked, cMain.itemInventory.items[4].itemName, "Item4");
	}
	
	public void displayArmorShop() {
		cMain.displayItemsShop = false;
		cMain.displayWeaponsShop = false;
		cMain.displayBuffsShop = false;
		cMain.displayArmorShop = true;
		cMain.shopNavigationPanel.setVisible(false);
		cMain.shopPanel.setVisible(true);
		
		
		shopButtonConfig(cMain.shopButton1, cMain.itemInventory.armor[0].unlocked, cMain.itemInventory.armor[0].armorName, "Armor0");
		shopButtonConfig(cMain.shopButton2, cMain.itemInventory.armor[1].unlocked, cMain.itemInventory.armor[1].armorName, "Armor1");
		shopButtonConfig(cMain.shopButton3, cMain.itemInventory.armor[2].unlocked, cMain.itemInventory.armor[2].armorName, "Armor2");
		shopButtonConfig(cMain.shopButton4, cMain.itemInventory.armor[3].unlocked, cMain.itemInventory.armor[3].armorName, "Armor3");
		shopButtonConfig(cMain.shopButton5, cMain.itemInventory.armor[4].unlocked, cMain.itemInventory.armor[4].armorName, "Armor4");
		
		
		
	}
	
}
