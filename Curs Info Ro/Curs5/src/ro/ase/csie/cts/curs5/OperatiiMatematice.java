package ro.ase.csie.cts.curs5;

public class OperatiiMatematice {

	public static float calculMedie(int[] valori) {

		if (valori.length == 0)
			return 0;

		float suma = 0;
		for (int valoare : valori) {
			suma += valoare;
		}
		return suma / valori.length;

	}

}
