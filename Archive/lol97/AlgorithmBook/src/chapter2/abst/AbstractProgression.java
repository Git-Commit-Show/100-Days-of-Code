package chapter2.abst;

public abstract class AbstractProgression {
	protected long current;
	
	protected AbstractProgression(long current) {
		this.current = current;
	}
	
	protected AbstractProgression() {
		this(0);
	}
	
	protected abstract void advance();
	
	public long nextValue() {
		long answer = current;
		advance();
		return answer;
	}
	
	public void printProgression(int n) {
		System.out.println(nextValue());
		for (int i=0; i<n;i++) {
			System.out.println(" " + nextValue());
		}
		System.out.println();
	}
}
