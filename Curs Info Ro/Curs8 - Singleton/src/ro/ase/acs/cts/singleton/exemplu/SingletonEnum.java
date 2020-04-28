package ro.ase.acs.cts.singleton.exemplu;

public enum SingletonEnum {
	INSTANCE;
	
	int atribut1;
	
	public int getAtribut1() {
		return atribut1;
	}
	
	public void metodaObiect() {
		System.out.println("Acesta este un Singleton");
	}

}
