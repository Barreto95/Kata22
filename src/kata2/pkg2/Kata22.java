package kata2.pkg2;

import java.util.*;

public class Kata22 {

    public static void main(String[] args) {
        int[] data = {1, 1, 1, 100, 2, 4, 5, 6, 8, 8, 4, 5, 6, 2, -4};
        Map<Integer, Integer> histogram = new HashMap<>();

        for (int i : data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
        for (int i = 0; i < data.length; i++) {

            if (!histogram.containsKey(data[i])) {
                histogram.put(data[i], 0);
            }
            histogram.put(data[i], histogram.get(data[i]) + 1);
        }

        for (int key : histogram.keySet()) {
            System.out.println(key + "-->" + histogram.get(key));
        }
    }
}
