package Challenge_10;


import java.util.ArrayList;
import java.util.List;

public class Employe {
    private String nom;
    private List<Projet> projets;

    public Employe(String nom) {
        this.nom = nom;
        this.projets = new ArrayList<>();
    }

    public void ajouterProjet(Projet p) {
        if(!projets.contains(p)) {
            this.projets.add(p);
            if(!p.getEquipe().contains(this)) {
                p.ajouterEmploye(this);
            }
        }
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Projet> getProjets() {
        return projets;
    }
    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }


    public void afficherInfo() {
        System.out.println("name : " + nom);
        System.out.println("Projet : ");
        for(Projet projet: projets) {
            System.out.println(" - " + projet.getNom());
        }
        System.out.println("****************************");
    }
}
