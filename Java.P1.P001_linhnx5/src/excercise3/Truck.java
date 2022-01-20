package excercise3;

public class Truck extends Car {
	
	int weight;

	public Truck(int speed, double regularPrice, String color,int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setTruckInfo() {
		super.setCarInfor();
		System.out.println("Enter the weight: ");
		weight = sc.nextInt();
	}
	
	public void getTruckInfor() {
		super.getCarInfo();
		System.out.println("The weight: "+weight);
		System.out.println("The sale price: "+getSalePrice());
	}
	
	public double getSalePrice() {
		if(weight>2000) {
			return super.getSalePrice()*0.9;
		}else {
			return super.getSalePrice()*0.8;
		}
	}
	
	
	
}
