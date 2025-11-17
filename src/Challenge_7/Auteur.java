package Challenge_7;

import java.util.ArrayList;
import java.util.List;

public class Auteur {
    private String nom;
    private List<Livre> livresEcrits;

    public Auteur(String nom) {
        this.nom = nom;
        this.livresEcrits = new ArrayList<>();
    }

    public void ajouterLivre(Livre l) {
        if(livresEcrits.contains(l)) {
            System.out.println("livre est deja ajouter");
            return;
        }
        livresEcrits.add(l);
        if(!l.getAuteurs().contains(this)) {
            l.ajouterAuteur(this);
        }

        System.out.println("livre est ajouter avec accsess :)");

    }


    public String getNom() {
        return nom;
    }

    public List<Livre> getLivresEcrits() {
        return livresEcrits;
    }

    public void afficherInfo() {
        System.out.println("----------Auteur-----------");
        System.out.println("Auteur: " + nom);
        System.out.println("Livres: ");
        if(livresEcrits.isEmpty()) {
            System.out.println("Aucun livre");
        }else {
            for(Livre livre : livresEcrits) {
                System.out.println("- Title : " + livre.getTitle());
            }
        }

    }

    @Override
    public String toString() {
        return "Auteur{" +
                "nom='" + nom + '\'' +
                ", livresEcrits=" + getLivresEcrits() +
                '}';
    }

/* public void afficherInfo(){
        System.out.println("-------Auteurs------");
        if(!auteurs.isEmpty()) {
            for(Auteur auteur : auteurs) {
                System.out.println("Auteur nom: " + auteur.getNom() + );
            }


        }
    }
    */
}
