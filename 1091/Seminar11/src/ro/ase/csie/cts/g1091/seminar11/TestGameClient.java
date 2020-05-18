package ro.ase.csie.cts.g1091.seminar11;

import java.util.ArrayList;

import ro.ase.csie.cts.g1091.seminar11.adapter.AcmeCharacter;
import ro.ase.csie.cts.g1091.seminar11.adapter.AcmeCharacterInterface;
import ro.ase.csie.cts.g1091.seminar11.adapter.AdapterDisney2Acme;
import ro.ase.csie.cts.g1091.seminar11.adapter.DisneyCharacter;
import ro.ase.csie.cts.g1091.seminar11.adapter.DisneyLooneyTune;

public class TestGameClient {

	public static void main(String[] args) {
		
		ArrayList<AcmeCharacterInterface> heroes = 
				new ArrayList<>();
		heroes.add(new AcmeCharacter("Superman", 1000));
		heroes.add(new AcmeCharacter("Batman", 1000));
		
		for(AcmeCharacterInterface hero : heroes)
		{
			System.out.println(hero.getName());
			hero.fight("Joker");
		}
		
		
		DisneyCharacter tweety = new DisneyLooneyTune("Tweety", 500);
		
		ArrayList<DisneyCharacter> disneyHeroes = 
				new ArrayList<>();
		disneyHeroes.add(new DisneyLooneyTune("Tweety", 500));
		
		//test the adapter
		//heroes.add(tweety);
		
		System.out.println("------------------------");
		
		AdapterDisney2Acme tweetyAdapter  = 
				new AdapterDisney2Acme(tweety);
		heroes.add(tweetyAdapter);
		
		for(AcmeCharacterInterface hero : heroes)
		{
			System.out.println(hero.getName());
			hero.fight("Joker");
		}
		
		//the decorator part
		AcmeCharacterInterface superman = new AcmeCharacter("Superman", 1000);
		AcmeCharacterInterface batman = new AcmeCharacter("Batman", 1000);
		
		AcmeCharacterInterface supermanWithShield = 
				new ShieldDecorator(superman, "Type 1");
		
		AcmeCharacterInterface batmanWithAlert = 
				new CriticalWoundedDecorator(batman);
		
		
		AcmeCharacterInterface  supermanWithShieldWithAlert = 
				new CriticalWoundedDecorator(supermanWithShield);
		
		supermanWithShieldWithAlert.takeAHit(500);
		System.out.println(supermanWithShieldWithAlert.getLifePoints());
		supermanWithShieldWithAlert.takeAHit(1400);
		System.out.println(supermanWithShieldWithAlert.getLifePoints());
	}

}
