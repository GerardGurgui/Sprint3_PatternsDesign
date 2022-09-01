package S3_02.n1Ex1;

public class AgenciaBorsaA extends Observador {


    private double precioActual = 100;


    public AgenciaBorsaA(AgentBorsa agentBorsa){

        this.agentBorsa = agentBorsa;
        this.agentBorsa.agregarObservador(this);

    }


    @Override
    public void actualizar() {

        double precioNuevo = agentBorsa.getCambioDivisa();

        if (precioNuevo < precioActual){

            System.out.println("Agencia de borsa A: El precio ha bajado");

        } else {

            System.out.println("Agencia de borsa A: El precio ha subido");
        }


    }
}
