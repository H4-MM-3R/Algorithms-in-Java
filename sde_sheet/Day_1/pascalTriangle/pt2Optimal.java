package sde_sheet.Day_1.pascalTriangle;

public class pt2Optimal {
  static void pascalTriangle(int n) {
    long ans = 1;

    /*
     * Print first element
     */
    System.out.print(ans + " ");

    /*
     * Print the rest
     */
    for (int i = 1; i < n; i++) {
      ans = ans * (n - i);
      ans = ans / i;
      System.out.print(ans + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int n = 5;
    pascalTriangle(n);
  }
}
