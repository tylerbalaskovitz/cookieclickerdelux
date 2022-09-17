package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombatHandler implements ActionListener{
	
	Combat combat;
	CookieMain cMain;
	
	CombatHandler(CookieMain cMain, Combat combat){
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
			break;
		case "Buff1":
			break;
		case "Buff2":
			break;
		case "Buff3":
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
		case "MultiplierSelecter":
			combat.multiplier();
			break;
		case "NormalStrength":
			cMain.healingMultiplier = 1;
			break;
		case "ExtraStrength":
			cMain.healingMultiplier = (cMain.selectedItemValue)/2;
			break;
		case "BastardlyStrength":
			cMain.healingMultiplier = (cMain.selectedItemValue);
			break;
		case "BastardFists":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "Fists";
			combat.playerAttackResult();
			break;
		case "Attack0":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "Attack0";
			combat.playerAttackResult();
			break;
		case "Attack1":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "Attack1";
			combat.playerAttackResult();
			break;
		case "Attack2":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "Attack2";
			combat.playerAttackResult();
		case "Attack3":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "Attack3";
			combat.playerAttackResult();
			break;
		case "Defend0":
			cMain.blockValue += cMain.itemInventory.armor[0].defenseValue;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			combat.playerDefendResult();
			break;
		case "Defend1":
			cMain.blockValue += cMain.itemInventory.armor[1].defenseValue;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			combat.playerDefendResult();
			break;
		case "Defend2":
			cMain.blockValue += cMain.itemInventory.armor[2].defenseValue;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			combat.playerDefendResult();
			break;
		case "Defend3":
			cMain.blockValue += cMain.itemInventory.armor[3].defenseValue;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			combat.playerDefendResult();
			break;
		case "Item0":
			cMain.selectedItemValue = cMain.itemInventory.items[0].totalCurrentAmount;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.logosCounter=combat.healSelf(cMain.itemInventory.items[0].totalCurrentAmount, cMain.itemInventory.items[0].healValue, cMain.healingMultiplier);
			combat.playerHealResult();
			break;
		case "Item1":
			cMain.selectedItemValue = cMain.itemInventory.items[1].totalCurrentAmount;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.logosCounter=combat.healSelf(cMain.itemInventory.items[1].totalCurrentAmount, cMain.itemInventory.items[1].healValue, cMain.healingMultiplier);
			combat.playerHealResult();
			break;
		case "Item2":
			cMain.selectedItemValue = cMain.itemInventory.items[2].totalCurrentAmount;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.logosCounter=combat.healSelf(cMain.itemInventory.items[2].totalCurrentAmount, cMain.itemInventory.items[2].healValue, cMain.healingMultiplier);
			combat.playerHealResult();
			break;
		case "Item3":
			cMain.selectedItemValue = cMain.itemInventory.items[3].totalCurrentAmount;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.logosCounter=combat.healSelf(cMain.itemInventory.items[3].totalCurrentAmount, cMain.itemInventory.items[3].healValue, cMain.healingMultiplier);
			combat.playerHealResult();
			break;
		case "EnemyTurn":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			combat.enemyAttack();
			break;
		case "ContinueBattle":
			cMain.blockValue = 0;
			cMain.numberOfActions = cMain.baseNumberOfActions;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			combat.fight();
			combat.gameOver();
			break;
		case "Victory":
			cMain.ui.closeAllPanels();
			cMain.ui.displayMainGame();
			break;
		case "GameOver":
			cMain.window.setVisible(false);
			cMain.soundFX.stop(cMain.soundFXValues.backgroundmusic);
			new CookieMain();
			break;
			
			//Action Bastard Movies
		
			
		
		
		}
		
	}

	
	
}
