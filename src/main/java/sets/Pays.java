package sets;

public class Pays {
    private String nom;
    private double nbHabitants;
    private double pibParHabitant;

    public Pays(String nom, double nbHabitants, double pibParHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibParHabitant = pibParHabitant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pays{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", nbHabitants=").append(nbHabitants);
        sb.append(", pibParHabitant=").append(pibParHabitant);
        sb.append('}');
        return sb.toString();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPibParHabitant() {
        return pibParHabitant;
    }

    public double getPibTotal() {
        return nbHabitants * pibParHabitant;
    }

}
