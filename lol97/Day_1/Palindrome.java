public class Palindrome{

	public boolean useRecursive(String text){
		return text.equals(reverseRec(text));
	}

	public String reverseRec(String text){
		if(text == null || text.isEmpty()){
			return text;
		}

		int lastIndex = text.length()-1;
		return text.charAt(lastIndex) + reverseRec(text.substring(0,lastIndex));
	}
}