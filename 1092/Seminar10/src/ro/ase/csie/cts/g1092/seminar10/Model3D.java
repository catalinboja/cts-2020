package ro.ase.csie.cts.g1092.seminar10;

import java.util.ArrayList;
import java.util.Random;

public class Model3D implements Cloneable {
	
	String fileName;
	String name;
	ArrayList<Integer> points = new ArrayList<>();
	
	private Model3D() {
		
	}
	
	public Model3D(String file, String name) {
		this.fileName = file;
		this.name = name;
		System.out.println("Loading model for " + name+" ... ");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Random random = new Random();
		for(int  i = 0; i < random.nextInt(1000); i++) {
			this.points.add(random.nextInt(255));
		}
		
		
		System.out.println("Model loaded");
		
	}
	
	@Override
	public Object clone() {
		//DON't DO this
		//return new Model3D(this.fileName, this.name);
		
		Model3D copy = new Model3D();
		copy.fileName = this.fileName;
		copy.name = this.name;
		copy.points = (ArrayList<Integer>) this.points.clone();
		
		return copy;
		
	}
	
	
}
