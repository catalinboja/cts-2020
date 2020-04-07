package ro.ase.csie.cts.g1085.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1085.Client;
import ro.ase.csie.cts.g1085.TipClient;
import ro.ase.csie.cts.g1085.exceptii.ExceptieTipClient;
import ro.ase.csie.cts.g1085.marketing.Promotie;
import ro.ase.csie.cts.g1085.marketing.PromotieAbstracta;
import ro.ase.csie.cts.g1085.teste.stub.StubPromotie;

public class TestClient {

	// test fixture
	Client client;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}

	// Test Right
	// ne bazam pe implementarea Promotie
	@Test
	public void testCalculeazaPretFinalRight() throws ExceptieTipClient {
		Promotie promo = new Promotie();
		client.setPromo(promo);

		TipClient testTipClient = TipClient.WOOD;
		float testPretInitial = 100;
		int testVechimeFidelitate = 0;

		float pretEstimat = testPretInitial;
		float pretCalculat = client.calculeazaPretFinal(testTipClient, testPretInitial, testVechimeFidelitate);
		assertEquals(pretEstimat, pretCalculat, 0);
	}

	// Test Right
	// nu avem implementare pentru Promotie
	@Category({CategorieImportante.class, CategorieClient.class})
	@Test
	public void testCalculeazaPretFinalRightCuStub() throws ExceptieTipClient {

/*		PromotieAbstracta promo = new PromotieAbstracta() {

			@Override
			public float getPretCuDiscount(float pret, float discount, float discountFidelitate) {
				// TODO Auto-generated method stub
				return 95 * 0.9f;
			}

			@Override
			public float getDiscountFidelitate(int aniFidelitate) {
				// TODO Auto-generated method stub
				return 0.05f;
			}
		};
*/
		StubPromotie promo = new StubPromotie();
		client.setPromo(promo);
		
		promo.setReturnGetDiscountFidelitate(0.05f);
		promo.setReturnGetPretCuDiscount(95*0.9f);
		

		TipClient testTipClient = TipClient.BRONZE;
		float testPretInitial = 100;
		int testVechimeFidelitate = 5;

		float pretEstimat = 95 * 0.9f;
		float pretCalculat = client.calculeazaPretFinal(testTipClient, testPretInitial, testVechimeFidelitate);
		assertEquals(pretEstimat, pretCalculat, 0);
	}
	
	

}
