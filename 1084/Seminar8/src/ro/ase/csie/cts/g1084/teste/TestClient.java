package ro.ase.csie.cts.g1084.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1084.Client;
import ro.ase.csie.cts.g1084.TipClient;
import ro.ase.csie.cts.g1084.exceptii.ExceptieTipClient;
import ro.ase.csie.cts.g1084.marketing.Promotie;
import ro.ase.csie.cts.g1084.marketing.PromotieAbstracta;
import ro.ase.csie.cts.g1084.teste.stub.StubPromotie;

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
		Promotie promotie = new Promotie();
		client.setPromo(promotie);

		TipClient testTipClient = TipClient.WOOD;
		float testPretInitial = 100;
		int testAniVechime = 0;

		float pretEstimat = testPretInitial;
		float pretCalculat = client.calculeazaPretFinal(testTipClient, testPretInitial, testAniVechime);

		assertEquals(pretEstimat, pretCalculat, 0);
	}

	// Test Right
	// folosim un stub pentru Promotie
	@Category({CategorieImportante.class})
	@Test
	public void testCalculeazaPretFinalRightCuStub() throws ExceptieTipClient {

		PromotieAbstracta promotie = new PromotieAbstracta() {

			@Override
			public float getPretCuDiscount(float pret, float discount, float discountFidelitate) {
				// TODO Auto-generated method stub
				return 85.5f;
			}

			@Override
			public float getDiscountFidelitate(int aniFidelitate) {
				// TODO Auto-generated method stub
				return 0.05f;
			}
		};

		client.setPromo(promotie);

		TipClient testTipClient = TipClient.BRONZE;
		float testPretInitial = 100;
		int testAniVechime = 5;

		float pretEstimat = 85.5f;
		float pretCalculat = client.calculeazaPretFinal(testTipClient, testPretInitial, testAniVechime);

		assertEquals(pretEstimat, pretCalculat, 0);

	}

	// Test Right
	// folosim un stub pentru Promotie
	@Test
	public void testCalculeazaPretFinalRightCuClasaStub() throws ExceptieTipClient {

		StubPromotie promotie = new StubPromotie();
		promotie.setReturnGetDiscountFidelitate(0.05f);
		promotie.setReturnGetPretCuDiscount(85.5f);
		
		//daca se doreste ca metoda stub sa genereze o exceptie
		//promotie.setGenereazaExceptie(true);

		client.setPromo(promotie);

		TipClient testTipClient = TipClient.BRONZE;
		float testPretInitial = 100;
		int testAniVechime = 5;

		float pretEstimat = 85.5f;
		float pretCalculat = client.calculeazaPretFinal(testTipClient, testPretInitial, testAniVechime);

		assertEquals(pretEstimat, pretCalculat, 0);

	}

}
