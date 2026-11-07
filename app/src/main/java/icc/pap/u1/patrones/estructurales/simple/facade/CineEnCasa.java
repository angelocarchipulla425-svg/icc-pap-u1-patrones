package icc.pap.u1.patrones.estructurales.simple.facade;

/*
Esta clase es la FACADE
Es la que cordina lo s componentes necesarios
para una acciion determinada
ver una pelicula */

public class CineEnCasa {
    private final Proyector proyector;
    private final Reproductor reproductor;


    public CineEnCasa() {
        this.proyector = new Proyector();
        this.reproductor = new Reproductor();
    }   


    public void iniciarPelicula(String nombre){
        proyector.encender();
        reproductor.reproducir(nombre);
    }    

}