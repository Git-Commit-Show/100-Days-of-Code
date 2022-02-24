package chapter2.casting;

public class GenTest {
	public static void main(String[] args) {
		//inference style
		Pair<String, Double> bid = new Pair<>("ORCL", 23.43);
		bid.getFirst();
		bid.getSecond();
		
		// explicit types
		bid = new Pair<String, Double>("ORCL", 66.6);
		
		// classic style
		bid = new Pair("ORCL", 77.7);
		bid.getFirst();
		bid.getSecond();
	}
}
