package ro.ase.csie.cts.g1074.seminar10.builder;

public class SuperErou {
	String nume;
	int puncteViata;
	boolean estePozitiv;
	boolean esteRanitCritic;
	InterfataArma armaManaStanga;
	InterfataArma armaManaDreapta;
	String superPutere;
	String superSuperPutere;
	
	
	private SuperErou(String nume, int puncteViata, boolean estePozitiv, boolean esteRanitCritic,
			InterfataArma armaManaStanga, InterfataArma armaManaDreapta, String superPutere, String superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.estePozitiv = estePozitiv;
		this.esteRanitCritic = esteRanitCritic;
		this.armaManaStanga = armaManaStanga;
		this.armaManaDreapta = armaManaDreapta;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}


	private SuperErou() {
		super();
	}


	private void setNume(String nume) {
		this.nume = nume;
	}


	private void setPuncteViata(int puncteViata) {
		this.puncteViata = puncteViata;
	}


	private void setEstePozitiv(boolean estePozitiv) {
		this.estePozitiv = estePozitiv;
	}


	private void setEsteRanitCritic(boolean esteRanitCritic) {
		this.esteRanitCritic = esteRanitCritic;
	}


	private void setArmaManaStanga(InterfataArma armaManaStanga) {
		this.armaManaStanga = armaManaStanga;
	}


	private void setArmaManaDreapta(InterfataArma armaManaDreapta) {
		this.armaManaDreapta = armaManaDreapta;
	}


	private void setSuperPutere(String superPutere) {
		this.superPutere = superPutere;
	}


	private void setSuperSuperPutere(String superSuperPutere) {
		this.superSuperPutere = superSuperPutere;
	}
	
	
	public static class SuperErouBuilder {
		
		private SuperErou superErou;
		
		public SuperErouBuilder(String nume, int puncteViata) {
			superErou = new SuperErou();
			this.superErou.setNume(nume);
			this.superErou.setPuncteViata(puncteViata);
		}
		
		public SuperErouBuilder setEstePozitiv() {
			this.superErou.setEstePozitiv(true);
			return this;
		}
		
		public SuperErouBuilder setEsteNegativ() {
			this.superErou.setEstePozitiv(false);
			return this;
		}
		
		public SuperErouBuilder setArmaManaStanga(InterfataArma arma) {
			this.superErou.setArmaManaStanga(arma);
			return this;
		}
		
		public SuperErouBuilder setArmaManaDreapta(InterfataArma arma) {
			this.superErou.setArmaManaDreapta(arma);
			return this;
		}
		
		public SuperErouBuilder setEsteRanitCritic() {
			this.superErou.setEsteRanitCritic(true);
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(String superPutere) {
			this.superErou.setSuperPutere(superPutere);
			return this;
		}
		
		public SuperErouBuilder setSuperSuperPutere(String superPutere) {
			this.superErou.setSuperSuperPutere(superPutere);
			return this;
		}
		
		
		public SuperErou build() {
			return this.superErou;
		}
		
	}
	
	
}
