package excercise.forloop;

public class SumAverage {
	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerBound = 1;
		int upperBound = 100;
		
		//Use a for-loop to sum from lowerbound to upperbound
		for(int number = lowerBound; number<=upperBound; ++number) {
			//the loop index variable number = 1+ 2+3..+100
			sum+=number;
		}
		
		average = sum/upperBound;
		
		System.out.println("Average of all 100 first numbers: "+average);
		
	}
}
