package S3_02.n1Ex1;

import java.util.ArrayList;
import java.util.List;

/*Clase observable encargada de notificar a su lista de observadores
* de algún cambio/actualización*/
public class AgentBorsa {

    private List<Observador> listaObservadores = new ArrayList<>();
    private double cambioDivisa;



    public double getCambioDivisa() {
        return cambioDivisa;
    }

    /*En el set del atributo que se va actualizando, llamamos al metodo para notificar
    * a todos los observadores siempre que ocurra un cambio.*/
    public double setCambioDivisa(double cambioDivisa) {
        this.cambioDivisa = cambioDivisa;
        notificarObservadores();
        return cambioDivisa;

    }

    public void agregarObservador(Observador observador){

        listaObservadores.add(observador);

    }

    public void notificarObservadores(){

        for (Observador observadores : listaObservadores) {

            observadores.actualizar();
        }

    }

}
