package S3_02.n2Ex1;

public class Tienda {

    private String nombre;
    private String sector;


    public Tienda(String nombre, String sector){

        this.nombre = nombre;
        this.sector = sector;

    }

    public void llamarPasarelaPago(FormaPago formaPago){

        ObtenerPago obtenerPago = new ObtenerPago(this, formaPago);
        obtenerPago.comprobarPago();

    }

    //CALLBACK
    public void verificarPago(){

        System.out.println("El pago se ha realizado correctamente");

    }

}
