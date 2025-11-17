package Challenge_7;

public class Main {
    public static void main(String[] args) {
        Auteur a1 = new Auteur("mouad");
        Auteur a2 = new Auteur("Ali");
        Auteur a3 = new Auteur("Adam");

        Livre l1 = new Livre("title1");
        Livre l2 = new Livre("title2");
        Livre l3 = new Livre("title3");

        System.out.println("=========ajoute Livre to auture ( mouad )==========");
        a1.ajouterLivre(l1);
        a1.ajouterLivre(l2);
        a1.ajouterLivre(l3);

        System.out.println("=========ajoute auter to Livre ( Titre 1 )==========");
        l1.ajouterAuteur(a1);
        l1.ajouterAuteur(a2);
        l1.ajouterAuteur(a3);

        System.out.println("=========ajoute auter to Livre ( Titre 2 )==========");
        l2.ajouterAuteur(a1);
        l2.ajouterAuteur(a3);

        System.out.println("=========Info auture==========");
        a1.afficherInfo();

        System.out.println("=========Info Livre==========");
        l1.afficherInfo();
        l2.afficherInfo();



    }
}
