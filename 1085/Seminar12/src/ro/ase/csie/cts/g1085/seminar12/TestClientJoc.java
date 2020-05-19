package ro.ase.csie.cts.g1085.seminar12;

import ro.ase.csie.cts.g1085.seminar12.composite.CaracterJucator;
import ro.ase.csie.cts.g1085.seminar12.composite.Grup;
import ro.ase.csie.cts.g1085.seminar12.decorator.CaracterAbstract;
import ro.ase.csie.cts.g1085.seminar12.decorator.DecoratorAlertaRanitCritic;
import ro.ase.csie.cts.g1085.seminar12.decorator.DecoratorScut;
import ro.ase.csie.cts.g1085.seminar12.decorator.SuperErou;
import ro.ase.csie.cts.g1085.seminar12.proxy.InterfataLogin;
import ro.ase.csie.cts.g1085.seminar12.proxy.ModulLogin;
import ro.ase.csie.cts.g1085.seminar12.proxy.ProxyLogin;

public class TestClientJoc {
	
	public static void main(String[] args) {
		
		SuperErou superman = new SuperErou("Superman", 1000);
		SuperErou batman = new SuperErou("Batman", 900);
		
		
		//Decorator
		CaracterAbstract supermanCuScut = 
				new DecoratorScut(superman, "Tip II");
		CaracterAbstract batmanCuAlerta = 
				new DecoratorAlertaRanitCritic(batman);
		
		
		supermanCuScut.ataca();
		supermanCuScut.seApara(500);
		System.out.println(superman.getPuncteViata());
		
		
		batmanCuAlerta.ataca();
		batmanCuAlerta.seApara(850);
		
		CaracterAbstract supermanCuScutCuAlerta = 
				new DecoratorAlertaRanitCritic(supermanCuScut);
		
		supermanCuScutCuAlerta.seApara(1400);
		
		
		CaracterAbstract joker = 
				new SuperErou("Joker", 500);
		joker = new DecoratorScut(joker, "Tip IV");
		joker = new DecoratorAlertaRanitCritic(joker);
		
		joker.seApara(300);
		
		
		//Composite
		
		CaracterJucator Superman = new CaracterJucator("superman");
		CaracterJucator Batman = new CaracterJucator("batman");
		
		Grup echipaAlbastra = new Grup("Echipa albastra");
		echipaAlbastra.adaugaNod(Batman);
		echipaAlbastra.adaugaNod(Superman);
		
		Grup echipa = new Grup("Echipa 1");
		echipa.adaugaNod(echipaAlbastra);
		echipa.adaugaNod(new CaracterJucator("Catwoman"));
		
		echipa.ataca("Joker");
		echipa.seApara();
		echipa.getNod("Catwoman").seVindeca(100);
		
		
		//Proxy
		//InterfataLogin modulLogin = new ModulLogin();
		
		InterfataLogin modulLogin = new ProxyLogin(new ModulLogin());
		
		String[] dictionar = new String[] {
				"admin", "root", "1234", "123456","1234j"
		};
		
		for(String parola : dictionar) {
			System.out.println("Incerc parola " + parola);
			if(modulLogin.login("jucator", parola))
			{
				System.out.println("Am gasit parola. Este " + parola);
			}
		}
		
	}
	
}
