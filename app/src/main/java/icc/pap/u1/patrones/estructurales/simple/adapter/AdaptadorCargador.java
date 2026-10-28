package icc.pap.u1.patrones.estructurales.simple.adapter;

public class AdaptadorCargador implements Cargador{

    // Dependencia del cargador (antiguo)
    private final CargadorAntiguo cargadorAntiguo;

    public AdaptadorCargador(CargadorAntiguo cargadorAntiguo){
        this.cargadorAntiguo = cargadorAntiguo;        
    }

    @Override
    public void cargarCelular() {
        cargadorAntiguo.cargarConector();
    }
    
}
