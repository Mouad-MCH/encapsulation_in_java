package Challenge_10;

public class Main {
    public static void main(String[] args) {
        Projet p1 = new Projet("whatssap clone");
        Projet p2 = new Projet("Netflix clone");
        Projet p3 = new Projet("AI Agent");
        Projet p4 = new Projet("Ecommerce Website");


        Employe e1 = new Employe("Mouad");
        Employe e2 = new Employe("Ali");
        Employe e3 = new Employe("Adam");
        Employe e4 = new Employe("Omar");


        p1.ajouterEmploye(e1);
        p1.ajouterEmploye(e2);
        p1.ajouterEmploye(e3);
        p1.ajouterEmploye(e4);

        p1.afficherInfo();

        e1.ajouterProjet(p2);
        e2.ajouterProjet(p3);
        e3.ajouterProjet(p4);
        e4.ajouterProjet(p2);

        p2.afficherInfo();
        p3.afficherInfo();

        e1.afficherInfo();
        e2.afficherInfo();
        e3.afficherInfo();
        e4.afficherInfo();

    }
}
