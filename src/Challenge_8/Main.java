package Challenge_8;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Facture f1 = new Facture(1);

        Paiement p1 = new Paiement(3.33, LocalDate.of(2024, 2, 12));
        Paiement p2 = new Paiement(55.33, LocalDate.of(2025, 4, 1));
        Paiement p3 = new Paiement(56.3, LocalDate.of(2025, 6, 10));

        f1.ajouterPaiement(p1);
        f1.ajouterPaiement(p2);
        f1.ajouterPaiement(p3);

        f1.afficherInfo();
    }
}
