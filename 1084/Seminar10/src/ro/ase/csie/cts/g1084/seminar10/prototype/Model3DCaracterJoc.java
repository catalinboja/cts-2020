package ro.ase.csie.cts.g1084.seminar10.prototype;

import java.util.ArrayList;

public class Model3DCaracterJoc implements Cloneable {
	
	String nume;
	String culoare;
	ArrayList<Integer> puncteGrafice;
	
	public Model3DCaracterJoc(String fisierGrafic) {
		System.out.println("Incarcare si generare model 3D personaj");
		puncteGrafice = new ArrayList<>();
		//generez 1000 de puncte grafice
		for(int i = 0; i < 1000; i++) {
			puncteGrafice.add(i+1);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	private Model3DCaracterJoc() {
		
	}
	

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	
	
	//metoda clone
	@Override
	public Object clone() {
		Model3DCaracterJoc clona = 
				new Model3DCaracterJoc();
		clona.culoare = this.culoare;
		clona.nume = this.nume;
		clona.puncteGrafice = (ArrayList<Integer>) this.clone();
		return clona;
	}
	
}
