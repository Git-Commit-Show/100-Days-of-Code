package chapter2.inf;

public class BoxedItem2 implements Insurable {
	private String descriptor;
	private int price;
	private int weight;
	private boolean haz;
	private int height = 0;
	private int width = 0;
	private int depth = 0;

	public BoxedItem2(String descriptor, int price, int wight, boolean haz) {
		super();
		this.descriptor = descriptor;
		this.price = price;
		this.weight = wight;
		this.haz = haz;
	}

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public boolean isHazardous() {
		// TODO Auto-generated method stub
		return haz;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return descriptor;
	}

	@Override
	public int listPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public int lowestPrice() {
		// TODO Auto-generated method stub
		return price / 2;
	}
	
	@Override
	public int insuredValue() {
		return price * 2;
	}

	public void setBox(int h, int w, int d) {
		this.height = h;
		this.weight = w;
		this.depth = d;
	}
}
