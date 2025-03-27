package fr.diginamic.entites;

public class Theatre {
    private final String nom;
    private final int maxCapacite;
    private int totalInscrits;
    private double recetteTotale;

    public Theatre(String nom, int maxCapacite) {
        this.nom = nom;
        this.maxCapacite = maxCapacite;
    }

    public void inscrire(int nbClients, double prixPlace) {
        if (totalInscrits + nbClients <= maxCapacite){
            totalInscrits += nbClients;
            recetteTotale += nbClients*prixPlace;
            System.out.println(totalInscrits + " clients inscrits.");
        } else {
            System.out.println("La capacité max est atteinte, impossible d'ajouter plus de clients!");
            }
    }

    public int getTotalInscrits() {
        return totalInscrits;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "nom='" + nom + '\'' +
                ", maxCapacite=" + maxCapacite +
                ", totalInscrits=" + totalInscrits +
                ", recetteTotale=" + recetteTotale +
                '}';
    }
}
