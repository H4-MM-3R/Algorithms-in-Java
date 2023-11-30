import java.util.ArrayList;
import java.util.Arrays;

public class smzBruteforce {
  static void markRow(ArrayList<ArrayList<Integer>> matrix, int m, int row) {
    /*
     * -------------------------------------------
     * Set all Non-Zero elements to -1 in the row
     * ------------------------------------------
     */
    for (int i = 0; i < m; i++) {
      if (matrix.get(row).get(i) != 0) {
        matrix.get(row).set(i, -1);
      }
    }
  }

  static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int column) {
    /*
     * ---------------------------------------------
     * Set all Non-Zero elements to -1 in the column
     * -------------------------------------------
     */
    for (int i = 0; i < n; i++) {
      if (matrix.get(i).get(column) != 0) {
        matrix.get(i).set(column, -1);
      }
    }
  }

  static ArrayList<ArrayList<Integer>> setZeroes(
      ArrayList<ArrayList<Integer>> matrix, int n, int m) {
    /*
     * -------------------------------------------
     * Set -1 for rows and cols that contains 0.
     * -------------------------------------------
     * Don't mark element as -1 which is already 0:
     * -----------------------------------------
     */
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix.get(i).get(j) == 0) {
          markRow(matrix, m, i);
          markCol(matrix, n, j);
        }
      }
    }
    /*
     * -----------------
     * Mark all -1 as 0:
     * ---------------
     */
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix.get(i).get(j) == -1) {
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
