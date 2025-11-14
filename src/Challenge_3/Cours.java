package Challenge_3;

import java.util.ArrayList;
import java.util.List;

public class Cours {
    private int id;
    private String title;
    private List<Etudiant> inscrits;

    public Cours(int id, String title) {
        this.id = id;
        this.title = title;
        this.inscrits = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant e) {
        inscrits.add(e);
        e.inscrire(this);
    }


}
