package ro.ase.csie.cts.g1084.seminar11;

import java.util.ArrayList;
import java.util.Arrays;

import ro.ase.csie.cts.g1084.seminar11.proxy.InterfataLogin;
import ro.ase.csie.cts.g1084.seminar11.proxy.Login;
import ro.ase.csie.cts.g1084.seminar11.proxy.ProxyLoginSecurizat;

public class TestClientJoc {

	public static void main(String[] args) {
		
		//Proxy
		
		//exemplu atac brute force pe contul unui jucator
		String dictionarParole[] = new String[]{"123456","1234","player1",
				"root","player11234","1234player","1234"}; 
		
		InterfataLogin login = new Login();
		int nrIncercari = 0;
		for(String parola : dictionarParole) {
			nrIncercari += 1;
			if(login.login("player1", parola)) {
				System.out.println("Parola gasita : " + parola);
				System.out.println("Numar incercari: " + nrIncercari);
				break;
			}
		}
		
		System.out.println("Sesiune terminata");
		
		
		
		InterfataLogin proxylogin = new ProxyLoginSecurizat(new Login());
		nrIncercari = 0;
		for(String parola : dictionarParole) {
			nrIncercari += 1;
			if(proxylogin.login("player1", parola)) {
				System.out.println("Parola gasita : " + parola);
				System.out.println("Numar incercari: " + nrIncercari);
				break;
			}
		}
		
		System.out.println("Sesiune terminata");
		
		
		//Facade
		//actiuni pentru a accesa forumul
		ConexiuneBazaDate conexiune = new ConexiuneBazaDate();
		conexiune.connect();
		Login modulLogin = new Login();
		modulLogin.login("test", "test");
		ForumJoc forum = new ForumJoc();
		Profil profilJucator = new Profil();
		conexiune.disconnect();
		
		//cu interfata simplificata
		FacadeAPIJoc apiJoc = new FacadeAPIJoc();
		apiJoc.accesForum();
		
		
	}

}
