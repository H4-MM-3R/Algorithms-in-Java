

public class frmOptimalXOR {
  public static int[] findMissingRepeatingNumbers(int[] arr) {
    int len = arr.length;
    int xr = 0;

    // Step 1: Find XOR of all elements:
    for (int i = 0; i < len; i++) {
      xr = xr ^ arr[i];
      xr = xr ^ (i + 1);
    }

    // Step 2: Find the differentiating bit number:
    int number = (xr & ~(xr - 1));

    // Step 3: Group the numbers:
    int zero = 0;
    int one = 0;
    for (int i = 0; i < len; i++) {

      // part of 1 group:
      if ((arr[i] & number) != 0) {
        one = one ^ arr[i];
      }

      // part of 0 group:
      else {
        zero = zero ^ arr[i];
      }
    }

    for (int i = 1; i <= len; i++) {

      // part of 1 group:
      if ((i & number) != 0) {
        one = one ^ i;
      }

      // part of 0 group:
      else {
        zero = zero ^ i;
      }
    }

    // Last step: Identify the numbers:
    int cnt = 0;
    for (int i = 0; i < len; i++) {
      if (arr[i] == zero) cnt++;
    }

    if (cnt == 2) return new int[] {zero, one};
    return new int[] {one, zero};
  }

  public static void main(String[] args) {
    int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
    int[] ans = findMissingRepeatingNumbers(a);
    System.out.println("The repeating and missing numbers are: {" + ans[0] + ", " + ans[1] + "}");
  }
}
