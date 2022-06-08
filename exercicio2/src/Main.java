import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double pi = 3.141459;
        double raio;
        double area;

        Scanner leitura = new Scanner(System.in);
        raio = leitura.nextDouble();

        area = pi * (raio * raio);
        System.out.printf("A=%.4f%n",area);

        leitura.close();
    }
}
