package Challenge_7;

import java.util.ArrayList;
import java.util.List;

public class Livre {
    private String title;
    private List<Auteur> auteurs;

    public Livre(String title) {
        this.title = title;
        this.auteurs = new ArrayList<>();
    }

    public void ajouterAuteur(Auteur a) {
        if(!auteurs.contains(a)){
            auteurs.add(a);
            a.ajouterLivre(this);
            System.out.println("auteur : " + a.getNom() + " est ajouter avec accsess :)");
        }else {
            System.out.println("auteur : " + a.getNom() + " est deja ajouter");
        }
    }

    public String getTitle() {
        return title;
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public void afficherInfo() {
        System.out.println("---------- Livre -----------");
        System.out.println("Titre: " + title);
        System.out.println("Auteurs:");
        if(auteurs.isEmpty()) {
            System.out.println("  Aucun auteur");
        } else {
            for(Auteur auteur : auteurs) {
                System.out.println("  - " + auteur.getNom());
            }
        }
        System.out.println("----------------------------");
    }
}
