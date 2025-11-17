package Challenge_6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private String nom;
    private List<Livre> livres;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.livres = new ArrayList<>();
    }


    public void ajouterLivre(Livre liver) {
        if(!livres.contains(liver)) {
            livres.add(liver);
        }else {
            System.out.println("liver " + liver.getTitle() + " est deja dans la bibliothique");
        }
    }

    public void supprimerLivre(Livre livre) {
        boolean removed = livres.remove(livre);
        if(removed)  {
            System.out.println("Livre supprime : " + livre.getTitle());
        }else {
            System.out.println("Livre non  trouve : " + livre.getTitle());
        }
    }

    public void afficherInfo() {
        System.out.println("---------Bibliothique-----------");
        if(livres.isEmpty()) {
            System.out.println("Bibliothique is Empty");
        }else {
            for(Livre livre : livres) {
                livre.afficherInfo();
            }
        }
    }

}
