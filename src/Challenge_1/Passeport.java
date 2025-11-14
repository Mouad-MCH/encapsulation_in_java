package Challenge_1;

public class Passeport {
    private int numero;
    private String nationalite;
    private int dateExpiration;

    public Passeport(int numero, String nationalite, int dateExpiration) {
        this.numero = numero;
        this.nationalite = nationalite;
        this.dateExpiration = dateExpiration;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public int getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(int dateExpiration) {
        this.dateExpiration = dateExpiration;
    }



    @Override
    public String toString() {
        return "Passeport{" +
                "numero=" + numero +
                ", nationalite='" + nationalite + '\'' +
                ", dateExpiration=" + dateExpiration +
                '}';
    }
}
