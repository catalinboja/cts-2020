package ro.ase.csie.cts.g1085.seminar14.chain;

public class MesajChat {
	String text;
	int prioritate;
	String numeJucatorDestinatie;
	
	
	public MesajChat(String text, int prioritate, String numeJucatorDestinatie) {
		super();
		this.text = text;
		this.prioritate = prioritate;
		this.numeJucatorDestinatie = numeJucatorDestinatie;
	}


	public String getText() {
		return text;
	}


	public int getPrioritate() {
		return prioritate;
	}


	public String getNumeJucatorDestinatie() {
		return numeJucatorDestinatie;
	}
	
	
	
	
}
