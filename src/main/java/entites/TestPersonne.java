package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
       // Solution 1
       AdressePostale a = new AdressePostale();
       a.numeroRue = 5;
       a.libelleRue = "des Maréchaux";
       a.codePostal = 44100;
       a.ville = "Nantes";

       Personne didier = new Personne();
       didier.nom = "Mazier";
       didier.prenom = "Didier";
       didier.adresse = a ;

       // Solution 2
       Personne aurelia = new Personne();
       aurelia.nom = "PIC";
       aurelia.prenom = "Aurélia";
       aurelia.adresse = new AdressePostale();
       aurelia.adresse.numeroRue = 5;
       aurelia.adresse.libelleRue = "des Maréchaux";
       aurelia.adresse.codePostal = 44100;
       aurelia.adresse.ville = "Nantes";
    }
}
