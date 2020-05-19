package ro.ase.csie.cts.g1091.seminar12;

import ro.ase.csie.cts.g1091.seminar12.composite.AbstractNode;
import ro.ase.csie.cts.g1091.seminar12.composite.GameCharacter;
import ro.ase.csie.cts.g1091.seminar12.composite.Group;
import ro.ase.csie.cts.g1091.seminar12.facade.CaracterJoc;
import ro.ase.csie.cts.g1091.seminar12.facade.ConexiuneBazaDate;
import ro.ase.csie.cts.g1091.seminar12.facade.ForumJoc;
import ro.ase.csie.cts.g1091.seminar12.facade.GameApiFacade;
import ro.ase.csie.cts.g1091.seminar12.facade.Login;
import ro.ase.csie.cts.g1091.seminar12.facade.Profil;
import ro.ase.csie.cts.g1091.seminar12.proxy.LoginInterface;
import ro.ase.csie.cts.g1091.seminar12.proxy.LoginModule;
import ro.ase.csie.cts.g1091.seminar12.proxy.LoginProxy;

public class TestGameClient {
	
	public static void main(String[] args) {
		
		//access the game forum
		ConexiuneBazaDate connection = new ConexiuneBazaDate();
		connection.connect();
		Login login = new Login();
		if(login.login("admin", "1234")) {
			ForumJoc forum = new ForumJoc();
			Profil profile = new Profil();
		}
		connection.disconnect();
		
		//check character settings
		ConexiuneBazaDate connection2 = new ConexiuneBazaDate();
		connection2.connect();
		Login login2 = new Login();
		if(login2.login("admin", "1234")) {
			CaracterJoc gameChar = new CaracterJoc();
		}
		connection2.disconnect();
		
		//Facade
		GameApiFacade.accessForum("admin", "1234");
		GameApiFacade gameApi = new GameApiFacade("admin", "1234");
		gameApi.getCharacterSettings();
		
		//Composite 
		GameCharacter superman = new GameCharacter("Superman");
		AbstractNode batman = new GameCharacter("Batman");
		
		Group teamRed = new Group("Team Red");
		teamRed.add(batman);
		teamRed.add(superman);
		
		Group team = new Group("The team");
		team.add(new GameCharacter("Catwoman"));
		team.add(teamRed);
		
		team.attack("Joker");
		team.defend();
		
		GameCharacter catwoman = (GameCharacter) team.get(0);
		catwoman.heal(100);
		
		//Proxy
		//LoginInterface loginModule = new LoginModule();
		LoginInterface loginModule = new LoginProxy(new LoginModule());
		
		String[] dictionary = new String[] {"admin", "root", "player", "1234", "player1234",
				 "1234p"};
		for(String pass : dictionary) {
			System.out.println("Trying " + pass);
			if(loginModule.login("playerone", pass))
				System.out.println("I found it ! It's " + pass);
		}
		

	
	}
}
