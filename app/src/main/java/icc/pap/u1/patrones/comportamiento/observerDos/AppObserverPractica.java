package icc.pap.u1.patrones.comportamiento.observerDos;

import icc.pap.u1.patrones.comportamiento.observerDos.observers.*;

public class AppObserverPractica {

    public static void main(String[] args) {
        // Inicialización de estudiantes requerida
        Estudiante ana = new Estudiante("EST001", "Ana Torres", 8.5, 1, Matricula.ACTIVO);
        Estudiante luis = new Estudiante("EST002", "Luis Pérez", 7.2, 4, Matricula.ACTIVO);
        Estudiante maria = new Estudiante("EST003", "María López", 9.1, 0, Matricula.ACTIVO);

        // Instancias de los observadores
        Auditoria auditoria = new Auditoria();
        SeguimientoAcademico obAcademico = new SeguimientoAcademico();
        ControlAsistencia controlAsistencia = new ControlAsistencia();
        ControlMatricula controlMatricula = new ControlMatricula();
        SeguimientoIntegral seguimientoIntegral = new SeguimientoIntegral();
        NotificadorRepresentante notificadorRepresentante = new NotificadorRepresentante();

        // CASOS DE PRUEBA

        System.out.println("=== CASO 1: Disminución del rendimiento académico ===");
        ana.suscribir(auditoria);
        ana.suscribir(obAcademico);
        ana.setPromedio(6.5);

        System.out.println("\n=== CASO 2: Recuperación académica ===");
        ana.setPromedio(7.8);

        System.out.println("\n=== CASO 3: Cambio de nivel de asistencia ===");
        luis.suscribir(auditoria);
        luis.suscribir(controlAsistencia);
        luis.setAsistencias(7); // Pasa de Advertencia (4) a Crítico (7)

        System.out.println("\n=== CASO 4: Modificación del estado de matrícula ===");
        maria.suscribir(auditoria);
        maria.suscribir(controlMatricula);
        maria.setEstado(Matricula.SUSPENDIDO);
        maria.setEstado(Matricula.ACTIVO); // Reactivación

        System.out.println("\n=== CASO 5: Identificación de riesgo integral ===");
        luis.suscribir(obAcademico);
        luis.suscribir(seguimientoIntegral);
        luis.setPromedio(6.4); // Luis ya tiene 7 inasistencias (crítico) y ACTIVO

        System.out.println("\n=== CASO 6: Modificaciones sin cambios reales ===");
        maria.setPromedio(9.1); // Mismo valor actual
        maria.setAsistencias(0); // Mismo valor actual

        System.out.println("\n=== CASO 7: Observación de múltiples estudiantes ===");
        for (Estudiante e : new Estudiante[]{ana, luis, maria}) {
            e.suscribir(auditoria);
            e.suscribir(obAcademico);
            e.suscribir(controlAsistencia);
        }
        ana.setPromedio(8.0);
        luis.setAsistencias(3);

        System.out.println("\n=== CASO 8: Incorporación de un nuevo observador (NotificadorRepresentante) ===");
        ana.suscribir(notificadorRepresentante);
        luis.suscribir(notificadorRepresentante);
        
        ana.setPromedio(5.5); // Dispara promedio < 6.0
        luis.setAsistencias(8); // Dispara inasistencias >= 8
        ana.setEstado(Matricula.SUSPENDIDO); // Dispara cambio a SUSPENDIDO
        
        // María NO está suscrita a este observador, por lo que no genera salida para ella
        maria.setEstado(Matricula.SUSPENDIDO); 
    }
}