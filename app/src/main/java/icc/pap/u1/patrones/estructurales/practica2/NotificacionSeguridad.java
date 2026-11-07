package icc.pap.u1.patrones.estructurales.practica2;

public class NotificacionSeguridad extends Notificacion{


    public NotificacionSeguridad(CanalEnvio c) {
        super(c);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        canalEnvio.enviar(destinatario, "[SEGURIDAD] " + mensaje);
    }
}
