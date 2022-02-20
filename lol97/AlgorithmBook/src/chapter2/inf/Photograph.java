package chapter2.inf;

public class Photograph implements Sellable{
	private String desc;
	private int price;
	private boolean color;

	public Photograph(String desc, int price, boolean color) {
		super();
		this.desc = desc;
		this.price = price;
		this.color = color;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return desc;
	}

	@Override
	public int listPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public int lowestPrice() {
		// TODO Auto-generated method stub
		return price/2;
	}
	
	public boolean isColor() {
		return color;
	}

}
