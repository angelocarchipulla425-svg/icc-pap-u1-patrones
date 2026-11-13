package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;
import java.util.function.Consumer;

public class Auditoria implements Consumer<CambioEstudiante> {
    @Override
    public void accept(CambioEstudiante cambio) {
        System.out.printf("[AUDITORIA] Estudiante: %s | Atributo: %s | Anterior: %s | Nuevo: %s%n",
            cambio.est().getNombre(), cambio.atributo(), cambio.old(), cambio.nuevo());
    }
}