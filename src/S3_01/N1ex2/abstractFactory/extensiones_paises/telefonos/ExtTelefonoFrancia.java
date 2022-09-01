package S3_01.N1ex2.abstractFactory.extensiones_paises.telefonos;

import S3_01.N1ex2.abstractFactory.interfaces.ExtensionTelefono;

public class ExtTelefonoFrancia implements ExtensionTelefono {

    public ExtTelefonoFrancia() {
    }


    @Override
    public String crearExtensionTelefono() {

        final String EXT_TELF = "+8900";

        return EXT_TELF;
    }


}
