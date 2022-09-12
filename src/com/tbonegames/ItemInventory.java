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
	
	//these will stay the same in size but the values at each index are able to be changed.
	Armor shopArmor[] = new Armor[4];
	Buffs shopBuffs[] = new Buffs[4];
	Items shopItems[] = new Items[4];
	Weapons shopWeapons[] = new Weapons[4];
	
	//these are the options you have when attacking or doing some sort of damage to to other players
	Armor inCombatArmor[] = new Armor[2];
	Buffs inCombatBuffs[] = new Buffs[2];
	Items inCombatItems[] = new Items[2];
	Weapons inCombatWeapons[] = new Weapons[2];
	
	


	public ItemInventory(CookieMain cMain) {
		this.cMain = cMain;
		
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
		
	}
	
	public void shopItems() {
		for (int x = 0; x < 5; x++) {
		shopItems[x] = items[x];
		}
	}
	
	public void inComabatItems() {
		for (int x = 0; x < 3; x++) {
		inCombatItems[x] = shopItems[x];
		}
	}
	
	public void weaponsInGame() {
		weapons[0] = new BastardRod();
		weapons[1] = new BastardBelt();
		weapons[2] = new BastardMask();
		weapons[3] = new BastardVibratingShaft();
		weapons[4] = new BastardNitrogenBomb();
	}
	
	public void shopWeapons() {
		for (int x = 0; x < 5; x++) {
		shopWeapons[x] = weapons[x];
		}
	}
	
	public void inComabatWeapons() {
		for (int x = 0; x < 3; x++) {
		inCombatWeapons[x] = shopWeapons[x];
		}
	}
	
	
	public void armorInGame() {
		armor[0] = new BastardGloves();
		armor[1] = new BastardBoots();
		armor[2] = new BastardShoulderPads();
		armor[3] = new BastardSlotBelt();
		armor[4] = new BastardArmor();
	}
	
	public void shopArmor() {
		for (int x = 0; x < 5; x++) {
		shopArmor[x] = armor[x];
		}
	}
	
	public void inComabatArmor() {
		for (int x = 0; x < 3; x++) {
		inCombatArmor[x] = shopArmor[x];
		}
	}
	
	public void buffsInGame() {
		
		buffs[0] = new BastardStopwatch();
		buffs[1] = new AttackRestore();
		buffs[2] = new DefendRestore();
		buffs[3] = new ItemRestore();
		buffs[4] = new BastardManual();
	}
	
	public void shopBuffs() {
		for (int x = 0; x < 5; x++) {
		shopBuffs[x] = buffs[x];
		}
	}
	
	public void inComabatBuffs() {
		for (int x = 0; x < 3; x++) {
		inCombatBuffs[x] = shopBuffs[x];
		}
	}
	
	

}


