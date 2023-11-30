

public class xpnBinaryExponentiation {
  static double Pow(double x, int n) {
    double ans = 1.0;
    long nn = n;
    if (nn < 0) {
      nn *= -1;
    }
    while (nn > 0) {
      if (nn % 2 == 1) {
        ans *= x;
        nn -= 1;
      } else {
        x *= x;
        nn /= 2;
      }
    }
    if (n < 0) {
      ans = (double) (1.0) / (double) (ans);
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(Pow(2, 10));
  }
}
