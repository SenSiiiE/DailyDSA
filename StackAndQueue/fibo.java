public class fibo {
    public static void main(String[] args){
        int n = 10;
        int a = 1;
        int b = -1;
        int c = a + b;
        int temp = 0;
        for(int i = 1; i < n; i++){
            temp = c+a;
            System.out.println(c);
            c = a;
            a = temp;
        }
    }
}
