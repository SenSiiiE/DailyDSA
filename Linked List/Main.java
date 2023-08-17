public class Main {
    public static void main(String[] args) {

        int x = 23;
        x >>>= 1;
        System.out.println(x);
//        System.out.println(longestSubsequence(16, new int[]{0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15}));
    }
    static int longestSubsequence(int size, int a[])
    {
        int len = 1;
        int max = len;
        for(int i = 1; i < a.length; i++){
            if(a[i] > a[i-1]){
                len++;
            }else{
                max = Math.max(len, max);
                len = 1;
            }
        }
        return max;
    }
}
