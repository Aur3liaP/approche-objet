package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
//        AdressePostale a = new AdressePostale();
//        AdressePostale b = new AdressePostale();
//
//        a.numeroRue = 2;
//        a.libelleRue = "des Maréchaux";
//        a.codePostal = 44100;
//        a.ville = "Nantes";
//
//        b.numeroRue = 5;
//        b.libelleRue = "des Maréchaux";
//        b.codePostal = 44100;
//        b.ville = "Nantes";

        AdressePostale a = new AdressePostale(2,"des Maréchaux", 44100, "Nantes");
        AdressePostale b = new AdressePostale(5,"des Maréchaux", 44100, "Nantes");
    }
}
