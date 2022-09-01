package S3_01.N1ex2.abstractFactory.extensiones_paises.direcciones;

import S3_01.N1ex2.abstractFactory.interfaces.ExtensionDireccion;

public class ExtDireccionInglaterra implements ExtensionDireccion {

    public ExtDireccionInglaterra() {
    }

        @Override
    public String crearExtensionDirecion() {

        final String EXT_DIRECCION = "Ing_";

        return EXT_DIRECCION;
    }
}

