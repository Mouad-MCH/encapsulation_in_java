package Challenge_9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Certification c = new Certification("coding", LocalDate.of(2020, 2, 2));

        Etudiant e1 = new Etudiant(1,"Mouad");

        e1.attribuerCertification(c);
        System.out.println(e1);
    }
}
