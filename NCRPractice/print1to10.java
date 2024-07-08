public class print1to10 {
    public static void main(String[] args) {
        print(10);
    }

    static void print(int n){
        if(n < 1){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
