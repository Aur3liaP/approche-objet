package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne didier = new Personne();
        Personne aurelia = new Personne();

       didier.nom = "Mazier";
       didier.prenom = "Didier";
       didier.adressePostale.numeroRue = 5;
       didier.adressePostale.libelleRue = "des Maréchaux";
       didier.adressePostale.codePostal = 44100;
       didier.adressePostale.ville = "Nantes";

        aurelia.nom = "PIC";
        aurelia.prenom = "Aurélia";
        aurelia.adressePostale.numeroRue = 5;
        aurelia.adressePostale.libelleRue = "des Maréchaux";
        aurelia.adressePostale.codePostal = 44100;
        aurelia.adressePostale.ville = "Nantes";
    }
}
