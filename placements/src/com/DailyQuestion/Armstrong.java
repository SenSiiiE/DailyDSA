package DailyQuestion;

public class Armstrong {
    public static void main(String[] args) {
        for (int i = 100; i<=9999; i++) {
            if(isArmstrong(i)) System.out.println(i);
        }
    }
    public static boolean isArmstrong(int num){
        int x = num;
        int rem = 0;
        int newNum = 0;
        while(x>0){
            rem = x % 10;
            newNum = newNum + rem*rem*rem;
            x = x/10;
        }
        return newNum == num;
    }
}
