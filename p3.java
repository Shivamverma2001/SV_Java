import java.util.*;

public class p3 {
    public static int[] orderPizza(int[] orderPlaced, int size) {
        int[] answer = new int[100];
        for (int i = 0; i < orderPlaced.length - 4; i++) {
            int ans = 0;
            if (orderPlaced[i] >= 0 && orderPlaced[i + 1] >= 0 && orderPlaced[i + 2] >= 0) {
                ans = 0;
            } else {
                if (orderPlaced[i] < 0)
                    ans = orderPlaced[i];
                else if (orderPlaced[i + 1] < 0)
                    ans = orderPlaced[i];
                else if (orderPlaced[i + 2] < 0)
                    ans = orderPlaced[i + 2];
            }
            answer[i] = ans;
        }
        return answer;
    }
}