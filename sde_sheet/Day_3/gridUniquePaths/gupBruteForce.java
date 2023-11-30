

public class gupBruteForce {

  static int countPaths(int i, int j, int n, int m) {
    if (i == (n - 1) && j == (m - 1)) {
      return 1;
    }
    if (i >= n || j >= m) {
      return 0;
    }
    return countPaths(i + 1, j, n, m) + countPaths(i, j + 1, n, m);
  }

  static int uniquePaths(int m, int n) {
    return countPaths(0, 0, m, n);
  }

  public static void main(String[] args) {
    int totalCount = uniquePaths(3, 7);
    System.out.println("The total number of unique paths are:" + totalCount);
  }
}
