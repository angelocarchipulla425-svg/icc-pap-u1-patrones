package icc.pap.u1.patrones.estructurales.practica2;

public abstract class Notificacion {
    protected CanalEnvio canalEnvio;

    public Notificacion(CanalEnvio canalEnvio) {
        this.canalEnvio = canalEnvio;
    }

    public abstract void notificar(String destinatario, String mensaje);
}
