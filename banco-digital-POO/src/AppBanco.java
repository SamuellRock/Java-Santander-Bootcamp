import BancoDigital.Banco;
import BancoDigital.Conta;

import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n==========================");
            System.out.println("=== Menu Banco Digital ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Extratos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) { // Depositar
                System.out.print("Número da conta: ");
                int numConta = sc.nextInt();
                Conta conta = banco.buscarContaPorNumero(numConta);
                if (conta != null) {
                    System.out.print("Valor do depósito: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                } else {
                    System.out.println("Conta não encontrada.");
                }
            } 
            else if (opcao == 2) { // Sacar
                System.out.print("Número da conta: ");
                int numConta = sc.nextInt();
                Conta conta = banco.buscarContaPorNumero(numConta);
                if (conta != null) {
                    System.out.print("Valor do saque: ");
                    double valor = sc.nextDouble();
                    conta.sacar(valor);
                } else {
                    System.out.println("Conta não encontrada.");
                }
            } 
            else if (opcao == 3) { // Transferir
                System.out.print("Conta origem: ");
                int origem = sc.nextInt();
                System.out.print("Conta destino: ");
                int destino = sc.nextInt();
                Conta contaOrigem = banco.buscarContaPorNumero(origem);
                Conta contaDestino = banco.buscarContaPorNumero(destino);

                if (contaOrigem != null && contaDestino != null) {
                    System.out.print("Valor da transferência: ");
                    double valor = sc.nextDouble();
                    contaOrigem.transferir(valor, contaDestino);
                } else {
                    System.out.println("Conta de origem ou destino inválida.");
                }
            } 
            else if (opcao == 4) { // Extratos
                for (Conta c : banco.getContas()) {
                    c.imprimirExtrato();
                }
            }

        } while (opcao != 0);

        sc.close();
    }
}