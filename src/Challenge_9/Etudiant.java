package Challenge_9;

public class Etudiant {
    private int id;
    private String nom;
    private Certification certification;

    public Etudiant(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.certification = null;
    }


    public void attribuerCertification(Certification c) {
        if(this.certification == null) {
            this.certification = c;
        }else {
            System.out.println("Etudiant is have this certification");
        }

    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", certification=" + certification +
                '}';
    }
}
