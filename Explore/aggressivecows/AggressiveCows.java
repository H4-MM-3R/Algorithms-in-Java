

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AggressiveCows {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {

      int n = sc.nextInt();

      int[][] arr = new int[n][2];

      for (int i = 0; i < n; i++) {
        arr[i][0] = sc.nextInt();
        arr[i][1] = sc.nextInt();
      }

      int l = sc.nextInt();
      int p = sc.nextInt();

      for (int i = 0; i < n; i++) {
        arr[i][0] = l - arr[i][0];
      }

      Arrays.sort(arr, (x, y) -> Integer.compare(x[0], y[0]));

      int ans = 0;
      int curr = p;

      PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
      boolean flag = false;

      for (int i = 0; i < n; i++) {
        if (curr >= l) {
          break;
        }

        while (curr < arr[i][0]) {
          if (pq.isEmpty()) {
            flag = true;
            break;
          }
          ans++;
          curr += pq.poll();
        }
        if (flag) break;

        pq.offer(arr[i][1]);
      }

      if (flag) {
        System.out.println("-1");
        continue;
      }

      while (!pq.isEmpty() && curr < 1) {
        curr += pq.poll();
        ans++;
      }

      if (curr < 1) {
        System.out.println("-1");
        continue;
      }

      System.out.println(ans);
    }
    sc.close();
  }
}
