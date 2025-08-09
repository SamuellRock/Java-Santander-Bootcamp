package ContaDigital;

public class ContaCorrente extends Conta {

     // Construtor — repassa para o construtor da classe mãe (Conta) usando super
    public ContaCorrente(int numero, int agencia, Cliente cliente) {
        super(numero, agencia, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Titular: " + getCliente().getNome());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número : " + getNumero());
        System.out.println("Saldo  : R$ " + getSaldo());
    }

}
