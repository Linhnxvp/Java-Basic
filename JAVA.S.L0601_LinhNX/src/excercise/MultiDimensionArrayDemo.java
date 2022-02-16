package excercise;

public class MultiDimensionArrayDemo {

	public static void main(String[] args) {
		//create a multi dimension array that has 2 rows and 2 columns
		int[][] matrix = new int[2][2];
		
		//set value for elment of matrix
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[1][0]=3;
		matrix[1][1]=4;
		
		//access array element at a given to get value
		System.out.println("Elementat second row and first column is: "+matrix[1][0]);
		System.out.println("Number of rows: "+matrix.length); //get number of rows of array
		System.out.println("Number of columns: "+matrix[0].length); //get number of columns of array

	}

}
