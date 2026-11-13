package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;
import java.util.function.Consumer;

public class ControlAsistencia implements Consumer<CambioEstudiante> {
    private String getNivelAsistencia(int asistencias) {
        if (asistencias <= 2) return "Normal";
        if (asistencias <= 5) return "Advertencia";
        return "Crítico";
    }

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("asistencias")) return;
        int anterior = (int) cambio.old();
        int nuevo = (int) cambio.nuevo();

        String nivelAnt = getNivelAsistencia(anterior);
        String nivelNue = getNivelAsistencia(nuevo);

        if (!nivelAnt.equals(nivelNue)) {
            System.out.printf("[ASISTENCIA] Control de asistencia: %s pasó del nivel %s al nivel %s (Inasistencias: %d)%n",
                cambio.est().getNombre(), nivelAnt, nivelNue, nuevo);
        }
    }
}