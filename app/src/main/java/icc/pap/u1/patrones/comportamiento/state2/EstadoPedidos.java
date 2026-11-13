package icc.pap.u1.patrones.comportamiento.state2;


public interface EstadoPedidos {
    public void pagar(Pedidos pedido);
    public void enviar(Pedidos pedido);
    public void entregar(Pedidos pedido);
    public void cancelar(Pedidos pedido);
    public String nombre();
    
}
