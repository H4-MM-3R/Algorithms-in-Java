

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AggressiveCowsFunc {
  static boolean canPlace(List<Integer> stalls, int k, int mid) {
    int temp = Integer.MIN_VALUE;
    for (Integer ele : stalls) {
      if (temp == Integer.MIN_VALUE || ele - temp >= mid) {
        k--;
        temp = ele;
      }
      if (k == 0) return true;
    }
    return false;
  }

  static int aggressiveCows(List<Integer> stalls, int k) {
    int len = stalls.size();
    Collections.sort(stalls);
    int l = 1;
    int r = stalls.get(len - 1) - stalls.get(0);

    while (l <= r) {
      int mid = (l + r) / 2;

      if (canPlace(stalls, k, mid)) {
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }
    return r;
  }

  public static void main(String[] args) {
    List<Integer> stalls = Arrays.asList(0, 3, 4, 7, 10, 9);
    int k = 4;
    int ans = aggressiveCows(stalls, k);
    System.out.println("The max possible distance is :" + ans);
  }
}
