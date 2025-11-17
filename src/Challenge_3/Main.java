package Challenge_3;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant(123, "Mouad");
        Cours c1 = new Cours(123, "Electronique");

        e1.inscrire(c1);
        c1.ajouterEtudiant(e1);


        e1.afficherCour();
        c1.afficherEtudiant();

//        System.out.println(e1);
//        System.out.println(c1);

    }
}
