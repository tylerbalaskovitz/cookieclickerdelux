package com.tbonegames.enemies;

public class HenchPeckers extends Enemies{

	public HenchPeckers() {
		
			name = "Hench Peckers";
			hp = 300;
			attack = 100;
			defense = 50;
			dodge = 10;
			
			attack1 = "Off Season Ice Dance";
			attack1Command = "IceDance";
			attack1Damage = 0;
			attack1Chance = 0;
			
			attack2 = "Pull off the Costume";
			attack2Command = "BirdShit";
			attack2Damage = 0;
			attack2Chance = 2;
			
			attack3 = "Fly";
			attack3Command = "Fly";
			attack3Damage = 0;
			attack3Chance = 4;
			
			attack4 = "ArachnoBots";
			attack4Command = "ArachnoBots";
			attack4Damage = 0;
			attack4Chance = 6;
	}
	
}
