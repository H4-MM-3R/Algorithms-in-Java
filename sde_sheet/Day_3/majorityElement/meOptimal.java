

/* ------------------------
 * Moore's Voting Algorithm
 * ----------------------
 *  */
public class meOptimal {
  public static int majorityElement(int[] arr) {

    int len = arr.length;
    int count = 0;
    int ele = 0;

    for (int i = 0; i < len; i++) {
      if (count == 0) {
        count = 1;
        ele = arr[i];
      } else if (ele == arr[i]) count++;
      else count--;
    }

    // checking if the stored element is the majority element:
    int cnt1 = 0;
    for (int i = 0; i < len; i++) {
      if (arr[i] == ele) cnt1++;
    }

    if (cnt1 > (len / 2)) return ele;
    return -1;
  }

  public static void main(String args[]) {
    int[] arr = {2, 2, 1, 1, 1, 2, 2};
    int ans = majorityElement(arr);
    System.out.println("The majority element is: " + ans);
  }
}
