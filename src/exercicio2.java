import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        float peso = scanner.nextFloat();

        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();

        float calImc = peso / (altura * altura);

        if (calImc <= 18.5) {
            System.out.println("Seu IMC é de " + calImc + " você está abaixo do peso");
        } else if (calImc <= 24.9) {
            System.out.println("Seu IMC é de " + calImc + " você está no peso ideal");
        } else if (calImc <= 29.9) {
            System.out.println("Seu IMC é de " + calImc + " você está um pouco acima do peso");
        } else if (calImc <= 34.9) {
            System.out.println("Seu IMC é de " + calImc + " Obesidade Grau I");
        } else if (calImc <= 39.9) {
            System.out.println("Seu IMC é de " + calImc + " Obesidade Grau II");
        } else {
            System.out.println("Seu IMC é de " + calImc + " OBESIDADE MÓRBIDA");
        }
    }
}
