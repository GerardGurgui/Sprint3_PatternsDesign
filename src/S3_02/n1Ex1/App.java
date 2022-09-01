package S3_02.n1Ex1;

public class App {

    public static void main(String[] args) {

        AgentBorsa agentBorsa = new AgentBorsa();

        AgenciaBorsaA agenciaBorsaA = new AgenciaBorsaA(agentBorsa);
        AgenciaBorsaB agenciaBorsaB = new AgenciaBorsaB(agentBorsa);

        /*Cambios de estado del agente de borsa*/
        agentBorsa.setCambioDivisa(120);


    }
}
