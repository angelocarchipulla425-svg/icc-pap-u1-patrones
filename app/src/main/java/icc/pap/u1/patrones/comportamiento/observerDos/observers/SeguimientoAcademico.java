package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;
import java.util.function.Consumer;

public class SeguimientoAcademico implements Consumer<CambioEstudiante> {
    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("promedio")) return;

        double anterior = (double) cambio.old();
        double nuevo = (double) cambio.nuevo();

        if (anterior >= 7.0 && nuevo < 7.0) {
            System.out.println("[ACADEMICO] Alerta: " + cambio.est().getNombre() + " tiene bajo rendimiento (Promedio: " + nuevo + ").");
        } else if (anterior < 7.0 && nuevo >= 7.0) {
            System.out.println("[ACADEMICO] Recuperación académica: " + cambio.est().getNombre() + " se recuperó (Promedio: " + nuevo + ").");
        }
    }
}