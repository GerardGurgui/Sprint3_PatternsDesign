package S3_01.N1ex2.abstractFactory.factorys;

import S3_01.N1ex2.abstractFactory.interfaces.AbstractFactory;

public class TipoFabrica {

    public static AbstractFactory obtenerFabrica(String tipoFabrica){

        AbstractFactory abstractFactory = null;

        if (tipoFabrica.equalsIgnoreCase("Direccion")){

            abstractFactory = new FabricaDireccion();

        } else if (tipoFabrica.equalsIgnoreCase("Telefono")) {

            abstractFactory = new FabricaTelefono();

        }

        return abstractFactory;
    }

}
