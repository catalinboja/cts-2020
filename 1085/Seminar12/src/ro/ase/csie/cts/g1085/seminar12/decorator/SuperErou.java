package ro.ase.csie.cts.g1085.seminar12.decorator;

public class SuperErou extends CaracterAbstract {

	public SuperErou(String nume, int puncteViata) {
		super(nume, puncteViata);
	}

	@Override
	public void ataca() {
		System.out.println(this.nume + " ataca ");
	}

	@Override
	public void seApara(int puncte) {
		System.out.println(this.nume + " se apara ");
		this.puncteViata -= puncte;
	}

	@Override
	public void seVindeca(int puncte) {
		System.out.println(this.nume + " se vindeca ");
		this.puncteViata += puncte;
	}
	
	

}
