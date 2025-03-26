package heritage;

public class CompteTaux extends Compte {
    private final double tauxRemuneration;


    public CompteTaux(int numeroCompte, double soldeCompte, double tauxRemuneration) {
        super(numeroCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + ", Taux de rémunération : " + tauxRemuneration;
    }
}
