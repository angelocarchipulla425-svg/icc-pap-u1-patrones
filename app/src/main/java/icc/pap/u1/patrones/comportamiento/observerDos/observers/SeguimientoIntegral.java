package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;
import icc.pap.u1.patrones.comportamiento.observerDos.Estudiante;
import icc.pap.u1.patrones.comportamiento.observerDos.Matricula;
import java.util.function.Consumer;

public class SeguimientoIntegral implements Consumer<CambioEstudiante> {
    @Override
    public void accept(CambioEstudiante cambio) {
        Estudiante est = cambio.est();
        if (est.getPromedio() < 7.0 && est.getAsistencias() >= 6 && est.getEstado() == Matricula.ACTIVO) {
            System.out.printf("[INTEGRAL] ¡ALERTA DE RIESGO INTEGRAL! %s presenta bajo promedio (%.2f), inasistencias críticas (%d) y matrícula ACTIVA.%n",
                est.getNombre(), est.getPromedio(), est.getAsistencias());
        }
    }
}