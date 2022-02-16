package excercise;

public class ArrayDemo {
	public static void main(String[] args) {
		
		//declare an array
		int[] arrayInt = new int[5];
		
		//set value for each element of array
		arrayInt[0] = 1;
		arrayInt[1] = 2;
		arrayInt[2] = 3;
		arrayInt[3] = 4;
		arrayInt[4] = 5;
		
		//get array length
		System.out.println("Array length: " +arrayInt.length);
		
		//access arry element at a given index to get value
		System.out.println("Element at index 3 is: "+arrayInt[3]);
	}
}
