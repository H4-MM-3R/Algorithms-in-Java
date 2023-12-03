import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class day3Part1 {

  /*
   * --------------------
   * Checks Out-of-Bounds
   * --------------------
   */
  public static boolean isValidIndex(int i, int j, int rows) {
    return 0 <= i && i < rows && 0 <= j && j < rows;
  }

  /*
   * ---------------------------
   * Checks if Element is Symbol
   * ---------------------------
   */
  public static boolean isSymbol(Character c) {
    return !(Character.isDigit(c) || c == '.');
  }

  private static int partNumber(List<String> inputLines) {
    int rows = inputLines.size();

    boolean[][] visited = new boolean[rows][rows];

    int ans = 0;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < rows; j++) {

        if (Character.isDigit(inputLines.get(i).charAt(j))) {

          int left = j;
          /*
           * ------------------
           * Number from Digits
           * ------------------
           */
          int number = 0;
          while (j < rows && Character.isDigit(inputLines.get(i).charAt(j))) {
            number = number * 10 + (inputLines.get(i).charAt(j++) - '0');
          }

          int right = j - 1;

          boolean isPartNum = false;

          for (int k = left - 1; k < right + 2; k++) {
            for (int ii = i - 1; ii < i + 2; ii++) {
              boolean b = isValidIndex(ii, k, rows) && isSymbol(inputLines.get(ii).charAt(k));

              isPartNum = isPartNum | b;

              if (b) {
                visited[ii][k] = true;
              }
            }
          }

          if (isPartNum) {
            ans += number;
          }
        }
      }
    }

    return ans;
  }

  public static void main(String[] args) throws IOException {
    String filePath = "/home/hemram/git-repos/Algos/AOC/2023/Day3/day3.txt";
    Path path = Paths.get(filePath);
    List<String> lines = Files.readAllLines(path);
    System.out.println(partNumber(lines));
  }
}
