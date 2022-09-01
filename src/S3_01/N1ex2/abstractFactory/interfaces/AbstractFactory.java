package S3_01.N1ex2.abstractFactory.interfaces;

/*Fabrica de fabricas:
* esta interfaz se encarga de definir los 2 metodos que implementarán
* las respectivas fábricas de objetos.*/

public interface AbstractFactory {

    public ExtensionTelefono obtenerExtTelefono(String pais);
    public ExtensionDireccion obtenerExtDireccion(String pais);

}
