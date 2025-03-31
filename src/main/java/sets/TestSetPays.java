package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetPays {
    public static void main(String[] args) {
        Set<Pays> paysSet = new HashSet<>();

        paysSet.add(new Pays("USA", 331_000_000, 68_308.57));
        paysSet.add(new Pays("France", 67_000_000, 40_494.24));
        paysSet.add(new Pays("Allemagne", 83_000_000, 50_206.49));
        paysSet.add(new Pays("UK", 67_000_000, 42_329.66));
        paysSet.add(new Pays("Italie", 60_000_000, 34_396.64));
        paysSet.add(new Pays("Japon", 126_000_000, 40_247.07));
        paysSet.add(new Pays("Chine", 1_440_000_000, 10_604.46));
        paysSet.add(new Pays("Russie", 146_000_000, 11_666.92));
        paysSet.add(new Pays("Inde", 1_390_000_000, 2_190.96));

        for (Pays pays : paysSet) {
            System.out.println(pays);
        }

        Pays maxPibHabitant = null;
        double maxPibHabitantLength = 0;

        Pays maxPibTotal = null;
        double maxPibTotalLength = 0;

        Pays minPibTotal = null;
        double minPibTotalLength = Double.MAX_VALUE;

        Iterator<Pays> iter = paysSet.iterator();

        while (iter.hasNext()) {
            Pays pays = iter.next();

            if (pays.getPibParHabitant() > maxPibHabitantLength) {
                maxPibHabitant = pays;
                maxPibHabitantLength = pays.getPibParHabitant();
            }

            double totalGdp = pays.getPibTotal();
            if (totalGdp > maxPibTotalLength) {
                maxPibTotal = pays;
                maxPibTotalLength = totalGdp;
            }

            if (totalGdp < minPibTotalLength) {
                minPibTotal = pays;
                minPibTotalLength = totalGdp;
            }
        }

        System.out.println("\nPays avec le PIB/habitant le plus important : " + maxPibHabitant.getNom());
        System.out.println("Pays avec le PIB total le plus important : " + maxPibTotal.getNom());

        paysSet.remove(minPibTotal);

        minPibTotal.setNom(minPibTotal.getNom().toUpperCase());
        paysSet.add(minPibTotal);

        Iterator<Pays> iter2 = paysSet.iterator();
        while (iter2.hasNext()) {
            if (iter2.next().equals(maxPibTotal)) {
                iter2.remove();
                break;
            }
        }

        System.out.println("\nAprès modifs :");
        for (Pays pays : paysSet) {
            System.out.println(pays);
        }

        /*
        PIB par habitant + grand:
        Pays paysLePlusRicheHabitant = pays.iterator().next();
        for(Pays item : pays) {
        if(item.getPib() > paysLePlusRicheHabitant.getPib() ) {
            paysLePlusRicheHabitant = item;
            }
        }

        PIB Total :
        Pays paysLePlusRiche = pays.iterator().next();
        for(Pays item : pays) {
        if(item.getPibTotal() > paysLePlusRiche.getPib() ) {
            paysLePlusRiche = item;
            }
        }

        PIB plus petit :
        Pays paysLeMoinsRiche = pays.iterator().next();
        for(Pays item : pays) {
        if(item.getPibTotal() > paysLeMoinsRiche.getPib() ) {
            paysLeMoinsRiche = item;
            }
        }
        paysLeMoinsRiche.setNom(paysLeMoinsRiche.getNom().toUpperCase());

        pays.remove(PaysLePlusRiche);
         */


    }
}
