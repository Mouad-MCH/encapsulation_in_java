package Challenge_5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("AB-123-CD", "Renault", "Clio");

        CarteGrise cart1 = new CarteGrise("CG-2024-001", LocalDate.of(2025, 1, 14));

        System.out.println("----------------Before---------------");
        v1.afficherInfo();
        cart1.afficherInfo();

        System.out.println("---------------After----------------");
        v1.lierCarteGrise(cart1);

        v1.afficherInfo();
        cart1.afficherInfo();

    }
}
