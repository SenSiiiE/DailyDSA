package DailyQuestion;

import java.util.Arrays;

public class Q2169 {
    public static void main(String[] args) {
        int[] arr = {10,7,-1,-3,-9,1};
        System.out.println(Arrays.toString(newArray(arr)));;
    }

    private static int[] newArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0, j = 0, k = 1; i < n; i++){
            if(nums[i]>0){
                ans[j] = nums[i];
                j = j + 2;
            }else{
                ans[k] = nums[i];
                k = k + 2;
            }
        }
        return ans;

    }
}
