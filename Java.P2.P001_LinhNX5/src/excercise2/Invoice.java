package excercise2;

public class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerttern;
	
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return quantity * pricePerttern;
	}
}
