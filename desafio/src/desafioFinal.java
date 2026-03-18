import java.util.Scanner;

public class desafioFinal {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "dani";
        String tipoCOnta = "contaCorrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*********************************");
        System.out.println("\nnome do cliente: " + nome);
        System.out.println("tipo conta: "  + tipoCOnta);
        System.out.println("saldo atual: " + saldo);
        System.out.println("*********************************");

        String menu = """
                ** digite sua opcao **
                1 - consultar saldo
                2 - transferir valor
                3 - receber valor
                4 - sair valor;
                """;
        Scanner leitura = new Scanner(System.in);



        while (opcao != 4 ){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("o saldo atualizado é " +  saldo);
            } else if (opcao == 2) {
                System.out.println("qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Nao ha saldo para realizar transferencia");
                } else {
                    saldo -= valor;
                    System.out.println("novo saldo" + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("valor recebido");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("novo saldo " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opcao invalida");
            }
        }
    }
}
