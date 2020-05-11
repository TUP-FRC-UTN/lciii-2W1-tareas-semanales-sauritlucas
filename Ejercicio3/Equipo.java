package Ejercicio3;

public class Equipo {

    private String nombreLiga, nombreEquipo;
    private int puntos, partidosG, partidosE, partidosP, golesHechos, golesRecibidos, posicion;

    public String getNombreLiga() {
        return nombreLiga;
    }

    public void setNombreLiga(String nombreLiga) {
        this.nombreLiga = nombreLiga;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidosG() {
        return partidosG;
    }

    public void setPartidosG(int partidosG) {
        this.partidosG = partidosG;
    }

    public int getPartidosE() {
        return partidosE;
    }

    public void setPartidosE(int partidosE) {
        this.partidosE = partidosE;
    }

    public int getPartidosP() {
        return partidosP;
    }

    public void setPartidosP(int partidosP) {
        this.partidosP = partidosP;
    }

    public int getGolesHechos() {
        return golesHechos;
    }

    public void setGolesHechos(int golesHechos) {
        this.golesHechos = golesHechos;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Equipo(String nombreLiga, String nombreEquipo, int puntos, int partidosG, int partidosE, int partidosP, int golesHechos, int golesRecibidos, int posicion) {

        this.nombreLiga = nombreLiga;
        this.nombreEquipo = nombreEquipo;
        this.puntos = puntos;
        this.partidosG = partidosG;
        this.partidosE = partidosE;
        this.partidosP = partidosP;
        this.golesHechos = golesHechos;
        this.golesRecibidos = golesRecibidos;
        this.posicion = posicion;
    }

    public Equipo() {

    }

    @Override
    public String toString() {
        return "\n *****RESULTADOS FINALES*****"
                + "\n\nNombre de Liga: " + nombreLiga
                + "\nNombre de Equipo: " + nombreEquipo
                + "\nCantidad de Puntos: " + puntos
                + "\nCantidad de Partidos: " + cantidadPartidos()
                + "\nPartidos Ganados: " + partidosG
                + "\nPartidos Empatados: " + partidosE
                + "\nPartidos Perdidos: " + partidosP
                + "\nGoles Hechos: " + golesHechos
                + "\nGoles Recibidos: " + golesRecibidos
                + "\nDiferencia de goles: " + DiferenciaGoles()
                + "\nPosicion: " + posicion;

    }

    public int DiferenciaGoles() {
        return golesHechos - golesRecibidos;
    }

    public int cantidadPartidos() {
        return partidosG + partidosE + partidosP;
    }

}
