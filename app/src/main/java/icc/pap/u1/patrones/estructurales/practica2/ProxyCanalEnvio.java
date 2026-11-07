package icc.pap.u1.patrones.estructurales.practica2;


public class ProxyCanalEnvio implements CanalEnvio{

    public CanalEnvio canalReal;
    public boolean autorizado;

    
    public ProxyCanalEnvio(CanalEnvio canalReal, boolean autorizado) {
        this.canalReal = canalReal;
        this.autorizado = autorizado;
    }


    @Override
    public void enviar(String destinatario, String mensaje) {
        if(autorizado){
            System.out.println("Autorización verificada.");
            canalReal.enviar(destinatario, mensaje);
        } else {
            System.out.println("Envío bloqueado: usuario no autorizado.");
        }
    }
    
}
