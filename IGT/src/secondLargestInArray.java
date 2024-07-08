public class secondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1};
        System.out.println(second(arr));
    }

    public static int second(int[] a){
        int m = Integer.MIN_VALUE;
        int sm = m;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m){
                sm = m;
                m = a[i];
            }else if(a[i] > sm){
                sm = a[i];
            }
        }
        return sm;
    }
}
