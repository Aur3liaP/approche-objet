package fr.diginamic.maison;

public abstract class Piece {
    private final double superficie;
    private final int etage;

    public Piece(double superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return etage;
    }
}
