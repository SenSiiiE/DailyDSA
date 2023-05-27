package DailyQuestion;

public class MinMax {
    public static void main(String[] args) {
        int [] arr = {3,9,1,7,5};

        //max element
        int ansMax = max(arr);
        System.out.println("Max element is "+ansMax);

        //minimum element
        int ansMin = min(arr);
        System.out.println("Min element is "+ansMin);
    }

    private static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min) min = arr[i];
        }
        return min;
    }

    private static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
}
