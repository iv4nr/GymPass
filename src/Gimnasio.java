public class Gimnasio {

    private String codigo;
    private String nombre;
    private Socio socios[];
    private Sala salas[];

    private final int CANT_SOCIOS;
    private final int CANT_SALAS;


    /**
     * Constructor del Gimnasio
     * @param codigo codigo del gimnasio
     * @param nombre nombre del gimnasio
     */
    public Gimnasio(String codigo, String nombre,int cantSocios, int cantSalas) {
        this.codigo = codigo;
        this.nombre = nombre;

        this.CANT_SOCIOS = cantSocios;
        this.CANT_SALAS = cantSalas;

    }


    @Override
    public String toString() {
        return "Gimnasio {" + "Codigo de Gimnasio: " + codigo +
                ", Nombre: " + nombre +
                ", Socios: " + socios +
                ", Salas: " + salas + '}';
    }


}
