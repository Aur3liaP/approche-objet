package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {

        Salarie salarie = new Salarie("Jean", "Pierre", 1500);
        System.out.println("Salaire du salarié: " + salarie.getSalaire());
        salarie.afficherDonnees();

        Pigiste pigiste = new Pigiste("Pierre", "Jean", 20, 150);
        System.out.println("Salaire du pigiste: " + pigiste.getSalaire());
        pigiste.afficherDonnees();
    }
}
