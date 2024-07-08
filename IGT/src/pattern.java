import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if (row >= col) {
                    System.out.print("*");
                } else if (col <= (size * 2 - 1) - (row)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
