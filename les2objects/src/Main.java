import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Leo Messi",
                LocalDate.of(1992, Month.APRIL, 21),
                5_000_000,
                'm');

        Player p2 = new Player("Lieke Martens",
                LocalDate.of(2000, Month.AUGUST, 21),
                6_000_000,
                'v');

        ArrayList<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);

        // enhanced for loop
        for (Player p : players) {
            p.print();
        }

        Team t1 = new Team("Ajax", "Amsterdam");
        t1.addPlayer(p1);

    }
}
