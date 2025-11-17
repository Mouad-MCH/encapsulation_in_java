package Challenge_8;

import java.time.LocalDate;

public class Paiement {
    private double montant;
    private LocalDate date;

    public Paiement(double montant, LocalDate date) {
        this.montant = montant;
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
