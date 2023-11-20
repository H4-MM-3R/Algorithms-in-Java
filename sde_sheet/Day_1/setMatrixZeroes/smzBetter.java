package sde_sheet.Day_1.setMatrixZeroes;

import java.util.ArrayList;
import java.util.Arrays;

public class smzBetter {
  static ArrayList<ArrayList<Integer>> setZeroes(
      ArrayList<ArrayList<Integer>> matrix, int n, int m) {

    int[] row_arr = new int[n];
    int[] col_arr = new int[m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {

        if (matrix.get(i).get(j) == 0) {

          row_arr[i] = 1; /* mark ith index of row wih 1: */
          col_arr[j] = 1; /* mark jth index of col wih 1: */
        }
      }
    }

    /*
     * ---------------------------------------
     * if row[i] or col[j] is marked with 1.
     * --------------------------------------
     * Mark all (i, j) as 0
     * ----------------------------------------
     */

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (row_arr[i] == 1 || col_arr[j] == 1) {
          matrix.get(i).set(j, 0);
        }
      }
    }

    return matrix;
  }

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
    matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
    matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

    int n = matrix.size();
    int m = matrix.get(0).size();

    System.out.println("The Initial matrix is: ");
    for (ArrayList<Integer> row : matrix) {
      for (Integer ele : row) {
        System.out.print(ele + " ");
      }
      System.out.println();
    }

    System.out.println();

    ArrayList<ArrayList<Integer>> ans = setZeroes(matrix, n, m);

    System.out.println("The Final matrix is: ");
    for (ArrayList<Integer> row : ans) {
      for (Integer ele : row) {
        System.out.print(ele + " ");
      }
      System.out.println();
    }
  }
}
