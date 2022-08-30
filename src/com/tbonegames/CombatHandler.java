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
			break;
		case "Party":
			combat.partyChoices();
			break;
		case "BastardFists":
			cMain.combatAttackingItem = "Fists";
			combat.playerAttackResult();
			break;
		case "BastardRod":
			cMain.combatAttackingItem = "BastardRod";
			combat.playerAttackResult();
			break;
		case "BastardBelt":
			cMain.combatAttackingItem = "BastardBelt";
			combat.playerAttackResult();
			break;
		case "BastardMask":
			cMain.combatAttackingItem = "BastardMask";
			combat.playerAttackResult();
			break;
		case "BastardArmor":
			break;
		case "BastardSausage":
			break;
		case "BastardCola":
			break;
		case "EnemyTurn":
			combat.enemyAttack();
			break;
		case "ContinueBattle":
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
