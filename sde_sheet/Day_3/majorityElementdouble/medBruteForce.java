package sde_sheet.Day_3.majorityElementdouble;

import java.util.ArrayList;
import java.util.List;

public class medBruteForce {
  public static List<Integer> majorityElement(int[] arr) {
    int len = arr.length;
    List<Integer> temp = new ArrayList<>();

    for (int i = 0; i < len; i++) {
      // selected element is v[i]:
      // Checking if v[i] is not already a part of the answer:
      if (temp.size() == 0 || temp.get(0) != arr[i]) {
        int cnt = 0;
        for (int j = 0; j < len; j++) {
          // counting the frequency of v[i]
          if (arr[j] == arr[i]) {
            cnt++;
          }
        }

        // check if frquency is greater than n/3:
        if (cnt > (len / 3)) temp.add(arr[i]);
      }

      if (temp.size() == 2) break;
    }

    return temp;
  }

  public static void main(String args[]) {
    int[] arr = {11, 33, 33, 11, 33, 11};
    List<Integer> ans = majorityElement(arr);
    System.out.print("The majority elements are: ");
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i) + " ");
    }
    System.out.println();
  }
}
