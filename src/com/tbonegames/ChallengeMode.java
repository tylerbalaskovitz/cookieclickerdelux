package com.tbonegames;

import com.tbonegames.armor.BastardBoots;
import com.tbonegames.armor.BastardGloves;
import com.tbonegames.armor.DeadArmor;
import com.tbonegames.buffs.BastardStopwatch;
import com.tbonegames.buffs.DeadBuff;
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

public class ChallengeMode {
	
	ClientMain cMain;
	boolean noBurnSwitch, savesDisabled;
	
	public ChallengeMode(ClientMain cMain) {
		this.cMain = cMain;
	}
	
	public void noBurnSwitchChallenge(){
		noBurnSwitch = true;
	}
	
	public void enemyDoubleDamage() {
		cMain.enemy.attack *= 2;
		cMain.enemy.attack1Damage *= 2;
		cMain.enemy.attack2Damage *= 2;
		cMain.enemy.attack3Damage *= 2;
		cMain.enemy.attack4Damage *= 2;
	}
	
	public void doubleTroubleChallenge() {
		cMain.enemy.hp *= 2;
	}
	
	public void lifeIsShortChallenge() {
		cMain.dayPerSecond = .11;
	}
	
	public void BlitzkriegChallenge() {
		cMain.dayPerSecond = .13;
		cMain.enemy.hp *= 2;
		cMain.enemy.attack *= 2;
		cMain.enemy.attack1Damage *= 2;
		cMain.enemy.attack2Damage *= 2;
		cMain.enemy.attack3Damage *= 2;
		cMain.enemy.attack4Damage *= 2;
	}
	
	public void cheapBastardChallenge() {
		noBurnSwitch = true;
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
		cMain.itemInventory.buffs[1] = new DeadBuff();
		cMain.itemInventory.buffs[2] = new DeadBuff();
		cMain.itemInventory.buffs[3] = new DeadBuff();;
		cMain.itemInventory.buffs[4] = new DeadBuff();
		
	}
	
	public void stopWatchFree() {
		cMain.itemInventory.buffs[0] = new DeadBuff();
	}
	
	public void inflationChallenge() {
		for (int i = 0; i < 10; i++) {
		cMain.itemInventory.armor[i].armorPrice *=2;
		cMain.itemInventory.armor[i].armorPriceIncrease *=2;
		cMain.itemInventory.armor[i].unlockAmount *=2;
		
		cMain.itemInventory.buffs[i].buffPrice *=2;
		cMain.itemInventory.buffs[i].buffPriceIncrease *=2;
		cMain.itemInventory.buffs[i].unlockAmount *=2;
		
		cMain.itemInventory.items[i].itemPrice *=2;
		cMain.itemInventory.items[i].itemPriceIncrease *=2;
		cMain.itemInventory.items[i].unlockAmount *=2;

		cMain.itemInventory.weapons[i].weaponPrice *=2;
		cMain.itemInventory.weapons[i].rateOfIncrease *=2;
		cMain.itemInventory.weapons[i].unlockAmount *=2;
		}
	}
	
	
	public void marathonModeChallenge() {
		savesDisabled = true;
	}
	
	public void shinAndSodaChallenge() {
		noBurnSwitch = true;
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
