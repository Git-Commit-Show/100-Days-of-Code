class Solution {
    public String firstPalindrome(String[] words) {
        char ch;
        String res="";
        for(String i: words){
            
            for(int j=0;j<i.length();j++){
                ch=i.charAt(j);
                res=ch+res;
            }
            if(res.equals(i))
                return res;
            res="";
        }
        return res;
    }
}