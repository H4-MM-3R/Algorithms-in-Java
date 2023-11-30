public class mssBetter {
  public static int maxSubarraySum(int[] arr) {
    int n = arr.length;

    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {

      int sum = 0;
      for (int j = i; j < n; j++) {

        // subarray = arr[i.....j]

        /*
         * ----------------------------------------------------
         * Sum of arr[i ... j] = Sum of arr[i ... j-1] + arr[j]
         * --------------------------------------------------
         */

        sum += arr[j];

        // check if sum greater than maxSum
        maxSum = Math.max(maxSum, sum);
      }
    }

    return maxSum;
  }

  public static void main(String args[]) {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int maxSum = maxSubarraySum(arr);
    System.out.println("The maximum subarray sum is: " + maxSum);
  }
}
