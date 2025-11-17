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
        if(!inscrits.contains(e)) {
            inscrits.add(e);
            if(!e.getCoursSuivis().contains(this)) {
                e.getCoursSuivis().add(this);
            }
        }


    }

    public void afficherEtudiant() {
        System.out.println("------Etudiant--------");
        for(Etudiant e : inscrits) {
            System.out.println("- " + e.toString());
        }
    }

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
