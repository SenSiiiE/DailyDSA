import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        int[] a = {0, -1, 2, -3, 1};
        System.out.println(Arrays.toString(pair(a, -3)));
    }
    static int[] pair(int[] a, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int comp = target - a[i];
            if(map.containsKey(comp)){
                return new int[]{i, map.get(comp)};
            }
            map.put(a[i], i);
        }
        return new int[]{-1,-1};
    }
}
