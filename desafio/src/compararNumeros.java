import java.util.Scanner;

public class compararNumeros {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("Os números sao iguais:");
        } else if (numero1 > numero2){
            System.out.println("O número 1 é maior:");

        } else {
            System.out.println("O número 2 é maior:");

        }
        System.out.println("a diferenca entre os números sao:" + (numero1-numero2));
    }



}

