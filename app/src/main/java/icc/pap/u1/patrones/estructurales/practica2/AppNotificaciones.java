package icc.pap.u1.patrones.estructurales.practica2;

public class AppNotificaciones {
    
    public static void main(String[] args) {

        System.out.println("Caso 1");

        Notificacion nAcE = new NotificacionAdministrativa(new CanalCorreo());
        nAcE.notificar("estudiante@universidad.edu", "Sus calificaciones están disponibles.");
    
        System.out.println("Caso 2");

        Notificacion nAdSms = new NotificacionAdministrativa(new CanalSMS());
        nAdSms.notificar("0991234567", "Existe un trámite pendiente.");

        System.out.println("Caso 3");

        Notificacion nScA = new NotificacionSeguridad(new ProxyCanalEnvio(new CanalPush(), true));
        nScA.notificar("usuario123", "Alerta");

        System.out.println("Caso 4");

        Notificacion nAsA = new NotificacionAcademica(new ProxyCanalEnvio(new CanalSMS(), false));

        nAsA.notificar("0987654321", "Mensaje");

        System.out.println("Caso 5");
        CanalEnvio canalCorreoCompartido = new CanalCorreo();
        Notificacion mismoCanalDifNot = new NotificacionAcademica(canalCorreoCompartido);
        Notificacion mismoCanalDifNot1 = new NotificacionAdministrativa(canalCorreoCompartido);

        mismoCanalDifNot.notificar("estudiante@universidad.edu", "Aviso Urgente.");

        mismoCanalDifNot1.notificar("0968441542", "Aviso de deuda.");

        System.out.println("Caso 6");

        Notificacion segCorreo = new NotificacionSeguridad(
        new ProxyCanalEnvio(new CanalCorreo(), true));
        segCorreo.notificar("usuario123@correo.com", "Alerta de inicio de sesión sospechoso");

        Notificacion segSMS = new NotificacionSeguridad(
        new ProxyCanalEnvio(new CanalSMS(), false));
        segSMS.notificar("0987654321", "Alerta de cambio de clave");
    }


}
