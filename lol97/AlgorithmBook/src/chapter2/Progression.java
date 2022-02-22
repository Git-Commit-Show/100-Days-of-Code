package chapter2;

public class Progression {
	protected long current;

	public Progression(long current) {
		super();
		this.current = current;
	}

	public Progression() {
		this(0);
	}
	
	public long nextValue() {
		long answer = current;
		advance();
		return answer;
	}
	
	protected void advance() {
		current++;
	}
	
	public void printProgression(int n) {
		System.out.println(nextValue());
		for (int j=1; j<n;j++) {
			System.out.print(" "+ nextValue());
		}
		System.out.println();
	}
}
