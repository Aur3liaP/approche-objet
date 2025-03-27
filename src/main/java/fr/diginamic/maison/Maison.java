package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
    private Piece[] pieces;

    public Maison() {
        this.pieces = new Piece[0];
    }

    public void ajouterPiece(Piece piece) {
        if (piece == null) {
            System.out.println("La pièce ne peut pas être null.");
            return;
        }
        if (piece.getSuperficie() <= 0) {
            System.out.println("La superficie doit être positive");
            return;
        }
        pieces = Arrays.copyOf(pieces, pieces.length + 1);
        pieces[pieces.length - 1] = piece;
    }

    public double superficieTotale() {
        double total = 0;
        for (Piece piece : pieces) {
            total += piece.getSuperficie();
        }
        return total;
    }

    public double superficieEtage(int etage) {
        double total = 0;
        for (Piece piece : pieces) {
            if (piece.getEtage() == etage) {
                total += piece.getSuperficie();
            }
        }
        return total;
    }

    public double superficieType(Class<?> typePiece) {
        double total = 0;
        for (Piece piece : pieces) {
            if (typePiece.isInstance(piece)) {
                total += piece.getSuperficie();
            }
        }
        return total;
    }

    public int nombrePiecesParType(Class<?> typePiece) {
        int count = 0;
        for (Piece piece : pieces) {
            if (typePiece.isInstance(piece)) {
                count++;
            }
        }
        return count;
    }

}
