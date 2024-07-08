public class Practice {
    public static void main(String[] args) {
        System.out.println(isPrime(25));
    }
    static int isPrime(int n){
        boolean flag = false;
        int i = 2;
        for (i = 2; i < n; i++) {
            if(n % i == 0){
                return i;
            }
        }
        return 1;
    }
}
