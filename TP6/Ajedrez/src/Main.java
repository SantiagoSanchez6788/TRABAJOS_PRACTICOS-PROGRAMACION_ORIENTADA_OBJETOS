
public class Main {
    public static void main(String[] args) {
    
    Alfil alfil= new Alfil();
    Alfil []arregloAlfilN=new Alfil[2];
    Alfil []arregloAlfilB=new Alfil[2];
    alfil.CrearPieza(arregloAlfilN, arregloAlfilB);
    
    Caballo caballo= new Caballo();
    Caballo []arregloCaballoN=new Caballo[2];
    Caballo []arregloCaballoB=new Caballo[2];
    caballo.CrearPieza(arregloCaballoN, arregloCaballoB);

    Peon peon=new Peon();
    Peon []arregloPeonN=new Peon[8];
    Peon []arregloPeonB=new Peon[8];
    peon.CrearPieza(arregloPeonN,arregloPeonB);
   
    Torre torre= new Torre();
    Torre []arregloTorreN=new Torre[2];
    Torre []arregloTorreB=new Torre[2];
    torre.CrearPieza(arregloTorreN, arregloTorreB);

    Rey rey=new Rey();
    Rey []arregloReyN=new Rey[1];
    Rey []arregloReyB=new Rey[1];
    rey.CrearPieza(arregloReyN, arregloReyB);

    Reina reina= new Reina();
    Reina []arregloReinaN=new Reina[1];
    Reina []arregloReinaB=new Reina[1];
    reina.CrearPieza(arregloReinaN, arregloReinaB);

    System.out.println("------------------------------PIEZAS BLANCAS------------------------------\n");
    procesarPiezas(arregloReyB);
    procesarPiezas(arregloReinaB);
    procesarPiezas(arregloAlfilB);
    procesarPiezas(arregloCaballoB);
    procesarPiezas(arregloTorreB);
    procesarPiezas(arregloPeonB);
    System.out.println("------------------------------PIEZAS NEGRAS------------------------------\n");
    procesarPiezas(arregloReyN);
    procesarPiezas(arregloReinaN);
    procesarPiezas(arregloAlfilN);
    procesarPiezas(arregloCaballoN);
    procesarPiezas(arregloTorreN);
    procesarPiezas(arregloPeonN);
    System.out.println("------------------------------TABLERO------------------------------");
    Tablero.MostrarTablero();
        
     GestorPiezas.mostrarPiezasBD();
    }


    public static void procesarPiezas (Pieza arr[]){
        for (Pieza p:arr ){
            System.out.println(p);
            GestorPiezas.insertarPieza(p);
        }
    }

    public static void insertarPiezaBD (Pieza arr[]){
        for (Pieza p:arr ){
            GestorPiezas.insertarPieza(p);
            
        }
    }


// `tipopieza` VALUES (1,'Reina'),(2,'Rey'),(3,'Torre'),(4,'Alfil'),(5,'Caballo'),(6,'Peon');
   /*  public static int obtenerIdTipoPieza(Pieza p){
        int idTipoPieza=0;
        if(p.getClass().getSimpleName()=="Reina"){
            idTipoPieza=1;
        }
        else if(p.getClass().getSimpleName()=="Rey"){
            idTipoPieza=2;
        }
        else if(p.getClass().getSimpleName()=="Torre"){
            idTipoPieza=3;
        }
        else if(p.getClass().getSimpleName()=="Alfil"){
            idTipoPieza=4;
        }
        else if(p.getClass().getSimpleName()=="Caballo"){
            idTipoPieza=5;
        }
        else if(p.getClass().getSimpleName()=="Peon"){
            idTipoPieza=6;
        }
        else{
            System.out.println("Pieza no valida....");
        }

        return idTipoPieza;
    }*/

   
}