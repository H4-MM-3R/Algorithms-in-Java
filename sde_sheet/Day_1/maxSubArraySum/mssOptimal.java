public class mssOptimal {
  /*
   * -------------------
   * KADANE 'S ALGORITHM
   * -----------------
   */
  public static int maxSubarraySum(int[] arr) {
    int len = arr.length;

    int maxSum = Integer.MIN_VALUE;
    int sum = 0;

    for (int i = 0; i < len; i++) {

      sum += arr[i];

      if (sum > maxSum) {
        maxSum = sum;
      }
      /*
       * If sum < 0:
       * --------------------------
       * discard the sum calculated
       * --------------------------
       */

      if (sum < 0) {
        sum = 0;
      }
    }

    return maxSum;
  }

  public static void main(String args[]) {
    int[] arr = {-2, 4, 5, -6, -9, 10, -8, 11};
    int maxSum = maxSubarraySum(arr);
    System.out.println("The maximum subarray sum is: " + maxSum);
  }
}
