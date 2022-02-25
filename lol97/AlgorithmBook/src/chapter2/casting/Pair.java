package chapter2.casting;

public class Pair<A, B> {
	A first;
	B second;

	public Pair(A first, B second) {
		super();
		this.first = first;
		this.second = second;
	}

	public A getFirst() {
		return first;
	}
	public B getSecond() {
		return second;
	}
}
