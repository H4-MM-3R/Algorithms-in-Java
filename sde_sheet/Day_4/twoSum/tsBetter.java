package sde_sheet.Day_4.twoSum;

import java.util.HashMap;

public class tsBetter {
  public static String twoSum(int n, int[] arr, int target) {
    HashMap<Integer, Integer> mpp = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int num = arr[i];
      int moreNeeded = target - num;
      if (mpp.containsKey(moreNeeded)) {
        return "Yes there exists a pair";
      }

      mpp.put(arr[i], i);
    }
    return "There is no pair";
  }

  public static void main(String args[]) {
    int n = 5;
    int[] arr = {2, 6, 5, 8, 11};
    int target = 14;
    String ans = twoSum(n, arr, target);
    System.out.println(ans);
  }
}
