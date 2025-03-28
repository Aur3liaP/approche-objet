package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        Collections.addAll(liste, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

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

/*
        Iterator<String> iterator = liste.iterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            if (item.toUppercase().charAt(0) == 'N') {
                iterator.remove();
            }
        }
 */


    }
}
