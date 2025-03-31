package maps;

import listes.Ville;

import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> mapVilles = new HashMap<>();

        mapVilles.put("Paris", new Ville("Paris", 2148000));
        mapVilles.put("Marseille", new Ville("Marseille", 870000));
        mapVilles.put("Lyon", new Ville("Lyon", 522000));
        mapVilles.put("Toulouse", new Ville("Toulouse", 479000));
        mapVilles.put("Nice", new Ville("Nice", 347000));

        for (Ville ville : mapVilles.values()) {
            System.out.println("Villes avant : " + ville);
        }

        Ville villeMoinsHabitants = null;
        for (Ville ville : mapVilles.values()) {
            if (villeMoinsHabitants == null ||  ville.getNbHabitants() < villeMoinsHabitants.getNbHabitants()) {
                villeMoinsHabitants = ville;
            }
        }

        if (villeMoinsHabitants != null) {
            mapVilles.remove(villeMoinsHabitants.getNom());
            System.out.println("Ville supprimée : " + villeMoinsHabitants);
        }

        for (Ville ville : mapVilles.values()) {
            System.out.println("Villes après : " + ville);
        }

    }
}
