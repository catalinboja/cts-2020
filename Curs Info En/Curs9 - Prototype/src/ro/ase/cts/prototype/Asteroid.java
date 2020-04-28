package ro.ase.cts.prototype;

import java.util.ArrayList;

public class Asteroid extends Model3D{

	public Asteroid(){
		System.out.println("Incarcare model 3D pentru Asteroid ....");
		poligoane = new ArrayList<>(50);
		this.tip = "Asteroid";
	}
	
	@Override
	void draw() {
		System.out.println("Obiect 3D de tip "+this.tip);
	}

}
