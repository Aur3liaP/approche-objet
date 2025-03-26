package heritage;

public class TestOperationExecutable {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];

        operations[0] = new Credit("2025-03-01", 150.0);
        operations[1] = new Credit("2025-03-03", 200.0);
        operations[2] = new Debit("2025-03-02", 50.0);
        operations[3] = new Debit("2025-03-04", 100.0);

        double montantGlobal = 0.0;

        for(Operation ope : operations){
            System.out.println(ope);

            if (ope.getType().equals("CREDIT")) {
                montantGlobal += ope.getMontant();
            } else if (ope.getType().equals("DEBIT")) {
                montantGlobal -= ope.getMontant();
            }
        }

        System.out.println("Montant global : " + montantGlobal + "€");
    }
}
