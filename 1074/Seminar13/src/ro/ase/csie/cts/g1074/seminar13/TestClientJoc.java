package ro.ase.csie.cts.g1074.seminar13;

import java.util.Random;

import ro.ase.csie.cts.g1074.seminar13.flyweight.DetaliiAfisareEcran;
import ro.ase.csie.cts.g1074.seminar13.flyweight.FactoryFlyweight;
import ro.ase.csie.cts.g1074.seminar13.flyweight.FlyModel3D;
import ro.ase.csie.cts.g1074.seminar13.flyweight.TipModel3D;
import ro.ase.csie.cts.g1074.seminar13.observer.InterfataStareConexiuneListener;
import ro.ase.csie.cts.g1074.seminar13.observer.ModulInterfataJucator;
import ro.ase.csie.cts.g1074.seminar13.observer.ModulMonitorizareConexiune;
import ro.ase.csie.cts.g1074.seminar13.observer.ModulStareJoc;
import ro.ase.csie.cts.g1074.seminar13.strategy.InterfataCalculPuncteBonus;
import ro.ase.csie.cts.g1074.seminar13.strategy.ModulPuncteBonus;
import ro.ase.csie.cts.g1074.seminar13.strategy.StrategieFixa;
import ro.ase.csie.cts.g1074.seminar13.strategy.StrategieRandom;

public class TestClientJoc {

	public static void main(String[] args) {
		
		//Flyweight
		
/*		FlyModel3D copac1 = new FlyModel3D("copac.img", "Copac");
		FlyModel3D copac2 = new FlyModel3D("copac.img", "Copac");
		FlyModel3D copac3 = new FlyModel3D("copac.img", "Copac");*/
		
		FlyModel3D copac1 = (FlyModel3D) FactoryFlyweight.getModel(TipModel3D.COPAC);
		FlyModel3D copac2 = (FlyModel3D) FactoryFlyweight.getModel(TipModel3D.COPAC);
		FlyModel3D copac3 = (FlyModel3D) FactoryFlyweight.getModel(TipModel3D.COPAC);
		
		
		Random random = new Random();
		String[] culori = new String[] {"rosu", "verde", "albastru"};
		
		copac1.afisareEcran(new DetaliiAfisareEcran(
				random.nextInt(100), 
				random.nextInt(100),
				culori[random.nextInt(3)]));
		
		copac2.afisareEcran(new DetaliiAfisareEcran(
				random.nextInt(100), 
				random.nextInt(100),
				culori[random.nextInt(3)]));
		
		copac3.afisareEcran(new DetaliiAfisareEcran(
				random.nextInt(100), 
				random.nextInt(100),
				culori[random.nextInt(3)]));
		
		
		
		//Observer
		
		System.out.println("------------------------");
		ModulMonitorizareConexiune monitorizareConexiune = 
				new ModulMonitorizareConexiune();
		monitorizareConexiune.notificareConexiunePierduta();
		
		System.out.println("------------------------");
		ModulInterfataJucator interfata = new ModulInterfataJucator();
		ModulStareJoc stareJoc = new ModulStareJoc();
		
		monitorizareConexiune.registerObservator(interfata);
		monitorizareConexiune.registerObservator(stareJoc);
		monitorizareConexiune.notificareConexiunePierduta();
		
		System.out.println("------------------------");
		monitorizareConexiune.unregisterObservator(stareJoc);
		monitorizareConexiune.notificareConexiuneActiva();
		
		System.out.println("------------------------");
		//exemplu observator anonim
		monitorizareConexiune.registerObservator(new InterfataStareConexiuneListener() {
			
			@Override
			public void conexiunePierduta(String timestamp) {
				System.out.println("Aprinde led rosu");
				
			}
			
			@Override
			public void conexiuneActiva() {
				System.out.println("Aprinde led verde");
			}
		});
		
		monitorizareConexiune.notificareConexiunePierduta();
		
		
		//Strategy
		
		System.out.println("------------------------");
		
		ModulPuncteBonus modulBonus = new ModulPuncteBonus(new StrategieFixa());
		
		int puncte = modulBonus.getPuncteBonusJucator("Gigel", 1000);
		System.out.println("Gigel a primit " + puncte);
		
		//modificare strategie
		modulBonus.setStrategieCurenta(new StrategieRandom());
		
		puncte = modulBonus.getPuncteBonusJucator("Gigel", 1000);
		System.out.println("Gigel a primit " + puncte);
		
		
		modulBonus.setStrategieCurenta(new InterfataCalculPuncteBonus() {
			
			@Override
			public int getPuncteBonus() {
				return 10000;
			}
		});
		
		puncte = modulBonus.getPuncteBonusJucator("Gigel", 1000);
		System.out.println("Gigel a primit " + puncte);
		
	}

}
