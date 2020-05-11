package ro.ase.cts.g1074.seminar11;

import java.util.ArrayList;

import ro.ase.cts.g1074.seminar11.adapter.AdaptorDisney2Acme;
import ro.ase.cts.g1074.seminar11.adapter.CaracterACME;
import ro.ase.cts.g1074.seminar11.adapter.CaracterDisney;
import ro.ase.cts.g1074.seminar11.adapter.SuperErouACME;

public class TestClientJoc {
	public static void main(String[] valori) {
		
		
		SuperErouACME c1 = new SuperErouACME("Superman", 1000);
		
		ArrayList<CaracterACME> eroi = 
				new ArrayList<>();
		eroi.add(c1);
		eroi.add(new SuperErouACME("Batman", 900));
		
		for(CaracterACME caracter : eroi) {
			caracter.afisareDetalii();
			caracter.seVindeca(20);
		}
		
		CaracterDisney pluto = new CaracterDisney("Pluto", 1500);
		//eroi.add(pluto);
		
		
		//test adaptor clase
		eroi.add(new AdaptorDisney2Acme("Donald", 600));
		
		System.out.println("------------------------");
		
		for(CaracterACME caracter : eroi) {
			caracter.afisareDetalii();
			caracter.seVindeca(20);
		}
		
		
		//test decorator
		System.out.println("-----------------------------");
		CaracterACME superman1 = new SuperErouACME("Superman 1", 1000);
		CaracterACME superman2 = new SuperErouACME("Superman 2", 1000);
		
		superman1.afisareDetalii();
		superman2.afisareDetalii();
		
		CaracterACME supermanCuScut = 
				new DecoratorCuScut(superman1, "Scut tip 1");
			
		supermanCuScut.esteLovit(500);
		
		CaracterACME supermanCuAlerta = 
				new DecoratorAlertaRanitCritic(superman2);
		supermanCuAlerta.esteLovit(950);
		
		CaracterACME supermanCuScutSiAlerta = 
				new DecoratorAlertaRanitCritic(supermanCuScut);
		supermanCuScutSiAlerta.afisareDetalii();
		
	}
}
