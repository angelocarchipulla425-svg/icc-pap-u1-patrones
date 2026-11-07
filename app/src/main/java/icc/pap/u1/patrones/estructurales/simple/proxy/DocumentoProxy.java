package icc.pap.u1.patrones.estructurales.simple.proxy;

//*
// Proxy  que pospone la creacion de un documento real
// hasta que se lo necesite
//  */
public class DocumentoProxy implements Documento{

    private String path;
    private DocumentoReal  documento;

    

    public DocumentoProxy(String path) {
        this.path = path;
    }


    @Override 
    public  void mostrar(){
        if(documento == null){
            documento = new DocumentoReal(path);
        }
        documento.mostrar();
    }



}