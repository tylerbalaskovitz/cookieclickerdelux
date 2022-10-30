package com.tbonegames.challenge;

import java.io.Serializable;

import com.tbonegames.ClientMain;
import com.tbonegames.armor.BastardBoots;
import com.tbonegames.armor.BastardGloves;
import com.tbonegames.armor.DeadArmor;
import com.tbonegames.buffs.BastardStopwatch;
import com.tbonegames.buffs.DeadBuff;
import com.tbonegames.buffs.SlowDown;
import com.tbonegames.buffs.SpeedUp;
import com.tbonegames.cards.DeadCard;
import com.tbonegames.cards.ShinChan;
import com.tbonegames.cards.Whitey;
import com.tbonegames.items.BastardCola;
import com.tbonegames.items.BastardSausage;
import com.tbonegames.items.DeadItem;
import com.tbonegames.weapons.BastardBrassKnuckles;
import com.tbonegames.weapons.BastardRod;
import com.tbonegames.weapons.BastardSpikedBoots;
import com.tbonegames.weapons.DeadWeapon;

public class CheapBastard extends Challenges  implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;

	public CheapBastard(){
		challengeName = "Cheap Bastard";
		
		challengeDescription = "Only the cheapest of cheap items are available at the shop for you to buy.";
		
		completed = false;
}
	
	public void combatChallenge(ClientMain cMain) {
	}
	
	public void menuChallenge(ClientMain cMain) {
		cMain.challengeMode.noBurnSwitch = true;
		cMain.itemInventory.cards[0] = new ShinChan();
		cMain.itemInventory.cards[1] = new Whitey();
		cMain.itemInventory.cards[2] = new DeadCard();
		cMain.itemInventory.cards[3] = new DeadCard();
		
		
		cMain.itemInventory.items[0] = new BastardCola();
		cMain.itemInventory.items[1] = new BastardSausage();
		cMain.itemInventory.items[2] = new DeadItem();
		cMain.itemInventory.items[3] = new DeadItem();
		cMain.itemInventory.items[4] = new DeadItem();
		
		
		cMain.itemInventory.weapons[0] = new BastardRod();		
		cMain.itemInventory.weapons[1] = new BastardBrassKnuckles();
		cMain.itemInventory.weapons[2] = new BastardSpikedBoots();
		cMain.itemInventory.weapons[3] = new DeadWeapon();
		cMain.itemInventory.weapons[4] = new DeadWeapon();
		
		cMain.itemInventory.armor[0] = new BastardGloves();
		cMain.itemInventory.armor[1] = new BastardBoots();
		cMain.itemInventory.armor[2] = new DeadArmor();
		cMain.itemInventory.armor[3] = new DeadArmor();
		cMain.itemInventory.armor[4] = new DeadArmor();
		
		cMain.itemInventory.buffs[0] = new BastardStopwatch();
		cMain.itemInventory.buffs[1] = new SpeedUp();
		cMain.itemInventory.buffs[2] = new SlowDown();
		cMain.itemInventory.buffs[3] = new DeadBuff();
		cMain.itemInventory.buffs[4] = new DeadBuff();
	}
	
}
