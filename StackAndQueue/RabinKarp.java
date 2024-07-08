import java.util.HashMap;

public class RabinKarp {
    public static void main(String[] args) {
        String s = "ccaccaaedba";
        String p = "dba";
        stringMatch(s,p);
    }
    static boolean stringMatch(String s, String p){
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "abcdef";

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), i + 1);
        }

        int patternHashCode = 0;
        for (int i =0; i < p.length(); i++) {
            int temp = map.get(p.charAt(p.length() - 1 - i));
            patternHashCode += temp * (int) Math.pow(map.size(), i);
//            patternHashCode = temp * patternHashCode;
        }
        System.out.println(patternHashCode);
        return true;
    }
}
