import java.util.Scanner;

public class desafioAlura {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número ");
        int numeroDigitado = scanner.nextInt();

        if (numeroDigitado < 0){
            System.out.println("É um número negativo");
        } else {
            System.out.println("É um número positivo");
        }


        }
    }

