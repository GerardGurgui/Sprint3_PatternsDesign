package S3_01.N1ex2.abstractFactory.main;

import S3_01.N1ex2.abstractFactory.clases.Agenda;
import S3_01.N1ex2.abstractFactory.clases.Contacto;
import S3_01.N1ex2.abstractFactory.clases.Direccion;
import S3_01.N1ex2.abstractFactory.clases.Telefono;
import S3_01.N1ex2.abstractFactory.factorys.TipoFabrica;
import S3_01.N1ex2.abstractFactory.interfaces.AbstractFactory;
import S3_01.N1ex2.abstractFactory.interfaces.ExtensionDireccion;
import S3_01.N1ex2.abstractFactory.interfaces.ExtensionTelefono;

import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        Agenda agenda = new Agenda();


/////DIRECCIONES TELEFONOS

        Direccion direccion1 = new Direccion("calle1", "120", "3", "08093");
        Telefono telefono1 = new Telefono("664293902");

        Direccion direccion2 = new Direccion("calle2", "435", "8", "03287");
        Telefono telefono2 = new Telefono("64583722");

        Direccion direccion3 = new Direccion("calle3", "45", "1", "039834");
        Telefono telefono3 = new Telefono("76436283");

        Direccion direccion4 = new Direccion("calle2", "560", "6", "094893");
        Telefono telefono4 = new Telefono("85476324");

        Direccion direccion5 = new Direccion("calle4", "560", "6", "094893");
        Telefono telefono5 = new Telefono("85476324");


//////CONTACTOS

        Contacto contacto1 = new Contacto("Gerard", "Gurgui", "francia", direccion1, telefono1);
        Contacto contacto2 = new Contacto("Albert", "alb", "italia", direccion2, telefono2);
        Contacto contacto3 = new Contacto("Gerard", "hul", "inglaterra", direccion3, telefono3);
        Contacto contacto4 = new Contacto("Sara", "sar", "italia", direccion4, telefono4);
        Contacto contacto5 = new Contacto("Sara", "sareta", "francia", direccion5, telefono5);

        agenda.getListaContactos().add(contacto1);
        implementarExtensionPais(contacto1);

        agenda.getListaContactos().add(contacto2);
        implementarExtensionPais(contacto2);

        agenda.getListaContactos().add(contacto3);
        implementarExtensionPais(contacto3);

        agenda.getListaContactos().add(contacto4);
        implementarExtensionPais(contacto4);

        agenda.getListaContactos().add(contacto5);
        implementarExtensionPais(contacto5);

        agenda.ordenarContactos();

        menu(agenda);


    }


    public static void menu(Agenda agenda) {

        int opcioUser;
        int posicion;

        String nombre;
        String apellido;

        Contacto contacto;


        do {

            System.out.println("Bienvenido al menú de la agenda");
            System.out.println("0- salir");
            System.out.println("1- crear contacto nuevo y añadir a la agenda (orden alfabético)");
            System.out.println("2- buscar contacto/s y mostrar datos");
            System.out.println("3- eliminar contacto (especificar nombre y apellido)");
            System.out.println("4- mostrar contactos");

            opcioUser = pedirNumero("Introduzca una opción: ");

            switch (opcioUser) {


                case 1:

                    contacto = crearContacto();
                    implementarExtensionPais(contacto);
                    agenda.getListaContactos().add(contacto);
                    agenda.ordenarContactos();
                    System.out.println("Contacto creado y añadido correctamente");

                    break;

                case 2:

                    System.out.println("2- buscar contacto/s y mostrar información");

                    nombre = pedirTexto("Introduzca el nombre a buscar");
                    agenda.buscarContactos(nombre);

                    break;

                case 3:

                    System.out.println("3- eliminar contacto");

                    nombre = pedirTexto("Introduzca el nombre del contacto a eliminar");
                    apellido = pedirTexto("Introduzca el apellido");

                    posicion = agenda.buscarContacto(nombre, apellido);

                    if (posicion != -1){

                        agenda.eliminarContacto(posicion);
                        System.out.println("Contacto " +nombre+ " " +apellido+ " eliminado");
                    } else {

                        System.out.println("El contacto no existe");

                    }

                    break;

                case 4:

                    System.out.println("4- mostrar lista de contactos");

                    agenda.mostrarListaContactos();


                    break;

                case 5:

                    System.out.println("5- crear nueva agenda");

                    agenda = crearAgenda();

                    agenda.mostrarListaContactos();

                    break;


            }

        } while (opcioUser != 0);

    }

    public static Contacto crearContacto(){

        System.out.println("--Datos del contacto:");
        String nombre = pedirTexto("Introduzca el nombre");
        String apellido = pedirTexto("Introduzca el apellido");
        String pais = pedirTexto("Introduzca la nacionalidad");

        System.out.println("--Dirección del contacto: ");
        String calle = pedirTexto("calle: ");
        String numero = pedirTexto("número: ");
        String piso = pedirTexto("piso: ");
        String cp = pedirTexto("Codigo postal: ");

        String numTelefono = pedirTexto("--Telefono del contacto: ");

        ////DIRECCION/TELEFONO
        Direccion direccion = new Direccion(calle,numero,piso,cp);
        Telefono telefono = new Telefono(numTelefono);

        ////CONTACTO
        Contacto contacto = new Contacto(nombre,apellido,pais,direccion,telefono);

        return contacto;
    }


    public static void implementarExtensionPais(Contacto contacto){

        String nombre = contacto.getNombre();
        String pais = contacto.getPais();
        Direccion direccion = contacto.getDireccion();
        Telefono telefono = contacto.getTelefono();

        AbstractFactory fabricaDirecciones = TipoFabrica.obtenerFabrica("direccion");
        ExtensionDireccion extensionDireccion = fabricaDirecciones.obtenerExtDireccion(pais);

        AbstractFactory fabricaTelefonos = TipoFabrica.obtenerFabrica("telefono");
        ExtensionTelefono extensionTelefono = fabricaTelefonos.obtenerExtTelefono(pais);

        String extDireccion = extensionDireccion.crearExtensionDirecion();
        String extTelf = extensionTelefono.crearExtensionTelefono();

        contacto.getDireccion().setExtDireccion(extDireccion);
        contacto.getTelefono().setExtTelf(extTelf);

        System.out.println("--Implementada la extensión de " +pais+ " para el contacto " +nombre+ ": ");

        System.out.println("Dirección: " +extDireccion+ " " +direccion);
        System.out.println("Teléfono: " +extTelf+ " " +telefono);

    }


    public static Agenda crearAgenda(){

        Agenda agenda = new Agenda();

        return agenda;

    }




    ///////DATOS USER

    public static int pedirNumero(String missatge) {

        Scanner input = new Scanner(System.in);

        int valor = 0;
        boolean capturaError = false;

        do {

            try {

                System.out.println(missatge);
                valor = input.nextInt();
                capturaError = true;

            } catch (InputMismatchException e) {

                System.out.println("Error de format, has d'introduir un número enter");

            }

            input.nextLine();

        } while (!capturaError);

        return valor;

    }


    public static String pedirTexto(String missatge) {

        Scanner input = new Scanner(System.in);

        String cadena;
        System.out.println(missatge);
        cadena = input.nextLine();

        return cadena;

    }
}





