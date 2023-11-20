package sde_sheet.Day_1.pascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class pt3 {

  public static int nCr(int n, int r) {
    long ans = 1;

    for (int i = 0; i < r; i++) {
      ans = ans * (n - i);
      ans = ans / (i + 1);
    }
    return (int) ans;
  }

  public static List<List<Integer>> pascalTriangle(int n) {
    List<List<Integer>> ans = new ArrayList<>();

    for (int row = 1; row <= n; row++) {

      List<Integer> temp = new ArrayList<>();

      for (int col = 1; col <= row; col++) {
        temp.add(nCr(row - 1, col - 1));
      }

      ans.add(temp);
    }
    return ans;
  }

  public static void main(String[] args) {
    int n = 5;
    List<List<Integer>> ans = pascalTriangle(n);

    for (List<Integer> it : ans) {
      for (int ele : it) {
        System.out.print(ele + " ");
      }

      System.out.println();
    }
  }
}
