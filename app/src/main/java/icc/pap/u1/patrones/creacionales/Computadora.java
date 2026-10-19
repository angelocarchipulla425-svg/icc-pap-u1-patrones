package icc.pap.u1.patrones.creacionales;

class Computadora {
    private String procesador;
    private int memoriaRamGB;
    private int almacenamientoGB;
    private String tarjetaGrafica;
    private boolean tieneRefrigeracionLiquida;

    //Constructor privado para restringir la instanciación directa (obligatorio en Builder)
    private Computadora(Builder builder){
        this.procesador = builder.procesador;
        this.memoriaRamGB = builder.memoriaRamGB;
        this.almacenamientoGB = builder.almacenamientoGB;
        this.tarjetaGrafica = builder.tarjetaGrafica;
        this. tieneRefrigeracionLiquida = builder.tieneRefrigeracionLiquida;
    }

    public void mostrarEspecificaciones() {
        System.out.println("-------------------------------------------");
        System.out.println("    ESPECIFICACIONES TÉCNICAS DE LA PC");
        System.out.println("-------------------------------------------");
        System.out.println("  Procesador: " + procesador);
        System.out.println("  Memoria RAM: " + memoriaRamGB + "GB");
        System.out.println("  Almacenamiento: " + almacenamientoGB + " GB SSD");
        System.out.println("  Tarjeta Gráfica: " + tarjetaGrafica);
        System.out.println("Refrigeración Líquida: " + (tieneRefrigeracionLiquida ? "Sí" : "No"));
        System.out.println("-------------------------------------------\n");
    }

    // 2. Clase Builder Estática Anidada
    public static class Builder {
        private String procesador;
        private int memoriaRamGB;
        private int almacenamientoGB;
        private String tarjetaGrafica;
        private boolean tieneRefrigeracionLiquida;

        public Builder setProcesador(String procesador) {
            this.procesador = procesador;
            return this;
        }

        public Builder setMemoriaRamGB(int memoriaRamGB) {
            this.memoriaRamGB = memoriaRamGB;
            return this;
        }

        public Builder setAlmacenamientoGB(int almacenamientoGB) {
            this.almacenamientoGB = almacenamientoGB;
            return this;
        }

        public Builder setTarjetaGrafica(String tarjetaGrafica) {
            this.tarjetaGrafica = tarjetaGrafica;
            return this;
        }

        public Builder setRefrigeracionLiquida(boolean tieneRefrigeracionLiquida) {
            this.tieneRefrigeracionLiquida = tieneRefrigeracionLiquida;
            return this;
        }

        // Método de construcción y validación estricta (Exigente)
        public Computadora build() {
            if (this.procesador == null || this.procesador.trim().isEmpty()) {
                throw new IllegalStateException("Error de validación: El procesador es un campo obligatorio.");
            }
            return new Computadora(this);
        }
    }
}
