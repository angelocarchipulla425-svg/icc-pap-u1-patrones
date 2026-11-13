package icc.pap.u1.patrones.comportamiento.observerDos;

public record CambioEstudiante(    
    Estudiante est,
    String atributo,
    Object old,
    Object nuevo){
}