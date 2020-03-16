package ro.ase.csie.cts.course5;

import java.util.ArrayList;

public class MyIntCollection {
	
	ArrayList<Integer> values;

	public MyIntCollection(ArrayList<Integer> values) {
		super();
		this.values = values;
	}
	
	public int getSum() {
		int sum = 0;
		for(int value : this.values)
			sum += value;
		return sum;
	}
	
	
	
}
