package com.tbonegames;

import com.tbonegames.armor.Armor;
import com.tbonegames.armor.BastardArmor;
import com.tbonegames.armor.BastardBoots;
import com.tbonegames.armor.BastardGloves;
import com.tbonegames.armor.BastardShoulderPads;
import com.tbonegames.armor.BastardSlotBelt;
import com.tbonegames.buffs.AttackRestore;
import com.tbonegames.buffs.BastardManual;
import com.tbonegames.buffs.BastardStopwatch;
import com.tbonegames.buffs.Buffs;
import com.tbonegames.buffs.DefendRestore;
import com.tbonegames.buffs.ItemRestore;
import com.tbonegames.items.BastardChips;
import com.tbonegames.items.BastardCola;
import com.tbonegames.items.BastardJuice;
import com.tbonegames.items.BastardNuts;
import com.tbonegames.items.BastardSausage;
import com.tbonegames.items.Items;
import com.tbonegames.weapons.BastardBelt;
import com.tbonegames.weapons.BastardMask;
import com.tbonegames.weapons.BastardNitrogenBomb;
import com.tbonegames.weapons.BastardRod;
import com.tbonegames.weapons.BastardVibratingShaft;
import com.tbonegames.weapons.Weapons;

public class ItemInventory {
	
	CookieMain cMain;
	//these numbers will grow as more items come into the game. THe methods will need to be organized so that way random card matches can also occur. 
	Armor armor[] = new Armor[5];
	Buffs buffs[] = new Buffs[5];
	Items items[] = new Items[5];
	Weapons weapons[] = new Weapons[5];
	

	//these are the options you have when attacking or doing some sort of damage to to other players
	Armor inCombatArmor[] = new Armor[4];
	Buffs inCombatBuffs[] = new Buffs[4];
	Items inCombatItems[] = new Items[4];
	Weapons inCombatWeapons[] = new Weapons[4];
	
	


	public ItemInventory(CookieMain cMain) {
		this.cMain = cMain;
		
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
	
	public void inventoryOfItems() {
		itemsInGame();
		weaponsInGame();
		armorInGame();
		buffsInGame();
	}
	
	//this will need to be looped through to make the game work. 
	public void itemsInGame() {
		items[0] = new BastardCola();
		items[1] = new BastardSausage();
		items[2] = new BastardNuts();
		items[3] = new BastardChips();
		items[4] = new BastardJuice();
	
		for (int i = 0; i < 5; i++) {
			items[i].idNumber = i;
		}
		
	}
	
	
	

	
	
	public void weaponsInGame() {
		weapons[0] = new BastardRod();		
		weapons[1] = new BastardBelt();
		weapons[2] = new BastardMask();
		weapons[3] = new BastardVibratingShaft();
		weapons[4] = new BastardNitrogenBomb();

		for (int i = 0; i < 5; i++) {
			weapons[i].idNumber = i;
		}
		
	}

	
	public void armorInGame() {
		armor[0] = new BastardGloves();
		armor[1] = new BastardBoots();
		armor[2] = new BastardShoulderPads();
		armor[3] = new BastardSlotBelt();
		armor[4] = new BastardArmor();
		
		for (int i = 0; i < 5; i++) {
			armor[i].idNumber = i;
		}
	}
	

	
	public void buffsInGame() {
		
		buffs[0] = new BastardStopwatch();
		buffs[1] = new AttackRestore();
		buffs[2] = new DefendRestore();
		buffs[3] = new ItemRestore();
		buffs[4] = new BastardManual();
		
		for (int i = 0; i < 5; i++) {
			buffs[i].idNumber = i;
		}
	}
	

	
	

}


