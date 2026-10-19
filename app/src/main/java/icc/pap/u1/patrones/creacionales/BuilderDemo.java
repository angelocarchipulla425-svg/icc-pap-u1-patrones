package icc.pap.u1.patrones.creacionales;

public class BuilderDemo {
    public static void ejecutar(){
        System.out.println("\n============================================");
        System.out.println("    Patrón Creacional: Builder comenzando   ");
        System.out.println("============================================");

        // Instanciación 1: Computadora Gamer de Alto Rendimiento
        System.out.println("[+] Ensamblando PC Gamer...");
        Computadora pcGamer = new Computadora.Builder()
            .setProcesador("Intel Core i9-14900K")
            .setMemoriaRamGB(64)
            .setAlmacenamientoGB(2000)
            .setTarjetaGrafica("NVIDIA GeForce RTX 4090")
            .setRefrigeracionLiquida(true)
            .build();
    
            pcGamer.mostrarEspecificaciones();

        //Instanciación 2: Computadora de Oficina Estándar

        System.out.println("[+] Ensamblando PC de Oficina...");
        Computadora pcOficina = new Computadora.Builder()
                .setProcesador("Intel Core i5-13400")
                .setMemoriaRamGB(16)
                .setAlmacenamientoGB(512)
                .setTarjetaGrafica("Intel UHD Graphics 730")
                .setRefrigeracionLiquida(false)
                .build();

        pcOficina.mostrarEspecificaciones();
    }
}
