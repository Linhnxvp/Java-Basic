package excercise2;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee employee1 = new Employee("Linh","Nx",1000);
		Employee employee2 = new Employee("Phong","Lh",-1000);
		
		employee1.getEmployeeInfo();
		employee2.getEmployeeInfo();
	}
}
