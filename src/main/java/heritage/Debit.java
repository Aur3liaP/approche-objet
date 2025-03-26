package heritage;

public class Debit extends Operation{

    public Debit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String toString() {
        return super.toString() + ", Débit de " + getMontant() + "€ effectué le " + getDate();
    }

    @Override
    public String getType(){
        return "DEBIT";
    }

    @Override
    public double recalulerSolde (double montant){
        return montant - getMontant();
    }

}
