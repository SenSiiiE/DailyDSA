public class normalTriangle {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for (int i = 1; i <= n ; i = i + 2) {
            int num = (n - i) / 2;
            for (int j = 0; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
