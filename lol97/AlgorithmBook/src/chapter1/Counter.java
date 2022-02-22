package chapter1;

public class Counter {
	private int count;
	public Counter() {};
	public Counter(int initial) {
		this.count = initial;
	}
	public int getCount() {
		return this.count;
	}
	
	public void increment() {
		this.count++;
	}
	
	public void increment(int delta) {
		this.count = count + delta;
	}
	
	public void reset() {
		this.count = 0;
	}
}
