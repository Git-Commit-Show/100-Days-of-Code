package chapter2.abst;

public class ArithmeticProgression extends AbstractProgression {
	protected long increment;
	
	public ArithmeticProgression() {
		this(1,0);
	}
	
	public ArithmeticProgression(long stepsize) {
		this(stepsize, 0);
	}
	
	public ArithmeticProgression(long stepsize, long start) {
		super(start);
		this.increment = stepsize;
	}

	@Override
	protected void advance() {
		// TODO Auto-generated method stub
		current += increment;
	}
	
	
}
