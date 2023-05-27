package DailyQuestion;


public class Q121_Stock {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxPorfit(prices));
    }

    private static int maxPorfit(int[] prices) {
        int min = 0;
        for(int i = 0; i<prices.length; i++ ){
            if(prices[i]<prices[min]){
                min = i;
            }
        }
        int best = 0;
        int bestIndex = min;
        for(int i = min; i< prices.length; i++){

            if(prices[i]-prices[min] > best){
                best = prices[i]-prices[min];
                bestIndex = i;
            }
        }

        return prices[bestIndex]-prices[min];
    }
}
