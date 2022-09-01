package S3_01.N1ex2.abstractFactory.extensiones_paises.direcciones;

import S3_01.N1ex2.abstractFactory.interfaces.ExtensionDireccion;

public class ExtDireccionItalia implements ExtensionDireccion {

    public ExtDireccionItalia() {
    }

    @Override
    public String crearExtensionDirecion() {

        final String EXT_DIRECCION = "It_";

        return EXT_DIRECCION;
    }
}
