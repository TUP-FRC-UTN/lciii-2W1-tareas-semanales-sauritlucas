package Ejercicio5;

import java.util.Scanner;

public class Main_Triangulo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el primer lado del triangulo: ");
        int lado1 = lector.nextInt();
        System.out.println("Ingrese el segundo lado del triangulo: ");
        int lado2 = lector.nextInt();
        System.out.println("Ingrese el tercer lado del triangulo: ");
        int lado3 = lector.nextInt();

        Triangulo t = new Triangulo(lado1, lado2, lado3);

        System.out.println(t.toString());
    }

}
