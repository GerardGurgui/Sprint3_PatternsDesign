package S3_02.n1Ex1;

/*Clase abstracta que heredan las clases observadoras
* contiene el sujeto(Agente de borsa en este caso) al que observan y la función de actualizar
* que se ejecuta siempre que ese sujeto cambie su estado*/
public abstract class Observador {

    protected AgentBorsa agentBorsa;

    public abstract void actualizar();

}
