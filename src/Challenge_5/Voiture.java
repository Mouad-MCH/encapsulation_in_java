package Challenge_5;

public class Voiture {
    private String immatriculation;
    private String marque;
    private String modele;
    private CarteGrise carteGrise;

    public Voiture(String immatriculation, String marque, String modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }

    public void lierCarteGrise(CarteGrise c) {
        this.carteGrise = c;

        if(c != null && c.getProprietaire() != this) {
            c.setProprietaire(this);
        }
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public CarteGrise getCarteGrise() {
        return carteGrise;
    }



    public void afficherInfo() {
        System.out.println("-----Information--------");
        System.out.println("Immatriculation : " + immatriculation);
        System.out.println("Immatriculation : " + marque);
        System.out.println("Immatriculation : " + modele);
        if(carteGrise != null) {
            System.out.println("Carte Grise : " + carteGrise.getNumero());
        } else {
            System.out.println("Aucune carte grise associée");
        }
    }


}
