//package S3_01.N1ex2.factory.main;
//
//import S3_01.N1ex2.factory.clase_abstracta.ExtensionGenerica;
//import S3_01.N1ex2.factory.clases.Agenda;
//import S3_01.N1ex2.factory.clases.Contacto;
//import S3_01.N1ex2.factory.factorys.Factory;
//
//import java.util.*;
//
//public class App {
//
//    public static void main(String[] args) {
//
//
////        /*Creamos una fábrica y una variable del tipo de objeto que puede crear la fábrica*/
////        Factory factory;
////        ExtensionGenerica extensionGenerica;
////
////        String pais = pedirTexto("Introduzca el país para saber la extensión");
////
////        factory = new Factory(pais);
////        extensionGenerica = factory.verificarPais();
////
////
////        /*. dependiendo del tipo de objeto que nos devuelva el método de la fábrica
////        * (según país introducido por usuario) obtendremos un tipo de objeto, y por tanto, con la variable
////        * de su clase padre, podremos llamar al método de la clase hija en concreto*/
////
////        String resultadoDireccion = extensionGenerica.implementarDireccionGenerica();
////        String resultadoExtension = extensionGenerica.implementarExtensionTelefono();
////
////        ////Direccion
////        System.out.println("------EXTENSIÓN DIRECCIÓN-----");
////        System.out.println(resultadoDireccion);
////
////        ////Pais
////        System.out.println("------EXTENSIÓN TELÉFONO-----");
////        System.out.println(resultadoExtension);
//
//        //////DATOS PREDEFINIDOS PARA PRUEBAS
//
//        Agenda agenda = crearAgenda();
//
//        Contacto contacto1 = new Contacto("gerard", "gurgui", "662296666", "amilcar",
//                "italiana", "+_IT", "+0045");
//
//        Contacto contacto2 = new Contacto("gerard", "orpinell", "66227656", "l'ull",
//                "inglaterra", "Street ", "+12900");
//
//
//        Contacto contacto3 = new Contacto("Albert", "basquu", "74376382", "calle",
//                "inglaterra", "Street ", "+12900");
//
//
//        Contacto contacto4 = new Contacto("zaida", "mouto", "6437382", "calle",
//                "inglaterra", "+_FR ", "+8900");
//
//
//        Contacto contacto5 = new Contacto("toni", "tonino", "6437382", "calle",
//                "inglaterra", "+_FR ", "+8900");
//
//
//        Contacto contacto6 = new Contacto("zaida", "rami", "6437382", "calle",
//                "inglaterra", "+_FR ", "+8900");
//
//        Contacto contacto7 = new Contacto("gerard", "elden", "6437382", "calle",
//                "inglaterra", "+_FR ", "+8900");
//
//
//
//        agenda.getListaContactos().add(contacto1);
//        agenda.getListaContactos().add(contacto2);
//        agenda.getListaContactos().add(contacto3);
//        agenda.getListaContactos().add(contacto4);
//        agenda.getListaContactos().add(contacto5);
//        agenda.getListaContactos().add(contacto6);
//        agenda.getListaContactos().add(contacto7);
//
//        ordenarContactos(agenda);
//
//        menu(agenda);
//
//    }
//
//    public static void menu(Agenda agenda) {
//
//        int opcioUser;
//        int posicion;
//
//        String extensionDireccion;
//        String extensionTelefono;
//        String pais;
//
//        String nombre;
//        String apellido;
//
//
//        do {
//
//            System.out.println("Bienvenido al menú de la agenda");
//            System.out.println("0- salir");
//            System.out.println("1- crear agenda nueva");
//            System.out.println("2- crear contacto nuevo y añadir a la agenda (orden alfabético)");
//            System.out.println("3- buscar contacto/s y mostrar datos");
//            System.out.println("4- eliminar contacto");
//            System.out.println("5- mostrar contactos");
//
//            opcioUser = pedirNumero("Introduzca una opción: ");
//
//            switch (opcioUser) {
//
//
//                case 1:
//
//                    System.out.println("1- Crear nueva agenda");
//
//                    agenda = crearAgenda();
//                    System.out.println("Agenda creada correctamente");
//
//                    break;
//
//                case 2:
//
//                    System.out.println("2- Crear contacto nuevo y añadirlo a la agenda");
//
//
//                    pais = pedirTexto("Introduzca la nacionalidad del contacto");
//
//                    extensionDireccion = aplicarExtensionDireccion(pais);
//                    extensionTelefono = aplicarExtensionTelefono(pais);
//
//                    crearContacto(agenda, pais, extensionDireccion, extensionTelefono);
//                    ordenarContactos(agenda);
//
//                    System.out.println("Contacto creado y añadido correctamente");
//
//                    break;
//
//                case 3:
//
//                    System.out.println("3- buscar contacto/s y mostrar información");
//
//                    nombre = pedirTexto("Introduzca el nombre a buscar");
//
//                     agenda.buscarContactos(nombre);
//
//                    break;
//
//                case 4:
//
//                    System.out.println("4- eliminar contacto");
//
//                    nombre = pedirTexto("Introduzca el nombre del contacto a eliminar");
//                    apellido = pedirTexto("Introduzca el apellido");
//
//                    posicion = agenda.buscarContacto(nombre,apellido);
//                    agenda.eliminarContacto(posicion);
//
//                    System.out.println("Contacto eliminado");
//
//                    break;
//
//                case 5:
//
//                    System.out.println("5- mostrar lista de contactos");
//
//                    mostrarListaContactos(agenda);
//
//                    break;
//
//
//            }
//
//        } while (opcioUser != 0);
//
//    }
//
//
//    public static Agenda crearAgenda() {
//
//        Agenda agenda = new Agenda();
//
//        return agenda;
//    }
//
//    public static String aplicarExtensionDireccion(String pais) {
//
//        /*Creamos una fábrica y una variable generica del tipo de objeto que puede crear la fábrica*/
//        Factory factory;
//        ExtensionGenerica extensionGenerica;
//        String direccion;
//
//        /*. dependiendo del tipo de objeto que nos devuelva el método de la fábrica
//         * (según país introducido por usuario) obtendremos un tipo de objeto, y por tanto, con la variable
//         * de su clase padre, podremos llamar al método de la clase hija en concreto*/
//
//
//        factory = new Factory(pais);
//        extensionGenerica = factory.verificarPais();
//        direccion = extensionGenerica.implementarDireccionGenerica();
//
//        System.out.println("Extensión dirección del país " + pais + " : " + direccion);
//
//        return direccion;
//
//    }
//
//    public static String aplicarExtensionTelefono(String pais) {
//
//        Factory factory;
//        ExtensionGenerica extensionGenerica;
//
//        factory = new Factory(pais);
//        extensionGenerica = factory.verificarPais();
//
//        String telefono = extensionGenerica.implementarExtensionTelefono();
//
//        System.out.println("Extensión teléfono del país " + pais + " : " + telefono);
//
//        return telefono;
//
//    }
//
//
//    public static void crearContacto(Agenda agenda, String nacionalidad,
//                                     String extensionDireccion, String extensionTelefono) {
//
//        System.out.println("--Datos del contacto: ");
//
//        String nombre = pedirTexto("Nombre: ");
//        String apellido = pedirTexto("Apellido: ");
//        String telefono = pedirTexto("Teléfono: ");
//        String direccion = pedirTexto("Dirección: ");
//
//        System.out.println("Extensión dirección del país " + nacionalidad + " : " + extensionDireccion + " " + direccion);
//        System.out.println("Extensión teléfono del país " + nacionalidad + " : " + extensionTelefono + " " + telefono);
//
//        Contacto contacto = new Contacto(nombre, apellido, telefono, direccion,
//                nacionalidad, extensionDireccion, extensionTelefono);
//
//        agenda.getListaContactos().add(contacto);
//
//
//    }
//
//
//    public static void ordenarContactos(Agenda agenda) {
//
//
//        Collections.sort(agenda.getListaContactos(), new Comparator<Contacto>() {
//            @Override
//            public int compare(Contacto contacto1, Contacto contacto2) {
//
//                String nombre1 = contacto1.getNombre();
//                String nombre2 = contacto2.getNombre();
//
//                return nombre1.compareTo(nombre2);
//
//            }
//        });
//
//    }
//
//    public static void mostrarContacto(Agenda agenda, int posicion) {
//
//        System.out.println(agenda.getListaContactos().get(posicion).toString());
//
//        System.out.println(agenda.getListaContactos().get(posicion).getExtensionDireccion()
//                + " " + agenda.getListaContactos().get(posicion).getDireccion());
//
//        System.out.println(agenda.getListaContactos().get(posicion).getExtensionTelefono()
//                + " " + agenda.getListaContactos().get(posicion).getTelefono());
//
//    }
//
//
//    public static void mostrarListaContactos(Agenda agenda) {
//
//        for (Contacto listaContactos : agenda.getListaContactos()) {
//
//            System.out.println(listaContactos);
//            System.out.println(listaContactos.getExtensionDireccion() + " " + listaContactos.getDireccion());
//            System.out.println(listaContactos.getExtensionTelefono() + " " + listaContactos.getTelefono());
//        }
//
//    }
//
//
//    ///////DATOS USER
//
//    public static int pedirNumero(String missatge) {
//
//        Scanner input = new Scanner(System.in);
//
//        int valor = 0;
//        boolean capturaError = false;
//
//        do {
//
//            try {
//
//                System.out.println(missatge);
//                valor = input.nextInt();
//                capturaError = true;
//
//            } catch (InputMismatchException e) {
//
//                System.out.println("Error de format, has d'introduir un número enter");
//
//            }
//
//            input.nextLine();
//
//        } while (capturaError == false);
//
//        return valor;
//
//    }
//
//
//    public static String pedirTexto(String missatge) {
//
//        Scanner input = new Scanner(System.in);
//
//        String cadena;
//        System.out.println(missatge);
//        cadena = input.nextLine();
//
//        return cadena;
//
//    }
//}
