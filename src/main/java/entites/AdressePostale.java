package entites;

public class AdressePostale {
    int numeroRue; // variable d'instance i.e. variable globale
    String libelleRue;
    int codePostal;
    String ville;

    static int nbDepartement = 101; // variable unique et partagée, si elle est modifiée, toutes seront modifiées
    // static final int NB_REGION = 18; -> constante non modifiable

    AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return   numeroRue + " " + libelleRue + ", " + codePostal + " " + ville;

    }

  /*  Si une classe ne possède pas de constructeur => constructeur implicite / par défaut
     constructeur sans paramètre :
     AdressePostale() {
         System.out.println("coucou");
         numeroRue = 1; valeur par défaut
     }

     constructeur avec paramètre
     AdressePostale(int nvNumeroRue, String nvLibelleRue) {
        numeroRue = nvNumeroRue;
        libelleRue = nvLibelleRue;
    }
     AdressePostale(int nvNumeroRue, String nvLibelleRue, int nvCodePostal) {
        numeroRue = nvNumeroRue;
        libelleRue = nvLibelleRue;
        codePostal = nvCodePostal;
    }

     constructeur (bonne pratique) :
     AdressePostale(int numeroRue, String libelleRue) {
        this.numeroRue = numeroRue; // écriture qu'on retrouve le plus souvent - désigne l'objet courant
        this.libelleRue = libelleRue;
    }
     AdressePostale(int numeroRue, String libelleRue, int codePostal) {
        this(numeroRue, libelleRue);
        this.codePostal = codePostal;
    }

     creation / raccourci > alt+ insert ou clic droit + generate


*/
    // Problème : On ne peut pas le mettre en static car devra utiliser des variables static
    public int getNumeroDepartement(){
        return codePostal/1000;
    }


}
