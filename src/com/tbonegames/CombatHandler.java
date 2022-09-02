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
		case "ShinChan":
			break;
		case "Lollipop":
			break;
		case "Doc":
			break;
		case "Attack":
			combat.playerAttackChoices();
			break;
		case "Defend":
			break;
		case "Item":
			combat.itemChoices();
			break;
		case "Party":
			combat.partyChoices();
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
		case "BastardRod":
			
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "BastardRod";
			combat.playerAttackResult();
			break;
		case "BastardBelt":
			
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "BastardBelt";
			combat.playerAttackResult();
			break;
		case "BastardMask":
			
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			cMain.combatAttackingItem = "BastardMask";
			combat.playerAttackResult();
		case "VibratingShaft":
			break;
		case "NitrogenBomb":
			break;
		case "ShoulderPads":
			break;
		case "BastardBoots":
			break;
		case "BastardGloves":
			break;
		case "SlotBelt":
			break;
		case "BastardArmor":
			cMain.combatAttackingItem = "BastardArmor";
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			break;
		case "BastardCola":
			cMain.selectedItemValue = cMain.colaValue;
			cMain.combatAttackingItem = "BastardCola";
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			combat.healSelfCola();
			combat.playerHealResult();
			break;
		case "BastardSausage":
			cMain.selectedItemValue = cMain.colaValue;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			
			combat.healSelfSausage();
			combat.playerHealResult();
			break;
		case "BastardNuts":
			break;
		case "BastardChips":
			break;
		case "BastardJuice":
			break;
		case "EnemyTurn":
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			combat.enemyAttack();
			break;
		case "ContinueBattle":
			cMain.numberOfActions = 1;
			cMain.inCombatActionsLabel.setText("Actions: " + cMain.numberOfActions);
			combat.fight();
			combat.gameOver();
			break;
		case "RestoreAttacks":
			break;
		case "RestoreBlocks":
			break;
		case "RestoreItems":
			break;
		case "Victory":
			cMain.ui.closeAllPanels();
			cMain.ui.displayMainGame();
			break;
		case "GameOver":
			cMain.window.setVisible(false);
			cMain.soundFX.stop(cMain.backgroundmusic);
			new CookieMain();
			break;
			
			//Action Bastard Movies
		
			
		
		
		}
		
	}

	
	
}
