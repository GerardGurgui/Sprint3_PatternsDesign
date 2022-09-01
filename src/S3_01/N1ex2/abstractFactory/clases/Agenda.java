package S3_01.N1ex2.abstractFactory.clases;

import java.util.*;


public class Agenda {

    private List<Contacto> listaContactos;

    public Agenda() {

        listaContactos = new ArrayList<>();
    }


    public List<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }


    public void buscarContactos(String nombreComparar) {


        int i = 0;
        boolean encontrado = false;

        while (i < listaContactos.size() && !encontrado) {

            if (listaContactos.get(i).getNombre().equalsIgnoreCase(nombreComparar)) {

                while (i < listaContactos.size() &&
                       listaContactos.get(i).getNombre().equalsIgnoreCase(nombreComparar)) {

                    System.out.println(listaContactos.get(i).toString());
                    encontrado = true;

                    i++;
                }
            }

            i++;
        }
    }

    public int buscarContacto(String nombreComparar, String apellidoComparar) {

        int i = 0;
        int posicion = -1;
        boolean encontrado = false;

        String nombreLista;
        String apellidoLista;

        while (i < listaContactos.size() && !encontrado) {

            nombreLista = listaContactos.get(i).getNombre();
            apellidoLista = listaContactos.get(i).getApellido();

            if (nombreLista.equalsIgnoreCase(nombreComparar)) {

                if (nombreLista.equalsIgnoreCase(nombreComparar)
                        && apellidoLista.equalsIgnoreCase(apellidoComparar)) {

                    posicion = i;
                    encontrado = true;
                }
            }

            i++;
        }

        return posicion;
    }

    public void ordenarContactos(){

        Collections.sort(listaContactos, new Comparator<Contacto>() {
            @Override
            public int compare(Contacto contacto1, Contacto contacto2) {

                String nombre1 = contacto1.getNombre();
                String nombre2 = contacto2.getNombre();

                return nombre1.compareToIgnoreCase(nombre2);

            }
        });

    }

    public void mostrarListaContactos(){

        for (Contacto lista : listaContactos) {

            System.out.println("Nombre:" +lista.getNombre());
            System.out.println("Apellido: " +lista.getApellido());
            System.out.println("Nacionalidad: " +lista.getPais());
            System.out.println("Dirección:" +lista.getDireccion().getExtDireccion()+ " " +lista.getDireccion());
            System.out.println("Teléfono:" +lista.getTelefono().getExtTelf()+ " " +lista.getTelefono());
            System.out.println(" ");

        }

    }



    public void eliminarContacto(int posicion) {

        listaContactos.remove(posicion);

    }

    @Override
    public String toString() {
        return "Agenda{" +
                "listaContactos=" + listaContactos +
                '}';
    }
}