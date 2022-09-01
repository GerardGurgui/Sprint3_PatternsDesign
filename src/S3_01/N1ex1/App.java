package S3_01.N1ex1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        /*com hem declarat el constructor privat, no podem crear noves instàncies de la classe desde el constructor
        per fer-ho, utilitzarem el metode que hem creat i que només ens permet tenir una sola instància*/
        Undo obj1 = Undo.getSingletonInstance("comando1");
        Undo obj2 = Undo.getSingletonInstance("comando2");

        //podem comprobar per consola que només ens crea la primera instància
        System.out.println(obj1.getNombre());
        System.out.println(obj2.getNombre());

        menu(obj1);


    }


    public static void menu(Undo obj1) {

        int opcioUser;
        String comando;

        do {

            System.out.println("0- Sortir");
            System.out.println("1- afegir comando");
            System.out.println("2- llistar comandos");
            System.out.println("3- eliminar comando");

            opcioUser = demanarNum("introdueixi una opció");

            switch (opcioUser) {

                case 1:

                    System.out.println("Afegir comando");

                    comando = demanarText("comando:");
                    obj1.guardarComando(comando);

                    break;

                case 2:

                    System.out.println("llistar comandos");

                    obj1.llistaComandos();

                    break;

                case 3:

                    System.out.println("Eliminar comando");

                    comando = demanarText("comando a eliminar: ");

                    obj1.eliminarComando(comando);

                    break;

            }

        } while (opcioUser != 0);

    }


    //METODES USUARI
    public static int demanarNum(String missatge) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println(missatge);

        num = input.nextInt();

        return num;

    }

    public static String demanarText(String missatge) {

        Scanner input = new Scanner(System.in);

        String text;

        System.out.println(missatge);

        text = input.nextLine();

        return text;

    }
}
