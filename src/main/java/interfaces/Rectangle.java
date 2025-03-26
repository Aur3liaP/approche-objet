package interfaces;

public class Rectangle implements ObjetGeometrique{
    private final double longueur;
    private final double largeur;

    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }
}
