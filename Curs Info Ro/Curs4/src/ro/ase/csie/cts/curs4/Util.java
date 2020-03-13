package ro.ase.csie.cts.curs4;

public class Util {
	
	public static int aduna(int a, int b) throws DepasireMaxIntException {
		if(Integer.MAX_VALUE - b >= a)
			return a+b;
		else
			throw new DepasireMaxIntException();
	}
}
