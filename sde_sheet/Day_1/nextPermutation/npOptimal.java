import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class npOptimal {
  public static List<Integer> nextPermutation(List<Integer> arr) {
    int len = arr.size();

    // Find the break point:
    int breakIdx = -1;

    for (int i = len - 2; i >= 0; i--) {
      if (arr.get(i) < arr.get(i + 1)) {

        // index i is the break point
        breakIdx = i;
        break;
      }
    }

    // If break point does not exist, reverse the whole array:
    if (breakIdx == -1) {
      Collections.reverse(arr);
      return arr;
    }

    // Find the next greater element and swap it with arr[ind]:
    for (int i = len - 1; i > breakIdx; i--) {
      if (arr.get(i) > arr.get(breakIdx)) {
        int tmp = arr.get(i);
        arr.set(i, arr.get(breakIdx));
        arr.set(breakIdx, tmp);
        break;
      }
    }

    // reverse the right half:
    List<Integer> sublist = arr.subList(breakIdx + 1, len);
    Collections.reverse(sublist);

    return arr;
  }

  public static void main(String args[]) {
    List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
    List<Integer> ans = nextPermutation(A);

    System.out.print("The next permutation is: [");
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i) + " ");
    }
    System.out.println("]");
  }
}
