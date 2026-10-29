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
        




        System.out.println();
        System.out.println("PATRONES ESTRUCTURALES (ADAPTER DECORATOR)");
        System.out.println("Caso 1: Cargador antiguo con registro");
        Cargador c1 = new DecoradorRegistro(new AdaptadorCargador(new CargadorAntiguo()));
        c1.cargarCelular();

        System.out.println("Caso 2: Cargador inalámbrico con seguridad permitida");
        Cargador c2 = new DecoradorSeguridad(new AdaptadorCargadorIna(new CargadorInalambrico()), true);
        c2.cargarCelular();

        System.out.println("Caso 3: Cargador antiguo con seguridad bloqueada");
        Cargador c3 = new DecoradorSeguridad(new AdaptadorCargador(new CargadorAntiguo()), false);
        c3.cargarCelular();

        System.out.println("Caso 4: Cargador inalámbrico con dos decoradores");
        Cargador c4 = new DecoradorSeguridad(new DecoradorRegistro(new AdaptadorCargadorIna
            (new CargadorInalambrico())), true);
        c4.cargarCelular();
    }
}
