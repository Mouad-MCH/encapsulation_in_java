package Challenge_2;

public class Main {
    public static void main(String[] args) {

        Instructeur i = new Instructeur(1, "Mouad", "physique");
        Cours c = new Cours(1, "Electronique Numerique", "physique");
        i.ajouterCours(c);

        System.out.println(i);

    }
}
