public class Torre extends Pieza{

    public Torre(String color, String comportamiento, String movimiento, int velocidad) {
        super(color, comportamiento, movimiento, velocidad);
    }

    public Torre() {
        
    }

   @Override 
    public void mover(){
        System.out.println("Directa");
    }

     @Override 
    public void CrearPieza(Pieza arrTorreN[], Pieza arrTorreB[]){

        for(int i=0; i<2 ;i++ ){
            arrTorreN[i]=new Torre("Negro","Agresor","Directa",2);
            arrTorreB[i]=new Torre("Blanco","Agresor","Ladino",2);
        }


    }
}
