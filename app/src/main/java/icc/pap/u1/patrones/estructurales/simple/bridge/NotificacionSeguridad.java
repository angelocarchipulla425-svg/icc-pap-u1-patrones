package icc.pap.u1.patrones.estructurales.simple.bridge;

public class NotificacionSeguridad extends Notificacion{


    public NotificacionSeguridad(CanalEnvio canal) {
        super(canal);
        
    }

    @Override
    public void notificar(String mensaje) {
        canal.enviar("Seguridad: " + mensaje);
    }
    
}