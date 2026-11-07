package icc.pap.u1.patrones.estructurales.simple.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CacheComponente {
    private final Map<String,ComponenteVisual> componentes;
    public CacheComponente(){
        componentes  = new HashMap<>();
    }

    public ComponenteVisual get(String tipo, String color, String border){
        
        String clave = tipo + "|" + color + "|" + border;
        
        //ComponenteVisual comp = componentes.get(clave);
        //if(comp == null){
          //  componentes.put(clave,new ComponenteVisual(tipo, color, border));
        //}

        return componentes.computeIfAbsent(clave, k -> new ComponenteVisual(tipo, color, border));

        

    }
}