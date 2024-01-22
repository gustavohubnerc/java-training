import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho da pirâmide: ");
        
        int size = scanner.nextInt();
        
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        scanner.close();
    }
}
