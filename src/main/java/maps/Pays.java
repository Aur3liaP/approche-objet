package maps;

public class Pays {
    private final String nom;
    private final int nombreHabitants;
    private final String continent;

    public Pays(String nom, int nombreHabitants, String continent) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return nom + " (" + nombreHabitants + " habitants, " + continent + ")";
    }
}
