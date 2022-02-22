package chapter2.abst;

public class GeometricProgression extends AbstractProgression{
	protected long base;
	
	public GeometricProgression(long b, long start) {
		super(start);
		this.base = b;
	}
	
	public GeometricProgression(long b) {
		this(b, 1);
	}
	
	public GeometricProgression() {
		this(2, 1);
	}

	@Override
	protected void advance() {
		// TODO Auto-generated method stub
		current *= base;
	}
	
	
}
