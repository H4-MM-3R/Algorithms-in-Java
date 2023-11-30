import java.util.Arrays;

public class tsOptimal {
  public static String twoSum(int n, int[] arr, int target) {
    Arrays.sort(arr);
    int left = 0, right = n - 1;
    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == target) {
        return "Yes there exists a pair";
      } else if (sum < target) left++;
      else right--;
    }
    return "No there is no pair exists";
  }

  public static void main(String args[]) {
    int n = 5;
    int[] arr = {2, 6, 5, 8, 11};
    int target = 14;
    String ans = twoSum(n, arr, target);
    System.out.println(ans);
  }
}
