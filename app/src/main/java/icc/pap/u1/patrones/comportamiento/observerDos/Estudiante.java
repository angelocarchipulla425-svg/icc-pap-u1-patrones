package icc.pap.u1.patrones.comportamiento.observerDos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private int asistencias;
    private Matricula estado;

    private final List<Consumer<CambioEstudiante>> observadores = new ArrayList<>();

    public Estudiante(String codigo, String nombre, double promedio, int asistencias, Matricula estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.asistencias = asistencias;
        this.estado = estado;
    }

    public void suscribir(Consumer<CambioEstudiante> observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void notificar(CambioEstudiante cambio) {
        for (Consumer<CambioEstudiante> observador : observadores) {
            observador.accept(cambio);
        }
    }

    // Getters y Setters con validación de cambios reales
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    
    public void setNombre(String nombre) {
        if (this.nombre != null && this.nombre.equals(nombre)) return;
        String old = this.nombre;
        this.nombre = nombre;
        notificar(new CambioEstudiante(this, "nombre", old, nombre));
    }

    public double getPromedio() { return promedio; }
    
    public void setPromedio(double promedio) {
        if (this.promedio == promedio) return;
        double old = this.promedio;
        this.promedio = promedio;
        notificar(new CambioEstudiante(this, "promedio", old, promedio));
    }

    public int getAsistencias() { return asistencias; }
    
    public void setAsistencias(int asistencias) {
        if (this.asistencias == asistencias) return;
        int old = this.asistencias;
        this.asistencias = asistencias;
        notificar(new CambioEstudiante(this, "asistencias", old, asistencias));
    }

    public Matricula getEstado() { return estado; }
    
    public void setEstado(Matricula estado) {
        if (this.estado == estado) return;
        Matricula old = this.estado;
        this.estado = estado;
        notificar(new CambioEstudiante(this, "estado", old, estado));
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + ")";
    }
}