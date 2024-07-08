//Best Time to Buy and Sell Stock
public class Stock {
    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        System.out.println((bestTime(a)));
    }

    static int bestTime(int[] a){
        int j = 0;
        int profit = 0;
        int maxProfit = 0;
        for (int i = 1; i < a.length; i++) {
            if(a[i] > a[j]){
                profit = a[i] - a[j];
            }else if(a[j] > a[i]){
                j = i;
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
