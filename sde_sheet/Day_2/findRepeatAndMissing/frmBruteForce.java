package sde_sheet.Day_2.findRepeatAndMissing;

public class frmBruteForce {
  public static int[] findMissingRepeatingNumbers(int[] arr) {
    int len = arr.length; // size of the array
    int repeating = -1, missing = -1;

    // Find the repeating and missing number:
    for (int i = 1; i <= len; i++) {

      int count = 0;
      for (int j = 0; j < len; j++) {
        if (arr[j] == i) count++;
      }

      if (count == 2) repeating = i;
      else if (count == 0) missing = i;

      if (repeating != -1 && missing != -1) break;
    }
    int[] ans = {repeating, missing};
    return ans;
  }

  public static void main(String[] args) {
    int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
    int[] ans = findMissingRepeatingNumbers(a);
    System.out.println("The repeating and missing numbers are: {" + ans[0] + ", " + ans[1] + "}");
  }
}
