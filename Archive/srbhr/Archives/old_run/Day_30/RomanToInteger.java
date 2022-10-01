import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanDictionary = new HashMap<>();

        romanDictionary.put('I',1);
        romanDictionary.put('V',5);
        romanDictionary.put('X',10);
        romanDictionary.put('L',50);
        romanDictionary.put('C',100);
        romanDictionary.put('D',500);
        romanDictionary.put('M',1000);

        int numeric = 0;

        for (int i=0; i<s.length()-1; i++) {
            if (romanDictionary.get(s.charAt(i)) < romanDictionary.get(s.charAt(i+1))){
                numeric -=romanDictionary.get(s.charAt(i));
            }else {
                numeric +=romanDictionary.get(s.charAt(i));
            }
        }
        numeric += romanDictionary.get(s.charAt(s.length()+1)); // the last character we skipped due to check
        return numeric;
    } // https://leetcode.com/problems/roman-to-integer/submissions/
    // accepted ✔
}
