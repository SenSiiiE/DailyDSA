package DailyQuestion;

public class Q169_majority {
    public static void main(String[] args) {
        int[] nums = {3,3,4};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int major = 0;
        for(int i = 0; i<nums.length; i++){
            if(count == 0) {
                major = nums[i];
                count++;
            }
            else if(major == nums[i]) count++;

            if(major != nums[i]) count--;
        }
        return major;
    }
}
