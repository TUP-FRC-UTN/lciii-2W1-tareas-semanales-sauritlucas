
package municipalidad;


public class PlanDePago {
    private String nombre;
    private float deuda;
    private int cuotas;
    Pago[] pagos;

    public String getNombre() {
        return nombre;
    }
    
    
    public int cantidadPagos(){
        return pagos.length;
    }

    public float getDeuda() {
        return deuda;
    }
    
    
    
    public boolean estaPagadoTotalmente(PlanDePago p){
        if(cantidadPagos() == cuotas) {
            return true;    
        } 
        else
        {
            return false;
        }
    }
    
    public boolean EstaPagadoTotalmente(){
        boolean estaPago= true;
        
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                estaPago = false;
                break;
            }
        }
        return estaPago;
    }
    
    public String listadoPagos(){
        String listado = "";
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null) {
                Pago p = pagos[i];
                
                listado += p.toString() + '\n';
            }
        }
        return listado;
    }
    
    public void agregarPago(Pago p){
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                pagos[i] = p;
                break;
            }
        }
    }
    
    public float sumaInteresesCobrados(){
    float interesesCobrados = 0;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null && pagos[i].getDemora() > 0) {
                 interesesCobrados += pagos[i].getInteresesAdicionales();
            }
           
        }
        return  interesesCobrados;
    }

    public PlanDePago(String nombre, float deuda, int cuotas) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        
        pagos = new Pago[cuotas];
    }

    @Override
    public String toString() {
        return "PlanDePago{" + "nombre=" + nombre + ", deuda=" + deuda + ", cuotas=" + cuotas + '}';
    }

    
    
    
    
}
