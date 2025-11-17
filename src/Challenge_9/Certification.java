package Challenge_9;

import java.time.LocalDate;

public class Certification {
    private String titre;
    private LocalDate dateObtention;

    public Certification(String titre, LocalDate dateObtention) {
        this.titre = titre;
        this.dateObtention = dateObtention;
    }

    @Override
    public String toString() {
        return "Certification{" +
                "titre='" + titre + '\'' +
                ", dateObtention=" + dateObtention +
                '}';
    }
}
