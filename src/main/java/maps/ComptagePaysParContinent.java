package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> listePays = new ArrayList<>();
        listePays.add(new Pays("France", 65_000_000, "Europe"));
        listePays.add(new Pays("Allemagne", 80_000_000, "Europe"));
        listePays.add(new Pays("Belgique", 10_000_000, "Europe"));
        listePays.add(new Pays("Russie", 150_000_000, "Asie"));
        listePays.add(new Pays("Chine", 1_400_000_000, "Asie"));
        listePays.add(new Pays("Indonésie", 220_000_000, "Océanie"));
        listePays.add(new Pays("Australie", 20_000_000, "Océanie"));

        HashMap<String, Integer> comptagePaysParContinent = new HashMap<>();

        for (Pays pays : listePays) {
            String continent = pays.getContinent();
            comptagePaysParContinent.put(continent, comptagePaysParContinent.getOrDefault(continent, 0) + 1);
        }

        System.out.println("Comptage des pays par continent :");
        for (String continent : comptagePaysParContinent.keySet()) {
            System.out.println(continent + " : " + comptagePaysParContinent.get(continent) + " pays");
        }
    }
}
