package equals;

import java.util.Objects;

public class Pays {
    private final String nom;
    private final int population;

    public Pays(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pays pays = (Pays) o;
        return population == pays.population && Objects.equals(nom, pays.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, population);
    }
}
