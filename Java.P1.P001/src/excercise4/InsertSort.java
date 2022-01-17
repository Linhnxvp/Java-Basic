package excercise4;

public class InsertSort extends NumberList implements Sort {

	public InsertSort(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort(int[] numberList, int n, int m) {
		for(int i =1; i<n;i++) {
			int k = numberList[i];
			int j = i-1;
			
			//Di chuyen cac pt cua numberList[0 .... i-1] lon hon k
			// den vi tri truoc vi tri hien tai cua chung
			while(j>=0 && numberList[j] > k) {
				numberList[j+1] = numberList[j];
				j = j-1;
			}
			numberList[j+1] = k;
		}
		
	}
	
}
