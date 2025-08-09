// Banco.java
package BancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
        carregarContasIniciais();
    }

    private void carregarContasIniciais() {
        // Simulando JSON
        contas.add(new ContaCorrente(1, 101, new Cliente("Maria"), 500.0));
        contas.add(new ContaPoupanca(2, 101, new Cliente("Pedro"), 800.0));
        contas.add(new ContaCorrente(3, 102, new Cliente("Ana"), 1200.0));
    }

    public Conta buscarContaPorNumero(int numero) {
        for (Conta c : contas) {
            if (c.getNumero() == numero) {
                return c;
            }
        }
        return null;
    }

    public List<Conta> getContas() {
        return contas;
    }
}
