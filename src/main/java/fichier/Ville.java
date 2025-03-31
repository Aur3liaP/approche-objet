package fichier;

public class Ville {
    private String nom;
    private final String codeDepartement;
    private final String nomRegion;
    private final int populationTotale;

    public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    @Override
    public String toString() {
        return nom + ";" + codeDepartement + ";" + nomRegion + ";" + populationTotale;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

}
