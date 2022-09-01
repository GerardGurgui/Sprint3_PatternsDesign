package S3_01.N1ex2.abstractFactory.clases;


public class Direccion {

    private String calle;
    private String numero;
    private String piso;
    private String codigoPostal;
    private String extDireccion;


    public Direccion(String calle, String numero, String piso, String codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.codigoPostal = codigoPostal;

    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getExtDireccion() {
        return extDireccion;
    }

    public void setExtDireccion(String extDireccion) {
        this.extDireccion = extDireccion;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numero='" + numero + '\'' +
                ", piso='" + piso + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", extDireccion='" + extDireccion + '\'' +
                '}';
    }
}
