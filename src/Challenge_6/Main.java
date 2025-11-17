package Challenge_6;



public class Main {
    public static void main(String[] args) {

        Bibliotheque b1 = new Bibliotheque("B1");

        Livre livre1 = new Livre("L1", "A1", "1234");
        Livre livre2 = new Livre("L2", "A2", "123LLL4");
        Livre livre3 = new Livre("L3", "A3", "12JJ34");

        b1.ajouterLivre(livre1);
        b1.ajouterLivre(livre2);
        b1.ajouterLivre(livre3);

        b1.afficherInfo();
        b1.supprimerLivre(livre2);
        b1.afficherInfo();

    }
}
