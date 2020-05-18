package ro.ase.csie.cts.g1085.seminar11;

public class AdaptorDisney2Acme implements InterfataCaractereACME{

	CaracterDisney erou;

	public AdaptorDisney2Acme(CaracterDisney erou) {
		super();
		this.erou = erou;
	}

	@Override
	public String getNume() {
		return this.erou.getInfo();
	}

	@Override
	public int getPuncteViata() {
		return (int) this.erou.energie;
	}

	@Override
	public void getDescriere() {
		System.out.println(this.erou.getInfo() + " - " + this.erou.energie);
	}

	@Override
	public void esteAtacat(int puncteLovitura) {
		this.erou.interactioneaza(puncteLovitura);	
	}

	@Override
	public void seVindeca(int puncte) {
		this.erou.resetEnergie();
		//this.erou.energie += puncte;
	}
	
}
