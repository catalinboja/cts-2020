package ro.ase.cts.prototype;

import java.util.ArrayList;

public class NavaSpatiala extends Model3D{
	
	public NavaSpatiala(String tip){
		System.out.println("Incarcare model 3D pentru nava spatiala ....");
		poligoane = new ArrayList<>(100);
		this.tip = tip;
	}

	@Override
	void draw() {
		System.out.println("Nava spatiala tip "+this.tip);
	}

}
