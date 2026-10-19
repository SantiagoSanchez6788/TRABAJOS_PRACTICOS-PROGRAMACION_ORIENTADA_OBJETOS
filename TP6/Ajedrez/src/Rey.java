public class Rey extends Pieza{

    public Rey(String color, String comportamiento, String movimiento, int velocidad) {
        super(color, comportamiento, movimiento, velocidad);
    }

    public Rey() {
        
    }

    @Override 
    public void mover(){
        System.out.println("Tenue");
    }
    
    @Override 
    public void CrearPieza(Pieza arrReyN[], Pieza arrReyB[]){

        for(int i=0; i<1 ;i++ ){
            arrReyN[i]=new Rey("Negro","Postrero","Tenue",1);
            arrReyB[i]=new Rey("Blanco","Postrero","Tenue",1);
        }


    }
}
