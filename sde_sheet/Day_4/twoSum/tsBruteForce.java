public class tsBruteForce {
  public static boolean twoSum(int n, int[] arr, int target) {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] + arr[j] == target) return true;
      }
    }
    return false;
  }

  public static void main(String args[]) {
    int n = 5;
    int[] arr = {2, 6, 5, 8, 11};
    int target = 14;
    boolean ans = twoSum(n, arr, target);
    System.out.println(ans ? "Yes there exists a Pair" : "No there is no pair");
  }
}
