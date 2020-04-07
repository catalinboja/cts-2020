package ro.ase.csie.cts.g1074.seminar8.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1074.seminar8.Client;
import ro.ase.csie.cts.g1074.seminar8.ExceptieTipClient;
import ro.ase.csie.cts.g1074.seminar8.TipClient;
import ro.ase.csie.cts.g1074.seminar8.exceptii.ExceptiePromotie;
import ro.ase.csie.cts.g1074.seminar8.marketing.InterfataPromotie;
import ro.ase.csie.cts.g1074.seminar8.marketing.Promotie;
import ro.ase.csie.cts.g1074.seminar8.stub.StubPromotie;

public class TestClient {
	
	//test fixture
	Client client;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}
	
	//Existence
	//Error-Condition
	@Category(CategorieImportante.class)
	@Test(expected = ExceptiePromotie.class)
	public void testCalculeazaPretFinalPromotieNull() 
			throws ExceptieTipClient, ExceptiePromotie {
		
		client.setPromotieCurenta(null);
		
		client.calculeazaPretFinal(TipClient.WOOD, 100, 0);
	}
	
	//Right
	//cu o implementare concreta pentru InterfataPromotie
	//rar se intampla asta
	@Test
	public void testCalculeazaPretFinalRight() throws ExceptieTipClient, ExceptiePromotie {
		//test cu implementare concreta
		InterfataPromotie promo = new Promotie();
		client.setPromotieCurenta(promo);
		
		TipClient tipTest = TipClient.WOOD;
		float pretTest = 100;
		int vechimeTest = 0;
		
		float pretEstimat = pretTest;
		float pretCalculat = client.calculeazaPretFinal(
				tipTest, pretTest, vechimeTest);
		
		assertEquals(pretEstimat, pretCalculat, 0);
		
	}
	
	//Right
	//cu o clasa Stub
	@Test
	public void testCalculeazaPretFinalRightCuStub() throws ExceptieTipClient, ExceptiePromotie {
		//nu avem implementare concreta pentru InterfataPromotie
		//folosim un stub pentru Promotie
		
		//creare stub
		StubPromotie promo = new StubPromotie();
		
		TipClient tipTest = TipClient.BRONZE; //10%
		float pretTest = 100;		
		int vechimeTest = 5;		//5%
		
		client.setPromotieCurenta(promo);
		
		//configurare stub
		promo.setReturnDiscountFidelitate(0.05f);
		promo.setReturnDiscountPret(95);
		promo.setReturnPretCuDiscount(85.5f);
		
		float pretEstimat = 85.5f;
		float pretCalculat = client.calculeazaPretFinal(
				tipTest, pretTest, vechimeTest);
		
		assertEquals(pretEstimat, pretCalculat, 0);
		
		
		
	}


}
