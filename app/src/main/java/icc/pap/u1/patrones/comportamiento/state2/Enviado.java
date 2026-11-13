package icc.pap.u1.patrones.comportamiento.state2;

/**
 * Enviado
 */
public class Enviado implements EstadoPedidos{

    @Override
    public void pagar(Pedidos pedido) {
        System.out.println("El pedido ya está pagado");
    }

    @Override
    public void enviar(Pedidos pedido) {
        System.out.println("El pedido ya fue enviado");
    }

    @Override
    public void entregar(Pedidos pedido) {
        System.out.println("Pedido Entregado");
        pedido.changeState(new Entregado());
    }

    @Override
    public void cancelar(Pedidos pedido) {
        System.out.println("No se puede cancelar un pedido enviado");
    }

    @Override
    public String nombre() {
        return "ENVIADO";
    }

}
