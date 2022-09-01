package S3_02.n2Ex1;

public class ObtenerPago {

    private Tienda tienda;
    private FormaPago formaPago;


    public ObtenerPago(Tienda tienda, FormaPago formaPago){

        this.tienda = tienda;
        this.formaPago = formaPago;

    }

    public void comprobarPago(){

        formaPago.pagament();
        //CALLBACK
        tienda.verificarPago();

    }


}
