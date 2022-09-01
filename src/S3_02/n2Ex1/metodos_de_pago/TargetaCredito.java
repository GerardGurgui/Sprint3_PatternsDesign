package S3_02.n2Ex1.metodos_de_pago;

import S3_02.n2Ex1.FormaPago;

public class TargetaCredito implements FormaPago {


    public TargetaCredito(){

    }

    @Override
    public void pagament() {

        System.out.println("Pago con targeta de crédito");

    }
}
