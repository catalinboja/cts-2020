package ro.ase.cts.prototype;

import java.util.ArrayList;

public class Asteroid extends Model3D{

	public Asteroid(){
		System.out.println("Incarcare model 3D pentru Asteroid ....");
		poligoane = new ArrayList<>(50);
		this.tip = "Asteroid";
	}
	
	public Asteroid(String tip){
		super(tip);
		System.out.println("Incarcare model 3D pentru Asteroid ....");
		poligoane = new ArrayList<>(50);
		this.tip = tip;
	}
	
	@Override
	void draw() {
		System.out.println("Obiect 3D de tip "+this.tip);
	}
	
	@Override
	public Object clone() {
		Asteroid clona = new Asteroid();
		clona.tip = this.tip;
		clona.id = this.id;
		clona.poligoane = (ArrayList<Object>) this.poligoane.clone();
		return clona;
	}

}
