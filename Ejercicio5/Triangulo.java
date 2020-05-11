package Ejercicio5;

public class Triangulo {

    private int lado1, lado2, lado3;

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo() {
    }

    public int perimetro() {
        int calculo;
        calculo = lado1 + lado2 + lado3;
        return calculo;
    }

    public String resultado() {
        String valor;
        if (perimetro() > 10) {
            valor = "Es superior a 10";
        } else {
            valor = "No es superior a 10";
        }
        return valor;
    }

    @Override
    public String toString() {
        return "\n *****RESULTADOS*****"
                +"\nEl perimetro del triangulo es: " + perimetro()
                + "\n" + resultado();

    }

}
