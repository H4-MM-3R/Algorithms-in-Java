package sde_sheet.Day_2.rotateMatrix;

public class rmBruteForce {

  static int[][] rotate(int[][] matrix) {
    int n = matrix.length;
    int rotated[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        rotated[j][n - i - 1] = matrix[i][j];
      }
    }
    return rotated;
  }

  public static void main(String args[]) {
    int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int rotated[][] = rotate(arr);

    System.out.println("Matrix Original");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Matrix Rotated");
    for (int i = 0; i < rotated.length; i++) {
      for (int j = 0; j < rotated.length; j++) {
        System.out.print(rotated[i][j] + " ");
      }
      System.out.println();
    }
  }
}
