package icc.pap.u1.patrones.comportamiento.state2;

/**
 * Pendiente
 */
public class Pendiente implements EstadoPedidos{

    @Override
    public void pagar(Pedidos pedido) {
        System.out.println("Pago realizado");
        pedido.changeState(new Pagado());
    }

    @Override
    public void enviar(Pedidos pedido) {
    System.out.println("Debes pagar primero");        
    }

    @Override
    public void entregar(Pedidos pedido) {
        System.out.println("El pedido no ha sido ni ENVIADO");
    }

    @Override
    public void cancelar(Pedidos pedido) {
        System.out.println("Pedido cancelado");
        pedido.changeState(new Cancelado());
    }

    @Override
    public String nombre() {
        return "PENDIENTE";   
    }

}
