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
        coursSuivis.add(c);
    }

}
