package icc.pap.u1.patrones.creacionales.factoryMethod;

public class LecturaTabulacion implements LectorLinea{

    @Override
    public Lectura leerLinea(String linea) {
        // dividir la línea por el separador "TAB"
        String[] partes = linea.split("\t");
        // devolver una instancia de lectura
        return new Lectura(partes[0], Double.parseDouble(partes[1]), partes[2]);

    }
    
}
