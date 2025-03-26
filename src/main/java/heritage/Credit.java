package heritage;

public class Credit extends Operation {

    public Credit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String toString() {
        return super.toString() + ", Crédit de " + getMontant() + "€ effectué le " + getDate();
    }

    @Override
    public String getType(){
        return "CREDIT";
    }

    @Override
    public double recalulerSolde(double montant){
        return montant + getMontant();
    }
}
