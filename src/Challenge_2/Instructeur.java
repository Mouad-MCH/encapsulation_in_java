package Challenge_2;

import java.util.ArrayList;
import java.util.List;

public class Instructeur {
    private int id;
    private String nom;
    private String specialisation;
    private List<Cours> coursEnseignes;


    public Instructeur(int id, String nom, String specialisation) {
        this.id = id;
        this.nom = nom;
        this.specialisation = specialisation;
        this.coursEnseignes = new ArrayList<>();
    }


    public void ajouterCours(Cours c) {
        this.coursEnseignes.add(c);
    }

    public void afficherCours() {

    }

    @Override
    public String toString() {
        return "Instructeur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", specialisation='" + specialisation + '\'' +
                ", coursEnseignes=" + coursEnseignes +
                '}';
    }

}
