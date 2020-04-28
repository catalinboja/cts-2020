import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMetode {

	int oMetoda(int valoare) throws Exception {

		int rez = 0;

		switch (valoare) {

		case 1:
			rez = 10;
			break;

		case 5:
			rez = 20;
			break;
		case 10:
			rez = 30;
			break;

		default:
			throw new Exception("Valoare gresita");
		}
		
		return rez;
	}
	
	@BeforeClass
	public void setUpBeforeClass() {
		System.out.print("Before ");
	}

	@Test
	public void test1() {
		System.out.print("Test1 ");
	}

	@Test
	public void test2() {
		System.out.print("Test2 ");
	}

	@After
	public void tearDown() {
		System.out.print("After ");
	}
}
