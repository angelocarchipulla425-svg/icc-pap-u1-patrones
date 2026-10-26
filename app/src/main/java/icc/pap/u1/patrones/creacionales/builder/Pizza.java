package icc.pap.u1.patrones.creacionales.builder;

import java.util.List;

/**
 * 
 * Pizza clase inmutable;
 * 
 * representa una pizza ya configurada
 */
public final class Pizza {


    private final String size;
    private final List<String> ingredientes;


    protected Pizza(String size, List<String> ingredientes) {
        this.size = size;
        this.ingredientes = ingredientes;
    }

    public String descripcion(){
        return "Pizza " + size + " con: " + ingredientes;
    }
}
