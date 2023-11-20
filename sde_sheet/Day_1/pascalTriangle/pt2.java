package sde_sheet.Day_1.pascalTriangle;

public class pt2 {
  static long nCr(int n, int r) {
    long ans = 1;

    for (int i = 0; i < r; i++) {
      ans = ans * (n - i);
      ans = ans / (i + 1);
    }
    return ans;
  }

  static void pascalTriangle(int row_num) {

    for (int i = 1; i <= row_num; i++) {
      System.out.print(nCr(row_num - 1, i - 1) + " ");
    }

    System.out.println();
  }

  public static void main(String[] args) {
    int row_num = 5;
    pascalTriangle(row_num);
  }
}
