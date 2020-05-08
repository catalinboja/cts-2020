package ro.ase.cts;

import ro.ase.cts.prototype.Asteroid;
import ro.ase.cts.prototype.Model3D;
import ro.ase.cts.prototype.NavaSpatiala;
import ro.ase.cts.prototype.factory.PrototypeFactory;

public class Test {

	public static void main(String[] args) {
		
		//fara Prototype
/*		Asteroid a1 = new Asteroid();
		Asteroid a2 = new Asteroid();
		Asteroid a3 = new Asteroid();*/
		
		//Prototype
		Asteroid prototipAsteroid = new Asteroid("Asteroid");
		Asteroid a1 = (Asteroid) prototipAsteroid.clone();
		Asteroid a2 = (Asteroid) prototipAsteroid.clone();
		Asteroid a3 = (Asteroid) prototipAsteroid.clone();
		
		
	}

}
