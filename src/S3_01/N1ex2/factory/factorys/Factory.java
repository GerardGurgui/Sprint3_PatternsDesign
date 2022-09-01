//package S3_01.N1ex2.factory.factorys;
//
//import S3_01.N1ex2.factory.extensiones_paises.ExtensionFrancia;
//import S3_01.N1ex2.factory.extensiones_paises.ExtensionInglaterra;
//import S3_01.N1ex2.factory.clase_abstracta.ExtensionGenerica;
//import S3_01.N1ex2.factory.extensiones_paises.ExtensionItalia;
//
///*Clase fábrica encargada de crear las diferentes posibles extensiones dependiendo
//del país introducido.
//Con este patrón, Si queremos añadir nuevas extensiones de paises, sólo tendremos que crear su clase
//e implementar los métodos de la clase padre y añadir al metodo verificarPais de la fábrica*/
//
//public class Factory {
//
//    private String pais;
//
//    //Constructor que recibe la dirección introducida por el usuario
//    public Factory(String pais) {
//
//        this.pais = pais;
//
//    }
//
//    public ExtensionGenerica verificarPais() {
//
//        /*Almacenamos el objeto que se fabricará en una variable de la clase padre, así,
//         * utilizamos polimorfismo y podemos crear el objeto en concreto según introduzca
//         * el usuario y lo devolevemos con solo un return*/
//
//
//        ExtensionGenerica extensionGenerica = null;
//
//
//        if (pais.equalsIgnoreCase("inglaterra")) {
//
//            extensionGenerica = new ExtensionInglaterra();
//
//
//        } else if (pais.equalsIgnoreCase("francia")) {
//
//            extensionGenerica = new ExtensionFrancia();
//
//
//        } else if (pais.equalsIgnoreCase("italia")) {
//
//            extensionGenerica = new ExtensionItalia();
//
//
//        } else {
//
//            System.out.println("No existe la extensión de este país en la base de datos,");
//
//        }
//
//        return extensionGenerica;
//    }
//
//
//}
