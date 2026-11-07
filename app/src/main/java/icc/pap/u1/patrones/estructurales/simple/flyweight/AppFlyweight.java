package icc.pap.u1.patrones.estructurales.simple.flyweight;

public class AppFlyweight {
    public static void main(String[] args) {
        CacheComponente cache = new CacheComponente();

        ComponenteVisual boton1 = cache.get("Boton","Azul", "24px");
        ComponenteVisual boton2 = cache.get("Boton","Azul", "24px");
        ComponenteVisual boton3 = cache.get("card","Azul", "12px");

        boton1.dibujar("Guardar", 10,20);
        boton2.dibujar("Cancelar",100,20);
        boton3.dibujar("opciones",5,25);

        System.out.println(boton1 == boton2);
    }
}