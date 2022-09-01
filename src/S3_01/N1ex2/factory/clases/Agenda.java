package S3_01.N1ex2.factory.clases;

//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Agenda {
//
//    private List<Contacto> listaContactos;
//
//    public Agenda() {
//
//        listaContactos = new ArrayList<>();
//    }
//
//
//    public List<Contacto> getListaContactos() {
//        return listaContactos;
//    }
//
//    public void setListaContactos(List<Contacto> listaContactos) {
//        this.listaContactos = listaContactos;
//    }
//
//
//    public void buscarContactos(String nombreComparar) {
//
//        int i = 0;
//        int j = 0;
//        int posicion = -1;
//        boolean encontrado = false;
//        boolean finBucle = false;
//
//        while (i < listaContactos.size() && !encontrado) {
//
//            if (listaContactos.get(i).getNombre().equalsIgnoreCase(nombreComparar)) {
//
//                while (listaContactos.get(i).getNombre().equalsIgnoreCase(nombreComparar)) {
//
//                    System.out.println(listaContactos.get(i).toString());
//                    encontrado = true;
//
//                i++;
//                }
//            }
//        i++;
//        }
//    }
//
//    public int buscarContacto(String nombreComparar, String apellidoComparar) {
//
//        int i = 0;
//        int posicion = -1;
//        boolean encontrado = false;
//
//        String nombreLista;
//        String apellidoLista;
//
//        while (i < listaContactos.size() && !encontrado) {
//
//            nombreLista = listaContactos.get(i).getNombre();
//            apellidoLista = listaContactos.get(i).getApellido();
//
//            if (nombreLista.equalsIgnoreCase(nombreComparar)) {
//
//                if (nombreLista.equalsIgnoreCase(nombreComparar)
//                        && apellidoLista.equalsIgnoreCase(apellidoComparar)) {
//
//                    System.out.println("Contacto " + nombreLista + " " + apellidoLista + " encontrado");
//                    posicion = i;
//                    encontrado = true;
//                }
//            }
//
//            i++;
//        }
//
//        if (posicion == -1) {
//
//            System.out.println("El contacto no existe");
//        }
//
//        return posicion;
//    }
//
//
//
//
//    public void eliminarContacto(int posicion) {
//
//        listaContactos.remove(posicion);
//
//    }
//
//    @Override
//    public String toString() {
//        return "Agenda{" +
//                "listaContactos=" + listaContactos +
//                '}';
//    }
//}
