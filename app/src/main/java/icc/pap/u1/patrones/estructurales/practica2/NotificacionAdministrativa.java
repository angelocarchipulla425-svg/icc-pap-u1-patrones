package icc.pap.u1.patrones.estructurales.practica2;

public class NotificacionAdministrativa extends Notificacion{

    public NotificacionAdministrativa(CanalEnvio canalE) {
        super(canalE);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        canalEnvio.enviar(destinatario, "[ADMINISTRATIVO] " + mensaje);
    }
    
}
