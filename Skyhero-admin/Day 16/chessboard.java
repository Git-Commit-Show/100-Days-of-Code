class Solution {
    public boolean squareIsWhite(String coordinates) {
        char move[]=coordinates.toCharArray();
        if(((int)move[0]+(int)move[1])%2==0){
            return false;
        }
        return true;
    }
}