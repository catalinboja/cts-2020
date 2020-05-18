package ro.ase.csie.cts.g1074.seminar12;

import ro.ase.csie.cts.g1074.seminar12.composite.Grup;
import ro.ase.csie.cts.g1074.seminar12.facade.CaracterJoc;
import ro.ase.csie.cts.g1074.seminar12.facade.ConexiuneBazaDate;
import ro.ase.csie.cts.g1074.seminar12.facade.FacadeAPIJoc;
import ro.ase.csie.cts.g1074.seminar12.facade.ForumJoc;
import ro.ase.csie.cts.g1074.seminar12.facade.Login;
import ro.ase.csie.cts.g1074.seminar12.facade.Profil;
import ro.ase.csie.cts.g1074.seminar12.proxy.ModulLogin;
import ro.ase.csie.cts.g1074.seminar12.proxy.ProxyModulLogin;

public class TestClientJoc {

	public static void main(String[] args) {
		
		//acces forum
		Login login = new Login();
		login.login("test", "1234");
		ForumJoc forum  = new ForumJoc();
		Profil profil = new Profil();
		ConexiuneBazaDate conexiuneBazaDate = new ConexiuneBazaDate();
		conexiuneBazaDate.connect();
		profil.display();
		conexiuneBazaDate.disconnect();
		
		//modificarea setarilor jocului
		Login login2 = new Login();
		login2.login("test", "1234");
		ConexiuneBazaDate conexiuneBazaDate2 = new ConexiuneBazaDate();
		conexiuneBazaDate2.connect();
		CaracterJoc caracter = new CaracterJoc();
		conexiuneBazaDate2.disconnect();
		
		
		//prin Facade
		FacadeAPIJoc.accesForum("test", "1234");
		FacadeAPIJoc.setariJoc("test", "1234");
		
		//Composite
		ro.ase.csie.cts.g1074.seminar12.composite.CaracterJoc superman = 
				new ro.ase.csie.cts.g1074.seminar12.composite.CaracterJoc("Superman");
		ro.ase.csie.cts.g1074.seminar12.composite.CaracterJoc batman = 
				new ro.ase.csie.cts.g1074.seminar12.composite.CaracterJoc("Batman");
		
		Grup grup = new Grup("Grup 1");
		grup.adaugaComponenta(superman);
		grup.adaugaComponenta(batman);
		
		ro.ase.csie.cts.g1074.seminar12.composite.CaracterJoc joker = 
				new ro.ase.csie.cts.g1074.seminar12.composite.CaracterJoc("Joker");
		Grup grup2 = new Grup("Grup 2");
		grup2.adaugaComponenta(joker);
		
		grup.adaugaComponenta(grup2);
		
		grup.ataca("Inamic generic");
		Grup grupGeneric = new Grup("Instanta joc");
		grupGeneric.adaugaComponenta(grup);
		grupGeneric.adaugaComponenta(grup2);
		grupGeneric.adaugaComponenta(
				new ro.ase.csie.cts.g1074.seminar12.composite.CaracterJoc("Leader grup"));
		
		
		//Proxy
		
		//fara proxy
		ModulLogin modulLogin = new ModulLogin("admin", "1234");
			
		String[] dictionarParole = new String[] {"123456", "1222", "admin", "root", "1234"};
		
		for(String parola : dictionarParole) {
			System.out.println("Incerc " + parola);
			if(modulLogin.login("admin", parola))
				System.out.println("Am gasit parola");
		}
		
		//cu proxy
		ProxyModulLogin proxy  = new ProxyModulLogin(modulLogin);
		for(String parola : dictionarParole) {
			System.out.println("Incerc " + parola);
			if(proxy.login("admin", parola))
				System.out.println("Am gasit parola");
		}
		
	}

}
