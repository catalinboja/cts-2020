package ro.ase.csie.cts.g1091.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1091.Client;
import ro.ase.csie.cts.g1091.TipClient;
import ro.ase.csie.cts.g1091.exceptions.ExceptieTipClient;
import ro.ase.csie.cts.g1091.sales.AbstractPromotion;
import ro.ase.csie.cts.g1091.sales.Promotie;
import ro.ase.csie.cts.g1091.tests.stubs.PromotionStub;

public class TestClient {
	
	Client client;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}
	
	//Right test
	@Test
	public void testCalculeazaPretFinalRight() throws ExceptieTipClient {
		
		Promotie promo = new Promotie();
		client.setPromo(promo);
		
		TipClient testClientType = TipClient.WOOD;
		int testFidelityYears = 0;
		float testInitialPrice = 100;
		
		float expectedFinalPrice = testInitialPrice;
		float computedPrice = client.calculeazaPretFinal(
				testClientType, testInitialPrice, testFidelityYears);
		assertEquals(expectedFinalPrice, computedPrice, 0);
		
	}
	
	//Right
	// we use a stub for Promotie
	
	@Category({CategoryImportant.class})
	@Test
	public void testCalculeazaPretFinalRightWithStub() 
			throws ExceptieTipClient {
		
		/*		AbstractPromotion promo = new AbstractPromotion() {
		
		@Override
		public float getPretCuDiscount(float pret, float discount, float discountFidelitate) {
			// TODO Auto-generated method stub
			return 100*(1-0.05f)*0.9f;
		}
		
		@Override
		public float getDiscountFidelitate(int aniFidelitate) {
			// TODO Auto-generated method stub
			return 0.05f;
		}
	};*/
		
		TipClient testClientType = TipClient.BRONZE;
		int testFidelityYears = 5;
		float testInitialPrice = 100;
		
		PromotionStub promo = new PromotionStub();
		client.setPromo(promo);
		
		promo.setReturnGetDiscountFidelitate(0.05f);
		promo.setReturnGetPretCuDiscount(95*0.9f);
			
		float expectedFinalPrice = 95*0.9f;
		float computedPrice = client.calculeazaPretFinal(
				testClientType, testInitialPrice, testFidelityYears);
		
		assertEquals(expectedFinalPrice, computedPrice, 0);
		
	}
	
	


}
