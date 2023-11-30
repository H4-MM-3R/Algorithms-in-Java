import java.util.Arrays;

public class gupDP {

  static int uniquePaths(int n, int m) {
    int[][] memo = new int[n + 1][m + 1];
    for (int[] row : memo) {
      Arrays.fill(row, -1);
    }
    int num = countPaths(0, 0, n, m, memo);

    if (m == 1 && n == 1) {
      return num;
    }
    return memo[0][0];
  }

  static int countPaths(int i, int j, int n, int m, int[][] memo) {
    if (i == (n - 1) && j == (m - 1)) {
      return 1;
    }
    if (i >= n || j >= m) {
      return 0;
    }
    if (memo[i][j] != -1) {
      return memo[i][j];
    }
    return memo[i][j] = countPaths(i + 1, j, n, m, memo) + countPaths(i, j + 1, n, m, memo);
  }

  public static void main(String[] args) {
    int totalCount = uniquePaths(3, 7);
    System.out.println("Total number of unique paths are:" + totalCount);
  }
}
