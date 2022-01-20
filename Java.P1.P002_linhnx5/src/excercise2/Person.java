package excercise2;

public class Person {
	
	public Person() {
		
	}

	public int calcTotal(int[] bills) {
		int total=0;
		for(int i=0;i<bills.length;i++) {
			total += bills[i];
		}
		
		return total;
	}

}
