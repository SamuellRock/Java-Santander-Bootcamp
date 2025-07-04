import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();


        System.out.println("Por favor, digite o número da Conta:");
        conta.numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Por favor, digite o número da Agência:");
        conta.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        conta.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        conta.saldo = scanner.nextDouble();


        // String mensagem = "Olá " + conta.nomeCliente +
        // ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia +
        // ", conta " + conta.numero +
        // " e seu saldo R$ " + conta.saldo +
        // " já está disponível para saque.";


        // Usando concat() para reforçar o aprendizado
        String mensagem = "Olá ".concat(conta.nomeCliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(conta.agencia)
            .concat(", conta ")
            .concat(String.valueOf(conta.numero))
            .concat(" e seu saldo R$ ")
            .concat(String.valueOf(conta.saldo))
            .concat(" já está disponível para saque.");

        System.out.println("\n" + mensagem);

        scanner.close();
        
    }
}
