package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

    private double[] tab;

    public CalculMoyenne() {
        this.tab = new double[0];
    }

    public void ajout(double value) {
        tab = Arrays.copyOf(tab, tab.length + 1);
        tab[tab.length - 1] = value;
    }

    public double calcul(){
        double somme = 0;
        for (double elem : tab){
            somme += elem;
        }
        return somme / tab.length;
    }
}
