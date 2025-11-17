package Challenge_8;

import java.util.ArrayList;
import java.util.List;

public class Facture {
    private int id;
    private List<Paiement> paiements;

    public Facture(int id) {
        this.id = id;
        this.paiements = new ArrayList<>();
    }



    public void ajouterPaiement(Paiement p) {
        paiements.add(p);
    }

    public double calculerTotalPaiements() {
        double totalePaiements = 0.0;
        for(Paiement paiement : paiements) {
            totalePaiements += paiement.getMontant();
        }
        return totalePaiements;
    }


    public void afficherInfo() {
        System.out.println("- Facture ID: " + id);
        System.out.println("- Paiements : ");
        if(paiements.isEmpty()) {
            System.out.println("Aucun Paiements");
        }else {
            for(Paiement paiement : paiements) {
                System.out.println("  * Montant: " + paiement.getMontant() + " (" + paiement.getDate() + ")");
            }
        }

        System.out.println("=> Totale Paiement : " + calculerTotalPaiements());

    }



}
