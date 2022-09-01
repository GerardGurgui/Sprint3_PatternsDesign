package S3_01.N1ex2.abstractFactory.factorys;

import S3_01.N1ex2.abstractFactory.extensiones_paises.direcciones.ExtDireccionFrancia;
import S3_01.N1ex2.abstractFactory.extensiones_paises.direcciones.ExtDireccionInglaterra;
import S3_01.N1ex2.abstractFactory.extensiones_paises.direcciones.ExtDireccionItalia;
import S3_01.N1ex2.abstractFactory.extensiones_paises.telefonos.ExtTelefonoFrancia;
import S3_01.N1ex2.abstractFactory.extensiones_paises.telefonos.ExtTelefonoInglaterra;
import S3_01.N1ex2.abstractFactory.extensiones_paises.telefonos.ExtTelefonoItalia;
import S3_01.N1ex2.abstractFactory.interfaces.AbstractFactory;
import S3_01.N1ex2.abstractFactory.interfaces.ExtensionDireccion;
import S3_01.N1ex2.abstractFactory.interfaces.ExtensionTelefono;


public class FabricaDireccion implements AbstractFactory {


    @Override
    public ExtensionDireccion obtenerExtDireccion(String pais) {

        ExtensionDireccion extensionDireccion = null;

        if (pais.equalsIgnoreCase("inglaterra")){

            extensionDireccion = new ExtDireccionInglaterra();

        } else if (pais.equalsIgnoreCase("francia")) {

            extensionDireccion = new ExtDireccionFrancia();

        } else if (pais.equalsIgnoreCase("italia")) {

            extensionDireccion = new ExtDireccionItalia();

        }

        return extensionDireccion;

    }



    @Override
    public ExtensionTelefono obtenerExtTelefono(String pais) {
        return null;
    }
}
