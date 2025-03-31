package tri;

public class Ville implements Comparable<Ville> {
    private String nom;
    private final int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom + " (" + nbHabitants + " habitants)";
    }

    @Override
    public int compareTo(Ville o) {
       // Ex 1 tri par nom : return this.nom.compareTo(o.nom);
        return Integer.compare(this.nbHabitants, o.nbHabitants);
    }

}
