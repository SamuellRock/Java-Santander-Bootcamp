package BancoDigital;

public abstract class Conta {
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente cliente;


    // Constructor
    public Conta(int numero, int agencia, Cliente cliente, double saldoInicial) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }



    public int getNumero() {
        return numero;
    }
    public int getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }



    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado para " + cliente.getNome());
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado para " + cliente.getNome());
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para " + destino.getCliente().getNome());
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public abstract void imprimirExtrato();
    
}
