package excercise2;

public class Wallet {
	private int wallet;
	
	public Wallet() {
		
	}

	public Wallet(int wallet) {
		super();
		this.wallet = wallet;
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public boolean payMoney(int total) {
		if(wallet >= total) {
			return true;
		}else {
			return false;
		}
	}
}
