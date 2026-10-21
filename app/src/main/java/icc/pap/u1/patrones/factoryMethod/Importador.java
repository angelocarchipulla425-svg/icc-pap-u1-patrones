package icc.pap.u1.patrones.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Importador {
    

    //Factory method
    protected abstract LectorLinea crearLector();

    public final List<Lectura> importacion(List<String> lecturas) {
        LectorLinea lector = crearLector(); // polimorfica
        List<Lectura> resultado = new ArrayList<>();
        for(String lectura : lecturas) {
            if(lectura.isBlank())
                continue;
            try{
                resultado.add(lector.leerLinea(lectura));

        } catch (Exception e) {
            throw new IllegalArgumentException("Linea mal formada");
        }
    }
    return resultado;
    }
}
