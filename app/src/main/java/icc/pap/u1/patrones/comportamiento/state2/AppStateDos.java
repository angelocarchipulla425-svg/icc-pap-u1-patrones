package icc.pap.u1.patrones.comportamiento.state2;

public class AppStateDos {
    public static void main(String[] args) {
        Pedidos pedido = new Pedidos();
        System.out.println(pedido.getState());
        pedido.entregar();
        pedido.pagar();
        System.out.println(pedido.getState());
        pedido.enviar();
        System.out.println(pedido.getState());
        pedido.cancelar();
        System.out.println(pedido.getState());
        pedido.entregar();
        System.out.println(pedido.getState());
    }
}
