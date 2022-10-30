package com.tbonegames;

import java.io.Serializable;

import com.tbonegames.armor.Armor;
import com.tbonegames.armor.BastardArmor;
import com.tbonegames.armor.BastardBarricade;
import com.tbonegames.armor.BastardBoots;
import com.tbonegames.armor.BastardCzechHedgehog;
import com.tbonegames.armor.BastardGloves;
import com.tbonegames.armor.BastardMirror;
import com.tbonegames.armor.BastardMoat;
import com.tbonegames.armor.BastardShield;
import com.tbonegames.armor.BastardShoulderPads;
import com.tbonegames.armor.BastardSlotBelt;
import com.tbonegames.buffs.AttackRestore;
import com.tbonegames.buffs.BastardStopwatch;
import com.tbonegames.buffs.BuffRestore;
import com.tbonegames.buffs.Buffs;
import com.tbonegames.buffs.CompleteDebuff;
import com.tbonegames.buffs.DefendRestore;
import com.tbonegames.buffs.DoubleDamage;
import com.tbonegames.buffs.SpeedUp;
import com.tbonegames.buffs.ItemRestore;
import com.tbonegames.buffs.SlotBelt;
import com.tbonegames.buffs.SlowDown;
import com.tbonegames.cards.Cards;
import com.tbonegames.cards.Doc;
import com.tbonegames.cards.Lollipop;
import com.tbonegames.cards.ShinChan;
import com.tbonegames.cards.Whitey;
import com.tbonegames.items.BastardBrunch;
import com.tbonegames.items.BastardBuffet;
import com.tbonegames.items.BastardChips;
import com.tbonegames.items.BastardCola;
import com.tbonegames.items.BastardFruitSnacks;
import com.tbonegames.items.BastardGummies;
import com.tbonegames.items.BastardJuice;
import com.tbonegames.items.BastardNuts;
import com.tbonegames.items.BastardSausage;
import com.tbonegames.items.BastardVeganOption;
import com.tbonegames.items.Items;
import com.tbonegames.weapons.BastardBeam;
import com.tbonegames.weapons.BastardBelt;
import com.tbonegames.weapons.BastardBrassKnuckles;
import com.tbonegames.weapons.BastardKeepYourHandsOffMyHappinessCake;
import com.tbonegames.weapons.BastardMask;
import com.tbonegames.weapons.BastardNitrogenBomb;
import com.tbonegames.weapons.BastardRod;
import com.tbonegames.weapons.BastardSpikedBoots;
import com.tbonegames.weapons.BastardSword;
import com.tbonegames.weapons.BastardVibratingShaft;
import com.tbonegames.weapons.Weapons;

public class ItemInventory implements Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	
	ClientMain cMain;
	//these numbers will grow as more items come into the game. THe methods will need to be organized so that way random card matches can also occur. 
	public Armor armor[] = new Armor[10];
	public Buffs buffs[] = new Buffs[10];
	public Items items[] = new Items[10];
	public Weapons weapons[] = new Weapons[10];
	public Cards cards[] = new Cards[4];
	int burnManager [] = new int[4];
	

	//these are the options you have when attacking or doing some sort of damage to to other players
	Armor inCombatArmor[] = new Armor[4];
	Buffs inCombatBuffs[] = new Buffs[4];
	Items inCombatItems[] = new Items[4];
	Weapons inCombatWeapons[] = new Weapons[4];

	Armor armorHolder[] = new Armor[1];
	Buffs buffsHolder[] = new Buffs[1];
	Items itemsHolder[] = new Items[1];
	Weapons weaponsHolder[] = new Weapons[1];
	
	
	


	public ItemInventory(ClientMain cMain) {
		this.cMain = cMain;
		
	}
	
	public ItemInventory() {

	}

	public void startingValuesBurnManager() {
		for (int i = 0; i < 4; i ++) {
			burnManager[i] = 5;
		}
	}
	
	public void defaultCombat() {
		for (int i = 0; i < 4; i++ ) {
			inCombatArmor[i] = armor[i];
			inCombatBuffs[i] = buffs[i];
			inCombatItems[i] = items[i];
			inCombatWeapons[i] = weapons[i];
			
		}
	}
	
	public void exitCombat() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				
			if (inCombatArmor[i].idNumber == armor[j].idNumber) {
				armor[j] = inCombatArmor[i];
			}
			if (inCombatBuffs[i].idNumber == buffs[j].idNumber) {
				buffs[j] = inCombatBuffs[i];	
				}
			if (inCombatItems[i].idNumber ==items[j].idNumber) {
				items[j] = inCombatItems[i];
			}
			if (inCombatWeapons[i].idNumber == weapons[j].idNumber) {
				weapons[j] = inCombatWeapons[i];
			}
			}
		}
		
	}
	
	public void cardsInGame() {
		cards[0] = new ShinChan();
		cards[1] = new Whitey();
		cards[2] = new Lollipop();
		cards[3] = new Doc();
		
	}
	
	public void inventoryOfItems() {
		itemsInGame();
		weaponsInGame();
		armorInGame();
		buffsInGame();
		cardsInGame();
	}
	
	//this will need to be looped through to make the game work. 
	public void itemsInGame() {
		items[0] = new BastardCola();
		items[1] = new BastardSausage();
		items[2] = new BastardNuts();
		items[3] = new BastardChips();
		items[4] = new BastardJuice();
		items[5] = new BastardBrunch();
		items[6] = new BastardBuffet();
		items[7] = new BastardFruitSnacks();
		items[8] = new BastardGummies();
		items[9] = new BastardVeganOption();
				
				for (int i = 0; i < 10; i++) {
			items[i].idNumber = i;
		}
		
	}
	
	
	

	
	
	public void weaponsInGame() {
		weapons[0] = new BastardRod();		
		weapons[1] = new BastardBelt();
		weapons[2] = new BastardMask();
		weapons[3] = new BastardVibratingShaft();
		weapons[4] = new BastardNitrogenBomb();
		weapons[5] = new BastardBeam();
		weapons[6] = new BastardBrassKnuckles();
		weapons[7] = new BastardKeepYourHandsOffMyHappinessCake();
		weapons[8] = new BastardSpikedBoots();
		weapons[9] = new BastardSword();
		for (int i = 0; i < 10; i++) {
			weapons[i].idNumber = i;
		}
		
	}

	
	public void armorInGame() {
		armor[0] = new BastardGloves();
		armor[1] = new BastardBoots();
		armor[2] = new BastardShoulderPads();
		armor[3] = new BastardSlotBelt();
		armor[4] = new BastardArmor();
		armor[5] = new BastardBarricade();
		armor[6] = new BastardCzechHedgehog();
		armor[7] = new BastardMirror();
		armor[8] = new BastardMoat();
		armor[9] = new BastardShield();
		for (int i = 0; i < 10; i++) {
			armor[i].idNumber = i;
		}
	}
	

	
	public void buffsInGame() {
		
		
		buffs[0] = new BastardStopwatch();
		buffs[1] = new AttackRestore();
		buffs[2] = new DefendRestore();
		buffs[3] = new ItemRestore();
		buffs[4] = new BuffRestore();
		buffs[5] = new CompleteDebuff();
		buffs[6] = new DoubleDamage();
		buffs[7] = new SpeedUp();
		buffs[8] = new SlotBelt();
		buffs[9] = new SlowDown();
		
		for (int i = 0; i < 10; i++) {
			buffs[i].idNumber = i;
		}
	}
	

	
	

}


