package sde_sheet.Day_1.nextPermutation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class npOptimal {
  public static List<Integer> nextGreaterPermutation(List<Integer> arr) {
    int n = arr.size();

    // Find the break point:
    int ind = -1; // break point

    for (int i = n - 2; i >= 0; i--) {
      if (arr.get(i) < arr.get(i + 1)) {

        // index i is the break point
        ind = i;
        break;
      }
    }

    // If break point does not exist, reverse the whole array:
    if (ind == -1) {
      Collections.reverse(arr);
      return arr;
    }

    // Find the next greater element and swap it with arr[ind]:
    for (int i = n - 1; i > ind; i--) {
      if (arr.get(i) > arr.get(ind)) {
        int tmp = arr.get(i);
        arr.set(i, arr.get(ind));
        arr.set(ind, tmp);
        break;
      }
    }

    // reverse the right half:
    List<Integer> sublist = arr.subList(ind + 1, n);
    Collections.reverse(sublist);

    return arr;
  }

  public static void main(String args[]) {
    List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
    List<Integer> ans = nextGreaterPermutation(A);

    System.out.print("The next permutation is: [");
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i) + " ");
    }
    System.out.println("]");
  }
}
