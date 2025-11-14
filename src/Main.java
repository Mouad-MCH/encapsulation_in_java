import Challenge_1.Passeport;
import Challenge_1.Personne;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personne per = new Personne("mouad", 12);
        Passeport pas = new Passeport(11, "ddkdkd", 11);
        per.assignerPasseport(pas);
        System.out.println(per);
    }
}