package chapter1;

public class CounterDemo {
	public static void main(String[] args) {
		Counter counter;
		counter = new Counter();
		counter.increment();
		counter.increment(3);
		
		int temp = counter.getCount();
		counter.reset();
		
		Counter cnt2 = new Counter(5);
		cnt2.increment();
		
		Counter cnt3 = cnt2;
		temp = cnt3.getCount();
		cnt3.increment();
	}

}
