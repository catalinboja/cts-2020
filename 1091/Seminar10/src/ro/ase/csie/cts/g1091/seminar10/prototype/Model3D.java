package ro.ase.csie.cts.g1091.seminar10.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Model3D implements Cloneable{
	String fileName;
	String name;
	
	ArrayList<Integer> modelPoints = new ArrayList<>();

	public Model3D(String fileName, String name) {
		super();
		this.fileName = fileName;
		this.name = name;
		
		System.out.println("Loading model ...");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Random random = new Random();
		for(int i = 0; i < random.nextInt(1000); i++) {
			modelPoints.add(random.nextInt(10000));
		}
		
		System.out.println("Model loaded");
	}
	
	private Model3D() {
		
	}
	
	@Override
	public Object clone() {
		Model3D copy = new Model3D();	//don't call the other one
		copy.fileName = this.fileName;
		copy.name = this.name;
		copy.modelPoints = (ArrayList<Integer>) this.modelPoints.clone();
		
		return copy;
	}
	
}
