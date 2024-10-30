import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldo = 10.0; // Saldo inicial
        int opcao = 0; // Opção do menu
        String menu = """
                Escolha uma das opções disponíveis:
                1 - Consultar saldo
                2 - Transferir valor de saldo
                3 - Receber valor
                4 - Sair
                """; // Menu de opções
        Scanner leitura = new Scanner(System.in); // Scanner para entrada de dados

        // Loop do menu até a opção "Sair" ser escolhida
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) { // Consultar saldo
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao == 2) { // Transferir valor de saldo
                System.out.println("Qual o valor que deseja transferir?:");
                double valorTransferir = leitura.nextDouble();
                if (valorTransferir > saldo) {
                    System.out.println("Saldo insuficiente para transferência!");
                } else {
                    saldo -= valorTransferir;
                    System.out.println("Transferência realizada com sucesso!");
                }
            } else if (opcao == 3) { // Receber valor
                System.out.println("Valor a receber:");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Valor recebido com sucesso!");
            } else if (opcao == 4) { // Sair
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        }

        leitura.close(); // Fechar Scanner para evitar vazamento de recursos
    }
}
