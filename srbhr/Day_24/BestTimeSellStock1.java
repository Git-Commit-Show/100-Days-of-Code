public class BestTimeSellStock1 {
    public static int maxProfit(int[] array){
        int profit = 0;
        for (int i =0; i < array.length-1; i++){
            for (int j=i+1; j<array.length; j++){
                int currProfit = array[j] - array[i];
                profit = Math.max(profit, currProfit);
            }
        }
        return profit;
    }
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
