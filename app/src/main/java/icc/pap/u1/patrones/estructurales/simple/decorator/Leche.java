package icc.pap.u1.patrones.estructurales.simple.decorator;

/**
 * 
 * Leche es mi DECORADOR que envuelve a una BEBIDA
 * BEBIDA -> general puede ser cualquiera como un café 
 * un expreso, chocolate.
 */
public final class Leche implements Bebida{

    protected final Bebida bebida;

    public Leche(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + " con leche";
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.50;
    }
    
}
