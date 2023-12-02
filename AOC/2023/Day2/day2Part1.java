import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class day2Part1 {

  public static int isValidGame(String inputLine) {
    String[] gameSplit = inputLine.split(":");
    int gameNumber = Integer.parseInt(gameSplit[0].split("Game ")[1]);
    String[] cases = gameSplit[1].split("[,;]");
    for (String c : cases) {
      /*
       * without .trim() before .split()
       * --------------------------------
       * count will show error due to " "
       */
      String[] cube = c.trim().split(" ");
      int count = Integer.parseInt(cube[0]);
      String color = cube[1];

      /*
       * --------------------------------------------------------
       * if count greater than given limit of color --> Not Valid
       * --------------------------------------------------------
       */
      if ((count > 12 && color.equals("red"))
          || (count > 13 && color.equals("green"))
          || (count > 14 && color.equals("blue"))) {
        return 0;
      }
    }
    return gameNumber;
  }

  public static void main(String[] args) throws IOException {
    String filePath = "/home/hemram/git-repos/Algos/AOC/2023/Day2/day2.txt";
    Path path = Paths.get(filePath);
    List<String> lines = Files.readAllLines(path);
    int ans = 0;
    for (String line : lines) {
      ans += isValidGame(line);
    }
    System.out.println(ans);
  }
}
