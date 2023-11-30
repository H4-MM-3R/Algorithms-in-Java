

public class gupCombinatorics {
  static int uniquePaths(int m, int n) {
    int N = n + m - 2;
    int r = m - 1;
    double ans = 1;

    for (int i = 1; i <= r; i++) {
      ans *= (N - r + i) / i;
    }
    return (int) ans;
  }

  public static void main(String[] args) {
    int totalCount = uniquePaths(3, 7);
    System.out.println("The Total number of Unique Paths are: " + totalCount);
  }
}
