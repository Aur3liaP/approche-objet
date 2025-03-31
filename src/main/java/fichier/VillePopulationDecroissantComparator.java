package fichier;

import java.util.Comparator;
import java.util.Objects;

public class VillePopulationDecroissantComparator implements Comparator<Ville> {

    @Override
    public int compare(Ville ville1, Ville ville2) {
        return -1* Objects.compare(ville1.getPopulationTotale(), ville2.getPopulationTotale(), Comparator.naturalOrder());
        // ou return Integer.compare(ville2.getPopulationTotale(), ville1.getPopulationTotale());
    }
}

