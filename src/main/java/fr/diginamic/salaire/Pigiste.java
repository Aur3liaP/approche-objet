package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    private final int nbJourTravaille;
    private final double montantJournalier;

    public Pigiste(String nom, String prenom, int nbJourTravaille, double montantJournalier) {
        super(nom, prenom);
        this.nbJourTravaille = nbJourTravaille;
        this.montantJournalier = montantJournalier;
    }

    @Override
    public double getSalaire() {
        return nbJourTravaille * montantJournalier;
    }

    @Override
    public String getStatut() {
        return "pigiste";
    }
}
