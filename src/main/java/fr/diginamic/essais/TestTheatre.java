package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre1 = new Theatre("Chez Didier", 30);

        theatre1.inscrire(10,25);
        theatre1.inscrire(10,25);
        theatre1.inscrire(10,25);
        theatre1.inscrire(10,25);

        System.out.println("total inscrits : " + theatre1.getTotalInscrits());
        System.out.println("recette totale : " +theatre1.getRecetteTotale());
    }
}
