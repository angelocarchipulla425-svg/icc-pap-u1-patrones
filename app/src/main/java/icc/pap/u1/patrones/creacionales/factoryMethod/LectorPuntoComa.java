package icc.pap.u1.patrones.creacionales.factoryMethod;

public class LectorPuntoComa implements LectorLinea {

    @Override
    public Lectura leerLinea(String linea) {
        // dividir la línea por el separador ";"
        String[] partes = linea.split(";");

        // devolver una instancia de lectura
        return new Lectura(partes[0], Double.parseDouble(partes[1]), partes[2]);
    }


}
