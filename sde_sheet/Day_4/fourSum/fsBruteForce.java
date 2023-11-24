package sde_sheet.Day_4.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class fsBruteForce {
  public static List<List<Integer>> fourSum(int[] nums, int target) {
    int n = nums.length; // size of the array
    Set<List<Integer>> set = new HashSet<>();

    // checking all possible quadruplets:
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          for (int l = k + 1; l < n; l++) {
            // taking bigger data type
            // to avoid integer overflow:
            long sum = (long) nums[i] + nums[j];
            sum += nums[k];
            sum += nums[l];

            if (sum == target) {
              List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
              Collections.sort(temp);
              set.add(temp);
            }
          }
        }
      }
    }
    List<List<Integer>> ans = new ArrayList<>(set);
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
    int target = 9;
    List<List<Integer>> ans = fourSum(nums, target);
    System.out.println("The quadruplets are: ");
    for (List<Integer> it : ans) {
      System.out.print("[");
      for (int ele : it) {
        System.out.print(ele + " ");
      }
      System.out.print("] ");
    }
    System.out.println();
  }
}
