package excercise3;

public class Ford extends Car {

	int year;
	int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	public double getSalePrice() {
		return (super.getSalePrice()-manufacturerDiscount);
	}

	public void setFordInfo() {
		super.setCarInfor();
		System.out.println("Enter the year: ");
		year = sc.nextInt();
		System.out.println("Enter the manufacturerDiscount: ");
		manufacturerDiscount = sc.nextInt();
	}
	
	public void getFordInfo() {
		super.getCarInfo();
		System.out.println("The year:"+ year);
		System.out.println("The manufacturerDiscount:"+ manufacturerDiscount);
		System.out.println("The sale price: "+getSalePrice());
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}

	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	
}
