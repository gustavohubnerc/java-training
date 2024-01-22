import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho da sequência de Fibonacci: ");
        
        int size = scanner.nextInt();
        
        int a = 0, b = 1;

        for (int i = 0; i < size; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        scanner.close();
    }
}
