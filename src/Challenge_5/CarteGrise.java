package Challenge_5;


import java.time.LocalDate;

public class CarteGrise {
    private String numero;
    private Voiture proprietaire;
    private LocalDate dateEmission;

    public CarteGrise(String numero, LocalDate dateEmission) {
        this.numero = numero;
        this.dateEmission = dateEmission;
    }


    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Voiture getProprietaire() {
        return proprietaire;
    }
    public void setProprietaire(Voiture proprietaire) {
        this.proprietaire = proprietaire;
    }

    public LocalDate getDateEmission() {
        return dateEmission;
    }
    public void setDateEmission(LocalDate dateEmission) {
        this.dateEmission = dateEmission;
    }



    public void afficherInfo() {
        System.out.println("-----Information--------");
        System.out.println("numero : " + numero);
        System.out.println("dateEmission : " + dateEmission);

        if(proprietaire != null) {
            System.out.println("Proprietaire : " + proprietaire.getMarque() + " " +
                               proprietaire.getModele() + " (" +
                               proprietaire.getImmatriculation() + ")");
        } else {
            System.out.println("Aucune Proprietaire associée");
        }
    }


}
