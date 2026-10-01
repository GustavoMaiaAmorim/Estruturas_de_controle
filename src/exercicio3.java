import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int number1 = scanner.nextInt();

        System.out.println("Digite um numero maior do que o anterior: ");
        int number2 = scanner.nextInt();

        while (number2 <= number1) {
            System.out.println("Número inválido! Digite um numero MAIOR do que " + number1 + ": ");
            number2 = scanner.nextInt();
        }

        System.out.println("Escolha uma opção: \n1 -Impar \n2 - Par");
        int imparOuPar = scanner.nextInt();

        switch (imparOuPar) {
            case 1:
                int inicioImpar = (number1 % 2 == 0) ? number1 + 1 : number1;

                for (int i = inicioImpar; i <= number2; i += 2) {
                    System.out.println(i);
                }
                break;

            case 2:
                int inicioPar = (number1 % 2 == 0) ? number1 : number1 + 1;

                for (int i = inicioPar; i <= number2; i += 2) {
                    System.out.println(i);
                }
                break;
        }
    }
}
