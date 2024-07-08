public class duplicateInArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,2};
        System.out.println(duplicate(a));
    }

    static int duplicate(int[] a){
        int n = a.length - 1;
        int sum1 = (n+1) * n / 2;
        int sum2 = 0;

        for (int i = 0; i <= n; i++) {
            sum2 += a[i];
        }
        return sum2 - sum1;
    }
}
