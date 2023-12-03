import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class day3Part2 {

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

  private static int gearNumber(List<String> inputLines) {
    int rows = inputLines.size();

    /*
     * ----------------------------------------
     * Numbers Mapped to Corresponding Symbols
     * ----------------------------------------
     */
    List<List<List<Integer>>> numsOfSymbol = new ArrayList<>(rows);

    for (int i = 0; i < rows; i++) {
      numsOfSymbol.add(new ArrayList<>(rows));
      for (int j = 0; j < rows; j++) {
        numsOfSymbol.get(i).add(new ArrayList<>());
      }
    }

    int ans = 0;

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < rows; col++) {

        if (Character.isDigit(inputLines.get(row).charAt(col))) {

          int left = col;

          /*
           * ------------------
           * Number from Digits
           * ------------------
           */
          int number = 0;
          while (col < rows && Character.isDigit(inputLines.get(row).charAt(col))) {
            number = number * 10 + (inputLines.get(row).charAt(col++) - '0');
          }

          int right = col - 1;

          for (int i = left - 1; i < right + 2; i++) {
            for (int j = row - 1; j < row + 2; j++) {
              if (isValidIndex(j, i, rows) && isSymbol(inputLines.get(j).charAt(i))) {
                numsOfSymbol.get(j).get(i).add(number);
              }
            }
          }
        }
      }
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < rows; j++) {
        /*
         * ---------------------------------------
         * For Symbol '*' with 2 Adjacent Elements
         * ---------------------------------------
         */
        if (inputLines.get(i).charAt(j) == '*' && numsOfSymbol.get(i).get(j).size() == 2) {
          ans += numsOfSymbol.get(i).get(j).get(0) * numsOfSymbol.get(i).get(j).get(1);
        }
      }
    }

    return ans;
  }

  public static void main(String[] args) throws IOException {
    String filePath = "/home/hemram/git-repos/Algos/AOC/2023/Day3/day3.txt";
    Path path = Paths.get(filePath);
    List<String> lines = Files.readAllLines(path);
    System.out.println(gearNumber(lines));
  }
}
