package fr.diginamic.operations;

public class Operations {
    public static double Calcul(double a, double b, char ope) {

        switch(ope){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a/b;
            default:
                throw new IllegalArgumentException("Opérateur non supporté");
        }
    }
}
