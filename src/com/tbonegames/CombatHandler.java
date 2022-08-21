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
		case "Attack":
			combat.playerAttackChoices();
			break;
		case "Defend":
			break;
		case "Item":
			break;
		case "BastardFists":
			break;
		case "BastardRod":
			break;
		case "BastardBelt":
			break;
		case "BastardMask":
			break;
		case "BastardArmor":
			break;
		case "BastardSausage":
			break;
		case "BastardCola":
			break;
			
			//Action Bastard Movies
		
			
		
		
		}
		
	}

	
	
}
