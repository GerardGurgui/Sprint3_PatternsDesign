package S3_01.N1ex2.abstractFactory.extensiones_paises.direcciones;


import S3_01.N1ex2.abstractFactory.interfaces.ExtensionDireccion;

public class ExtDireccionFrancia implements ExtensionDireccion {

    public ExtDireccionFrancia() {
    }


    @Override
    public String crearExtensionDirecion() {

        final String EXT_DIRECCION_FR = "Fr_";

        return EXT_DIRECCION_FR;
    }



}
