package ro.ase.cts.g1085.seminar10.builder;

public class SuperErou {
	String nume;
	int puncteViata;
	String superPutere;
	String superSuperPutere;
	String armaManaDreapta;
	String armaManaStanga;
	boolean estePozitiv;
	boolean esteRanitCritic;
	
	
	private SuperErou(String nume, int puncteViata, String superPutere, String superSuperPutere, String armaManaDreapta,
			String armaManaStanga, boolean estePozitiv, boolean esteRanitCritic) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
		this.armaManaDreapta = armaManaDreapta;
		this.armaManaStanga = armaManaStanga;
		this.estePozitiv = estePozitiv;
		this.esteRanitCritic = esteRanitCritic;
	}
	
	private SuperErou() {
		
	}
	
	//Builder
	public static class BuilderSuperErou {
		
		private SuperErou superErou;
		
		public BuilderSuperErou(String nume, int puncteViata) {
			superErou = new SuperErou();
			this.superErou.nume = nume;
			this.superErou.puncteViata = puncteViata;
		}
		
		public BuilderSuperErou setArmaManaStanga(String arma) {
			this.superErou.armaManaStanga = arma;
			return this;
		}
		
		public BuilderSuperErou setArmaManaDreapta(String arma) {
			this.superErou.armaManaDreapta = arma;
			return this;
		}
		
		public BuilderSuperErou setEstePozitiv() {
			this.superErou.estePozitiv = true;
			return this;
		}
		
		public BuilderSuperErou setEsteNegativ() {
			this.superErou.estePozitiv = false;
			return this;
		}
		
		public BuilderSuperErou setEsteRanit() {
			this.superErou.esteRanitCritic = true;
			return this;
		}
		
		public BuilderSuperErou setSuperPutere(String superPutere) {
			this.superErou.superPutere = superPutere;
			return this;
		}
		
		public BuilderSuperErou setSuperSuperPutere(String superPutere) {
			this.superErou.superSuperPutere = superPutere;
			return this;
		}
		
		public SuperErou build() {
			return this.superErou;
		}
		
	}
	
	
}
