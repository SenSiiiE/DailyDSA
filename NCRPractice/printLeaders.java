public class printLeaders {
    public static void main(String[] args) {
        int[] a = {16,19,3,4,8,3};
//        Leaders(a);
        System.out.println(3/4);
    }
    static void Leaders(int[] a){
        System.out.println(a[a.length - 1]);
        int j = a.length - 1;
        for (int i = a.length - 2; i >= 0; i--) {
            if(a[i] > a[j]){
                System.out.println(a[i]);
                j = i;
            }
        }
    }
}
