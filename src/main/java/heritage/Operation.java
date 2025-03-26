package heritage;

public abstract class Operation {
    private final String date;
    private final double montant;

    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }

    public Operation(String date, double montant){
        this.date = date;
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }

    public abstract String getType();

}
