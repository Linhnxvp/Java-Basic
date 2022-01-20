package excercise1;

public class NormalCalculator {

	
	public double calculate(double a, String operator, double b) {
		switch(operator) {
		case "+":
			return a+b;
		case "-":
			return a-b;
		case "*":
			return a*b;
		case "/":
			if (b == 0) {
                System.out.println("Divisor must be non-zero");
                return 0;
            } else {
            	return a/b;
            }
		case "^":
			return Math.pow(a,b);
		default:
			return 0;
		}
	}
	
	public boolean checkOperator(String operator) {
		if(operator.equals("=")||operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")||operator.equals("^")) {
			return true;
		}else {
			System.out.println("Please input(+, -, *, /, ^)");
			return false;
		}
	}
}
