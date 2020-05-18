package ro.ase.csie.cts.g1092.seminar12;

import ro.ase.csie.cts.g1092.seminar12.composite.GameCharacter;
import ro.ase.csie.cts.g1092.seminar12.composite.Group;
import ro.ase.csie.cts.g1092.seminar12.facade.CaracterJoc;
import ro.ase.csie.cts.g1092.seminar12.facade.ConexiuneBazaDate;
import ro.ase.csie.cts.g1092.seminar12.facade.ForumJoc;
import ro.ase.csie.cts.g1092.seminar12.facade.GameApiFacade;
import ro.ase.csie.cts.g1092.seminar12.facade.Login;
import ro.ase.csie.cts.g1092.seminar12.facade.Profil;
import ro.ase.csie.cts.g1092.seminar12.proxy.LoginInterface;
import ro.ase.csie.cts.g1092.seminar12.proxy.LoginModule;
import ro.ase.csie.cts.g1092.seminar12.proxy.LoginProxy;

public class TestGameClient {
	
	public static void main(String[] args) {
		
		//access the forum
		ConexiuneBazaDate connection = new ConexiuneBazaDate();
		connection.connect();
		Login login = new Login();
		login.login("player", "1234");
		Profil profile = new Profil();
		ForumJoc forum = new ForumJoc();
		connection.disconnect();
		
		//get the character settings
		ConexiuneBazaDate connection2 = new ConexiuneBazaDate();
		connection2.connect();
		Login login2 = new Login();
		login2.login("player", "1234");
		CaracterJoc character = new CaracterJoc();
		connection2.disconnect();
		
		
		//with Facade
		GameApiFacade.accessForum();
		GameApiFacade gameApi = new GameApiFacade("127.0.0.1", "user = root; pass = 1234");
		gameApi.getCharacterSettings();
		
		//composite
		GameCharacter superman = new GameCharacter("superman");
		GameCharacter batman = new GameCharacter("batman");
		Group groupRed = new Group("Team Red");
		groupRed.addNode(batman);
		groupRed.addNode(superman);
		
		Group team =  new Group("Teams");
		team.addNode(groupRed);
		team.addNode(new GameCharacter("Catwoman"));
		
		team.attack("Joker");
		team.defend();
		team.getNode(1).attack("Joker");
		
		
		//Proxy
		String[] dictionary = new String[] {"123456", "root", "admin","1234", "p1234","1234p"};
		
		LoginInterface loginModule = new LoginModule();
		LoginInterface proxyLogin = new LoginProxy(loginModule);
		
	
		for(String pass : dictionary) {
			System.out.println("Try with " + pass);
			if(proxyLogin.login("playerOne", pass)) {
				System.out.println("Found it !!!");
				System.out.println("Is " + pass);
				break;
			}
		}
		
	}

}
