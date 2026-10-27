package icc.pap.u1.patrones.creacionales.practica;

public abstract class Pedido {
    private String codigo;
    private String cliente;
    private double subtotal;

    protected Pedido(String codigo, String cliente, double subtotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.subtotal = subtotal;
    }
    
    public void procesar(){
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        double impuesto = subtotal * (config.getPorcentajeImpuesto() / 100.00);
        double total = subtotal + impuesto;

        // Imprimir datos según la salida esperada
        if (this instanceof PedidoPresencial) {
            System.out.println("Pedido presencial");
        } else {
            System.out.println("Pedido en línea");
        }

        System.out.println("Código: " + codigo);
        System.out.println("Cliente: " + cliente);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Total: " + total);
    }
    
    //Método implementado en las subclases
    protected abstract void generarComprobante();
}
