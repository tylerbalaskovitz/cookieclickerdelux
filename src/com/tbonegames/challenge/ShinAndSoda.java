package com.tbonegames.challenge;

import java.io.Serializable;

import com.tbonegames.ClientMain;
import com.tbonegames.armor.DeadArmor;
import com.tbonegames.buffs.BastardStopwatch;
import com.tbonegames.buffs.DeadBuff;
import com.tbonegames.cards.DeadCard;
import com.tbonegames.cards.ShinChan;
import com.tbonegames.items.BastardCola;
import com.tbonegames.items.DeadItem;
import com.tbonegames.weapons.BastardBrassKnuckles;
import com.tbonegames.weapons.DeadWeapon;

public class ShinAndSoda extends Challenges implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	public ShinAndSoda() {
		
			challengeName = "Shin and Soda";
			
			challengeDescription = "";
			
			completed = false;
	}
		
		public void combatChallenge(ClientMain cMain) {
		
		}
		
		public void menuChallenge(ClientMain cMain) {
			
			cMain.challengeMode.noBurnSwitch = true;
			cMain.itemInventory.cards[0] = new ShinChan();
			cMain.itemInventory.cards[1] = new DeadCard();
			cMain.itemInventory.cards[2] = new DeadCard();
			cMain.itemInventory.cards[3] = new DeadCard();
			
			
			cMain.itemInventory.items[0] = new BastardCola();
			cMain.itemInventory.items[1] = new DeadItem();
			cMain.itemInventory.items[2] = new DeadItem();
			cMain.itemInventory.items[3] = new DeadItem();
			cMain.itemInventory.items[4] = new DeadItem();
			
			
			cMain.itemInventory.weapons[0] = new BastardBrassKnuckles();
			cMain.itemInventory.weapons[1] = new DeadWeapon();
			cMain.itemInventory.weapons[2] = new DeadWeapon();
			cMain.itemInventory.weapons[3] = new DeadWeapon();
			cMain.itemInventory.weapons[4] = new DeadWeapon();
			
			cMain.itemInventory.armor[0] = new DeadArmor();
			cMain.itemInventory.armor[1] = new DeadArmor();
			cMain.itemInventory.armor[2] = new DeadArmor();
			cMain.itemInventory.armor[3] = new DeadArmor();
			cMain.itemInventory.armor[4] = new DeadArmor();
			
			cMain.itemInventory.buffs[0] = new BastardStopwatch();
			cMain.itemInventory.buffs[1] = new DeadBuff();
			cMain.itemInventory.buffs[2] = new DeadBuff();
			cMain.itemInventory.buffs[3] = new DeadBuff();
			cMain.itemInventory.buffs[4] = new DeadBuff();
			
		}
	
	
}
