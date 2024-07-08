import org.w3c.dom.ls.LSOutput;

public class test {


    public static void main(String[] args) {
        abc a = new abc();
        abc b = new abc();
        abc c = b;

        System.out.println(a == c);
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}

class abc{

}
