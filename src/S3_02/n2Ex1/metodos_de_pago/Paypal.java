package S3_02.n2Ex1.metodos_de_pago;

import S3_02.n2Ex1.FormaPago;

public class Paypal implements FormaPago {

    public Paypal() {
    }

    @Override
    public void pagament() {

        System.out.println("Pago desde paypal");

    }
}
