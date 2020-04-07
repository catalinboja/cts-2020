package ro.ase.acs.cts.singleton.exemplu;


public class SingletonVersiune2 {
	//referinta instanta unica
	
    public static final SingletonVersiune2 instance;
   
    static {
    	instance = 
        		new SingletonVersiune2();
    }

	//constructor privat
    private SingletonVersiune2() { }
}
