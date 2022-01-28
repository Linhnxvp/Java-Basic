package excercise.forloop;

public class AverageArray {
	public static void main(String[] args) {
		int[] intArray = {12,11,5,9,3,8};
		
		int sum = 0;
		double average = 0.0d;
		int length = intArray.length;
		
		for(int i=0;i<length;i++) {
			sum+=intArray[i];
		}
		
		average = sum/length;
		
		System.out.println("Average of all element in intArray: "+average);
	}
}
