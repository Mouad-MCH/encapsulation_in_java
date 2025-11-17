package Challenge_4;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int id;
    private List<Produit> produits;

    public Commande(int id) {
        this.id = id;
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit p) {
            produits.add(p);
    }


    public double calculerTotal() {
        double totale = 0.0;
        for(Produit p : produits) {
            totale += p.getPrixTotale();
        }
        return totale;
    }

    public void afficherInfo() {
        System.out.println("Commande id:" + id);
        for(Produit p : produits) {
            System.out.printf("%s: %.2f€ x %d = %.2f€\n",
                    p.getNom(), p.getPrixUnitaire(), p.getQuantite(), p.getPrixTotale());
        }
        System.out.println("**************");
        System.out.printf("Totale : %.2f€\n", calculerTotal());
    }


}
