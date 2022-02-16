package excercise4;

public class SelectionSort extends NumberList implements Sort {

	public SelectionSort(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort(int[] numberList, int n, int m) {
		for(int i=0;i<n-1;i++) {
			//Tim pt nho nhat trong mang ch sap xep
			int min_index = i;
			for(int j=i+1;j<n;j++) {
				if(numberList[j]<numberList[min_index]) {
					min_index = j;
				}
				
			}
			//Hoan doi pt nho nhat va pt dau tien
			int temp = numberList[min_index];
			numberList[min_index] = numberList[i];
			numberList[i] = temp;
		}
		
	}

}
