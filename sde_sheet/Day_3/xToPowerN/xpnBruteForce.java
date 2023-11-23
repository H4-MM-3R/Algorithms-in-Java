package sde_sheet.Day_3.xToPowerN;

public class xpnBruteForce {
  static double Pow(double x, double n) {
    double ans = 1.0;
    for (int i = 0; i < n; i++) {
      ans *= x;
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(Pow(2, 10));
  }
}
