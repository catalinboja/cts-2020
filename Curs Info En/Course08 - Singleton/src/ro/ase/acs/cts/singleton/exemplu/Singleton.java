package ro.ase.acs.cts.singleton.exemplu;

import java.io.Serializable;

public class Singleton implements Serializable{

    private static Singleton instance = null;
    
    static{
    	System.out.println("Inainte de a incarca clasa");
    }

    {
    	System.out.println("Inainte de creare obiecte");
    }
    
	//constructor privat
    private Singleton() throws Exception {
    	if(instance!=null)
    		throw new Exception("Singleton deja creat !");
    }

 	//metoda publica statica
    public static synchronized Singleton getInstance() throws Exception {
        if (instance == null) {
            instance = new Singleton ();
        }
        return instance;
    }
    
    /*
     * Pentru deserializare singleton
     */
    private Object readResolve() throws Exception {
        return Singleton.getInstance();
    }

}

