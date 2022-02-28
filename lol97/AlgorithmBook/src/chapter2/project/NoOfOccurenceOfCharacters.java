package chapter2.project;

import java.util.HashMap;

public class NoOfOccurenceOfCharacters {
	static final int MAX_CHAR = 256;
	 
    static void getOccuringChar(String str)
    {
         
        // Create an array of size 256
        // i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
 
        int len = str.length();
 
        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
 
            if (find == 1)
                System.out.println(
                    "Number of Occurrence of "
                    + str.charAt(i)
                    + " is:" + count[str.charAt(i)]);
        }
    }
   
    // Driver Code
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        System.out.println(countCharEachByString(str));
    }
    
    public static HashMap<Character, Integer> countCharEachByString(String text){
		HashMap<Character, Integer> dataMap = new HashMap<Character, Integer>();
		for (int i = 0; i < text.length(); i++) {
			char data = text.charAt(i);
			Integer counter = dataMap.get(data);
			if(counter == null) {
				dataMap.put(data, 1);
			}else {
				dataMap.put(data, counter.intValue() + 1);
			}
			
		}
		return dataMap;
	}
}
