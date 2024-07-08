public class ThrowsCheck {
    public static void main(String[] args) {
        divide(1,0);
    }

    public static void divide(int a, int b){
//            int c = 1/0;
            b = 0;
            if(b == 0) {
                throw new ArithmeticException();
            }
    }
}
