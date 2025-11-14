package Challenge_1;

public class Personne {
    private String nom;
    private int age;
    private Passeport passeport;


    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void assignerPasseport(Passeport p) {
        passeport = p;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Passeport getPasseport() {
        return passeport;
    }

    public void setPasseport(Passeport passeport) {
        this.passeport = passeport;
        System.out.println("Socsess :)");
    }


    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", passeport=" + passeport +
                '}';
    }
}
