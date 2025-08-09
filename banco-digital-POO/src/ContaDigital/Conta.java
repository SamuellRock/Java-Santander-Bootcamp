package ContaDigital;

public abstract class Conta {
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente cliente;


    //Construtor
    public Conta(int numero, int agencia, Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = 0; // Começa com zero por padrão
    }


    public double getSaldo() {
        return saldo;
    }
    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }





    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor do depósito deve ser positivo.");
            return;
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor do saque deve ser positivo.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente.");
            return;
        }
        saldo -= valor;
    }

    public void transferir(double valor, Conta destino) {
        if (valor <= 0) {
            System.out.println("Erro: Valor da transferência deve ser positivo.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente.");
            return;
        }
        this.sacar(valor);
        destino.depositar(valor);
    }

    public abstract void imprimirExtrato();

}
