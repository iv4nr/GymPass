

public class Gimnasio {

    private String codigo;
    private String nombre;
    private Socio socios[];
    private Sala salas[];
    private int responableId = -1;

    private final int CANT_SOCIOS;
    private final int CANT_SALAS;

    private int contador;

    /**
     * Constructor del Gimnasio
     * @param codigo codigo del gimnasio
     * @param nombre nombre del gimnasio
     * @param cantSocios cantidad de socios del servidor
     * @param cantSalas cantidad de salas del servidor
     */
    public Gimnasio(String codigo, String nombre,int cantSocios, int cantSalas) {
        this.codigo = codigo;
        this.nombre = nombre;

        this.CANT_SOCIOS = cantSocios;
        this.CANT_SALAS = cantSalas;
    }

    /**
     * Comprueba si ya existe el socio
     * @param numSocio codigo de socio
     * @return resultado
     */
    public boolean existeSocio(int numSocio ) {
        boolean resultado = false;

        for (int i = 0; i < CANT_SOCIOS && !resultado; i++) {
            if( socios[i] != null && socios[i].getNumSocio() == numSocio ) {
                resultado = true;
            }
        }

        return resultado;
    }

    /**
     * Comprueba si hay hueco
     * @return el resultado
     */
    public boolean comprobarSiHayHuecoClicker(){
        boolean resultado;

        if( contador < CANT_SOCIOS ) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    /**
     * Busca la primera posicion libre
     * @return la primera posicion libre
     */
    private int buscarPrimeraPosicionLibre(){
        int primeraPosicionLibre = -1;
        boolean continuarBuscando = true;

        for (int i = 0; i < CANT_SOCIOS && continuarBuscando ; i++) {
            if( socios[i] == null ){
                primeraPosicionLibre = i;
                continuarBuscando = false;
            }
        }

        return primeraPosicionLibre;
    }

    /**
     * Agrega un socio
     * @param socio el socio a incorporar
     * @return el miembro agregado
     */
    public boolean agregarSocio(Socio socio) {
        boolean miembroAgregadoOK;
        int primeraPosicionLibre;

        if( comprobarSiHayHuecoClicker() ){
            if( existeSocio(socio.getNumSocio()) == false ){
                primeraPosicionLibre = buscarPrimeraPosicionLibre();
                socios[primeraPosicionLibre] = socio;
                miembroAgregadoOK = true;
            } else {
                miembroAgregadoOK = false;
            }
        } else {
            miembroAgregadoOK = false;
        }
        return miembroAgregadoOK;
    }

    /**
     * Expulsa el socio por el numero de socio si existe, sino existe devuelve null
     * @param numSocio numero de socio
     * @return socio expulsado o null
     */
    public Socio expulsarSocio(int numSocio) {
        Socio socioEliminado = null;
        boolean continuarBuscando = true;

        for (int i = 0; i < CANT_SOCIOS && continuarBuscando; i++) {
            if( socios[i].getNumSocio() == numSocio ){
                socioEliminado = socios[i];
                socios[i] = null;
                continuarBuscando = false;
            }
        }

        return socioEliminado;
    }

    /**
     * Designa el responable por numero de socio
     * @param numSocio numero de socio
     * @return resultado
     */
    public boolean designarResponsable(int numSocio) {
        boolean resultado = false;

        if( existeSocio(numSocio)){
            responableId = numSocio;
            resultado = true;
        }

        return resultado;
    }

    /**
     *Comprueba si el codigo de sala ya existe
     * @param codigoSala codigo de la sala
     * @return resultado
     */
    public boolean contieneSala(int codigoSala) {
        boolean resultado = false;

        for (int i = 0; i < CANT_SALAS && !resultado; i++) {
            if( salas[i] != null && salas[i].getCodigoSala() == codigoSala ){
                resultado = true;
            }
        }

        return resultado;
    }

    /**
     * Busca la primera posicion libre de la salas
     * @return la primera posicion libre
     */
    private int buscarPrimeraPosicionLibreSalas() {
        int primeraPosicionSalaLibre = -1;
        boolean continuarBuscando = true;

        for (int i = 0; i < CANT_SALAS && continuarBuscando; i++) {
            if( salas[i] == null ){
                primeraPosicionSalaLibre = i;
                continuarBuscando = false;
            }
        }

        return primeraPosicionSalaLibre;
    }

    /**
     * Incorpora una sala
     * @param sala sala a agregar
     * @return resultado
     */
    public boolean incorporarSala(Sala sala) {
        boolean resultado = false;
        int posicionSala;

        posicionSala = buscarPrimeraPosicionLibreSalas();

        if( ! contieneSala(sala.getCodigoSala()) && posicionSala >= 0 ){
            salas[posicionSala] = sala;
            resultado = true;
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "Gimnasio {" + "Codigo de Gimnasio: " + codigo +
                ", Nombre: " + nombre +
                ", Socios: " + socios +
                ", Salas: " + salas +
                ", ResponableId: " + responableId +'}';
    }


}
