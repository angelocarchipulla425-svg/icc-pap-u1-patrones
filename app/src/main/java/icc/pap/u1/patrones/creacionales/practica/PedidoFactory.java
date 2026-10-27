package icc.pap.u1.patrones.creacionales.practica;

public class PedidoFactory {
    
    // Método encargado de crear los objetos sin exponer la lógica de instanciación en App
    public static Pedido crearPedido(String tipo, String codigo, String cliente, double subtotal) {
        if(tipo.equalsIgnoreCase("PRESENCIAL")) {
            return new PedidoPresencial(codigo, cliente, subtotal);
        } else if (tipo.equalsIgnoreCase("EN_LINEA")) {
            return new PedidoEnLinea(codigo, cliente, subtotal);
        }
        throw new IllegalArgumentException("Tipo de pedido desconocido: " + tipo);
    }
}
