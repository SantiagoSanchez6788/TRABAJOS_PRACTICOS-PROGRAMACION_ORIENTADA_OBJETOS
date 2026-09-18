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
    imprimir(arregloAlfilB);
    imprimir(arregloCaballoB);
    imprimir(arregloPeonB);
    imprimir(arregloTorreB);
    imprimir(arregloReyB);
    imprimir(arregloReinaB);
    System.out.println("------------------------------PIEZAS NEGRAS------------------------------\n");
    imprimir(arregloAlfilN);
    imprimir(arregloCaballoN);
    imprimir(arregloPeonN);
    imprimir(arregloTorreN);
    imprimir(arregloReyN);
    imprimir(arregloReinaN);
    System.out.println("------------------------------UN TABLERO------------------------------");
    Tablero.MostrarTablero();
   
    }

    public static void imprimir (Pieza arr[]){
        for (Pieza p:arr ){
            System.out.println(p);
        }
    }

      /*  public static void instanciacion(Pieza arr[],Pieza arr2[],Pieza n,Pieza b,String comportamiento, String movimiento, int velocidad){
        n.setComportamiento(comportamiento);
        n.setMovimiento(movimiento);
        n.setVelocidad(velocidad);
        b.setComportamiento(comportamiento);
        b.setMovimiento(movimiento);
        b.getVelocidad();
        for(int i=0;i<arr.length;i++){
            n.setColor("NEGRO");
            arr[i]=n;
            b.setColor("BLANCO");
            arr2[i]=b;
        }
    }*/

}
