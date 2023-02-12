
import java.util.*;

public class MainPrac {
    public static int morethanNdK(int[] arr, int n, int k) {
        HashMap<Integer, Integer> ans = new HashMap<Integer, Integer>();
        int x = n / k;// 3
        for (int i = 0; i < arr.length; i++) {// 0 to n
            if (!ans.containsKey(arr[i])) {
                ans.put(arr[i], 1);// 2,1
            } else {
                int count = ans.get(arr[i]);
                ans.put(arr[i], count + 1);// ((1,5),(2,4),(3,2),(4,1),(5,1))
            }
        }
        for (Map.Entry m : ans.entrySet()) {
            Integer temp = (Integer) m.getValue();
            if (temp > x)
                System.out.println(m.getKey());
        }
        return 1;
    }

    public static void main(String[] args) {
        int a[] = new int[] { 3, 2, 3 };// 13
        int n = 3;
        int k = 3;
        System.out.println(morethanNdK(a, n, k));
    }
}