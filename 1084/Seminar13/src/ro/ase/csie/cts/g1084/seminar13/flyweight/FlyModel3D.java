package ro.ase.csie.cts.g1084.seminar13.flyweight;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class FlyModel3D implements InterfataFlyModel3D{
	
	//stare permanenta
	
	String fisierModel3D;
	ArrayList<Integer> puncteModel;
	String denumireModel;
	
	
	public FlyModel3D(String fisierModel3D, String denumireModel) {
		super();
		this.fisierModel3D = fisierModel3D;
		this.puncteModel = new ArrayList<>(1000);
		this.denumireModel = denumireModel;
		System.out.println("Generare obiect pentru " + denumireModel);
		System.out.println("Ocupa 1MB memorie");
	}

	@Override
	public void afisareEcranModel3D(DetaliiAfisareEcran detalii) {
		System.out.println("Afisare model " + denumireModel);
		System.out.println(
				String.format("La coordonatele %d, %d avand culoarea %s",
						detalii.X, detalii.Y, detalii.culoare));
	}

}
