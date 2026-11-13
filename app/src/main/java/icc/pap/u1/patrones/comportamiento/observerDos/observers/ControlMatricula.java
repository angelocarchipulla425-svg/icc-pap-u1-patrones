package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;
import icc.pap.u1.patrones.comportamiento.observerDos.Matricula;
import java.util.function.Consumer;

public class ControlMatricula implements Consumer<CambioEstudiante> {
    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("estado")) return;
        Matricula anterior = (Matricula) cambio.old();
        Matricula nuevo = (Matricula) cambio.nuevo();

        if (nuevo == Matricula.SUSPENDIDO) {
            System.out.printf("[MATRICULA] El estudiante %s ha sido SUSPENDIDO.%n", cambio.est().getNombre());
        } else if (nuevo == Matricula.RETIRADO) {
            System.out.printf("[MATRICULA] El estudiante %s se ha RETIRADO.%n", cambio.est().getNombre());
        } else if (anterior != Matricula.ACTIVO && nuevo == Matricula.ACTIVO) {
            System.out.printf("[MATRICULA] El estudiante %s ha sido REACTIVADO (ACTIVO).%n", cambio.est().getNombre());
        }
    }
}