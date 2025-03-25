package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
// TP 1 :
/*
       Solution 1
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


// TP 2 :
       // Avec paramètres :

       AdressePostale adr = new AdressePostale(15,"rue machin", 33000, "Bordeaux");
       Personne didier = new Personne("Mazier", "Didier", adr);
       System.out.println(didier.prenom);
 */

// TP 3 :
        AdressePostale adr = new AdressePostale(15,"rue machin", 33000, "Bordeaux");
        Personne didier = new Personne("Mazier", "Didier", null);

        didier.setAdresse(adr);
        didier.afficherPersonne();
        System.out.println(didier.getAdresse());

        AdressePostale.nbDepartement = 102; // modification
        System.out.println(AdressePostale.nbDepartement); // ne march qu'avec variable static
    }
}
