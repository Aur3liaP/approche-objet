package encapsulation;

public class Compte {
    private int numeroCompte;
    private double soldeCompte;


    @Override
    public String toString() {
        return "Compte [Numéro de compte : " + numeroCompte + ", Solde : " + soldeCompte + "]";
    }

    public Compte(int numeroCompte, double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

}
