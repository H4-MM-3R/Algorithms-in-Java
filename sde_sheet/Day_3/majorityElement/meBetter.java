

import java.util.HashMap;
import java.util.Map;

public class meBetter {
  public static int majorityElement(int[] arr) {

    int len = arr.length;

    HashMap<Integer, Integer> freq = new HashMap<>();

    for (int i = 0; i < len; i++) {
      int value = freq.getOrDefault(arr[i], 0);
      freq.put(arr[i], value + 1);
    }

    // searching for the majority element:
    for (Map.Entry<Integer, Integer> ele : freq.entrySet()) {
      if (ele.getValue() > (len / 2)) {
        return ele.getKey();
      }
    }

    return -1;
  }

  public static void main(String args[]) {
    int[] arr = {2, 2, 1, 1, 1, 2, 2};
    int ans = majorityElement(arr);
    System.out.println("The majority element is: " + ans);
  }
}
