public class Main {
    public static void main(String[] args) {
        VeiculoFactory factory = new VeiculoFactoryImpl();

        Veiculo veiculo1 = factory.criarVeiculo("carro");
        veiculo1.exibirInfo();

        Veiculo veiculo2 = factory.criarVeiculo("moto");
        veiculo2.exibirInfo();

        Veiculo veiculo3 = factory.criarVeiculo("caminhao");
        veiculo3.exibirInfo();
    }
}

interface Veiculo {
    void exibirInfo();
}

class Carro implements Veiculo {
    @Override
    public void exibirInfo() {
        System.out.println("Veículo: Carro");
    }
}

class Moto implements Veiculo {
    @Override
    public void exibirInfo() {
        System.out.println("Veículo: Moto");
    }
}

class Caminhao implements Veiculo {
    @Override
    public void exibirInfo() {
        System.out.println("Veículo: Caminhao");
    }
}

interface VeiculoFactory {
    Veiculo criarVeiculo(String tipo);
}

class VeiculoFactoryImpl implements VeiculoFactory {
    @Override
    public Veiculo criarVeiculo(String tipo) {
        if ("carro".equalsIgnoreCase(tipo)) {
            return new Carro();
        } else if ("moto".equalsIgnoreCase(tipo)) {
            return new Moto();
        } else if ("caminhao".equalsIgnoreCase(tipo)) {
            return new Caminhao();
        }
        return null;
    }
}
