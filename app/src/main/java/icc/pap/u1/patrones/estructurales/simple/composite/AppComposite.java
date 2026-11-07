package icc.pap.u1.patrones.estructurales.simple.composite;

public class AppComposite {
    public static void main(String[] args) {
        GrupoMenu combo = new GrupoMenu();
        
        GrupoMenu hamburguesa = new GrupoMenu();
        hamburguesa.addItem(new ProductoMenu("Queso", 0.50));
        hamburguesa.addItem(new ProductoMenu("Carne", 1.00));
        hamburguesa.addItem(new ProductoMenu("Pan", 0.50));
        hamburguesa.addItem(new ProductoMenu("Lechuuga", 0.25));


        ProductoMenu bebida = new ProductoMenu("Coca cola", 1.35);
        
        combo.addItem(hamburguesa); //agregue un GM
        combo.addItem(bebida);      // AGREGE UN PM
    
        System.out.println("Total del combo" + " $ " + combo.precio());
    
    
    }


}