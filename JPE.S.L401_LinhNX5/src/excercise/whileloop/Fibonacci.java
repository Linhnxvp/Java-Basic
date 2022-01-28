package excercise.whileloop;

public class Fibonacci {
	public static void main(String[] args) {
		
		int n = 1; //The index n for F(n)
		int fnMinus1 = 1; //F(n-1), init to F(2)
		int fnMinus2 = 1; //F(n-2), init to F(1)
		int nMax = 20; //Maximum n, inclusive
		int sum = fnMinus1 + fnMinus2; //need sum to compute average
		double average;
		
		System.out.println("The first "+nMax+" Fibonacci numbers are:");
		
		while(n<=nMax) {
			System.out.print(fnMinus1 + " ");
			//Compute F(n), printit and add to sum
			// Increment the index n and shift the numbers for the next iteration
			
			sum = fnMinus1 + fnMinus2;
			
			fnMinus1 = fnMinus2;
			fnMinus2 = sum;
			
			++n;
		}
		
		//compute and display the average 
		average = sum/nMax;
		
		//Baware that int/int gives int.
		System.out.println("\nThe average is "+average);
		
	}
}
