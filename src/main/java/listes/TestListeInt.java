package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        Collections.addAll(liste, -1, 5, 7, 3, -2, 4, 8, 5);

        System.out.println("Liste : " + liste);
        System.out.println("Taille liste : " + liste.size());

        int max = Collections.max(liste);
        System.out.println("Plus grand élément : " + max);

        int min = Collections.min(liste);
        liste.remove((Integer) min);
        System.out.println("Liste après suppression du plus petit élément : " + liste);


    }
}
