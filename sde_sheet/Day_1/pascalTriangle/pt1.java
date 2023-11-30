public class pt1 {
  static long nCr(int n, int r) {
    long ans = 1;

    for (int i = 0; i < r; i++) {
      ans = ans * (n - i);
      ans = ans / (i + 1);
    }
    return ans;
  }

  public static int pascalTriangle(int row, int column) {
    int element = (int) nCr(row - 1, column - 1);
    return element;
  }

  public static void main(String[] args) {
    int r = 5; // row number
    int c = 3; // col number
    int element = pascalTriangle(r, c);
    System.out.println("The element at position (r,c) is: " + element);
  }
}
