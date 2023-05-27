package DailyQuestion;

public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int ans = addBin(a1, b1);
        String sb = Integer.toBinaryString(ans);
        System.out.println(sb);
    }

    private static int addBin(int a1, int b1) {
        int sum = a1+b1;
        return sum;
    }
}
