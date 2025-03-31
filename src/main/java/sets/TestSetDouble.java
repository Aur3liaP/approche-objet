package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

    public static void main(String[] args) {
        Set<Double> doubleSet = new HashSet<>();
        Collections.addAll(doubleSet, 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);

        System.out.println(doubleSet);

        double maxElement = Collections.max(doubleSet);
        System.out.println(maxElement);

        double minElement = Collections.min(doubleSet);
        doubleSet.remove(minElement);
        System.out.println(doubleSet);
    }
}
