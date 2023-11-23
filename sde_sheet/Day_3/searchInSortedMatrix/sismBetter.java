package sde_sheet.Day_3.searchInSortedMatrix;

import java.util.ArrayList;
import java.util.Arrays;

public class sismBetter {
  public static boolean binarySearch(ArrayList<Integer> nums, int target) {
    int len = nums.size();
    int start = 0, end = len - 1;

    while (start <= end) {
      int mid = (start + end) / 2;
      if (nums.get(mid) == target) {
        return true;
      } else if (target > nums.get(mid)) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return false;
  }

  public static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
    int n = matrix.size();
    int m = matrix.get(0).size();

    for (int i = 0; i < n; i++) {
      if (matrix.get(i).get(0) <= target && target <= matrix.get(i).get(m - 1)) {
        return binarySearch(matrix.get(i), target);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
    matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
    matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

    boolean result = searchMatrix(matrix, 8);
    System.out.println(result ? "true" : "false");
  }
}
