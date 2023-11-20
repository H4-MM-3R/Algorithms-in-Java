package General.knapsack;

public class Knapsack_TD {
  public static int knapSack_top_down(int limit, int weights[], int values[], int n) {
    Integer memo[][] = new Integer[n + 1][limit + 1];
    return knapHelper(limit, weights, values, n, memo);
  }

  private static int knapHelper(int limit, int weights[], int values[], int n, Integer memo[][]) {
    if (n == 0 || limit == 0) {
      return 0;
    }

    if (memo[n][limit] != null) {
      return memo[n][limit];
    }

    int result;
    if (weights[n - 1] <= limit) {
      result =
          Math.max(
              knapHelper(limit, weights, values, n - 1, memo),
              values[n - 1] + knapHelper(limit - weights[n - 1], weights, values, n - 1, memo));
    } else {
      result = knapHelper(limit, weights, values, n - 1, memo);
    }

    memo[n][limit] = result;
    return result;
  }

  public static void main(String[] args) {
    int val[] = new int[] {15, 10, 40};
    int w[] = new int[] {1, 2, 3};
    System.out.println(knapSack_top_down(5, w, val, 3));
  }
}
