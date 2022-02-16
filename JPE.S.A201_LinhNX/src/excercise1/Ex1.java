package excercise1;

public class Ex1 {
	public static void main(String[] args) {
		int x=5, y=6;
		
		System.out.println("(101 + 0) / 3 = "+(101+0)/3);
		
		System.out.println("3.0e - 6 * 10000000.1 = "+(3.0*Math.E-6*10000000.1));
		
		if(x>3 && y >4) {
			System.out.println("true && true -> true");
		}else {
			System.out.println("false");
		}
		
		if(x<3 && y >4) {
			System.out.println("true");
		}else {
			System.out.println("false && true -> false");
		}
		
		if((x<3 && y <4) || (x>3 && y >4)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if((x<3 || y <4) && (x>3 || y >4)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
