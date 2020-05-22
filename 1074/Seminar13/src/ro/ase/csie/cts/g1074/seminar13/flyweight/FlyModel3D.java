package ro.ase.csie.cts.g1074.seminar13.flyweight;

import java.util.ArrayList;
import java.util.Random;

public class FlyModel3D implements InterfataFlyModel3D {
	
	//stare permanenta
	String fisierModel;
	String numeModel;
	ArrayList<Integer> puncte;

		
	public FlyModel3D(String fisierModel, String numeModel) {
		super();
		this.fisierModel = fisierModel;
		this.numeModel = numeModel;
		Random random = new Random();
		this.puncte = new ArrayList<>(random.nextInt(1000));
		System.out.println("Generare model pentru " + numeModel);
	}


	//starea temporara este data de detalii
	@Override
	public void afisareEcran(DetaliiAfisareEcran detalii) {
		System.out.println("Afisare model 3d pentru " + numeModel);
		System.out.println("Numar puncte: " + this.puncte.size());
		System.out.println(
				String.format("Coordoanate X = %d, Y = %d. Culoare = %s",
						detalii.X, detalii.Y, detalii.culoare));
	}

}
