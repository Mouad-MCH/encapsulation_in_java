package Challenge_6;

public class Livre {
    private String title;
    private String auteur;
    private String isbn;

    public Livre(String title, String auteur, String isbn) {
        this.title = title;
        this.auteur = auteur;
        this.isbn = isbn;
    }

    public void afficherInfo() {
        System.out.println("- " + title + " - " + auteur + " (ISB: " + isbn + ")");
    }


    public String getTitle() {
        return title;
    }
    public String getAuteur() {
        return auteur;
    }
    public String isIsbn() {
        return isbn;
    }
}
