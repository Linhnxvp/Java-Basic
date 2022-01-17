package excercise4;

public class QuickSort extends NumberList implements Sort {

	
	
	public QuickSort(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort(int[] numberList, int n, int m) {
		int low = 0;
		int high = n-1;
		if(low < high) {
			
			int pi = partition(numberList, low, high);
			
			sort(numberList,low, pi -1);
			sort(numberList, pi + 1, high);
		}
		
	}
	/**
	 *  Ham nhan pt cuoi cung lam chot, dat cac pt nho hon chot o
	 *  truoc va lon hon o sau no
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	public int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i=(low-1); //vi tri pt nho hon
		
		for(int j = low; j< high; j++) {
			//neu pt hien tai nho hon chot
			if(arr[j]<pivot) {
				i++;
				
				//doi vi tri arr[i] va arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		//doi vt arr[i+1] va arr[high] (hoac pivot)
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i +1 ;
	}
}
