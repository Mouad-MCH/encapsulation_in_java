package Challenge_10;

import java.util.ArrayList;
import java.util.List;

public class Projet {
    private String nom;
    private List<Employe> equipe;

    public Projet(String nom) {
        this.nom = nom;
        this.equipe = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e) {
        if(!equipe.contains(e)) {
            this.equipe.add(e);
            if(!(e.getProjets().contains(this))) {
                e.ajouterProjet(this);
            }
        }
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Employe> getEquipe() {
        return equipe;
    }
    public void setEquipe(List<Employe> equipe) {
        this.equipe = equipe;
    }

    public void afficherInfo() {
        System.out.println("Projet nom : " + nom);
        System.out.println("Embloyee : ");
        for(Employe employe: equipe) {
            System.out.println(" - " + employe.getNom());
        }
        System.out.println("****************************");
    }
}
