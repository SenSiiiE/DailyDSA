public class reverseString {
    public static void main(String[] args) {
        System.out.println(rev("Vikash Sharma"));
    }

    static String rev(String s){
        StringBuffer sbr = new StringBuffer(s);
        for (int i = 0; i < s.length(); i++) {
            sbr.setCharAt(i, s.charAt(s.length() - i - 1));
        }

        return sbr.toString();
    }
}
