package icc.pap.u1.patrones.creacionales.prototype;

public class PlantillaEmail implements Copiable {
    
    private String asunto;
    private String mensaje;


    //Constructor lleno

    public PlantillaEmail(String asunto, String mensaje) {
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    //public PlantillaEmail clone() {
    //    return new PlantillaEmail(asunto, mensaje);
    //}

    @Override 
    public PlantillaEmail copia() {
        return new PlantillaEmail(asunto, mensaje);
    }
    
    public PlantillaEmail clone() {
        return new PlantillaEmail(asunto, mensaje);
    }

    //SETTER asunto -> con otro nombre
    public void cambiarAsunto(String newAsunto){
        this.asunto = newAsunto;
    }
    
    // GETTER del ToString -> con otro nombre
    public String contenido(){
        return this.toString();
    }
    @Override
    public String toString() {
        return asunto + ": " + mensaje;
    }

    
}
