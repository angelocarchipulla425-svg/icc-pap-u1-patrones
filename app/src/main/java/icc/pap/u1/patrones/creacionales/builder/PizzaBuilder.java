package icc.pap.u1.patrones.creacionales.builder;

import java.util.ArrayList;

import java.util.List;

/**
 * ObjBuilder
 * PizzaBuilder va a acumular las opciones de una pizza
 * y creará el producto(Objeto(Pizza)) cuando se le pida
 * al método construir(build)
*/
public final class PizzaBuilder {
    
    //private String size = "mediana";
    //private List<String> ingredientes = new ArrayList<>();

    private String size;
    private List<String> ingredientes;

    //Vacio -> default
    public  PizzaBuilder() {
        this.size = "mediana";
        this.ingredientes = new ArrayList<>();
        this.ingredientes.add("Queso");
    }

    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }

    public PizzaBuilder addIng(String ing){
        this.ingredientes.add(ing);
        return this;
    }

    // Metodo Build
    // devuelve el Producto
    public Pizza build(){
        return new Pizza(size, ingredientes);
    }
}
