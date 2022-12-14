package S3_01.N1ex1;


import java.lang.reflect.Field;
import java.util.ArrayList;

/*Singleton: utilizat per exemple per asegurar una única conexió a una base de dades.
o també per compartir informació/dades comuns entre varios objectes amb una sola instància,
i no una instància per cada objecte. Millora considerabble de rendiment sobretot en memoria*/

public class Undo {


    private String nom;
    private ArrayList<String> comandes;
    private static Undo undo;


    //CONSTRUCTORS

    private Undo(String nombre){

        this.nom = nombre;
        comandes = new ArrayList<>();

    }



    //GETTERS SETTERS

    public String getNombre() {
        return nom;
    }

    public void setNombre(String nombre) {
        this.nom = nombre;
    }

    public ArrayList<String> getComandes() {
        return comandes;
    }

    public void setComandes(ArrayList<String> comandes) {
        this.comandes = comandes;
    }

    public static Undo getUndo() {
        return undo;
    }

    public static void setUndo(Undo undo) {
        Undo.undo = undo;
    }



    //METODES CLASSE

    public void guardarComando(String comando){

        comandes.add(comando);

    }


    public void eliminarComando(String comando){

        comandes.remove(comando);

    }


    public void llistaComandos(){

        for (String llistaComandos : comandes) {

            System.out.println(llistaComandos);
        }

    }


    //Metode Singletone: static per poder accedir sense tenir que crear cap instància de la classe

    public static Undo getSingletonInstance(String nom) {

        if (undo == null){
            undo = new Undo(nom);
        }
        else{
            System.out.println("No es pot crear el objecte " +nom+ " perque ja existeix un objecte de la clase Undo");
        }

        return undo;
    }


}