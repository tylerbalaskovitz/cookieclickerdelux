package com.tbonegames;

import com.tbonegames.armor.Armor;
import com.tbonegames.buffs.Buffs;
import com.tbonegames.items.BastardChips;
import com.tbonegames.items.BastardCola;
import com.tbonegames.items.BastardJuice;
import com.tbonegames.items.BastardNuts;
import com.tbonegames.items.BastardSausage;

import com.tbonegames.items.Items;
import com.tbonegames.weapons.Weapons;

public class ItemInventory {
	
	CookieMain cMain;
	Armor armor[] = new Armor[10];
	Buffs buffs[] = new Buffs[10];
	Items items[] = new Items[10];
	Weapons weapons[] = new Weapons[10];
	


	public ItemInventory(CookieMain cMain) {
		this.cMain = cMain;
		
	}
	
	//this will need to be looped through to make the game work. 
	public void itemsInGame() {
		items[0] = new BastardCola();
		items[1] = new BastardSausage();
		items[2] = new BastardNuts();
		items[3] = new BastardChips();
		items[4] = new BastardJuice();
		
	}
	
	public void weaponsInGame() {
		
	}
	
	public void armorInGame() {
		
	}
	
	public void buffsInGame() {
		
		
		
	}
	
	

}


