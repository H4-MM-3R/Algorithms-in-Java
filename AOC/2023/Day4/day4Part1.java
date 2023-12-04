import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class day4Part1 {
    public static int parse(String inputLine) {
        String[] splitted = inputLine.split(":");
        String[] cardNumbers = splitted[1].split("\\|");

        List<Integer> st = new ArrayList<>();
        int ans = 0;
        String[] winningNumbers = cardNumbers[0].trim().split("\\s+");
        String[] currNumbers = cardNumbers[1].trim().split("\\s+");
        for (String currNum : currNumbers) {
            st.add(Integer.parseInt(currNum));
        }
        for (String winningNum : winningNumbers) {
            if (st.contains(Integer.parseInt(winningNum))) {
                ans++;
            }
        }

        return 1 << ans-1;
    }

    public static void main(String[] args) throws IOException {
        String filePath = "/home/hemram/git-repos/Algos/AOC/2023/Day4/day4.txt";
        Path path = Paths.get(filePath);
        List<String> lines = Files.readAllLines(path);
        int ans = 0;
        for (String line : lines) {
            int hehe = parse(line);
            ans += hehe;
        }
            System.out.println(ans);
    }
}
