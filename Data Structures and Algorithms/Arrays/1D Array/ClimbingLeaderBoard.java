import java.util.*;

public class ClimbingLeaderBoard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> ranked = new ArrayList<>();
        while (n-- > 0) {
            ranked.add(s.nextInt());
        }
        int m = s.nextInt();
        List<Integer> player = new ArrayList<>();
        while (m-- > 0) {
            player.add(s.nextInt());
        }
        for (int it : climbingLeaderboard(ranked, player)) {
            System.out.println(it);
        }

        s.close();
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> res = new ArrayList<>();

        Collections.sort(ranked, Collections.reverseOrder());
        ranked = new ArrayList<>(new LinkedHashSet<>(ranked));

        for (int score : player) {
            int rank = Collections.binarySearch(ranked, score, Comparator.reverseOrder());
            if (rank < 0)
                rank = -(rank + 1);
            res.add(rank + 1);
        }

        return res;
    }
}
