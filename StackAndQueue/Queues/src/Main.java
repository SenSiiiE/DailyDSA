import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue q = new CustomQueue(5 );

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.display();
        System.out.println(q.isEmpty());
    }
}