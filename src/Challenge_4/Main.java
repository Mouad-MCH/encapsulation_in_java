package Challenge_4;

public class Main {
    public static void main(String[] args) {
        Produit p1 = new Produit("p1", 23.33, 2);
        Produit p2 = new Produit("p2", 23.44, 2);
        Produit p3 = new Produit("p3", 23.5555, 2);

        Commande c1 = new Commande(1);

        c1.ajouterProduit(p1);
        c1.ajouterProduit(p2);
        c1.ajouterProduit(p3);

        c1.afficherInfo();
    }
}
