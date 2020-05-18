package ro.ase.cts.g1092.seminar11;

import java.util.ArrayList;

import ro.ase.cts.g1092.seminar11.adapter.ACMECharacter;
import ro.ase.cts.g1092.seminar11.adapter.ACMECharacterInterface;
import ro.ase.cts.g1092.seminar11.adapter.Disney2AcmeAdapter;
import ro.ase.cts.g1092.seminar11.adapter.DisneyCharacter;
import ro.ase.cts.g1092.seminar11.adapter.HitAlertDecorator;
import ro.ase.cts.g1092.seminar11.adapter.LooneyToonChar;
import ro.ase.cts.g1092.seminar11.decorator.ShieldDecorator;

public class TestGameClient {

	public static void main(String[] args) {
		
		ACMECharacter hero1 = new ACMECharacter("Superman", 1000);
		
		ArrayList<ACMECharacterInterface> heroes = 
				new ArrayList<>();
		heroes.add(hero1);
		heroes.add(new ACMECharacter("Batman", 800));
		
		for(ACMECharacterInterface hero : heroes)
			hero.getDetails();
		
		
		ArrayList<DisneyCharacter> disneyHeroes = 
				new ArrayList<>();
		disneyHeroes.add(new LooneyToonChar("Tweety", 1000));
		
		DisneyCharacter tweety = new LooneyToonChar("Tweety", 1000);
		
		//use the adapter
		Disney2AcmeAdapter adapter = new Disney2AcmeAdapter(tweety);
		
		System.out.println("-------------------------");
		
		//heroes.add(tweety);
		heroes.add(adapter);
		
		for(ACMECharacterInterface hero : heroes) {
			hero.getDetails();
			hero.takeAHit(50);
			hero.heal(100);
		}
		
		
		//decorator
		ACMECharacter superman1 = new ACMECharacter("Superman", 1000);
		ACMECharacter superman2 = new ACMECharacter("Superman", 1000);
		
		ACMECharacterInterface supermanWithShield = 
				new ShieldDecorator(superman1, "Shield type 1");
		supermanWithShield.takeAHit(30);
		
		ACMECharacterInterface supermanWithALert = 
				new HitAlertDecorator(superman2);
		
		supermanWithALert.takeAHit(501);
		
		ACMECharacterInterface supermanWithAShieldAndAnAlert = 
				new HitAlertDecorator(supermanWithShield);
		
		System.out.println("-----------------------");
		supermanWithAShieldAndAnAlert.takeAHit(550);
		
	}

}
