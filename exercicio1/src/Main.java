import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, soma;

        Scanner leitura = new Scanner(System.in);

        a = leitura.nextInt();
        b = leitura.nextInt();
        soma = a + b;

        System.out.println("SOMA = " + soma);

    }
}
