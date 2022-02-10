class Solution {
    public String reverseWords(String s) {
        String[] split=s.split(" ");
        StringBuilder res=new StringBuilder();
        
        for(String word: split){
            StringBuilder string=new StringBuilder();
            string.append(word);
            string.reverse();
            res.append(string.toString()+" ");
        }
        res.setLength(res.length()-1);
            
        return res.toString();
    }
}