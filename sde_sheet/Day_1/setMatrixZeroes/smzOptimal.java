import java.util.ArrayList;
import java.util.Arrays;

public class smzOptimal {
  static ArrayList<ArrayList<Integer>> setZeroes(
      ArrayList<ArrayList<Integer>> matrix, int n, int m) {

    // int[] row = new int[n]; --> matrix[..][0]
    // int[] col = new int[m]; --> matrix[0][..]

    int col0 = 1;

    /*
     * -------------------------------
     * Mark 1st row & col accordingly:
     * ----------------------------
     */

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {

        if (matrix.get(i).get(j) == 0) {
          /*
           * mark i-th row:
           */
          matrix.get(i).set(0, 0);

          if (j != 0) {
            /*
             * mark j-th column:
             */
            matrix.get(0).set(j, 0);
          } else col0 = 0;
        }
      }
    }

    /*
     * -------------------------------------
     * Mark with 0 from (1,1) to (n-1, m-1):
     * -------------------------------------
     */
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < m; j++) {
        if (matrix.get(i).get(j) != 0) {
          if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
            matrix.get(i).set(j, 0);
          }
        }
      }
    }

    /*
     * ----------------------------------------
     * Finally mark the 1st col & then 1st row:
     * ----------------------------------------
     */
    if (matrix.get(0).get(0) == 0) {
      for (int j = 0; j < m; j++) {
        matrix.get(0).set(j, 0);
      }
    }
    if (col0 == 0) {
      for (int i = 0; i < n; i++) {
        matrix.get(i).set(0, 0);
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
