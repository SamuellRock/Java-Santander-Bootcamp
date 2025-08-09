import ContaDigital.Cliente;
import ContaDigital.Conta;
import ContaDigital.ContaCorrente;
import ContaDigital.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        Cliente maria = new Cliente("Maria");
        Cliente joao = new Cliente("João");

        Conta cc = new ContaCorrente(1, 101, maria);
        Conta cp = new ContaPoupanca(2, 101, joao);

        cc.depositar(500);
        cp.depositar(300);

        cc.transferir(200, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
