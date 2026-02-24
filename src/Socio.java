public class Socio {

    public int numSocio;
    private String nombre;

    /**
     * Constructor de Socio
     * @param numSocio numero de socio
     * @param nombre nombre del socio
     */
    public Socio(int numSocio, String nombre) {
        this.numSocio = numSocio;
        this.nombre = nombre;
    }

    public int getNumSocio() {
        return this.numSocio;
    }
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Socio {" + "Numero de socio: " + numSocio +
                ", Nombre: " + nombre + '}';
    }

}
