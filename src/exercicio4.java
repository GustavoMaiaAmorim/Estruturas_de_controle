import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Agora digite outro numero, maior do que o primeiro: ");
        int numero2 = scanner.nextInt();

        while (numero2 < numero1){
            System.out.println("Numero inválido, digite um numero maior doque o primeiro: ");
            numero2 = scanner.nextInt();
        }

        while (numero1 % numero2 == 0) {
            System.out.println("Digite um novo numero, maior do que o primeiro: ");
            numero2 = scanner.nextInt();
        }

    }
}
