package ro.ase.csie.cts.g1074.seminar10.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Model3D implements Cloneable {
	
	String fisierResurse;
	String numeModel;
	ArrayList<Integer> puncteModel = new ArrayList<>();
	
	public Model3D(String fisier, String nume) {
		System.out.println("Incarcare model din " + fisier);
		this.numeModel = nume;
		this.fisierResurse = fisier;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Random random = new Random();
		
		//generare puncte
		for(int i = 0; i < 1000; i++) {
			this.puncteModel.add(random.nextInt(1000));
		}
		
	}
	
	private Model3D() {
		
	}
	
	public Object clone() {
		Model3D copie = new Model3D();
		copie.fisierResurse = this.fisierResurse;
		copie.numeModel = this.numeModel;
		copie.puncteModel = (ArrayList<Integer>) this.puncteModel.clone();
		return copie;
	}
	
}
