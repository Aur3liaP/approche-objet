package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        Collections.addAll(stringSet, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");

        String plusDeLettres = "";
        int maxLength = 0;

        Iterator<String> iter = stringSet.iterator();
        while (iter.hasNext()) {
            String country = iter.next();
            if (country.length() > maxLength) {
                plusDeLettres = country;
                maxLength = country.length();
            }
        }

        System.out.println("plus de lettres: " + plusDeLettres);
        stringSet.remove(plusDeLettres);
        System.out.println(stringSet);

    }
}
