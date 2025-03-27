package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        int longueurChaine = chaine.length();
        System.out.println("longueur chaine: " + longueurChaine);

        int indexPremierPointVirgule  = chaine.indexOf(';');
        System.out.println("index du Premier ;  " + indexPremierPointVirgule );

        String nomDeFamille = chaine.substring(0, indexPremierPointVirgule);
        System.out.println("Nom de famille: " + nomDeFamille);

        String nomDeFamilleMajuscules = nomDeFamille.toUpperCase();
        System.out.println("Nom de famille en majuscules: " + nomDeFamilleMajuscules);

        String nomDeFamilleMinuscules = nomDeFamille.toLowerCase();
        System.out.println("Nom de famille en minuscules: " + nomDeFamilleMinuscules);

        String[] morceaux = chaine.split(";");
        System.out.println("Tableau après découpage : ");
        for (String morceau : morceaux) {
            System.out.println(morceau);
        }

        String nom = morceaux[0];
        String prenom = morceaux[1];
        String salaireStr = morceaux[2].replace(" ", "");
        double salaire = Double.parseDouble(salaireStr);

        Salarie salarie = new Salarie(nom, prenom, salaire);
        System.out.println("Salarié : " + salarie);


    }
}
