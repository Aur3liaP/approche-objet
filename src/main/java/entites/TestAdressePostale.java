package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale a = new AdressePostale();
        AdressePostale b = new AdressePostale();

        a.numeroRue = 5;
        a.libelleRue = "des Maréchaux";
        a.codePostal = 44100;
        a.ville = "Nantes";

        b.numeroRue = 5;
        b.libelleRue = "des Maréchaux";
        b.codePostal = 44100;
        b.ville = "Nantes";
    }
}
