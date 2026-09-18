public class Tablero {

    private Casillero [][]tablero;

    public Tablero(Casillero[][] casilleros) {
        tablero=new Casillero[8][8];
        
    }

    public Tablero() {
    }

    public Casillero[][] getTablero() {
        return tablero;
    }

    public void setTablero(Casillero[][] tablero) {
        this.tablero = tablero;
    }

    public static void MostrarTablero(){
        int fila, colum;
        for(fila = 0; fila < 8; fila++){
            for(colum = 0; colum < 8; colum++){     
                if ((fila + colum) % 2 == 0) {
                    System.out.print("[B] ");  // Casillero blanco
                } else {
                    System.out.print("[N] ");  // Casillero negro
                }
            }
            System.out.println();
        }
        System.out.println();
    }


}
