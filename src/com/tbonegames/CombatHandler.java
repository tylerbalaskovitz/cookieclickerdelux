package com.tbonegames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombatHandler implements ActionListener{
	
	String combatSelection;
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		String combatSelect = event.getActionCommand();
		combatSelection = combatSelect;
	}

	public void performCombat(String nextPosition) {
		
		//the switch position takes the String nextPosition as its parameter.
		switch(combatSelection) {
		
		//town switches
		
		}
		
	}
	
	
}
