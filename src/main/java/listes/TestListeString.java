package listes;

import java.util.ArrayList;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Nice");
        liste.add("Carcassonne");
        liste.add("Narbonne");
        liste.add("Lyon");
        liste.add("Foix");
        liste.add("Pau");
        liste.add("Marseille");
        liste.add("Tarbes");

        String villePlusLettres= "";

        for (String ville : liste){
            if(ville.length() > villePlusLettres.length()){
                villePlusLettres = ville;
            }
        }
        System.out.println("Ville avec le plus de lettres : " + villePlusLettres);

        liste.replaceAll(String::toUpperCase);

        System.out.println("liste en maj : " + liste);

        liste.removeIf(ville -> ville.startsWith("N"));
        System.out.println("liste sans N : " + liste);
    }
}
