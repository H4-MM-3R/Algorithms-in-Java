import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day1Part1 {

  /*
   * -----------------
   * Number Extraction
   * ----------------
   */
  public static int extractNumber(String input) {
    StringBuilder digits = new StringBuilder();

    /*
     * -------------------------
     * Regex for matching Digits
     * ------------------------
     */
    Pattern pattern = Pattern.compile("\\d+");

    Matcher matcher = pattern.matcher(input);
    while (matcher.find()) {
      digits.append(matcher.group());
    }

    /*
     * ---------------------------
     * Adding first and last digit
     * -------------------------
     */
    String number = "";
    number += digits.charAt(0);
    number += digits.charAt(digits.length() - 1);

    return Integer.parseInt(number);
  }

  public static void main(String[] args) throws IOException {
    String filePath = "/home/hemram/git-repos/Algos/AOC/2023/Day1/day1.txt";
    Path path = Paths.get(filePath);
    List<String> lines = Files.readAllLines(path);
    int ans = 0;
    for (String line : lines) {

      // System.out.println(line);
      // System.out.println(extractNumber(line));
      ans += extractNumber(line);
    }
    System.out.println(ans);
  }
}
