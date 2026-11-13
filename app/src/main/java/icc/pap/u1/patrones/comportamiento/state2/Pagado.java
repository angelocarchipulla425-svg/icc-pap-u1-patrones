package icc.pap.u1.patrones.comportamiento.state2;

/**
 * Pagado
 */
public class Pagado implements EstadoPedidos{

    @Override
    public void pagar(Pedidos pedido) {
        System.out.println("Ya está pagado");
    }

    @Override
    public void enviar(Pedidos pedido) {
        System.out.println("Pedido enviado");
        pedido.changeState(new Enviado());
    }

    @Override
    public void entregar(Pedidos pedido) {
        System.out.println("Debe enviarse primero");
    }

    @Override
    public void cancelar(Pedidos pedido) {
         System.out.println("No se puede cancelar un pedido pagado");
    }

    @Override
    public String nombre() {
        return "PAGADO"; 
    }

}
