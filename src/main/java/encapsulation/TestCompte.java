package encapsulation;

public class TestCompte {
    public static void main(String[] args) {
        Compte cmpt = new Compte(124456554, 108.30);

        cmpt.setNumeroCompte(445474548);
        cmpt.setSoldeCompte(230.82);

        System.out.println("il reste " + cmpt.getSoldeCompte() + "€ sur le compte n°" + cmpt.getNumeroCompte());
        System.out.println(cmpt);
    }
}
