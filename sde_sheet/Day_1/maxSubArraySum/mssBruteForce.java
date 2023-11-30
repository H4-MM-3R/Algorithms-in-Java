public class mssBruteForce {
  public static int maxSubarraySum(int[] arr) {
    int len = arr.length;

    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < len; i++) {
      for (int j = i; j < len; j++) {

        // subarray = arr[i.....j]
        int sum = 0;

        // add all the elements of subarray:
        for (int k = i; k <= j; k++) {
          sum += arr[k];
        }

        // check if sum is greater that maxSum
        maxSum = Math.max(maxSum, sum);
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
