package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne calculMoyenne = new CalculMoyenne();
        calculMoyenne.ajout(10);
        calculMoyenne.ajout(20);
        calculMoyenne.ajout(30);
        System.out.println("moyenne : " + calculMoyenne.calcul());

        CalculMoyenne calculMoyenne2 = new CalculMoyenne();
        calculMoyenne2.ajout(10);
        calculMoyenne2.ajout(20);
        calculMoyenne2.ajout(30);
        calculMoyenne2.ajout(40);
        calculMoyenne2.ajout(150);
        System.out.println("moyenne : " + calculMoyenne2.calcul());

    }
}
