package excercise.forloop;

/**
 * Harmonic (n) = 1 + 1/2 + 1/3 + ... + 1/n
 * @author MR
 *
 */

public class HarmonicSum {

	public static void main(String[] args) {
		
		int n = 50000;
		double sumL2R = printLeftToRightSum(n);
		double sumR2L = printRightToLeftSum(n);
		
		System.out.printf("Difference: %.15f", (sumL2R-sumR2L));
		System.out.println();
	}
	
	/**
	 * Left-to-right harnomic sum
	 * @param n
	 * @return
	 */
	private static double printLeftToRightSum(int n) {
		double sum = 0.0;
		for(int i =1; i<=n; i++) {
			sum += (double) 1/i;
		}
		System.out.printf("Left-to-Right harnomic sum %.15f", sum);
		System.out.println();
		
		return sum;
	}
	
	/**
	 * Right-to-left harnomic sum
	 * @param n
	 * @return
	 */
	private static double printRightToLeftSum(int n) {
		double sum = 0.0;
		for(int i =n; i>=1; i--) {
			sum += (double) 1/i;
		}
		System.out.printf("Right-to-Left harnomic sum %.15f", sum);
		System.out.println();
		
		return sum;
	}
}
