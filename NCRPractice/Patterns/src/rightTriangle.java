public class rightTriangle {
    public static void main(String[] args) {
//        printPattern(5);
        reverse(5);
    }
    static void reverse(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void printPattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
