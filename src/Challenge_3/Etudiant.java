package Challenge_3;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private int id;
    private String nom;
    private List<Cours> coursSuivis;

    public Etudiant(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.coursSuivis = new ArrayList<>();
    }

    public void  inscrire(Cours c) {
        if(!coursSuivis.contains(c)) {
           coursSuivis.add(c);
           c.ajouterEtudiant(this);
        }
    }


    public List<Cours> getCoursSuivis() {
        return coursSuivis;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }

    public void afficherCour() {
        System.out.println("-----Cour--------");
        for(Cours c: coursSuivis) {
            System.out.println("- " + c.toString());
        }
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
