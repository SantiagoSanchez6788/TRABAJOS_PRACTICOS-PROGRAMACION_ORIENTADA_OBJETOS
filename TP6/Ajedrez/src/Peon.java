public class Peon extends Pieza {

    public Peon(String color, String comportamiento, String movimiento, int velocidad) {
        super(color, comportamiento, movimiento, velocidad);
    }

    public Peon() {
        
    }

    @Override 
    public void mover(){
        System.out.println("Ladino");
    }

    @Override 
    public void CrearPieza(Pieza arrPeonN[], Pieza arrPeonB[]){

        for(int i=0; i<8 ;i++ ){
            arrPeonN[i]=new Peon("Negro","Agresor","Ladino",2);
            arrPeonB[i]=new Peon("Blanco","Agresor","Ladino",2);
        }


    }

    
    
}
