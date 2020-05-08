package ro.ase.cts.prototype;

import java.util.ArrayList;

public class NavaSpatiala extends Model3D{
	
	public NavaSpatiala(String tip){
		super(tip);
		System.out.println("Incarcare model 3D pentru nava spatiala ....");
		poligoane = new ArrayList<>(100);
		this.tip = tip;
	}
	
	public NavaSpatiala() {

	}

	@Override
	void draw() {
		System.out.println("Nava spatiala tip "+this.tip);
	}

	@Override
	public Object clone() {
		NavaSpatiala clona = new NavaSpatiala();
		clona.tip = this.tip;
		clona.id = this.id;
		clona.poligoane = (ArrayList<Object>) this.poligoane.clone();
		return clona;
	}

}
