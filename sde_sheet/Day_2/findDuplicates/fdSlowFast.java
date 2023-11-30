

public class fdSlowFast {
  public static int findDuplicate(int[] nums) {
    int slow = nums[nums[0]];
    int fast = nums[nums[nums[0]]];

    while (slow != fast) {
      slow = nums[slow];
      fast = nums[nums[fast]];
    }

    fast = nums[0]; // again to the start

    // repeat
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }

    return slow;
  }

  public static void main(String args[]) {
    int arr[] = {3, 1, 4, 2, 1};
    System.out.println("The duplicate element is " + findDuplicate(arr));
  }
}
