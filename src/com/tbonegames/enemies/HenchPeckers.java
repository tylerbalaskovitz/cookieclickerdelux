package com.tbonegames.enemies;

public class HenchPeckers extends Enemies{

	public HenchPeckers() {
		
			name = "Hench Peckers";
			hp = 140000;
			attack = 2200;
			defense = 20;
			dodge = 10;
			
			attackDisableCounter = 0;
			blockDisableCounter = 0;
			itemDisableCounter = 0;
			buffsDisableCounter = 0;
			
			attack1 = "Off Season Ice Dancer";
			attack1Command = "IceDance";
			attack1Damage = 4000;
			attack1Chance = 0;
			
			//full disable
			attack2 = "Pull off the Costume";
			attack2Command = "Costume";
			attack2Damage = 2000;
			attack2Chance = 2;
			
			attack3 = "Hench Pecking";
			attack3Command = "HenchPeck";
			attack3Damage = 6000;
			attack3Chance = 4;
			
			attack4 = "Drill a Hole with my mouth, I mean beak Beak";
			attack4Command = "DrillHole";
			attack4Damage = 20000;
			attack4Chance = 8;
			specialMessage = "";
		}
		
		
		
		public void special1() {
			
		}

		public void special2() {
			
		}
		
		public void special3() {
			
		}
		
		public void special4() {
			
		}
}
