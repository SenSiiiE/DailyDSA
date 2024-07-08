public class numberOfRotationInSortedArray {
    public static void main(String[] args) {
        int[] a = {8, 9, 10, 2, 5, 6};
        System.out.println(rotation(a));
    }
    static int rotation(int[] a){
        int s = 0;
        int e = a.length - 1;
        int ans = 0;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(a[mid] < a[ans]){
                ans = mid;
            }
            if(a[s] < a[e]){
                if(a[ans] > a[s]){
                    return s;
                }
                return ans;
            }else if(a[s] <= a[mid]){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return ans;
    }
}
