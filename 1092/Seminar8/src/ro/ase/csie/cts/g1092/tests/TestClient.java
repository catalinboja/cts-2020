package ro.ase.csie.cts.g1092.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1092.*;
import ro.ase.csie.cts.g1092.exceptions.ExceptieTipClient;
import ro.ase.csie.cts.g1092.sales.AbstractPromotion;
import ro.ase.csie.cts.g1092.sales.Promotion;
import ro.ase.csie.cts.g1092.tests.stubs.AbstractPromotionStub;

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
	
	//Right test
	//we are lucky, we already have an implementation of AbstractPromotion
	@Category(CategoryImportant.class)
	@Test
	public void testCalculeazaPretFinalRight() throws ExceptieTipClient {
		Promotion promo = new Promotion();
		client.setPromo(promo);
		
		TipClient testType = TipClient.WOOD;
		float testPrice = 100;
		int testFidelity = 0;
		
		float estimatedPrice = testPrice;
		float computedPrice = client.calculeazaPretFinal(
				testType, testPrice, testFidelity);
		
		assertEquals(estimatedPrice, computedPrice, 0);
	}
	
	
	//Right test
	//we don't have the implementation of AbstractPromotion
	@Test
	public void testCalculeazaPretFinalRightWithStub() throws ExceptieTipClient {
		
		
		
		AbstractPromotionStub promo = new AbstractPromotionStub();
		client.setPromo(promo);
		
		TipClient testType = TipClient.BRONZE;
		float testPrice = 100;
		int testFidelity = 5;
		
		//configure the stub
		promo.setReturnGetDiscountFidelitate(0.05f);
		promo.setReturnGetPretCuDiscount(85.5f);
		
		float estimatedPrice = 85.5f;
		float computedPrice = client.calculeazaPretFinal(
				testType, testPrice, testFidelity);
		
		assertEquals(estimatedPrice, computedPrice, 0);
	}
	
	
	


}
