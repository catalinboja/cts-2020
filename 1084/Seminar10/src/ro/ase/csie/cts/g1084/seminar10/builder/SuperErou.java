package ro.ase.csie.cts.g1084.seminar10.builder;

public class SuperErou {
	String nume;
	boolean estePozitiv;
	boolean esteRanitCritic;
	String superPutere;
	String superSuperPutere;
	InterfataArma armaManaStanga;
	InterfataArma armaManaDreapta;
	
	private SuperErou(String nume, boolean estePozitiv, boolean esteRanitCritic, String superPutere,
			String superSuperPutere, InterfataArma armaManaStanga, InterfataArma armaManaDreapta) {
		super();
		this.nume = nume;
		this.estePozitiv = estePozitiv;
		this.esteRanitCritic = esteRanitCritic;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
		this.armaManaStanga = armaManaStanga;
		this.armaManaDreapta = armaManaDreapta;
	}
	
	private SuperErou() {
		
	}

	private void setNume(String nume) {
		this.nume = nume;
	}

	private void setEstePozitiv(boolean estePozitiv) {
		this.estePozitiv = estePozitiv;
	}

	private void setEsteRanitCritic(boolean esteRanitCritic) {
		this.esteRanitCritic = esteRanitCritic;
	}

	private void setSuperPutere(String superPutere) {
		this.superPutere = superPutere;
	}

	private void setSuperSuperPutere(String superSuperPutere) {
		this.superSuperPutere = superSuperPutere;
	}

	private void setArmaManaStanga(InterfataArma armaManaStanga) {
		this.armaManaStanga = armaManaStanga;
	}

	private void setArmaManaDreapta(InterfataArma armaManaDreapta) {
		this.armaManaDreapta = armaManaDreapta;
	}
	
	
	//definire Builder pentru supererou
	public static class SuperErouBuilder {
		
		private SuperErou supererou;
		
		//se vor solicita atributele considerate obligatorii pentru un SuperErou
		public SuperErouBuilder(String nume) {
			this.supererou = new SuperErou();
			this.supererou.setNume(nume);
		}
		
		public SuperErouBuilder estePozitiv() {
			this.supererou.setEstePozitiv(true);
			return this;
		}
		
		public SuperErouBuilder estePersonajNegativ() {
			this.supererou.setEstePozitiv(false);
			return this;
		}
		
		public SuperErouBuilder esteRanitCritic() {
			this.supererou.setEsteRanitCritic(true);
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(String putere) {
			this.supererou.setSuperPutere(putere);
			return this;
		}
		
		public SuperErouBuilder setArmaManaStanga(InterfataArma arma) {
			this.supererou.setArmaManaStanga(arma);
			return this;
		}
		
		//la fel si pentru celelalte atribute
		//...
		
		public SuperErou build() {
			return this.supererou;
		}
		
	}
	
	
}
