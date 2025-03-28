package listes;

import java.util.ArrayList;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        System.out.println("Liste : " + villes);

        Ville villeLaPlusPeuplee = villes.getFirst();
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > villeLaPlusPeuplee.getNbHabitants()) {
                villeLaPlusPeuplee = ville;
            }
        }
        System.out.println("Ville la plus peuplée : " + villeLaPlusPeuplee);

        Ville villeLaMoinsPeuplee = villes.getFirst();
        for (Ville ville : villes) {
            if (ville.getNbHabitants() < villeLaMoinsPeuplee.getNbHabitants()) {
                villeLaMoinsPeuplee = ville;
            }
        }
        villes.remove(villeLaMoinsPeuplee);

        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 100_000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        System.out.println("Liste après modifs : " + villes);
    }
}
