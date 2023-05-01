import java.util.Scanner;


public class kiloIndeks {
    public static void main(String[] args) {

        double kg, m, indeks;

        Scanner inp = new Scanner(System.in);

        System.out.print("lütfen kilonuzu giriniz :");
        kg = inp.nextDouble();

        System.out.print("lütfen boyunuzu giriniz : ");
        m = inp.nextDouble();

        indeks = kg / m * m;
        System.out.print("indeks : " + indeks);


    }
}
