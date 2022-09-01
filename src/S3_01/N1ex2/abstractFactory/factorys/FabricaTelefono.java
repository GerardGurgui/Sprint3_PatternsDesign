package S3_01.N1ex2.abstractFactory.factorys;

import S3_01.N1ex2.abstractFactory.extensiones_paises.telefonos.ExtTelefonoFrancia;
import S3_01.N1ex2.abstractFactory.extensiones_paises.telefonos.ExtTelefonoInglaterra;
import S3_01.N1ex2.abstractFactory.extensiones_paises.telefonos.ExtTelefonoItalia;
import S3_01.N1ex2.abstractFactory.interfaces.AbstractFactory;
import S3_01.N1ex2.abstractFactory.interfaces.ExtensionDireccion;
import S3_01.N1ex2.abstractFactory.interfaces.ExtensionTelefono;

public class FabricaTelefono implements AbstractFactory {



    @Override
    public ExtensionTelefono obtenerExtTelefono(String pais) {

        ExtensionTelefono extensionTelefono = null;

        if (pais.equalsIgnoreCase("inglaterra")){

            extensionTelefono = new ExtTelefonoInglaterra();

        } else if (pais.equalsIgnoreCase("francia")) {

            extensionTelefono = new ExtTelefonoFrancia();

        } else if (pais.equalsIgnoreCase("italia")) {

            extensionTelefono = new ExtTelefonoItalia();
        }

        return extensionTelefono;

    }

    @Override
    public ExtensionDireccion obtenerExtDireccion(String pais) {
        return null;
    }
}
