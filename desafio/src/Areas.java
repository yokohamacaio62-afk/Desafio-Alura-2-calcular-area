import java.util.Scanner;

public class Areas {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha !=3){

            System.out.println("----Menu----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. sair");
            System.out.println("Escolha uma opcao: ");
            escolha = scanner.nextInt();

            if (escolha == 1){
                System.out.println("digite o lado do quadrado");
                double lado = scanner.nextDouble();
                double areaDoQuadrado = lado * lado;
                System.out.println("A area do quadrado é:" + areaDoQuadrado);
                System.out.println("Programa encerrado.");
            } else if (escolha == 2) {
                System.out.println("Digite o raio");
                double raio = scanner.nextDouble();
                double areaDoCirculo = raio * raio;
                System.out.println("A area do circulo é:" + areaDoCirculo);
                System.out.println("Programa encerrado.");
            } else if (escolha == 3 ) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opcao é invalida");
            }

        }
    }
}
