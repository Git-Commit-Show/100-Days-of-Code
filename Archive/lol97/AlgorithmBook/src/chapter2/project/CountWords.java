package chapter2.project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CountWords {
	public static HashMap<String, Integer> counts(List<String> listString){
		HashMap<String, Integer> retHashMap = new HashMap<String, Integer>();
		
		for (String text : listString) {
			Integer count = retHashMap.get(text);
			if (count == null) {
				retHashMap.put(text, 1);
			} else {
				retHashMap.put(text, count.intValue() + 1);
			}
		}
		
		return retHashMap;
	}
	
	public static void main(String[] args) {
		Scanner sIn = new Scanner(System.in).useDelimiter("\r\n");
		String data = sIn.next();
		List<String> listData = Arrays.asList(data.split(" "));
		System.out.println(counts(listData));
		sIn.close();
	}
}
