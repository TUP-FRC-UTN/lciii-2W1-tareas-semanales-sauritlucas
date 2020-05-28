
package municipalidad;


public class Pago {
    private int demora;
    private float importe;
    private float interesesAdicionales;

    

    public float getInteresesAdicionales() {
        return this.interesesAdicionales;
    }

    public int getDemora() {
        return demora;
    }

    public float getImporte() {
        return importe;
    }
    

    public Pago(int demora, float importe, float interesesAdicionales) {
        this.demora = demora;
        this.importe = importe;
        this.interesesAdicionales = interesesAdicionales;
    }

    

    @Override
    public String toString() {
        return "Pago{" + "Demora=" + demora + ", importe=" + importe + ", interesesAdicionales=" + interesesAdicionales + '}';
    }
    
    
    
}
