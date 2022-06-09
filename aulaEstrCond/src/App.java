import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        int minutos = leitura.nextInt();

        double conta = 50.0;

        double contaAPagar = (minutos > 100) ? conta += (minutos - 100) * 2 : conta;
        
        System.out.printf("Valor da conta = R$ %.2f%n",contaAPagar);

        leitura.close();

    }
}
