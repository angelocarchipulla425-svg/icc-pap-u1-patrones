package icc.pap.u1.patrones.estructurales.simple.composite;

import java.util.ArrayList;
import java.util.List;

/*
Composite por que agrupa productos de tipo Elemento return
Y calcula un precio que en este caso es la sumataria de todos 
los ElementoMenu
grupoMenu */

public class GrupoMenu implements ElementoMenu {
    private List<ElementoMenu> items;
    


    public GrupoMenu() {
        items = new ArrayList<>();
    }



    @Override
    public double precio() {
        //La sumatoria de todos
        //double suma = 0;
        //for(ElementoMenu elementoMenu : items){
          //  suma = suma + elementoMenu.precio();
    //}
     //   return suma;



     //Stream toma todo el flujo de datos (For each)
     //Mapea todo el mapa a solo el precio
        return items.stream().mapToDouble(ElementoMenu::precio).sum();

    }

    public void addItem(ElementoMenu _item){
        this.items.add(_item);
    }
    
}