package excercise3;

public class Sedan extends Car {
	int length;

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	
	public double getSalePrice() {
		if(length > 20) {
			return super.getSalePrice()*0.95 ;
		}else {
			return super.getSalePrice()*0.9;
		}
	}

	public void setSedanInfo() {
		super.setCarInfor();
		System.out.println("Enter the length: ");
		length = sc.nextInt();
	}
	public void getSedanInfo() {
		super.getCarInfo();
		System.out.println("The length:"+ length);
		System.out.println("The sale price: "+getSalePrice());
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	
	
}
