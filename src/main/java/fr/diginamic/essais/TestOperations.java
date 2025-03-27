package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {

        System.out.println("+ : " + Operations.Calcul(2,15,'+'));
        System.out.println("- : " + Operations.Calcul(2,7,'-'));
        System.out.println("* : " + Operations.Calcul(5,2,'*'));
        System.out.println("/ : " + Operations.Calcul(12,6,'/'));
    }
}
