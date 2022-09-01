package S3_01.N1ex2.abstractFactory.extensiones_paises.telefonos;

import S3_01.N1ex2.abstractFactory.interfaces.ExtensionDireccion;
import S3_01.N1ex2.abstractFactory.interfaces.ExtensionTelefono;

public class ExtTelefonoInglaterra implements  ExtensionTelefono {


    public ExtTelefonoInglaterra() {
    }


    @Override
    public String crearExtensionTelefono() {

        final String EXT_TELF = "+08500";

        return EXT_TELF;

    }
}
