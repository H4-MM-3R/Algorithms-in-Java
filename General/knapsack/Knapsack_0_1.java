package General.knapsack;

public class Knapsack_0_1 {
  public static int knapSack(int limit, int weights[], int values[], int n) {
    if (n == 0 || limit == 0) {
      return 0;
    }

    if (weights[n - 1] > limit) {
      return knapSack(limit, weights, values, n - 1);
    }

    return Math.max(
        values[n - 1] + knapSack(limit - weights[n - 1], weights, values, n - 1),
        knapSack(limit, weights, values, n - 1));
  }

  public static void main(String[] args) {

    int values[] = new int[] {15, 10, 40};
    int weights[] = new int[] {1, 2, 3};
    int limit = 5;
    int n = values.length;
    System.out.println(knapSack(limit, weights, values, n));
  }
}
