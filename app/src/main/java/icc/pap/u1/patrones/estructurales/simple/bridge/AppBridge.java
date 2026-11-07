package icc.pap.u1.patrones.estructurales.simple.bridge;

public class AppBridge {
    public static void main(String[] args) {
        Notificacion not1 = new NotificacionAcademica(new CanalCorreo());
        
        Notificacion not2 = new NotificacionAcademica(new CanalPush()); 
        
        Notificacion notSegCor= new NotificacionSeguridad(new CanalCorreo());  
        
        
        Notificacion notSegPush = new NotificacionSeguridad(new CanalPush());

        String mensajeAca = "Solicitud #44 aprobada";
        String mmensajeSeg = "Alerta de correos maliciosos";

        not1.notificar(mensajeAca);
        not2.notificar(mensajeAca);

        notSegCor.notificar(mmensajeSeg);
        notSegPush.notificar(mmensajeSeg);
    }
}
