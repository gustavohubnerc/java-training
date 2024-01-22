import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int number = scanner.nextInt();

        String parity = (number % 2 == 0) ? "par" : "ímpar";
        String sign = (number >= 0) ? "positivo" : "negativo";

        System.out.println(number + " é " + parity + " e " + sign + ".");
        scanner.close();
    }
}