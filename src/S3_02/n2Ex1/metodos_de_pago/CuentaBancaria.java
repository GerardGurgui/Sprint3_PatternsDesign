package S3_02.n2Ex1.metodos_de_pago;

import S3_02.n2Ex1.FormaPago;

public class CuentaBancaria implements FormaPago {

    public CuentaBancaria() {
    }

    @Override
    public void pagament() {

        System.out.println("Pago desde cuenta bancaria");

    }
}
