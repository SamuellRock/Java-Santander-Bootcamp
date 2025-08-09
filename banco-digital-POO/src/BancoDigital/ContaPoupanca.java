package BancoDigital;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, int agencia, Cliente cliente, double saldoInicial) {
        super(numero, agencia, cliente, saldoInicial);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" ");
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Titular: " + getCliente().getNome());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número : " + getNumero());
        System.out.println("Saldo  : R$ " + getSaldo());
    }

}
