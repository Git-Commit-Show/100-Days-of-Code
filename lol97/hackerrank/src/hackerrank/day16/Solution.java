package hackerrank.day16;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.SortedSet<String> sorted = new java.util.TreeSet<String>();
        for(int i=0; i<=s.length()-k; i++) {
        	sorted.add(s.substring(i, i+k));
        }
        smallest = sorted.first();
        largest = sorted.last();
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
