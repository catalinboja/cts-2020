package ro.ase.csie.cts.course5;

import java.util.ArrayList;

public class TestApp {

	public static void main(String[] args) {
		
		ArrayList<Integer> values = new ArrayList<>();
		values.add(10);
		values.add(20);
		values.add(30);
		
		MyIntCollection collection = 
				new MyIntCollection(values);
		
		int sum = collection.getSum();
		
		if(sum == 60)
			System.out.println("It works");
		else
			System.out.println(
					"Houston we have a problem. The actual sum is " + 
			sum);
		
	}

}
