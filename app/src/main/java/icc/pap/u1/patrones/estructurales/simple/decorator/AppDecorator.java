package icc.pap.u1.patrones.estructurales.simple.decorator;

public class AppDecorator {

    public static void main(String[] args){
        //BEBIDA instanciada -> CAFE SIMPLE
        Bebida bebida = new CafeSimple(); 
        System.out.println(bebida.descripcion() + ": $" + bebida.precio());

        //BEBIDA instanciada -> CAFE SIMPLE + LECHE
        Bebida bebidaL = new Leche(new CafeSimple()); 
        System.out.println(bebidaL.descripcion() + ": $" + bebidaL.precio());

        //BEBIDA instanciada -> CAFE + CHOCOLATE
        Bebida bebidaC = new Chocolate(bebida);
        System.out.println(bebidaC.descripcion() + "$" + bebidaC.precio());

        //BEBIDA instanciada -> CAFE + LECHE + CHOCOLATE
        Bebida bebidaLC = new Chocolate(new Leche(new CafeSimple()) );

        //BEBIDA instanciada -> CAFE + CHOCOLATE + LECHE
        Bebida bebidaCL = new Leche(new Chocolate((new CafeSimple())));

        //BEBIDA instanciada -> CAFE + CHOCOLATE + LECHE
        Bebida bebidaCCL = new Leche(new Chocolate((new Chocolate(new CafeSimple()))));

        
        // 1 -> CAFE con chocolate (LISTO)
        System.out.println("1 -> " + bebidaC.descripcion());

        // 2 -> CAFE con leche y chocolate LISTO
        System.out.println("2 -> " + bebidaLC.descripcion());

        // 3 -> CAFE con chocolate y leche LISTO
        System.out.println("3 -> " + bebidaCL.descripcion());

        // 4 -> CAFE con chocolate y chocolate y leche LISTO
        System.out.println("4 -> " + bebidaCCL.descripcion());
    }
}

