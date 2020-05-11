
package clasenro4b;

import java.util.Scanner;


public class ClaseNro4b {

    
    public static void main(String[] args) {
       Jugador[] equipo;
       
        Scanner sc = new Scanner(System.in);
       //Ingreso de Cantidad de Jugadores del equipo
        System.out.println("Ingrese cantidad de Jugadores");
        
        int cantidad = sc.nextInt();
        
        equipo = new Jugador[cantidad];
        
        //Ingreso de datos de cada jugador
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese Nombre Jugador" + i + ":");
            sc.nextLine();
            String nombre = sc.nextLine();
            
            System.out.println("Ingrese Posicion Jugador" + i + ":");
            int posicion =sc.nextInt();
            
            System.out.println("Ingrese Numero Jugador" + i + ":");
            int nroCamiseta =sc.nextInt();
            
            System.out.println("Ingrese partidos jugados" + i + ":");
            int cantPartidosJugados =sc.nextInt();
            
            System.out.println("Ingrese porcentaje estado fisico" + i + ":");
            int porcEstadoFisico =sc.nextInt();
            
            equipo[i] = new Jugador(nombre, posicion, nroCamiseta, cantPartidosJugados, porcEstadoFisico);
            
        }
        
        int cantidadJugadoresEquipo = equipo.length;
        
        for (int i = 0; i < cantidadJugadoresEquipo; i++) {
            System.out.println(equipo[i]);
        }
        
        int cantMenos10Partidos = 0;
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].getCantPartidosJugados() < 10) {
                cantMenos10Partidos++;
            }
        }
        
        System.out.println("Cantidad de Jugadores con pocos partidos: " + cantMenos10Partidos);
        
        
        Jugador jugadorConMasPartidos = equipo[0];
        
        for (int i = 0; i < cantidadJugadoresEquipo; i++) {
            if (jugadorConMasPartidos.getCantPartidosJugados() < equipo[i].getCantPartidosJugados()) {
                jugadorConMasPartidos = equipo[i];
            }
        }
        
        System.out.println("El jugador con mas presencias fue: " + jugadorConMasPartidos.getNombre());
        
        int sumaEstadoFisico =0;
        double promedio = 0;
        for (int i = 0; i < cantidadJugadoresEquipo; i++) {
            sumaEstadoFisico += equipo[i].getPorcEstadoFisico();
            
            }
        promedio = sumaEstadoFisico / cantidadJugadoresEquipo;
       System.out.println("El promedio de estado fisico del equipo es: " + promedio);
           
             
        
        
        System.out.println("Ingrese Numero Camiseta");
        int nroCamiseta = sc.nextInt();
        
        Jugador j = equipo[0];
        for (int i = 0; i < cantidadJugadoresEquipo; i++) {
            if (equipo[i].getNroCamiseta() == nroCamiseta) {
                j = equipo[i];
                break;
              
            }
        }
        System.out.println("Estado Fisico del jugador numero " + j.getNroCamiseta()+ " es " + j.getPorcEstadoFisico());
        
        
        int cantidadArqueros =0; int cantidadDefensores =0; int cantidadMedioCampo =0; int cantidadDelanteros =0;
        int partidosArqueros =0; int partidosDefensores =0; int partidosMedioCampo =0; int partidosDelanteros =0;
        double promedioArqueros =0; double promedioDefensores =0; double promedioMedioCampo =0;double promedioDelanteros=0;
        
        for (int i = 0; i < cantidadJugadoresEquipo; i++) {
            if (equipo[i].getPosicion() ==1) {
                cantidadArqueros++;
                partidosArqueros += equipo[i].getCantPartidosJugados();
                promedioArqueros= partidosArqueros /cantidadArqueros;
                System.out.println("Cantidad Promedio partidos Arqueros" + promedioArqueros);
                
            } else if (equipo[i].getPosicion() ==2) {
                cantidadDefensores++;
                partidosDefensores  += equipo[i].getCantPartidosJugados();
                promedioDefensores=partidosDefensores/cantidadDefensores;
                System.out.println("Cantidad Promedio partidos Defensores" + promedioDefensores);
              
            } else if (equipo[i].getPosicion() == 3) {
                cantidadMedioCampo++;
                partidosMedioCampo += equipo[i].getCantPartidosJugados();
                promedioMedioCampo=partidosMedioCampo/cantidadMedioCampo;
                System.out.println("Cantidad Promedio partidos mediocampistas" + promedioMedioCampo);
            } else{
               cantidadDelanteros++; 
               partidosDelanteros += equipo[i].getCantPartidosJugados();
                promedioDelanteros=partidosDelanteros/cantidadDelanteros;
                System.out.println("Cantidad Promedio partidos delanteros" + promedioDelanteros);
            }
        }
   
        

      
        
        
    }
    
}
