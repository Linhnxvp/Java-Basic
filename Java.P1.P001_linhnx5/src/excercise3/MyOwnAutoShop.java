package excercise3;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		Sedan sedan = new Sedan(100, 100, "black", 15);
		Ford ford1 = new Ford(150, 110, "blue", 2022, 10);
		Ford ford2 = new Ford(120, 100, "white", 2022, 15);
		Car car = new Car(100, 90, "red");
		
		
		sedan.getSedanInfo();
		System.out.println("--------------------");
		ford1.getFordInfo();
		System.out.println("--------------------");
		ford2.getFordInfo();
		System.out.println("--------------------");
		car.getCarInfo();
	}
}
