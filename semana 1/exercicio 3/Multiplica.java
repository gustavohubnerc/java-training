import java.util.Scanner;

public class Multiplica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número a ser multiplicado: ");
        int num = scanner.nextInt();

        System.out.println("Tabela de multiplicação por " + num);

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        scanner.close();
    }
}
