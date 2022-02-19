package chapter1;

public class CreditCard {
	// instance variable
	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;

	// Constructor
	public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initialBal;
	}

	public CreditCard(String cust, String bk, String acnt, int lim) {
		this(cust, bk, acnt, lim, 0.0);
	}

	// Accessor methods
	public String getCustomer() {
		return customer;
	}

	public String getBank() {
		return bank;
	}

	public String getAccount() {
		return account;
	}

	public int getLimit() {
		return limit;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}

	// Update methods
	public boolean charge(double price) {
		if (price + balance > limit) {
			return false;
		}
		balance += price;
		return true;
	}
	
	public void makePayment(double amount) {
		balance -= amount;
	}

	// Utility method to print a card's information
	public static void printSummary(CreditCard cc) {
		System.out.println("===============================");
		System.out.println("Customer = " + cc.customer);
		System.out.println("Bank = " + cc.bank);
		System.out.println("Account = " + cc.account);
		System.out.println("Balance = " + cc.balance);
		System.out.println("Limit = " + cc.limit);
		System.out.println("===============================");
	}

	public static void main(String[] args) {
		CreditCard[] wallet = new CreditCard[3];
		wallet[0] = new CreditCard("John Bownman", "California Savings", "5931 0375 9387 5309", 5000);
		wallet[1] = new CreditCard("John Bownman", "California Federal", "3845 0399 3395 1954", 3500);
		wallet[2] = new CreditCard("John Bownman", "California Finance", "5391 0375 9387 5309", 2500, 300);

		for (int val = 1; val <= 16; val++) {
			wallet[0].charge(3*val);
			wallet[1].charge(2*val);
			wallet[2].charge(val);
		}
		
		for(CreditCard cc : wallet) {
			CreditCard.printSummary(cc);
			while(cc.getBalance() > 200.0) {
				cc.makePayment(200);
				System.out.println("New Balance = " + cc.getBalance());
			}
		}
	}
}
