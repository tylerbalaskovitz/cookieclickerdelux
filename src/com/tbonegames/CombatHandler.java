package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;


public class CombatHandler implements ActionListener, Serializable{
	final static long serialVersionUID = -1404202925519361557L;
	Combat combat;
	ClientMain cMain;
	
	CombatHandler(ClientMain cMain, Combat combat){
		this.cMain = cMain;
		this.combat = combat;
	}
	
	String combatSelection;
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		String combatSelect = event.getActionCommand();
		
		switch (combatSelect) {
		case "Return":
			combat.fight();
			break;
		case "Buff0":
			cMain.numberOfActions = cMain.itemInventory.buffs[0].turnBoost(cMain.numberOfActions, cMain.itemInventory.buffs[0].actionIncrease);
			cMain.itemInventory.buffs[0].debuff(cMain.disableAttacksCounter, cMain.disableBlocksCounter, cMain.disableItemsCounter, cMain.disableBuffsCounter);
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.itemInventory.buffs[0].currentAmount -= 1;
			cMain.itemInventory.buffs[0].combatSpecial(cMain);
			combat.playerBuffResult(cMain.itemInventory.buffs[0].buffName);
			break;
		case "Buff1":
			cMain.numberOfActions = cMain.itemInventory.buffs[1].turnBoost(cMain.numberOfActions, cMain.itemInventory.buffs[1].actionIncrease);
			cMain.itemInventory.buffs[1].debuff(cMain.disableAttacksCounter, cMain.disableBlocksCounter, cMain.disableItemsCounter, cMain.disableBuffsCounter);
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.itemInventory.buffs[1].currentAmount -= 1;
			cMain.itemInventory.buffs[1].combatSpecial(cMain);
			combat.playerBuffResult(cMain.itemInventory.buffs[1].buffName);
			break;
		case "Buff2":
			cMain.numberOfActions = cMain.itemInventory.buffs[2].turnBoost(cMain.numberOfActions, cMain.itemInventory.buffs[2].actionIncrease);
			cMain.itemInventory.buffs[2].debuff(cMain.disableAttacksCounter, cMain.disableBlocksCounter, cMain.disableItemsCounter, cMain.disableBuffsCounter);
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.itemInventory.buffs[2].currentAmount -= 1;
			cMain.itemInventory.buffs[2].combatSpecial(cMain);
			combat.playerBuffResult(cMain.itemInventory.buffs[2].buffName);
			break;
		case "Buff3":
			cMain.numberOfActions = cMain.itemInventory.buffs[3].turnBoost(cMain.numberOfActions, cMain.itemInventory.buffs[3].actionIncrease);
			cMain.itemInventory.buffs[3].debuff(cMain.disableAttacksCounter, cMain.disableBlocksCounter, cMain.disableItemsCounter, cMain.disableBuffsCounter);
			
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.itemInventory.buffs[3].currentAmount -= 1;
			cMain.itemInventory.buffs[3].combatSpecial(cMain);
			combat.playerBuffResult(cMain.itemInventory.buffs[3].buffName);
			
			break;
		case "Attack":
			combat.playerAttackChoices();
			break;
		case "Defend":
			combat.playerDefendChoices();
			break;
		case "Item":
			combat.itemChoices();
			break;
		case "Buffs":
			combat.buffChoices();
			break;
		case "Normal":
			cMain.healingMultiplierHandler = "Normal";
			
			//these need sound effects for when they're clicked on. 
			setBoldness();
			break;
		case "Extra":
			cMain.healingMultiplierHandler = "Extra";
			setBoldness();
			break;
		case "Bastardly":
			cMain.healingMultiplierHandler = "Bastardly";
			setBoldness();
			break;
		case "BastardFists":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "BastardFists";
			cMain.playerDamage = combat.calculateDamage(0, 0);
			cMain.playerAttackBonus = combat.calculateBonus(cMain.playerDamage);
			cMain.playerRecoil = combat.calculateRecoil(cMain.extraAttackRecoil, cMain.bastardlyAttackRecoil, cMain.healingMultiplierHandler);
			cMain.logosCounter-= cMain.playerRecoil;
			combat.playerAttackResult("Bastard Fists", cMain.playerDamage, cMain.playerAttackBonus, cMain.playerRecoil);
			break;
		case "Attack0":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "Attack0";
			cMain.combat.weaponSpecialAttack(cMain.itemInventory.weapons[0]);
			cMain.playerDamage = combat.calculateDamage(cMain.itemInventory.weapons[0].weaponMultiplier, cMain.itemInventory.weapons[0].totalAmountPurchased);
			cMain.playerAttackBonus = combat.calculateBonus(cMain.playerDamage);
			cMain.playerRecoil = combat.calculateRecoil(cMain.extraAttackRecoil, cMain.bastardlyAttackRecoil, cMain.healingMultiplierHandler);
			cMain.logosCounter-= cMain.playerRecoil;
			cMain.itemInventory.weapons[0].combatSpecial(cMain);
			combat.playerAttackResult(cMain.itemInventory.weapons[0].weaponName, cMain.playerDamage, cMain.playerAttackBonus, cMain.playerRecoil);
			break;
		case "Attack1":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "Attack1";
			cMain.combat.weaponSpecialAttack(cMain.itemInventory.weapons[1]);
			cMain.playerDamage = combat.calculateDamage(cMain.itemInventory.weapons[1].weaponMultiplier, cMain.itemInventory.weapons[1].totalAmountPurchased);
			cMain.playerAttackBonus = combat.calculateBonus(cMain.playerDamage);
			cMain.playerRecoil = combat.calculateRecoil(cMain.extraAttackRecoil, cMain.bastardlyAttackRecoil, cMain.healingMultiplierHandler);
			cMain.logosCounter-= cMain.playerRecoil;
			 combat.playerAttackResult(cMain.itemInventory.weapons[1].weaponName, cMain.playerDamage, cMain.playerAttackBonus, cMain.playerRecoil);
			break;
		case "Attack2":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "Attack2";
			cMain.combat.weaponSpecialAttack(cMain.itemInventory.weapons[2]);
			cMain.playerDamage = combat.calculateDamage(cMain.itemInventory.weapons[2].weaponMultiplier, cMain.itemInventory.weapons[2].totalAmountPurchased);
			cMain.playerAttackBonus = combat.calculateBonus(cMain.playerDamage);
			cMain.playerRecoil = combat.calculateRecoil(cMain.extraAttackRecoil, cMain.bastardlyAttackRecoil, cMain.healingMultiplierHandler);
			cMain.logosCounter-= cMain.playerRecoil;
			cMain.itemInventory.weapons[2].combatSpecial(cMain);
			combat.playerAttackResult(cMain.itemInventory.weapons[2].weaponName, cMain.playerDamage, cMain.playerAttackBonus, cMain.playerRecoil);
		case "Attack3":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "Attack3";
			cMain.combat.weaponSpecialAttack(cMain.itemInventory.weapons[3]);
			cMain.playerDamage = combat.calculateDamage(cMain.itemInventory.weapons[3].weaponMultiplier, cMain.itemInventory.weapons[3].totalAmountPurchased);
			cMain.playerAttackBonus = combat.calculateBonus(cMain.playerDamage);
			cMain.logosCounter-= combat.calculateRecoil(cMain.extraAttackRecoil, cMain.bastardlyAttackRecoil, cMain.healingMultiplierHandler);
			cMain.logosCounter-=cMain.playerRecoil;
			cMain.itemInventory.weapons[3].combatSpecial(cMain);
			combat.playerAttackResult(cMain.itemInventory.weapons[3].weaponName, cMain.playerDamage, cMain.playerAttackBonus, cMain.playerRecoil);
			break;
		case "Defend0":
			cMain.blockValue += cMain.itemInventory.armor[0].defenseValue + cMain.blockValueBonus;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.itemInventory.armor[0].combatSpecial(cMain);
			combat.playerDefendResult();
			break;
		case "Defend1":
			cMain.blockValue += cMain.itemInventory.armor[1].defenseValue + cMain.blockValueBonus;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.itemInventory.armor[1].combatSpecial(cMain);
			combat.playerDefendResult();
			break;
		case "Defend2":
			cMain.blockValue += cMain.itemInventory.armor[2].defenseValue + cMain.blockValueBonus;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.itemInventory.armor[2].combatSpecial(cMain);
			combat.playerDefendResult();
			break;
		case "Defend3":
			cMain.blockValue += cMain.itemInventory.armor[3].defenseValue+ cMain.blockValueBonus;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.itemInventory.armor[3].combatSpecial(cMain);
			combat.playerDefendResult();
			break;
		case "Item0":
			cMain.selectedItemValue = cMain.itemInventory.items[0].totalCurrentAmount;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.healingMultiplier = cMain.itemInventory.items[0].calculateHealing(cMain.healingMultiplierHandler, cMain.itemInventory.items[0].totalCurrentAmount);
			cMain.logosCounter=combat.healSelf(cMain.itemInventory.items[0].totalCurrentAmount, cMain.itemInventory.items[0].healValue, cMain.healingMultiplier, cMain.healingMultiplierHandler);
			cMain.itemInventory.items[0].totalCurrentAmount -= cMain.healingMultiplier;
			cMain.itemInventory.items[0].combatSpecial(cMain);
			combat.playerHealResult(cMain.itemInventory.items[0].itemName, cMain.healingMultiplierHandler);
			break;
		case "Item1":
			cMain.selectedItemValue = cMain.itemInventory.items[1].totalCurrentAmount;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.healingMultiplier = cMain.itemInventory.items[1].calculateHealing(cMain.healingMultiplierHandler, cMain.itemInventory.items[1].totalCurrentAmount);
			cMain.logosCounter=combat.healSelf(cMain.itemInventory.items[1].totalCurrentAmount, cMain.itemInventory.items[1].healValue, cMain.healingMultiplier, cMain.healingMultiplierHandler);
			cMain.itemInventory.items[1].totalCurrentAmount -= cMain.healingMultiplier;
			cMain.itemInventory.items[1].combatSpecial(cMain);
			combat.playerHealResult(cMain.itemInventory.items[1].itemName, cMain.healingMultiplierHandler);
			break;
		case "Item2":
			cMain.selectedItemValue = cMain.itemInventory.items[2].totalCurrentAmount;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.healingMultiplier = cMain.itemInventory.items[2].calculateHealing(cMain.healingMultiplierHandler, cMain.itemInventory.items[2].totalCurrentAmount);
			cMain.logosCounter=combat.healSelf(cMain.itemInventory.items[2].totalCurrentAmount, cMain.itemInventory.items[2].healValue, cMain.healingMultiplier, cMain.healingMultiplierHandler);
			cMain.itemInventory.items[2].totalCurrentAmount -= cMain.healingMultiplier;
			cMain.itemInventory.items[2].combatSpecial(cMain);
			combat.playerHealResult(cMain.itemInventory.items[2].itemName, cMain.healingMultiplierHandler);
			break;
		case "Item3":
			cMain.selectedItemValue = cMain.itemInventory.items[3].totalCurrentAmount;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.healingMultiplier = cMain.itemInventory.items[3].calculateHealing(cMain.healingMultiplierHandler, cMain.itemInventory.items[3].totalCurrentAmount);
			cMain.logosCounter=combat.healSelf(cMain.itemInventory.items[3].totalCurrentAmount, cMain.itemInventory.items[3].healValue, cMain.healingMultiplier, cMain.healingMultiplierHandler);
			cMain.itemInventory.items[3].totalCurrentAmount -= cMain.healingMultiplier;
			cMain.itemInventory.items[3].combatSpecial(cMain);
			combat.playerHealResult(cMain.itemInventory.items[3].itemName, cMain.healingMultiplierHandler);
			break;
		case "EnemyTurn":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			combat.enemyAttack();
			break;
		case "ContinueBattle":
			if (cMain.blocksDisabled == false) {
			cMain.blockValue = 0;
			}
			cMain.numberOfActions = cMain.baseNumberOfActions;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			combat.fight();
			combat.gameOver();
			break;
		case "Victory":
			combat.calculateDisables(cMain.enemy.attackDisableCounter, cMain.enemy.blockDisableCounter, cMain.enemy.itemDisableCounter, cMain.enemy.buffsDisableCounter);
			cMain.ui.closeAllPanels();
			cMain.ui.displayMainGame();
			break;
		case "GameOver":
			combat.calculateDisables(cMain.enemy.attackDisableCounter, cMain.enemy.blockDisableCounter, cMain.enemy.itemDisableCounter, cMain.enemy.buffsDisableCounter);
			cMain.window.setVisible(false);
			cMain.soundFX.stop(cMain.soundFXValues.backgroundmusic);
			new ClientMain();
			break;
			
			//Action Bastard Movies
		
			
		
		
		}
		
	}

	public void setBoldness() {
		switch (cMain.healingMultiplierHandler) {
		case "Normal":
			cMain.multiplierButton1.setFont(cMain.font3Bold);
			cMain.multiplierButton2.setFont(cMain.font3);
			cMain.multiplierButton3.setFont(cMain.font3);
			break;
		case "Extra":
			cMain.multiplierButton1.setFont(cMain.font3);
			cMain.multiplierButton2.setFont(cMain.font3Bold);
			cMain.multiplierButton3.setFont(cMain.font3);
			break;
		case "Bastardly":
			cMain.multiplierButton1.setFont(cMain.font3);
			cMain.multiplierButton2.setFont(cMain.font3);
			cMain.multiplierButton3.setFont(cMain.font3Bold);
			break;
		}
	}
	
	
}
