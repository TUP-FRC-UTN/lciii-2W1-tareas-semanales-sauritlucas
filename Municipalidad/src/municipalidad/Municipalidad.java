
package municipalidad;




public class Municipalidad {

    
    public static void main(String[] args) {
       Muni m = new Muni(2);
       
       //Carga de los planes de pago
       PlanDePago PDP = new PlanDePago("lucas",12000,2);
       // se agrega al vector PlanDePago
        m.agregarPlanDePago(PDP);
        // Carga del pago en el plan de pago
        Pago p1 = new Pago(10, 100, 100);
        Pago p2 = new Pago(25, 100, 300);
        // Se agrega al vector pago
        PDP.agregarPago(p1);
        PDP.agregarPago(p2);
        
        //Carga de los planes de pago
        PlanDePago PDP1 = new PlanDePago("Laucha",12000,3);
       // se agrega al vector PlanDePago
        m.agregarPlanDePago(PDP1);
        // Carga del pago en el plan de pago
        Pago p3 = new Pago(3, 100, 50);
        Pago p4 = new Pago(50, 100, 600);
        // Se agrega al vector pago
        PDP1.agregarPago(p3);
        PDP1.agregarPago(p4);
       
        System.out.println( "Cantidad de planes pagados: " + m.cantidadPlanesPagados() );
        //System.out.println(m.sumatoriaDeuda());
        System.out.println("");
        
        System.out.println("El listado de pagos del es");
        System.out.println(PDP.listadoPagos() + PDP1.listadoPagos());
        
        
        System.out.println("El promedio de intereses pagados por plan de pagos es: " + m.promedioIntereses());
        System.out.println("");
        System.out.println( "El contribuyente " + m.listadoPagosContribuyente("Laucha"));
        
        System.out.println("");
        System.out.println("La entidad ha otorgado prestamos por $ " + m.sumatoriaDeuda());
        
    }
    
}
