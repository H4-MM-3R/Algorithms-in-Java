import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class npBruteForce {
  private static void recurPermute(int idx, List<Integer> nums, List<List<Integer>> ans) {
    if (idx == nums.size()) {

      List<Integer> ds = new ArrayList<>();
      for (int i = 0; i < nums.size(); i++) {
        ds.add(nums.get(i));
      }

      ans.add(new ArrayList<>(ds));
      return;
    }

    for (int i = idx; i < nums.size(); i++) {
      Collections.swap(nums, i, idx);
      recurPermute(idx + 1, nums, ans);
      Collections.swap(nums, i, idx);
    }
  }

  public static List<List<Integer>> permutate(List<Integer> nums) {
    List<List<Integer>> ans = new ArrayList<>();
    recurPermute(0, nums, ans);
    return ans;
  }

  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();

    for (int i = 0; i < 6; i++) {
      nums.add(i);
    }

    List<List<Integer>> matrix = permutate(nums);

    for (List<Integer> list : matrix) {
      for (int element : list) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}
