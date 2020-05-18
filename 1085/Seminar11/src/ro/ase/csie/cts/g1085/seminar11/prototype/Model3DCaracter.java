package ro.ase.csie.cts.g1085.seminar11.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Model3DCaracter implements Cloneable {
	
	String nume;
	String fisierModel;
	
	ArrayList<Integer> puncte;

	public Model3DCaracter(String nume, String fisierModel) {
		super();
		this.nume = nume;
		this.fisierModel = fisierModel;
		
		puncte = new ArrayList<>();
		
		System.out.println("Se incarca modelul 3d pentru " + nume);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Random random  = new Random();
		for(int i = 0; i < random.nextInt(1000); i++) {
			puncte.add(random.nextInt(500));
		}
		System.out.println("Model incarcat");
	}
	
	private Model3DCaracter() {
		nume = "";
		fisierModel = "";
		puncte = null;
	}
	
	

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getFisierModel() {
		return fisierModel;
	}

	public void setFisierModel(String fisierModel) {
		this.fisierModel = fisierModel;
	}

	@Override
	public Object clone(){
		//NU asa
		/*	Model3DCaracter copia = 
				new Model3DCaracter(this.nume, this.fisierModel);*/
		
		Model3DCaracter copie = 
				new Model3DCaracter();
		copie.nume = this.nume;
		copie.fisierModel = this.fisierModel;
		copie.puncte = (ArrayList<Integer>) this.puncte.clone();
		
		return copie;
	}
	
	
}
