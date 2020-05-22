package ro.ase.csie.cts.g1074.seminar13.strategy;

import java.util.Random;

public class StrategieRandom implements InterfataCalculPuncteBonus{

	@Override
	public int getPuncteBonus() {
		Random random = new Random();
		return random.nextInt(1000);
	}

}
