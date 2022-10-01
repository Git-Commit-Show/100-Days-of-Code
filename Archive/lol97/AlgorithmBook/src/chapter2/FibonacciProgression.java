package chapter2;

public class FibonacciProgression extends Progression{
	protected long prev;
	public FibonacciProgression(long first, long second) {
		super(first);
		this.prev = second - first;
	}
	
	public FibonacciProgression() {
		this(0, 1);
	}

	@Override
	protected void advance() {
		// TODO Auto-generated method stub
		long temp = prev;
		prev = current;
		current += temp;
	}
	
}
