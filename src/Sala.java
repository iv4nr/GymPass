public class Sala {

    private int codigoSala;
    private String descripcion;

    /**
     * Constructor de Sala
     * @param codigoSala codigo de la sala
     * @param descripcion descripcion de la sala
     */
    public Sala(int codigoSala, String descripcion) {
        this.codigoSala = codigoSala;
        this.descripcion = descripcion;
    }

    public int getCodigoSala() {
        return this.codigoSala;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public String toString() {
        return "Sala {" + "Codigo de Sala: " + codigoSala +
                ", descripcion: " + descripcion + '}';
    }

}
