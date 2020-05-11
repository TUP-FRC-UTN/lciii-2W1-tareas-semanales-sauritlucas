package Ejercicio3;

import java.util.Scanner;

public class Main_Equipo {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese nombre de liga: ");
        String nombreLiga = lector.nextLine();
        System.out.println("Ingrese nombre de equipo: ");
        String nombreEquipo = lector.nextLine();
        System.out.println("Ingrese la cantidad de puntos obtenidos: ");
        int puntos = lector.nextInt();
        System.out.println("Ingrese la cantidad de partidos ganados: ");
        int partidosG = lector.nextInt();
        System.out.println("Ingrese la cantidad de partidos empatados: ");
        int partidosE = lector.nextInt();
        System.out.println("Ingrese la cantidad de partidos perdidos: ");
        int partidosP = lector.nextInt();
        System.out.println("Ingrese la cantidad de partidos goles hechos: ");
        int golesHechos = lector.nextInt();
        System.out.println("Ingrese la cantidad de partidos goles recibidos: ");
        int golesRecibidos = lector.nextInt();
        System.out.println("Ingrese la posicion obtenido: ");
        int posicion = lector.nextInt();

        Equipo e = new Equipo(nombreLiga, nombreEquipo, puntos, partidosG, partidosE, partidosP, golesHechos, golesRecibidos, posicion);

        System.out.println(e.toString());
    }

}
