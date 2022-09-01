package S3_02.n1Ex1;

public class AgenciaBorsaB extends Observador {


    private double precioActual = 150;


    public AgenciaBorsaB(AgentBorsa agentBorsa){

        this.agentBorsa = agentBorsa;
        this.agentBorsa.agregarObservador(this);

    }


    @Override
    public void actualizar() {

        double precioNuevo = agentBorsa.getCambioDivisa();

        if (precioNuevo < precioActual){

            System.out.println("Agencia de borsa B: El precio ha bajado");

        } else  {

            System.out.println("Agencia de borsa B: El precio ha subido");
        }


    }
}
