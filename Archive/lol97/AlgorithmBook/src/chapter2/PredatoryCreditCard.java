package chapter2;

import chapter1.CreditCard;

public class PredatoryCreditCard extends CreditCard{
	private double apr;

	public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initialBal, double apr) {
		super(cust, bk, acnt, lim, initialBal);
		this.apr = apr;
	}
	
	public void processMonth() {
		if (balance > 0) {
			double monthFactor = Math.pow(1 + apr, 1.0/12);
			balance *= monthFactor;
		}
	}

	@Override
	public boolean charge(double price) {
		// TODO Auto-generated method stub
		boolean isSuccess = super.charge(price);
		if (!isSuccess) {
			balance += 5;
		}
		return isSuccess;
	}
	
	
}
