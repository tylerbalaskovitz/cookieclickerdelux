package com.tbonegames;

import java.net.URL;

public class Slots {
	
	SoundFX soundFX = new SoundFX();
	
	public URL jackpot = getClass().getClassLoader().getResource("audio//jackpot.wav");
	public URL slotWinner = getClass().getClassLoader().getResource("audio//slotwinner.wav");
	
	CookieMain cMain;
	
	public Slots(CookieMain cMain) {
		this.cMain = cMain;
	}
	
	


	public void wildCard(int wildCard) {
		switch (wildCard) {
		
		case(0):
			cMain.elvesPrice = cMain.elvesPrice/2;
			soundFX.playSoundEffect(slotWinner);
			cMain.rewardsMessage = "The cost of elves have been halved!";
			break;
		case (1):
			cMain.grandmaPrice = cMain.grandmaPrice/2;
			soundFX.playSoundEffect(slotWinner);
			cMain.rewardsMessage = "The cost of grandmas have been halved!";
			break;
		case (2):
			cMain.grandpaPrice = cMain.grandpaPrice/2;
			soundFX.playSoundEffect(slotWinner);
			cMain.rewardsMessage = "The cost of grandpas have been halved!";
			break;
		case (3):
			cMain.cursorPrice = cMain.cursorPrice/2;
			soundFX.playSoundEffect(slotWinner);
			cMain.rewardsMessage = "The cost of cursors have been halved!";
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
				if (slot1 == 3) {
					soundFX.playSoundEffect(jackpot);
					cMain.rewardsMessage = "Gain 15,000 Cookies";
					cMain.cookieCounter = cMain.cookieCounter + 15000;
				} else {
					cMain.rewardsMessage = "Gain 5,000";
					cMain.cookieCounter = cMain.cookieCounter + 5000;
					soundFX.playSoundEffect(slotWinner);
				}
				
				cMain.messageText.setText("You're the luckiest bastard of all! You hit the jackpot! All sticker prices are 1/4 the price. " + cMain.rewardsMessage);
				cMain.cursorPrice = cMain.cursorPrice/4;
				cMain.grandpaPrice = cMain.grandpaPrice/4;
				cMain.grandmaPrice = cMain.grandmaPrice/4;
				cMain.elvesPrice = cMain.elvesPrice/4;
				cMain.luckyPrice = cMain.luckyPrice/4;
				cMain.bastardPrice = cMain.bastardPrice/4;
				cMain.feverPrice = cMain.feverPrice/4;
				
				break;
			}
			else if (slot1 == slot2 || slot2==slot3) {
				soundFX.playSoundEffect(slotWinner);
				luckyBastardFever("Lucky", 4);
				cMain.messageText.setText("You pulled the rod, and the results are a bit lopsided. " + cMain.rewardsMessage);
				break;
			}
			else if (slot1 == slot3) {
				soundFX.playSoundEffect(slotWinner);
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

