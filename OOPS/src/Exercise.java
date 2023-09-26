import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>(3);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String element = sc.next();
            c1.add(element);
        }

        // Call the increaseArrayCapacity function with c1 and sc as arguments.
        c1 = increaseArrayCapacity(c1, sc);

        // Print the updated ArrayList c1
        System.out.println("Updated ArrayList:");
        for (String element : c1) {
            System.out.println(element);
        }
    }

    public static ArrayList<String> increaseArrayCapacity(ArrayList<String> list, Scanner sc) {
        System.out.println("Enter the number of additional elements to add:");
        int additionalElements = sc.nextInt();

        // Increase the capacity of the ArrayList
        list.ensureCapacity(list.size() + additionalElements);

        // Add new elements
        for (int i = 0; i < additionalElements; i++) {
            System.out.println("Enter element #" + (i + 1) + ":");
            String element = sc.next();
            list.add(element);
        }

        return list;
    }
}