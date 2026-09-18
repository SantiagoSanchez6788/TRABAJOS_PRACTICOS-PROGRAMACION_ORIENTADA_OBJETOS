public class Reina extends Pieza {

    public Reina(String color, String comportamiento, String movimiento, int velocidad) {
        super(color, comportamiento, movimiento, velocidad);
    }

    public Reina() {
        
    }
    @Override 
    public void mover(){
        System.out.println("Encarnizada");
    }

    @Override 
    public void CrearPieza(Pieza arrReinaN[], Pieza arrReinaB[]){

        for(int i=0; i<1 ;i++ ){
            arrReinaN[i]=new Reina("Negro","Armada","Encarnizada",9);
            arrReinaB[i]=new Reina("Blanco","Armada","Encarnizada",9);
        }


    }
}
