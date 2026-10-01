import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int number = scanner.nextInt();

        System.out.println("\n--- Tabuada do " + number + " ---");

        for (int i = 1; i <= 10; i++) {
            int resultado = number * i;
            System.out.println(number + " x " + i + " = " + resultado);
        }
    }
}
