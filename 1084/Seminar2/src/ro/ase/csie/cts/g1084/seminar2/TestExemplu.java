package ro.ase.csie.cts.g1084.seminar2;

import java.util.ArrayList;
import java.util.List;

public class TestExemplu {

	public static void main(String[] args) {
		
		List<ContBancar> conturi = 
				new ArrayList<>();
		Banca bcr = new Banca("BCR");
		
		conturi.add(bcr.deschideCont(TipConturi.CREDIT));
		conturi.add(bcr.deschideCont(TipConturi.DEBIT));
		conturi.add(bcr.deschideCont(TipConturi.CREDIT));
		
		for(ContBancar cont : conturi) {
			System.out.println("Tipul contului este " +
					cont.toString());
			System.out.println("Soldul este " + 
					cont.getBalanta());
		}
		
	}

}
