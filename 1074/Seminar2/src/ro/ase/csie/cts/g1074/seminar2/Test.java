package ro.ase.csie.cts.g1074.seminar2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Banca banca = new Banca("BCR");
		
		ContCredit cc1 = 
				(ContCredit) banca.deschideCont(
						TipConturiBancare.CREDIT);
		ContDepozit cd1 = 
				(ContDepozit) banca.deschideCont(
						TipConturiBancare.DEPOZIT);
		
		ArrayList<ContBancar> conturi = 
			new ArrayList<>();	
		
		cd1.depune(1000);
		//cd1.retrage(1150);
		cd1.transfer(500, cc1);
		
		conturi.add(cc1);
		conturi.add(cd1);
		conturi.add(banca.deschideCont(TipConturiBancare.getTip(1)));
	}

}
