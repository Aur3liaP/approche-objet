package heritage;

public class TestCompte {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[2];

        comptes[0] = new Compte(124456554, 108.30);
        comptes[1]= new CompteTaux(123456789, 230.30, 1.5);

        for (Compte cmpt : comptes) {
            System.out.println(cmpt);
        }



    }
}
