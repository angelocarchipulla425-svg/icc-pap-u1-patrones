package icc.pap.u1.patrones.creacionales.practica;

public class ConfiguracionSistema {
    // Instancia única estática
    private static ConfiguracionSistema instancia;
    private double porcentajeImpuesto;


    //Constructor privado para evitar la creaciòn con new desde fuera
    private ConfiguracionSistema() {
        this.porcentajeImpuesto = 15.0; // Valor por default
    }

    // Método público global para obtener la única instancia
    public static synchronized ConfiguracionSistema getInstancia(){
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public double getPorcentajeImpuesto(){
        return porcentajeImpuesto;
    }
    
    public void setPorcentajeImpuesto(double porcentajeImpuesto) {
        this.porcentajeImpuesto = porcentajeImpuesto;
    }
}
