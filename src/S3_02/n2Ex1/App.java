package S3_02.n2Ex1;


import S3_02.n2Ex1.metodos_de_pago.CuentaBancaria;
import S3_02.n2Ex1.metodos_de_pago.Paypal;
import S3_02.n2Ex1.metodos_de_pago.TargetaCredito;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        FormaPago formaPago;

        Tienda tienda = new Tienda("Tienda 1","calzado");

        formaPago = menuPago();

        tienda.llamarOtenerPago(formaPago);


    }

    public static FormaPago menuPago(){

        Scanner input = new Scanner(System.in);

        FormaPago formaPago = null;

        System.out.println("Elige un método de pago");
        System.out.println("1- Targeta de crédito");
        System.out.println("2- Cuenta bancária");
        System.out.println("3- Paypal");

        int opcion = input.nextInt();


        switch (opcion){

            case 1:

                formaPago = new TargetaCredito();
                break;

            case 2:

                formaPago = new CuentaBancaria();
                break;

            case 3:

                formaPago = new Paypal();
                break;

        }

        return formaPago;

    }
}
