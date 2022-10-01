public class Caller{
	public static void main(String args[]){
		Palindrome pal = new Palindrome();
		System.out.println(pal.useRecursive("paman"));
		System.out.println(pal.useRecursive("katak"));
	}
}