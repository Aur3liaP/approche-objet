package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();

        maison.ajouterPiece(new Chambre(10, 1));
        maison.ajouterPiece(new Cuisine(15, 0));
        maison.ajouterPiece(new Salon(30, 0));
        maison.ajouterPiece(new SalleDeBain(10, 1));
        maison.ajouterPiece(new WC(5, 0));


        System.out.println("Superficie totale : " + maison.superficieTotale());
        System.out.println("Superficie RDC : " + maison.superficieEtage(0));

        maison.ajouterPiece(null);
        maison.ajouterPiece(new Chambre(-5,0));

        maison.ajouterPiece(new Chambre(12, 1));
        System.out.println("Superficie totale des chambres : " + maison.superficieType(Chambre.class));
        System.out.println("Nombre de chambres : " + maison.nombrePiecesParType(Chambre.class));
    }


}
