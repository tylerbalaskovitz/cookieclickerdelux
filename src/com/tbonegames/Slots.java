package com.tbonegames;

import java.io.Serializable;

public class Slots implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	ClientMain cMain;
	
	public Slots(ClientMain cMain) {
		this.cMain = cMain;
	}
	
	


	public void wildCard(int wildCard) {
		switch (wildCard) {
		
		case(0):
			cMain.itemInventory.cards[3].cardPrice /= 2;
			cMain.soundFX.playSoundEffect(cMain.soundFXValues.slotWinner);
			cMain.rewardsMessage = "The cost of "+ cMain.itemInventory.cards[3].cardName +"'s have been halved!";
			break;
		case (1):
			cMain.itemInventory.cards[2].cardPrice /= 2;
			cMain.soundFX.playSoundEffect(cMain.soundFXValues.slotWinner);
			cMain.rewardsMessage = "The cost of "+ cMain.itemInventory.cards[2].cardName +"'s have been halved!";
			break;
		case (2):
			cMain.itemInventory.cards[1].cardPrice /= 2;
			cMain.soundFX.playSoundEffect(cMain.soundFXValues.slotWinner);
			cMain.rewardsMessage = "The cost of "+ cMain.itemInventory.cards[1].cardName +"'s have been halved!";
			break;
		case (3):
			cMain.itemInventory.cards[0].cardPrice /= 2;
			cMain.soundFX.playSoundEffect(cMain.soundFXValues.slotWinner);
			cMain.rewardsMessage = "The cost of "+ cMain.itemInventory.cards[0].cardName +"'s have been halved!";
			break;
			default:
			cMain.rewardsMessage = "Ya lost you little bastard!";
			break;
		}
	}
	
	public void luckyBastardFever(String slotType, int slotValue) {
		int result;
		switch (slotType) {
		case "Lucky":
			result = cMain.rand.nextInt(slotValue);
			wildCard(result);
			break;
		case "Bastard":
			result = cMain.rand.nextInt(slotValue);
			wildCard(result);
			break;
		case "Fever":
			result = cMain.rand.nextInt(slotValue);
			wildCard(result);
			break;
		case "Slots":
			
			int slot1 = cMain.rand.nextInt(slotValue);
			cMain.button5.setText(""+ slot1);
			int slot2 = cMain.rand.nextInt(slotValue);
			cMain.button6.setText(""+ slot2);
			int slot3 = cMain.rand.nextInt(slotValue);
			cMain.button7.setText(""+ slot3);
			if (slot1 == slot2 && slot1 == slot3) {
				if (slot1 == 0) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.jackpot);
					cMain.rewardsMessage = "Gain 5,000 logos!";
					cMain.logosCounter = cMain.logosCounter + 5000;
				}
				if (slot1 == 1 ) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.jackpot);
					cMain.rewardsMessage = "Gain 7,500 logos!";
					cMain.logosCounter = cMain.logosCounter + 7500;
				}
				if (slot1 == 2) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.jackpot);
					cMain.rewardsMessage = "Gain 20,000, and a counter upgrade!";
					cMain.logosCounter = cMain.logosCounter + 20000;
					cMain.counterUpgrade++;
				}
				else if (slot1 == 3) {
					cMain.soundFX.playSoundEffect(cMain.soundFXValues.jackpot);
					cMain.rewardsMessage = "Gain 50,000 Cookies, a Base Actions upgrade and counter upgrade!";
					cMain.logosCounter = cMain.logosCounter + 50000;
					cMain.baseNumberOfActions++;
					cMain.counterUpgrade++;
					
				} 
				
				cMain.messageText.setText("You're the luckiest bastard of all! You hit the jackpot! All sticker prices are 1/4 the price. " + cMain.rewardsMessage);
				cMain.itemInventory.cards[0].cardPrice /= 4;
				cMain.itemInventory.cards[1].cardPrice /= 4;
				cMain.itemInventory.cards[2].cardPrice /= 4;
				cMain.itemInventory.cards[3].cardPrice /= 4;
				cMain.luckyPrice = cMain.luckyPrice/4;
				cMain.bastardPrice = cMain.bastardPrice/4;
				cMain.feverPrice = cMain.feverPrice/4;
				
				break;
			}
			else if (slot1 == slot2 || slot2==slot3) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.slotWinner);
				luckyBastardFever("Lucky", 4);
				cMain.messageText.setText("You pulled the rod, and the results are a bit lopsided. " + cMain.rewardsMessage);
				break;
			}
			else if (slot1 == slot3) {
				cMain.soundFX.playSoundEffect(cMain.soundFXValues.slotWinner);
				luckyBastardFever("Bastard", 4);
				cMain.messageText.setText("Keep pulling that rod, you little bastard! Something good is starting to come out! " + cMain.rewardsMessage);
				break;
			} else {
				cMain.messageText.setText("Ya lost you little bastard!");
			}
			break;
		
		
		
		}
	
	
	}
}

