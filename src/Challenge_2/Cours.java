package Challenge_2;

public class Cours {
    private int id;
    private String titre;
    private String descriptio;

    public Cours(int id, String titre, String descriptio) {
        this.id = id;
        this.titre = titre;
        this.descriptio = descriptio;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", descriptio='" + descriptio + '\'' +
                '}';
    }
}
