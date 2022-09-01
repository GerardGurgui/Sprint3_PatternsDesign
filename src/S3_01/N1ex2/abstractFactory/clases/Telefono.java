package S3_01.N1ex2.abstractFactory.clases;



public class Telefono {

    private String numero;
    private String extTelf;


    public Telefono(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getExtTelf() {
        return extTelf;
    }

    public void setExtTelf(String extTelf) {
        this.extTelf = extTelf;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "numero='" + numero + '\'' +
                ", extTelf=" + extTelf +
                '}';
    }
}
