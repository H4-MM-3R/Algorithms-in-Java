import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class day2Part2 {

  public static int minPowers(String inputLine) {
    String[] gameSplit = inputLine.split(":");
    String[] cases = gameSplit[1].split("[,;]");

    int rMax, gMax, bMax;
    rMax = gMax = bMax = 0;

    for (String c : cases) {
      /*
       * without .trim() before .split()
       * --------------------------------
       * count will show error due to " "
       */
      String[] cube = c.trim().split(" ");

      int count = Integer.parseInt(cube[0]);
      String colour = cube[1].trim();

      /*
       * ----------------------------
       * Update Maximum of each Color
       * ----------------------------
       */
      if (count > rMax && colour.equals("red")) rMax = count;
      if (count > gMax && colour.equals("green")) gMax = count;
      if (count > bMax && colour.equals("blue")) bMax = count;
    }
    return rMax * gMax * bMax; // product
  }

  public static void main(String[] args) throws IOException {
    String filePath = "/home/hemram/git-repos/Algos/AOC/2023/Day2/day2.txt";
    Path path = Paths.get(filePath);
    List<String> lines = Files.readAllLines(path);
    int ans = 0;
    for (String line : lines) {
      ans += minPowers(line);
    }
    System.out.println(ans);
  }
}
