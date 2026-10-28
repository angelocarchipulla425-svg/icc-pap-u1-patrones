package icc.pap.u1.patrones.estructurales.simple.adapter;

public class AppAdapter {
    
    /**
     * 
     * Adapter: permite usar un termómetro Fahrenheit con una aplicación que espera
     * Celcius.
     */


    public static void main(String[] args) {

        // Cargar mi celular con un cargador
        // pero como ahora tengo un cargador antiguo
        // debo crear un adaptador
        CargadorAntiguo cAntiguo = new CargadorAntiguo();
        Cargador cargor1 = new AdaptadorCargador(cAntiguo);

        CargadorInalambrico cInalambrico = new CargadorInalambrico();

        Cargador cargor2 = new AdaptadorCargadorIna(cInalambrico);

        


        cInalambrico.cargarBase();

        // Cargar el celular con enchufe
        cargor1.cargarCelular();

        // Cargar de forma inhalámbrica
        cargor2.cargarCelular();

        // Cargar el celular - sin el patron

        // si el cargador es antiguo
        cAntiguo.cargarConector();
        
    }
}
