package S3_01.N1ex2.abstractFactory.extensiones_paises.telefonos;


import S3_01.N1ex2.abstractFactory.interfaces.ExtensionTelefono;

public class ExtTelefonoItalia implements  ExtensionTelefono {

    public ExtTelefonoItalia() {
    }


    @Override
    public String crearExtensionTelefono() {

        final String EXT_TELF = "+1200";

        return EXT_TELF;
    }
}
