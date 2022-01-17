class reverseInteger {
    public int reverse(int x) {
        long rev=0;
        int temp;
        
        while(x!=0){
            temp=x%10;
            rev=(rev*10)+temp;
            x=x/10;
            
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
            }
        }
        
        return (int) rev;
    }
}