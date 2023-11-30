

import java.util.HashSet;
import java.util.Set;

public class lswdBruteForce {
  static int solve(String str) {

    if (str.length() == 0) return 0;
    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < str.length(); i++) // outer loop for traversing the string
    {
      Set<Character> s = new HashSet<>();
      for (int j = i;
          j < str.length();
          j++) // nested loop for getting different string starting with str[i]
      {
        if (s.contains(
            str.charAt(j))) // if element if found so mark it as ans and break from the loop
        {
          ans = Math.max(ans, j - i);
          break;
        }
        s.add(str.charAt(j));
      }
    }
    return ans;
  }

  public static void main(String args[]) {
    String str = "HemramKumarapu";
    System.out.println(solve(str));
  }
}
