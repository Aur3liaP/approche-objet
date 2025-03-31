package maps;

import listes.Ville;

import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> mapVilles = new HashMap<>();

        mapVilles.put("rrr", new Ville("Paris", 2148000));
        mapVilles.put("fff", new Ville("Marseille", 870000));
        mapVilles.put("ddd", new Ville("Lyon", 522000));
        mapVilles.put("bbb", new Ville("Toulouse", 479000));
        mapVilles.put("aaa", new Ville("Nice", 347000));

        for (Ville ville : mapVilles.values()) {
            System.out.println("Villes avant : " + ville);
        }

        Ville villeMoinsHabitants = null;
        for (Ville ville : mapVilles.values()) {
            if (villeMoinsHabitants == null ||  ville.getNbHabitants() < villeMoinsHabitants.getNbHabitants()) {
                villeMoinsHabitants = ville;
            }
        }

            mapVilles.remove(villeMoinsHabitants.getNom());// Fonctionne car ville et clés ont le même nom mais si différents :

        String cleVilleMoinsHabitants = null;
        for (String ville : mapVilles.keySet()) {
                Ville item = mapVilles.get(ville);
            if (cleVilleMoinsHabitants == null ||  item.getNbHabitants() <= villeMoinsHabitants.getNbHabitants()) {
                villeMoinsHabitants = item;
                cleVilleMoinsHabitants = ville;
            }
            }
            mapVilles.remove(cleVilleMoinsHabitants);
            System.out.println("Ville supprimée : " + villeMoinsHabitants);

        for (Ville ville : mapVilles.values()) {
            System.out.println("Villes après : " + ville);
        }

    }
}
