
package municipalidad;


public class Muni {
    private PlanDePago[] planesDePagos;
    
    public Muni(int cantidad){
        planesDePagos = new PlanDePago[cantidad];
    }
    
    public void agregarPlanDePago(PlanDePago pdp){
        for (int i = 0; i < planesDePagos.length; i++) {
            if (planesDePagos[i] == null) {
                planesDePagos[i]= pdp;
                break;
            }
        }
    }
    
    public int cantidadPlanesPagados(){
        int cantidadPlanesPagados = 0;
        for (int i = 0; i < planesDePagos.length; i++) {
            if (planesDePagos[i] != null && planesDePagos[i].EstaPagadoTotalmente()) {
                cantidadPlanesPagados++;
            }
        }
        return cantidadPlanesPagados;
    }
    
    public float sumatoriaDeuda(){
        float totalSumatoria = 0;
        for (int i = 0; i < planesDePagos.length; i++) {
            if (planesDePagos[i] != null) {
                totalSumatoria += planesDePagos[i].sumaInteresesCobrados();
            }
        }
        return totalSumatoria;
    }
    
    public float promedioIntereses(){
        float sumaInteresesPP = 0;
        int contadorPlanes =0;
        for (int i = 0; i < planesDePagos.length; i++) {
            if (planesDePagos[i] != null) {
                sumaInteresesPP += planesDePagos[i].sumaInteresesCobrados();
                contadorPlanes++;
            }
        }
        return sumaInteresesPP/contadorPlanes;
    }
    
    public String listadoPagosContribuyente(String nombreContribuyente){
        String listadoContribuyente = "";
        for (int i = 0; i < planesDePagos.length; i++) {
            if (planesDePagos[i] != null && planesDePagos[i].getNombre().equals(nombreContribuyente)) {
                listadoContribuyente = nombreContribuyente + " al Día de la fecha presenta los siguientes pagos:" + '\n' + planesDePagos[i].listadoPagos();
                break;
            }
            else{
                listadoContribuyente = nombreContribuyente + " no registra deuda con la entidad";
            }
        }
        return  listadoContribuyente;
    }
}
