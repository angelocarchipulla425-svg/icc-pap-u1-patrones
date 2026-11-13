package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;
import icc.pap.u1.patrones.comportamiento.observerDos.Estudiante;
import icc.pap.u1.patrones.comportamiento.observerDos.Matricula;
import java.util.function.Consumer;

public class NotificadorRepresentante implements Consumer<CambioEstudiante> {
    @Override
    public void accept(CambioEstudiante cambio) {
        Estudiante est = cambio.est();
        boolean notificar = false;
        String motivo = "";

        if (cambio.atributo().equals("promedio") && (double) cambio.nuevo() < 6.0) {
            notificar = true;
            motivo = "promedio inferior a 6.0 (" + cambio.nuevo() + ")";
        } else if (cambio.atributo().equals("asistencias") && (int) cambio.nuevo() >= 8) {
            notificar = true;
            motivo = "inasistencias iguales o superiores a 8 (" + cambio.nuevo() + ")";
        } else if (cambio.atributo().equals("estado") && cambio.nuevo() == Matricula.SUSPENDIDO) {
            notificar = true;
            motivo = "cambio de estado a SUSPENDIDO";
        }

        if (notificar) {
            System.out.printf("[REPRESENTANTE] Notificación enviada al representante de %s por: %s.%n",
                est.getNombre(), motivo);
        }
    }
}