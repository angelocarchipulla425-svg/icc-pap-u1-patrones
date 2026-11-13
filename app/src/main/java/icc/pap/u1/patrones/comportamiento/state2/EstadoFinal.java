package icc.pap.u1.patrones.comportamiento.state2;

public abstract class EstadoFinal implements EstadoPedidos{

    @Override
    public void pagar(Pedidos pedido) {
        System.out.println("Operacion no permitida");
    }

    @Override
    public void enviar(Pedidos pedido) {
        System.out.println("Operacion no permitida");

    }

    @Override
    public void entregar(Pedidos pedido) {
        System.out.println("Operacion no permitida");
    }

    @Override
    public void cancelar(Pedidos pedido) {
        System.out.println("Operacion no permitida");
    }

}
