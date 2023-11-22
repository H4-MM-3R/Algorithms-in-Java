package sde_sheet.Day_2.findRepeatAndMissing;

public class frmHashing {
  public static int[] findMissingRepeatingNumbers(int[] a) {
    int len = a.length; // size of the array
    //
    int[] freq = new int[len + 1];

    for (int i = 0; i < len; i++) {
      freq[a[i]]++;
    }

    int repeating = -1;
    int missing = -1;

    for (int i = 1; i <= len; i++) {
      if (freq[i] == 2) repeating = i;
      else if (freq[i] == 0) missing = i;

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
