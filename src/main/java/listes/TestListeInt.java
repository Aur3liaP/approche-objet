package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        Collections.addAll(liste, -1, 5, 7, 3, -2, 4, 8, 5);

        /*
        ArrayList<Integer> liste = Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5)
         */

        System.out.println("Liste : " + liste);
        System.out.println("Taille liste : " + liste.size());

        int max = Collections.max(liste);
        System.out.println("Plus grand élément : " + max);

        int min = Collections.min(liste); // En mettant INTEGER directement à la place de int, évite le valueOf
        liste.remove(Integer.valueOf(min));
        System.out.println("Liste après suppression du plus petit élément : " + liste);

        for(int i =0, size = liste.size(); i<size; i++){ // le fait d'initialiser size avant permet d'optimiser les tours de boucles inutiles
            if(liste.get(i) < 0){
                liste.set(i, Math.abs(liste.get(i)));
            }
        }

    }
}
