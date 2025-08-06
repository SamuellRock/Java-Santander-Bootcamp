package candidatura;

public class ProcessoSeletivo {


    public final static double SALARIO_BASE = 2000.0;


    static void analisarCandidato(double salarioPretendido){

        if(SALARIO_BASE > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
            
        } else if(SALARIO_BASE == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPOPOSTA");
            
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS OUTROS CANDIDATOS");

        }

    }

}
